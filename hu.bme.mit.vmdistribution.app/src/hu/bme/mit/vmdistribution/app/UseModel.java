package hu.bme.mit.vmdistribution.app;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.vagrantutil.Archiver;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class UseModel {

	private static final Logger logger_parent = Logger.getLogger("");
	private static final Logger logger = Logger.getLogger(UseModel.class.getName());
	private static LabSystem myLabSystem;

	public static void init() {
		System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
		logger_parent.setLevel(Level.FINER);
	}

	public static void main(String[] args) {
		
		init();
		logger.log(Level.INFO, "[Starting tasks.]");
		EMFModelUtil emfutil = new EMFModelUtil();
		myLabSystem = emfutil.loadModelInstance();
		Lab goal = null;
		//TODO replace with command line arguments
		for (Lab lab : myLabSystem.getLabs()){
			if("mixed_test".equals(lab.getName())){
				goal = lab;
			}
		}

		Archiver.createZipArchive("E:\\_TSYS\\VirtualBox\\_VMs\\vagrantvm_test","E:\\vagrantvm_test.zip");
		//distribute(goal);

		
		//save changes to model
		emfutil.saveModelInstance();
		logger.log(Level.INFO, "[Instance model updated.]");
		logger.log(Level.INFO, "[Done.]");
	}

	public static void distribute(Lab goal) {
		
		
		//TODO skip if nothing to copy
		//copy vms to seed
		Map<VirtualMachine, String> vm_torrentfilename_map = VMUtil.copyVmsToSeed(goal);
		
		//start seeding
		TorrentUtil.startSeeding();

		//get compat vms to install
		Map<Computer, List<VirtualMachine>> currentsetup = EMFModelUtil.buildComputerToVMsMapFromLabSystem(myLabSystem);
		Map<Computer, List<VirtualMachine>> goalsetup = EMFModelUtil.buildComputerToVMsMapFromLab(goal);

		Map<Computer, List<VirtualMachine>> vms_toinstall_notalreadyinstalled = getConfWithoutAlreadyInstalledVMs(currentsetup, goalsetup);
		Map<Computer, List<VirtualMachine>> vms_toinstall_alsocompatible = EMFModelUtil.getConfWithoutIncompatibleVMs(vms_toinstall_notalreadyinstalled);
		
		for(Computer pc : vms_toinstall_alsocompatible.keySet()){
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc);
			for(VirtualMachine vm : vmstodistr){
				TorrentUtil.copyTorrentFile(Properties.getHostData(pc.getName()), vm_torrentfilename_map.get(vm));
			}
			if(vmstodistr.size() > 0){
				TorrentUtil.startLeeching(Properties.getHostData(pc.getName()));
			}
			
			//update model
			for(VirtualMachine vm : vmstodistr){
				vm.getComputers().add(pc);
			}
			pc.getVirtualmachines().addAll(vmstodistr);
		}
		
	}

	public static Map<Computer, List<VirtualMachine>> getConfWithoutAlreadyInstalledVMs(Map<Computer, List<VirtualMachine>> current_setup, Map<Computer, List<VirtualMachine>> goal_setup){
		Map<Computer, List<VirtualMachine>> withoutalreadyinstalledvms = goal_setup;

		for (Computer pc : current_setup.keySet()) {
			if(withoutalreadyinstalledvms.containsKey(pc)){
				withoutalreadyinstalledvms.get(pc).removeAll(pc.getVirtualmachines());
			}
		}
		return withoutalreadyinstalledvms;
	}

}