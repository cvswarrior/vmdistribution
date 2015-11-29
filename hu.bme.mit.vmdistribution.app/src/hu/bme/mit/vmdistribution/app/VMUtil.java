package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.ssh.SSHUtil;
import hu.bme.mit.vmdistribution.app.vagrantutil.Archiver;
import hu.bme.mit.vmdistribution.app.vagrantutil.VagrantUtil;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.VagrantVM;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class VMUtil {

	private static final Logger logger = Logger.getLogger(VMUtil.class.getName());

	public static void copyVM(final Computer target, final File vm, final String destfolder) {
		SSHUtil sshutil = new SSHUtil(target.getConnectioninfo());
		List<File> files = new ArrayList<>();
		files.add(vm);
		sshutil.copyFiles(files, destfolder);
	}

	public static Map<VirtualMachine, String> copyVmsToSeed(final Computer seed, final Lab goal) {
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

				if ("VagrantVM".equals(vm.eClass().getName())) {
					VagrantVM vagrantvm = (VagrantVM) vm;
					//prepareVagrantVM(vagrantvm);TODO
					vmzipfile = vagrantvm.getVmZipArchive();
					vmtorrentname = vagrantvm.getVmZipArchive().getName().replaceFirst("\u002ezip$", ".torrent");
					copyVM(seed, vagrantvm.getVmZipArchive(), Properties.getPathString("vm_distr_target_location"));
				} else {
					vmzipfile = vm.getVmZipArchive();
					vmtorrentname = vm.getVmZipArchive().getName().replaceFirst("\u002ezip$", ".torrent");
					copyVM(seed, vm.getVmZipArchive(), Properties.getPathString("vm_distr_target_location"));
				}

				TorrentUtil.createTorrentFile(seed, vmzipfile.getName(), vmtorrentname);
				vm_torrentfilename_map.put(vm, vmtorrentname);
			}
		}
		return vm_torrentfilename_map;
	}

	public static void prepareVagrantVM(final VagrantVM vm) {
		logger.log(Level.INFO, "Creating and provisioning vagrant VM: " + vm.getName() + "]");
		VagrantUtil.runVagrantCommand("vagrant up", vm.getVagrantFile());
		logger.log(Level.INFO, "Shutting down VM to prepare for distribution.]");
		VagrantUtil.runVagrantCommand("vagrant halt", vm.getVagrantFile());
		logger.log(Level.INFO, "Creating .zip archive...]");
		File outputzip = new File(
				Properties.getPath("created_vagrant_vm_archives").getAbsolutePath() + vm.getName() + ".zip");
		File foldertozip = new File(Properties.getPath("created_vagrant_vms").getAbsolutePath() + "\\" + vm.getName());
		//Archiver.createZipArchive(foldertozip.getAbsolutePath(), outputzip.getAbsolutePath());TODO
		vm.setVmZipArchive(outputzip);
		vm.setReadyToDistribute(true);
	}
}
