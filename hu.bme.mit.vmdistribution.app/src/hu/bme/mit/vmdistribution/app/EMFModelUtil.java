package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

/**
 * Utility class for tasks regarding our model object: reading the model
 * instance from file and doing various queries on it. The queries should be
 * replaced with EMF-IncQuery ones in the future for readability and performance
 * improvements.
 * 
 * @author BVincze
 */
public class EMFModelUtil {

	private static final Logger LOGGER = Logger.getLogger(EMFModelUtil.class.getName());
	/**
	 * {@link Resource} object representing the contents of the model file.
	 */
	private Resource resource;

	/**
	 * Loads the EMF instance model file and initializes a LabSystem object.
	 * 
	 * @param modelfile
	 *            - Path to the file containing the model instance - has
	 *            .vmdistribution extension
	 * @return A {@link LabSystem} object representing the root of our EMF instance model.
	 */
	public final LabSystem loadModelInstance(final File modelfile) {
		VMDistributionPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vmdistribution", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		this.resource = resSet.getResource(URI.createURI(modelfile.toURI().toString()), true);
		LabSystem myLabSystem = (LabSystem) this.resource.getContents().get(0);
		LOGGER.log(Level.INFO, "[Model data loaded from " + modelfile.getAbsolutePath() + "]");
		return myLabSystem;
	}

