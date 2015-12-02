package hu.bme.mit.vmdistribution.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.distrstatus.DistributionStatusUpdater;
import hu.bme.mit.vmdistribution.app.distrstatus.RTorrentXmlRpcClient;
import hu.bme.mit.vmdistribution.app.distrstatus.Transfer;
import hu.bme.mit.vmdistribution.app.vmutil.TorrentUtil;
import hu.bme.mit.vmdistribution.app.vmutil.VMUtil;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

/**
 * The main class of the program, initializes the logging, controls the
 * distribution of VMs and processes user input (during the last part of the
 * distribution).
 * 
 * @author BVincze
 */
public final class UseModel {

	/**
	 * The root logger, used to configure all loggers.
	 */
	private static final Logger LOGGER_PARENT = Logger.getLogger("");
	private static final Logger LOGGER = Logger.getLogger(UseModel.class.getName());
	/**
	 * The {@link LabSystem} object representing the EMF model instance loaded
	 * from the file.
	 */
	private static LabSystem myLabSystem;

	private UseModel() {

	}

	/**
	 * Initializes the logging system. (java.util.logging.*)
	 * 
	 * @param level
	 *            The logging level to be set
	 * 
	 */
	public static void initLogger(final Level level) {
		// output log messages in a single line
		System.setProperty("java.util.logging.SimpleFormatter.format",
				"%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
		Handler consoleHandler = new ConsoleHandler();
		// enable logging of FINER messages
		consoleHandler.setLevel(Level.FINER);
		LOGGER_PARENT.removeHandler(LOGGER_PARENT.getHandlers()[0]);
		LOGGER_PARENT.addHandler(consoleHandler);
		// set logging level
		LOGGER_PARENT.setLevel(level);
		LOGGER.log(Level.CONFIG, "Logging set to: " + level.getName());
	}

	/**
	 * The main function.
	 * 
	 * @param args
	 *            Command line arguments set by the user, contains at least the
	 *            2 required ones:
	 *            <ol>
	 *            <li>Path to the file containing the model instance - has
	 *            .vmdistribution extension - <b>REQUIRED</b></li>
	 *            <li>Name of the goal lab - one of the many specified by the
	 *            user in the model instance - <b>REQUIRED</b></li>
	 *            <li>Logging level - the minimum level for log messages to be
	 *            displayed, possible values include WARNING, INFO, FINE, FINER,
	 *            defaults to INFO - <b>OPTIONAL</b></li>
	 *            </ol>
	 * 
	 */
	public static void main(final String[] args) {
		File modelfile;
		String goallabname = "";
		String logginglevelstring = "";
		Level logginglevel;

		// process user arguments
		if (args.length < 2) {
			System.out.println("Not enough command line arguments!");
			System.out.println(
					"Usage: java -jar hu.bme.mit.vmdistribution.app.*.jar [path to model instance] [name of goal lab] [logging level]");
			System.exit(1);
		}

		modelfile = new File(args[0]);
		goallabname = args[1];

		if (args.length > 2) {
			logginglevelstring = args[2];
		}

		switch (logginglevelstring) {
		case "WARNING":
			logginglevel = Level.WARNING;
			break;
		case "INFO":
			logginglevel = Level.INFO;
			break;
		case "FINE":
			logginglevel = Level.FINE;
			break;
		case "FINER":
			logginglevel = Level.FINER;
			break;
		default:
			logginglevel = Level.INFO;
		}

		// initalize logger
		initLogger(logginglevel);
		LOGGER.log(Level.INFO, "[Starting tasks.]");

		// load model instance
		EMFModelUtil emfutil = new EMFModelUtil();
		myLabSystem = emfutil.loadModelInstance(modelfile);

		// get goal lab
		Lab goal = null;
		for (Lab lab : myLabSystem.getLabs()) {
			if (goallabname.equals(lab.getName())) {
				goal = lab;
			}
		}

		if (goal == null) {
			LOGGER.log(Level.SEVERE, "The goal lab doesn't exist, check command line arguments!");
			System.exit(1);
		}

		// start the distribution process
		distribute(myLabSystem.getTorrentSeed(), goal);

		LOGGER.log(Level.INFO, "[Saving changes to model instance.]");
		// save changes made to the model instance to the source file
		emfutil.saveModelInstance();

		LOGGER.log(Level.INFO, "[Done.]");
	}

	/**
	 * Controls the VM distribution process, calls the required subroutines in
	 * order.
	 * 
	 * <ol>
	 * <li>Get which VMs are compatible and not already installed</li>
	 * <li>Copy these to the designated seed Computer (also init Vagrant-based
	 * Vms and zip them before copying)</li>
	 * <li>Create a torrent file for each VM the start seeding</li>
	 * <li>Get torrent info hashes - these are required to get progress info
	 * from the torrent clients</li>
	 * <li>Copy the torrent files to the target Computers, and make them start
	 * to download(leech)</li>
	 * <li>Call the DistributionProgressLoop to monitor transfers in real time
	 * </li>
	 * </ol>
	 * 
	 * @param seed
	 *            The designated Computer to seed the torrents.
	 * @param goal
	 *            The goal of the distibution, a goal contains which Computers
	 *            should have which VMs after the distribution
	 */
	public static void distribute(final Computer seed, final Lab goal) {
		// get compatible vms to install
		Map<Computer, List<VirtualMachine>> currentsetup = EMFModelUtil.buildComputerToVMsMapFromLabSystem(myLabSystem);
		Map<Computer, List<VirtualMachine>> goalsetup = EMFModelUtil.buildComputerToVMsMapFromLab(goal);

		Map<Computer, List<VirtualMachine>> vms_toinstall_notalreadyinstalled = EMFModelUtil
				.getConfWithoutAlreadyInstalledVMs(currentsetup, goalsetup);
		// remove seed from distribution targets - it'll hold all VMs anyways
		vms_toinstall_notalreadyinstalled.remove(seed);
		Map<Computer, List<VirtualMachine>> vms_toinstall_alsocompatible = EMFModelUtil
				.getConfWithoutIncompatibleVMs(vms_toinstall_notalreadyinstalled);
		Map<VirtualMachine, String> vm_torrentfilename_map = new HashMap<>();

		// exit if no VMs can be distributed
		if (vms_toinstall_alsocompatible.values().size() == 0) {
			LOGGER.log(Level.WARNING, "No Virtual Machines can be distributed, see log above for reasons.");
			System.exit(1);
		}

		// copy vms to seed & create a torrent file for each
		vm_torrentfilename_map = VMUtil.copyVmsToSeed(seed, goal);

		// start seeding
		TorrentUtil.startSeeding(seed);

		// copy the required torrent files to the target Computers and start
		// leeching
		for (Entry<Computer, List<VirtualMachine>> pc_vmlist : vms_toinstall_alsocompatible.entrySet()) {
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc_vmlist.getKey());
			for (VirtualMachine vm : vmstodistr) {
				TorrentUtil.copyTorrentFile(seed, pc_vmlist.getKey(), vm_torrentfilename_map.get(vm));
			}
			if (vmstodistr.size() > 0) {
				TorrentUtil.startLeeching(seed, pc_vmlist.getKey());
			}
		}

		// get torrent info hashes - these are required to get progress info
		// from the torrent clients,
		// the seed has all torrent files so get them from it
		RTorrentXmlRpcClient xmlrpcclient_seed = new RTorrentXmlRpcClient(seed);
		Map<String, String> vmzipname_infohashes_map = xmlrpcclient_seed.getTorrentInfoHashes();
		Map<VirtualMachine, String> vm_infohashes_map = new HashMap<>();
		for (Entry<String, String> infohash_vm : vmzipname_infohashes_map.entrySet()) {
			String vmzipname = vmzipname_infohashes_map.get(infohash_vm.getKey());
			vm_infohashes_map.put(EMFModelUtil.getVmByFilename(vmzipname, myLabSystem.getVirtualmachines()),
					infohash_vm.getKey());
		}

		// create Transfers for every Vm -> Pc transfer
		List<Transfer> transfers = new ArrayList<>();
		for (Entry<Computer, List<VirtualMachine>> pc_vmlist : vms_toinstall_alsocompatible.entrySet()) {
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc_vmlist.getKey());
			for (VirtualMachine vm : vmstodistr) {
				transfers.add(new Transfer(vm, pc_vmlist.getKey(), vm_infohashes_map.get(vm)));
			}
		}

