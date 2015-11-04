package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.resources.Properties;
import hu.bme.mit.vmdistribution.app.ssh.Host;
import hu.bme.mit.vmdistribution.app.ssh.SSHUtil;
import hu.bme.mit.vmdistribution.app.vagrantutil.VagrantUtil;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.CustomVM;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.Vagrant_VM;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class UseModel {

	private static final Logger logger_parent = Logger.getLogger("");
	private static final Logger logger = Logger.getLogger(UseModel.class.getName());
	private static LabSystem myLabSystem;

	public static void init() {
		System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
		logger_parent.setLevel(Level.INFO);
	}

	public static void main(String[] args) {
		init();
		logger.log(Level.INFO, "[Starting tasks.]");
		EMFModelUtil emfutil = new EMFModelUtil();
		myLabSystem = emfutil.loadModelInstance();
		Lab goal = null;
		for (Lab lab : myLabSystem.getLabs()){
			if("mixed_test".equals(lab.getName())){
				goal = lab;
			}
		}
		
		distribute(goal);

		logger.log(Level.INFO, "[Done.]");
	}

	public static void copyVM(String pcname, File vm, String destfolder) {
		Host host = Properties.getHostData(pcname);
		SSHUtil sshutil = new SSHUtil(host);
		sshutil.connect();
		List<File> files = new ArrayList<>();
		files.add(vm);
		sshutil.copyFiles(files, destfolder);
		sshutil.disconnect();
	}
	
	public static void copyTorrentFile(Host targetpc, String torrentfilename) {
		StringBuilder command = new StringBuilder("~/shared/copy_torrent_from_seeder_to_leecher.sh ");
		command.append(targetpc.getHostname()+" ");
		command.append(String.valueOf(targetpc.getPassword())+" ");
		command.append(torrentfilename);
		remoteExec("seed", command.toString());
	}
	
	public static void createTorrentFile(String vmzipname, String vmtorrentname){
		StringBuilder command = new StringBuilder("~/shared/create_torrent.sh ");
		Host host = Properties.getHostData("seed");
		command.append(host.getHostname()+" ");
		command.append(vmzipname+" ");
		command.append(vmtorrentname);
		remoteExec("seed", command.toString());
	}
	
	public static void startSeeding(){
		StringBuilder command = new StringBuilder("~/shared/start_seeding.sh ");
		Host host = Properties.getHostData("seed");
		command.append(host.getHostname()+" ");
		command.append(String.valueOf(host.getPassword()));
		remoteExec("seed", command.toString());
	}
	
	public static void startLeeching(Host targetpc){
		StringBuilder command = new StringBuilder("~/shared/start_leeching.sh ");
		command.append(targetpc.getHostname()+" ");
		command.append(String.valueOf(targetpc.getPassword()));
		remoteExec("seed", command.toString());
	}
	
	public static Map<VirtualMachine, String> copyVmsToSeed(Lab goal){
		Map<VirtualMachine, String> vm_torrentfilename_map = new HashMap<>();
		// prepare vagrant vms & copy single copy of vms to seed
		logger.log(Level.INFO, "[Copying required VMs to seed.]");
		for (ComputerConfig cfgitem : goal.getComputerconfigs()) {
			for (VirtualMachine vm : cfgitem.getVirtualmachines()) {

				if (vm_torrentfilename_map.containsKey(vm)) {
					continue;
				}

				File vmzipfile = null;
				String vmtorrentname;
				
				if ("CustomVM".equals(vm.eClass().getName())) {
					CustomVM customvm = (CustomVM) vm;
					vmzipfile =  customvm.getVmZipArchive();
					vmtorrentname = customvm.getVmZipArchive().getName().replace(".zip", ".torrent"); //TODO regex
					copyVM("seed", customvm.getVmZipArchive(), "/home/vagrant/Downloads");
					
				} else {
					Vagrant_VM vagrantvm = (Vagrant_VM) vm;
					vmzipfile =  vagrantvm.getDistributionImage();
					vmtorrentname = vagrantvm.getDistributionImage().getName().replace(".zip", ".torrent"); //TODO regex
					prepareVagrantVM(vagrantvm);
					copyVM("seed", vagrantvm.getDistributionImage(), "/home/vagrant/Downloads");
					
				}
				createTorrentFile(vmzipfile.getName(), vmtorrentname);
				vm_torrentfilename_map.put(vm, vmtorrentname);
			}
		}
		
		return vm_torrentfilename_map;
	}
	
	public static Map<Computer, List<VirtualMachine>> buildComputerToVMsMapFromLabSystem(LabSystem labsystem){
		Map<Computer, List<VirtualMachine>> map = new HashMap<>();
		for(Computer c : labsystem.getComputers()){
			map.put(c, c.getVirtualmachines());
		}
		return map;
	}
	
	public static Map<Computer, List<VirtualMachine>> buildComputerToVMsMapFromLab(Lab lab){
		Map<Computer, List<VirtualMachine>> map = new HashMap<>();
		for(ComputerConfig cfg : lab.getComputerconfigs()){
			map.put(cfg.getComputer(), cfg.getVirtualmachines());
		}
		return map;
	}
	
	public static void distribute(Lab goal) {
		
		//copy vms to seed
		Map<VirtualMachine, String> vm_torrentfilename_map = copyVmsToSeed(goal);
		
		//start seeding
		startSeeding();
		
		//get compat vms to install
		Map<Computer, List<VirtualMachine>> currentsetup = buildComputerToVMsMapFromLabSystem(myLabSystem);
		Map<Computer, List<VirtualMachine>> goalsetup = buildComputerToVMsMapFromLab(goal);

		Map<Computer, List<VirtualMachine>> vms_toinstall_notalreadyinstalled = getConfWithoutAlreadyInstalledVMs(currentsetup, goalsetup);
		Map<Computer, List<VirtualMachine>> vms_toinstall_alsocompatible = getConfWithoutIncompatibleVMs(vms_toinstall_notalreadyinstalled);
		
		for(Computer pc : vms_toinstall_alsocompatible.keySet()){
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc);
			for(VirtualMachine vm : vmstodistr){
				copyTorrentFile(Properties.getHostData(pc.getName()), vm_torrentfilename_map.get(vm));
			}
			startLeeching(Properties.getHostData(pc.getName()));
		}
		
		// TODO updatemodel
	}

	public static void prepareVagrantVM(Vagrant_VM vm) {
		logger.log(Level.INFO, "Creating and provisioning vagrant VM: "+vm.getName()+"]");
		VagrantUtil.runVagrantCommand("vagrant up", vm.getVagrantFile());
		logger.log(Level.INFO, "Shutting down VM to prepare for distribution.]");
		VagrantUtil.runVagrantCommand("vagrant halt", vm.getVagrantFile());
		logger.log(Level.INFO, "Creating .zip archive...]");
		File outputzip =  new File("E:\\"+vm.getName()+".zip");
		File foldertozip = new File(Properties.getPath("created_vagrant_vms").getAbsolutePath() + "\\vagrant_test");
		VagrantUtil.createZip(foldertozip, outputzip);
		vm.setDistributionImage(outputzip);
		vm.setReadyToDistribute(true);
	}

	public static void remoteExec(String pcname, String command) {
		SSHUtil sshutil = new SSHUtil(Properties.getHostData(pcname));
		sshutil.connect();
		sshutil.executeCommand(command);
		sshutil.disconnect();
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
	
	public static Map<Computer, List<VirtualMachine>> getConfWithoutIncompatibleVMs(Map<Computer, List<VirtualMachine>> goal_setup){
		Map<Computer, List<VirtualMachine>> goodsetup = new HashMap<>();

		for(Computer pc: goal_setup.keySet()){
			if(hasEnoughSpace(pc, goal_setup.get(pc))){
				goodsetup.put(pc, new ArrayList<VirtualMachine>());
				for (VirtualMachine vm :  goal_setup.get(pc)){
					if(!isCompatible(pc, vm)){
						goodsetup.get(pc).add(vm);
					}
				}
			}
		}
		return goodsetup;
	}
	
	public static double getUsedSpace(List<VirtualMachine> vms){
		double space = 0;
		for( VirtualMachine vm : vms){
			space = space + vm.getRequirements().getReqSpace();
		}
		return space;
	}
	
	public static boolean isCompatible(Computer pc, VirtualMachine vm){
		boolean result = true;
		if(!"x64".equals(pc.getArchitecture()) && !pc.getArchitecture().equals(vm.getRequirements().getReqArchi())){
			result = false;
			logger.log(Level.WARNING, "WARNING:_Computer:"+pc.getName()+" is not compatible with Virtual Machine:"+vm.getName()+", Architecture mismatch!");
		}
		if(pc.getInstalledRAM() < vm.getRequirements().getReqRAM()){
			logger.log(Level.WARNING, "WARNING:_Computer:"+pc.getName()+" is not compatible with Virtual Machine:"+vm.getName()+", Not enough RAM!");
		}
		
		return result;
	}
	
	public static boolean hasEnoughSpace(Computer pc, List<VirtualMachine> vms){
		boolean result;
		
		double pc_free_space = pc.getMaxSpaceForVMs() - getUsedSpace(pc.getVirtualmachines());
		double vms_toinstall_disk_usage = getUsedSpace(vms);
		
		if(pc_free_space >= vms_toinstall_disk_usage){
			result = true;
		}else{
			result = false;
			logger.log(Level.WARNING, "WARNING:_Computer:"+pc.getName()+" does not have enough free space for the new VMs! Available: "+pc_free_space+" MB, Required: "+vms_toinstall_disk_usage+" MB");
		}
		
		return result;
	}
	
}