	/**
	 * Save the changes done to the model instance.
	 */
	public final void saveModelInstance() {
		try {
			resource.save(null);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "[ERROR saving model instance.]", e);
		}
	}

	/**
	 * Creates a Map representation of each Computer object's virtualmachines
	 * attribute from our model.
	 * 
	 * @param labsystem
	 *            - our instance model, {@link LabSystem}
	 * @return a {@link Map} with the {@link Computer}s as keys and the
	 *         {@link VirtualMachine}s on them as values
	 */
	public static Map<Computer, List<VirtualMachine>> buildComputerToVMsMapFromLabSystem(final LabSystem labsystem) {
		Map<Computer, List<VirtualMachine>> map = new HashMap<>();
		for (Computer c : labsystem.getComputers()) {
			map.put(c, c.getVirtualmachines());
		}
		return map;
	}

	/**
	 * Creates a Map representation of each ComputerConfig's Computer object's
	 * virtualmachines attribute from the supplied Lab object.
	 * 
	 * @param lab A {@link Lab} object containing {@link ComputerConfig}s
	 * @return A {@link Map} with the Computers as keys and the VMs on them as
	 *         values
	 */
	public static Map<Computer, List<VirtualMachine>> buildComputerToVMsMapFromLab(final Lab lab) {
		Map<Computer, List<VirtualMachine>> map = new HashMap<>();
		for (ComputerConfig cfg : lab.getComputerconfigs()) {
			map.put(cfg.getComputer(), cfg.getVirtualmachines());
		}
		return map;
	}

	/**
	 * Creates a copy of the {@code goal_setup} with all already installed VMs
	 * removed by checking {@code current_setup}.
	 * 
	 * @param current_setup
	 *            A {@link Map} representing the current state of our
	 *            {@link Computer} objects - which has which VM installed
	 * @param goal_setup
	 *            A {@link Map} representing the goal state of the distribution
	 *            - which {@link Computer} should have which
	 *            {@link VirtualMachine}(s)
	 * @return A Map containing the result of the {@code goal_setup} -
	 *         {@code current_setup} operation.
	 */
	public static Map<Computer, List<VirtualMachine>> getConfWithoutAlreadyInstalledVMs(
			final Map<Computer, List<VirtualMachine>> currentSetup,
			final Map<Computer, List<VirtualMachine>> goalSetup) {
		Map<Computer, List<VirtualMachine>> withoutAlreadyInstalledVms = goalSetup;

		for (Computer pc : currentSetup.keySet()) {
			if (withoutAlreadyInstalledVms.containsKey(pc)) {
				withoutAlreadyInstalledVms.get(pc).removeAll(pc.getVirtualmachines());
			}
		}
		return withoutAlreadyInstalledVms;
	}

	/**
	 * Removes incompatible Computer - VM pairs from the supplied map.
	 * 
	 * @param goal_setup
	 *            A {@link Map} representing the goal state of the distribution
	 *            - which {@link Computer} should have which VM(s)
	 * @return A {@link Map} representing the goal state of the distribution,
	 *         but withiout any incompatibilites
	 */
	public static Map<Computer, List<VirtualMachine>> getConfWithoutIncompatibleVMs(
			final Map<Computer, List<VirtualMachine>> goalSetup) {

		Map<Computer, List<VirtualMachine>> goodsetup = new HashMap<>();

		for (Entry<Computer, List<VirtualMachine>> pc_vmlist : goalSetup.entrySet()) {
			if (hasEnoughSpace(pc_vmlist.getKey(), goalSetup.get(pc_vmlist.getKey()))) {
				goodsetup.put(pc_vmlist.getKey(), new ArrayList<VirtualMachine>());
				for (VirtualMachine vm : goalSetup.get(pc_vmlist.getKey())) {
					if (isCompatible(pc_vmlist.getKey(), vm)) {
						goodsetup.get(pc_vmlist.getKey()).add(vm);
					}
				}
			}
		}
		return goodsetup;
	}

	/**
	 * Gets A VirtualMachine object from a Collection containing them by its
	 * filename(the archive's name that contains the VM)
	 * 
	 * @param vmZipName
	 *            Filename with extension
	 * @param vms
	 *            A {@link Collection} of {@link VirtualMachine} objects.
	 * @return A {@link VirtualMachine} if the filename represents one in the
	 *         supplied {@link Collection}, {@code null} otherwise.
	 */
	public static VirtualMachine getVmByFilename(final String vmZipName, final Collection<VirtualMachine> vms) {
		VirtualMachine result = null;
		for (VirtualMachine vm : vms) {
			if (vm.getVmZipArchive().getName().equals(vmZipName)) {
				result = vm;
				break;
			}
		}
		return result;
	}

	/**
	 * Gets the total space used by all VirtuVMs on a certain Computer.
	 * 
	 * @param vms
	 *            A {@link List} containing {@link VirtualMachine} objects
	 * @return The total used space in MegaBytes.
	 */
	public static double getUsedSpace(final List<VirtualMachine> vms) {
		double space = 0;
		for (VirtualMachine vm : vms) {
			space = space + vm.getRequirements().getReqSpace();
		}
		return space;
	}

	/**
	 * Checks if a Computer is compatible with a VM or not. Outputs a warning in
	 * case of incompatibility.
	 * 
	 * @param pc
	 *            The supplied {@link Computer}
	 * @param vm
	 *            The supplied {@link VirtualMachine}
	 * @return {@code true} if they are compatible, {@code false} otherwise
	 */
	public static boolean isCompatible(final Computer pc, final VirtualMachine vm) {
		boolean result = true;
		// check architecture for compatibility, x64 is compatible with x32 too,
		// x32 only with x32.
		if (!"x64".equals(pc.getArchitecture()) && !pc.getArchitecture().equals(vm.getRequirements().getReqArchi())) {
			result = false;
			LOGGER.log(Level.WARNING, "WARNING:_Computer:" + pc.getName() + " is not compatible with Virtual Machine:"
					+ vm.getName() + ", Architecture mismatch!");
		}
		// check required RAM amount
		if (pc.getInstalledRAM() < vm.getRequirements().getReqRAM()) {
			result = false;
			LOGGER.log(Level.WARNING, "WARNING:_Computer:" + pc.getName() + " is not compatible with Virtual Machine:"
					+ vm.getName() + ", Not enough RAM!");
		}

		return result;
	}

	/**
	 * Checks if a Computer has enough space for a List of VMs or not. Outputs a
	 * warning if not enough free space is available.
	 * 
	 * @param pc
	 *            The supplied {@link Computer}
	 * @param vms
	 *            The supplied {@link List} of {@link VirtualMachine}s
	 * @return {@code true} if there's enough space, {@code false} otherwise
	 */
	public static boolean hasEnoughSpace(final Computer pc, final List<VirtualMachine> vms) {
		boolean result;

		double pc_free_space = pc.getMaxSpaceForVMs() - getUsedSpace(pc.getVirtualmachines());
		double vms_toinstall_disk_usage = getUsedSpace(vms);

		if (pc_free_space >= vms_toinstall_disk_usage) {
			result = true;
		} else {
			result = false;
			LOGGER.log(Level.WARNING,
					"WARNING:_Computer:" + pc.getName()
							+ " does not have enough free space for the new VMs! Available: " + pc_free_space
							+ " MB, Required: " + vms_toinstall_disk_usage + " MB");
		}
		return result;
	}
}