		// call distribution progress loop
		try {
			LOGGER.log(Level.INFO, "[Giving 10s grace period before asking for progress updates...]");
			// grace period for all clients to start leeching, 10s should be
			// enough as rtorrent is set to start torrents every 5 seconds.
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "Waiting interrupted.", e);
		}

		// start the progress loop - get the progress info of all transfers and
		// display it to the user every few seconds
		distributionProgressLoop(transfers);

	}

	/**
	 * Monitors the distribution of the VMs in real time. Gets the progress info
	 * in a separate thread from all running torrent clients using the XMLRPC
	 * protocol, prints out progress info every 10s, the user can type in 'stop'
	 * or 's' followed by pressing ENTER to stop all transfers prematurely. The
	 * model instance file will be updated based on which Transfers are
	 * completed.
	 * 
	 * @param transfers
	 *            A list of Transfer objects, each representing the status of a
	 *            VM upload from the seed to a target Computer.
	 * 
	 */
	public static void distributionProgressLoop(final List<Transfer> transfers) {
		// create and start the status updater thread
		DistributionStatusUpdater distrstatusupdater = new DistributionStatusUpdater(transfers);
		Thread statusthread = new Thread(distrstatusupdater);
		// set it to daemon, so we don't need to stop it manually in case of a
		// cancelled distribution
		statusthread.setDaemon(true);
		statusthread.start();

		String msg = null;
		BufferedReader in = null;
		// Process user input to allow cancelling the distribution gracefully
		try {
			in = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			while (true) {
				msg = in.readLine();
				if ("".equals(msg) && !statusthread.isAlive()) {
					break;
				}
				if ("STOP".equalsIgnoreCase(msg) || "S".equalsIgnoreCase(msg)) {
					LOGGER.log(Level.INFO, "Quit due to user command");
					List<String> incompletetransfers = distrstatusupdater.getIncompleteTransfers();
					if (incompletetransfers.size() > 0) {
						LOGGER.warning("[There were unfinished transfers:]");
					}
					for (String s : incompletetransfers) {
						LOGGER.warning(s);
					}
					break;
				}
			}
		} catch (UnsupportedEncodingException e1) {
			LOGGER.log(Level.SEVERE, "UTF-8 encoding not supported, this should not happen.", e1);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Could not read user input.", e);
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, "Could not close input stream!", e);
			}
		}
	}
}

/*
 * TODO list
 * 
 * important: perf analysis in real lab, fail distr - cleanup
 * 
 * not important: create javadoc
 * 
 * 
 */
