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
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class UseModel {

	private static final Logger logger_parent = Logger.getLogger("");
	private static final Logger logger = Logger.getLogger(UseModel.class.getName());
	private static LabSystem myLabSystem;

	public static void initLogger(Level level) {
		System.setProperty("java.util.logging.SimpleFormatter.format",
				"%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.FINER); //enable logging of FINER messages
		logger_parent.removeHandler(logger_parent.getHandlers()[0]);
		logger_parent.addHandler(consoleHandler);
		logger_parent.setLevel(level); //set logging level
		logger.log(Level.CONFIG, "Logging set to: " + level.getName());
	}

	public static void main(final String[] args) {
		File modelfile;
		String goallabname = "";
		String logginglevelstring = "";
		Level logginglevel;

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
		default:
			logginglevel = Level.INFO;
		}

		initLogger(logginglevel);
		logger.log(Level.INFO, "[Starting tasks.]");

		EMFModelUtil emfutil = new EMFModelUtil();
		myLabSystem = emfutil.loadModelInstance(modelfile);

		Lab goal = null;
		for (Lab lab : myLabSystem.getLabs()) {
			if (goallabname.equals(lab.getName())) {
				goal = lab;
			}
		}

		if (goal == null) {
			logger.log(Level.SEVERE, "The goal lab doesn't exist, check command line arguments!");
			System.exit(1);
		}

		distribute(myLabSystem.getTorrentSeed(), goal);

		logger.log(Level.INFO, "[Saving changes to model instance.]");
		emfutil.saveModelInstance();

		logger.log(Level.INFO, "[Done.]");
	}

	public static void distribute(final Computer seed, final Lab goal) {
		// get compat vms to install
		Map<Computer, List<VirtualMachine>> currentsetup = EMFModelUtil.buildComputerToVMsMapFromLabSystem(myLabSystem);
		Map<Computer, List<VirtualMachine>> goalsetup = EMFModelUtil.buildComputerToVMsMapFromLab(goal);

		Map<Computer, List<VirtualMachine>> vms_toinstall_notalreadyinstalled = EMFModelUtil
				.getConfWithoutAlreadyInstalledVMs(currentsetup, goalsetup);
		// remove seed
		vms_toinstall_notalreadyinstalled.remove(seed);
		Map<Computer, List<VirtualMachine>> vms_toinstall_alsocompatible = EMFModelUtil
				.getConfWithoutIncompatibleVMs(vms_toinstall_notalreadyinstalled);
		Map<VirtualMachine, String> vm_torrentfilename_map = new HashMap<>();

		if (vms_toinstall_alsocompatible.values().size() == 0) {
			logger.log(Level.WARNING, "No Virtual Machines can be distributed, see log above for reasons.");
			System.exit(1);
		}

		// copy vms to seed
		vm_torrentfilename_map = VMUtil.copyVmsToSeed(seed, goal);

		// start seeding
		TorrentUtil.startSeeding(seed);

		/*System.out.println("stop right there!");
		System.exit(0);//TODO*/
		
		for (Entry<Computer, List<VirtualMachine>> pc_vmlist : vms_toinstall_alsocompatible.entrySet()) {
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc_vmlist.getKey());
			for (VirtualMachine vm : vmstodistr) {
				TorrentUtil.copyTorrentFile(seed, pc_vmlist.getKey(), vm_torrentfilename_map.get(vm));
			}
			if (vmstodistr.size() > 0) {
				TorrentUtil.startLeeching(seed, pc_vmlist.getKey());
			}
		}

		// get info hashes
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

		// call distr progress loop
		try {
			logger.log(Level.INFO, "[Giving 10s grace period before asking for progress updates...]");
			Thread.sleep(10000);// TODO
		} catch (InterruptedException e) {
			logger.log(Level.SEVERE, "Waiting interrupted.", e);
		}

		distributionProgressLoop(transfers);

	}

	public static void distributionProgressLoop(List<Transfer> transfers) {
		DistributionStatusUpdater distrstatusupdater = new DistributionStatusUpdater(transfers);
		Thread statusthread = new Thread(distrstatusupdater);
		statusthread.setDaemon(true);
		statusthread.start();

		String msg = null;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			while (true) {
				msg = in.readLine();
				if ("".equals(msg) && !statusthread.isAlive()) {
					break;
				}
				if ("QUIT".equalsIgnoreCase(msg) || "EXIT".equalsIgnoreCase(msg)) {
					logger.log(Level.INFO, "Quit due to user command");
					logger.log(Level.INFO, "asd");
					List<String> incompletetransfers = distrstatusupdater.getIncompleteTransfers();
					if (incompletetransfers.size() > 0) {
						logger.warning("[There were unfinished transfers:]");
					}
					for (String s : incompletetransfers) {
						logger.warning(s);
					}
					break;
				}
			}
		} catch (UnsupportedEncodingException e1) {
			logger.log(Level.SEVERE, "UTF-8 encoding not supported, this should not happen.", e1);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Could not read user input.", e);
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				logger.log(Level.SEVERE, "Could not close input stream!", e);
			}
		}
	}
}

/*
 * TODO list
 * 
 * important: perf analysis in real lab,  fail distr - cleanup 
 * 
 * almost important: shutdown hook - log failed transfers?
 * 
 * not important: create javadoc
 * 

 * 
 * 
 */