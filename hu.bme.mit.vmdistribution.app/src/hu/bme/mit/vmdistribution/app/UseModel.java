package hu.bme.mit.vmdistribution.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	//private static RTorrentXmlRpcClient xmlRPCClient;

	public static void initLogger() {
		System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
		logger_parent.setLevel(Level.FINER);
	}

	public static void main(final String[] args) {
		String goallabname = "";
		if(args.length > 0){
			goallabname = args[0];
		}
		
		initLogger();
		logger.log(Level.INFO, "[Starting tasks.]");
		EMFModelUtil emfutil = new EMFModelUtil();
		myLabSystem = emfutil.loadModelInstance();
		//xmlRPCClient = new RTorrentXmlRpcClient(myLabSystem.getTorrentSeed());
		Lab goal = null;
		for (Lab lab : myLabSystem.getLabs()){
			if(goallabname.equals(lab.getName())){
				goal = lab;
			}
		}
		
		if(goal == null){
			logger.log(Level.SEVERE, "The goal lab doesn't exist, check command line arguments!");
			System.exit(1);
		}
		
		distribute(myLabSystem.getTorrentSeed(), goal);
		
		logger.log(Level.INFO, "[Saving changes to model instance.]");
		//emfutil.saveModelInstance();TODO
		
		logger.log(Level.INFO, "[Done.]");
	}

	public static void distribute(final Computer seed, final Lab goal) {
		//get compat vms to install
		Map<Computer, List<VirtualMachine>> currentsetup = EMFModelUtil.buildComputerToVMsMapFromLabSystem(myLabSystem);
		Map<Computer, List<VirtualMachine>> goalsetup = EMFModelUtil.buildComputerToVMsMapFromLab(goal);

		Map<Computer, List<VirtualMachine>> vms_toinstall_notalreadyinstalled = EMFModelUtil.getConfWithoutAlreadyInstalledVMs(currentsetup, goalsetup);
		Map<Computer, List<VirtualMachine>> vms_toinstall_alsocompatible = EMFModelUtil.getConfWithoutIncompatibleVMs(vms_toinstall_notalreadyinstalled);
		//TODO remove seed
		
		Map<VirtualMachine, String> vm_torrentfilename_map = new HashMap<>();
		
		if(vms_toinstall_alsocompatible.values().size() == 0){
			logger.log(Level.WARNING, "No Virtual Machines can be distributed, see log above for reasons.");
			System.exit(1);
		}
		
		//copy vms to seed
		//vm_torrentfilename_map = VMUtil.copyVmsToSeed(seed, goal);

		//start seeding
		//TorrentUtil.startSeeding(seed);
		
		for(Computer pc : vms_toinstall_alsocompatible.keySet()){
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc);
			for(VirtualMachine vm : vmstodistr){
				//TorrentUtil.copyTorrentFile(seed, pc, vm_torrentfilename_map.get(vm));
			}
			if(vmstodistr.size() > 0){
				//TorrentUtil.startLeeching(seed, pc);
			}
		}
		
		//get info hashes
		RTorrentXmlRpcClient xmlrpcclient_seed = new RTorrentXmlRpcClient(seed);
		Map<String, String> vmzipname_infohashes_map = xmlrpcclient_seed.getTorrentInfoHashes();
		Map<VirtualMachine, String>  vm_infohashes_map = new HashMap<>();
		for(String infohash : vmzipname_infohashes_map.keySet()){
			String vmzipname = vmzipname_infohashes_map.get(infohash);
			vm_infohashes_map.put(EMFModelUtil.getVmByFilename(vmzipname, myLabSystem.getVirtualmachines()), infohash);
		}
		
		//create Transfers for every Vm -> Pc transfer
		List<Transfer> transfers = new ArrayList<>();
		for(Computer pc : vms_toinstall_alsocompatible.keySet()){
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc);
			for(VirtualMachine vm : vmstodistr){
				transfers.add(new Transfer(vm, pc, vm_infohashes_map.get(vm)));
			}
		}
		
		//call distr progress loop
		try {
			logger.log(Level.INFO, "[Giving 10s grace period before asking for progress updates...]");
			Thread.sleep(10);//TODO
		} catch (InterruptedException e) {
			logger.log(Level.SEVERE, "Waiting interrupted.", e);
		}
		
		distributionProgressLoop(transfers);
		
	}

	public static void distributionProgressLoop(List<Transfer> transfers){
		DistributionStatusUpdater distrstatusupdater = new DistributionStatusUpdater(transfers);
		Thread statusthread = new Thread(distrstatusupdater);
		statusthread.setDaemon(true);
		statusthread.start();
		
		String msg = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try{
			msg=in.readLine();
			}catch(Exception e){
				e.printStackTrace();//TODO
			}
			if("QUIT".equalsIgnoreCase(msg) || "EXIT".equalsIgnoreCase(msg)){
				logger.info("Quit due to user command");
				List<String> incompletetransfers = distrstatusupdater.getIncompleteTransfers();
				if(incompletetransfers.size() > 0){
					logger.warning("[There were unfinished transfers:]");
				}
				for(String s : incompletetransfers){
					logger.warning(s);
				}
				System.exit(0);
			}
		}
		
	}

}