package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.ssh.Host;
import hu.bme.mit.vmdistribution.app.ssh.SSHUtil;
import hu.bme.mit.vmdistribution.app.vagrantutil.VagrantUtil;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.CustomVM;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.Vagrant_VM;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class VMUtil {
	
	private static final Logger logger = Logger.getLogger(VMUtil.class.getName());
	
	
	public static void copyVM(String pcname, File vm, String destfolder) {
		Host host = Properties.getHostData(pcname);
		SSHUtil sshutil = new SSHUtil(host);
		sshutil.connect();
		List<File> files = new ArrayList<>();
		files.add(vm);
		sshutil.copyFiles(files, destfolder);
		sshutil.disconnect();
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
					vmtorrentname = customvm.getVmZipArchive().getName().replaceFirst("\u002ezip$", ".torrent"); 
					copyVM("seed", customvm.getVmZipArchive(), Properties.getPath("vm_distr_target_location").getAbsolutePath()+" ");
					
				} else {
					Vagrant_VM vagrantvm = (Vagrant_VM) vm;
					vmzipfile =  vagrantvm.getDistributionImage();
					vmtorrentname = vagrantvm.getDistributionImage().getName().replaceFirst("\u002ezip$", ".torrent");
					prepareVagrantVM(vagrantvm);
					copyVM("seed", vagrantvm.getDistributionImage(), Properties.getPath("vm_distr_target_location").getAbsolutePath()+" ");
					
				}
				TorrentUtil.createTorrentFile(vmzipfile.getName(), vmtorrentname);
				vm_torrentfilename_map.put(vm, vmtorrentname);
			}
		}
		return vm_torrentfilename_map;
	}
	
	public static void prepareVagrantVM(Vagrant_VM vm) {
		logger.log(Level.INFO, "Creating and provisioning vagrant VM: "+vm.getName()+"]");
		VagrantUtil.runVagrantCommand("vagrant up", vm.getVagrantFile());
		logger.log(Level.INFO, "Shutting down VM to prepare for distribution.]");
		VagrantUtil.runVagrantCommand("vagrant halt", vm.getVagrantFile());
		logger.log(Level.INFO, "Creating .zip archive...]");
		File outputzip =  new File(Properties.getPath("created_vagrant_vm_archives").getAbsolutePath() + vm.getName() + ".zip");
		File foldertozip = new File(Properties.getPath("created_vagrant_vms").getAbsolutePath() + "\\"+ vm.getName());
		VagrantUtil.createZip(foldertozip, outputzip);
		vm.setDistributionImage(outputzip);
		vm.setReadyToDistribute(true);
	}
	
}
