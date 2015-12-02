package hu.bme.mit.vmdistribution.app.vmutil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.Properties;
import hu.bme.mit.vmdistribution.app.ssh.SSHUtil;
import hu.bme.mit.vmdistribution.app.vmutil.VagrantUtil;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.VagrantVM;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

/**
 * This class has methods which can copy VMs to remote hosts and prepare
 * Vagrant-based VMs for distribution.
 * 
 * @author BVincze
 */
public final class VMUtil {

	private static final Logger LOGGER = Logger.getLogger(VMUtil.class.getName());

	private VMUtil() {

	}

	/**
	 * Copies a VM to the target Computer using SCP.
	 * 
	 * @param target
	 *            The target {@link Computer}
	 * @param vm
	 *            {@link File} containing the VM's archive to be copied.
	 * @param destfolder
	 *            The destination folder on the target Computer.
	 */
	public static void copyVM(final Computer target, final File vm, final String destfolder) {
		SSHUtil sshutil = new SSHUtil(target.getConnectioninfo());
		List<File> files = new ArrayList<>();
		files.add(vm);
		sshutil.copyFiles(files, destfolder);
	}

	/**
	 * Copies all VMs to be distributed to the seed and creates a torrent file
	 * for each one. Also initializes any Vagrant-based VMs.
	 * 
	 * @param seed
	 *            The {@link Computer} designated as the torrent seed.
	 * @param goal
	 *            A {@link Map} representing the goal state of the distribution
	 *            - which {@link Computer} should have which
	 *            {@link VirtualMachine}(s)
	 * @return A {@link Map} containing {@link VirtualMachine}s as keys and
	 *         torrent{@link File}s as values, so we can get which torrentfile
	 *         belongs to which VM later.
	 */
	public static Map<VirtualMachine, String> copyVmsToSeed(final Computer seed, final Lab goal) {
		Map<VirtualMachine, String> vm_torrentfilename_map = new HashMap<>();
		// prepare vagrant vms & copy single copy of vms to seed
		LOGGER.log(Level.INFO, "[Copying required VMs to seed.]");
		for (ComputerConfig cfgitem : goal.getComputerconfigs()) {
			for (VirtualMachine vm : cfgitem.getVirtualmachines()) {
				if (vm_torrentfilename_map.containsKey(vm)) {
					continue;
				}
				File vmzipfile = null;
				String vmtorrentname;

				// Vagrant-based VMs need to be initialized first
				if ("VagrantVM".equals(vm.eClass().getName())) {
					VagrantVM vagrantvm = (VagrantVM) vm;
					// prepareVagrantVM(vagrantvm);TODO
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

	/**
	 * Prepares Vagrant-based VMs for distribution. Initializes the VM using the
	 * supplied Vagrantfile, then creates a zip containing it and marks it ready
	 * for distribution.
	 * 
	 * @param vm
	 *            The {@link VagrantVM} to prepare.
	 */
	public static void prepareVagrantVM(final VagrantVM vm) {
		LOGGER.log(Level.INFO, "Creating and provisioning vagrant VM: " + vm.getName() + "]");
		// the 'vagrant up' command creates a working VM from a base box and
		// runs any provisional tasks set in the Vagrantfile
		VagrantUtil.runVagrantCommand("vagrant up", vm.getVagrantFile());
		LOGGER.log(Level.INFO, "Shutting down VM to prepare for distribution.]");
		VagrantUtil.runVagrantCommand("vagrant halt", vm.getVagrantFile());
		LOGGER.log(Level.INFO, "Creating .zip archive...]");
		File outputzip = new File(
				Properties.getPath("created_vagrant_vm_archives").getAbsolutePath() + vm.getName() + ".zip");
		File foldertozip = new File(Properties.getPath("created_vagrant_vms").getAbsolutePath() + "\\" + vm.getName());
		// Archiver.createZipArchive(foldertozip.getAbsolutePath(),
		// outputzip.getAbsolutePath());TODO use createzip return value
		vm.setVmZipArchive(outputzip);
		vm.setReadyToDistribute(true);
	}
}
