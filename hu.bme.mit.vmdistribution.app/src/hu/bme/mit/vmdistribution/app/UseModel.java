package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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

	public static void init() {
		System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
		logger_parent.setLevel(Level.INFO);
	}

	public static void main(String[] args) {
		init();
		logger.log(Level.INFO, "[Starting tasks.]");
		EMFModelUtil emfutil = new EMFModelUtil();
		LabSystem myLabSystem = emfutil.loadModelInstance();
		Lab goal = null;
		for (Lab lab : myLabSystem.getLabs()){
			if("mixed_test".equals(lab.getName())){
				goal = lab;
			}
		}
		
		List<Computer> pcs = emfutil.query_GetAllComputers();
		for (Computer computer : pcs) {
			System.out.println(computer.getName());
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

	public static void distribute(Lab goal) {

		List<VirtualMachine> seenVMs = new ArrayList<>();

		// prepare vagrant vms & copy single copy of vms to torrent seed
		logger.log(Level.INFO, "[Copying required VMs to seed.]");
		for (ComputerConfig cfgitem : goal.getComputerconfigs()) {
			for (VirtualMachine vm : cfgitem.getVirtualmachines()) {

				if (seenVMs.contains(vm)) {
					continue;
				}

				if ("CustomVM".equals(vm.eClass().getName())) {
					CustomVM customvm = (CustomVM) vm;
					copyVM("seed", customvm.getVmZipArchive(), "/home/vagrant/Downloads");
				} else {
					Vagrant_VM vagrantvm = (Vagrant_VM) vm;
					prepareVagrantVM(vagrantvm);
					copyVM("seed", vagrantvm.getDistributionImage(), "/home/vagrant/Downloads");
				}
				seenVMs.add(vm);
			}
		}
		
		/*
		//CHEAT:
		List<Computer> targetpcs = new ArrayList<>();
		targetpcs.add(goal.getComputerconfigs().get(0).getComputer());
		targetpcs.add(goal.getComputerconfigs().get(1).getComputer());
		//targetpcs.add(goal.getComputerconfig().get(2).getComputer());
		
		logger.log(Level.INFO, "[Creating torrent file and starting seeding.]");
		StringBuilder command = new StringBuilder("~/shared/begin_seed.sh ");
		Host host = Properties.getHostData("seed");
		command.append(host.getHostname()+" ");
		command.append("testvm.zip ");
		command.append("testvm.torrent");
		remoteExec("seed", command.toString());
		
		logger.log(Level.INFO, "[Distribute torrent and start rtorrent on clients.]");
		for (Computer pc : targetpcs){
			command = new StringBuilder("~/shared/init_leecher.sh ");
			host = Properties.getHostData(pc.getName());
			command.append(host.getHostname()+" ");
			command.append(String.valueOf(host.getPassword())+" ");
			command.append("testvm.torrent");
			remoteExec("seed", command.toString());
		}*/
		
		// updatemodel
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
	
	
}