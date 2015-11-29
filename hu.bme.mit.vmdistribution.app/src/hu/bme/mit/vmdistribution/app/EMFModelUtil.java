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

public class EMFModelUtil {

	private static final Logger logger = Logger.getLogger(EMFModelUtil.class.getName());
	private Resource resource;

	public LabSystem loadModelInstance(File modelfile) {
		VMDistributionPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vmdistribution", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		this.resource = resSet.getResource(URI.createURI(modelfile.toURI().toString()), true);
		LabSystem myLabSystem = (LabSystem) this.resource.getContents().get(0);
		logger.log(Level.INFO, "[Model data loaded from " + modelfile.getAbsolutePath() + "]");
		return myLabSystem;
	}

	public void saveModelInstance() {
		try {
			resource.save(null);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "[ERROR saving model instance.]", e);
		}
	}

	public static Map<Computer, List<VirtualMachine>> buildComputerToVMsMapFromLabSystem(final LabSystem labsystem) {
		Map<Computer, List<VirtualMachine>> map = new HashMap<>();
		for (Computer c : labsystem.getComputers()) {
			map.put(c, c.getVirtualmachines());
		}
		return map;
	}

	public static Map<Computer, List<VirtualMachine>> buildComputerToVMsMapFromLab(final Lab lab) {
		Map<Computer, List<VirtualMachine>> map = new HashMap<>();
		for (ComputerConfig cfg : lab.getComputerconfigs()) {
			map.put(cfg.getComputer(), cfg.getVirtualmachines());
		}
		return map;
	}

	public static Map<Computer, List<VirtualMachine>> getConfWithoutAlreadyInstalledVMs(
			final Map<Computer, List<VirtualMachine>> current_setup,
			final Map<Computer, List<VirtualMachine>> goal_setup) {
		Map<Computer, List<VirtualMachine>> withoutalreadyinstalledvms = goal_setup;

		for (Computer pc : current_setup.keySet()) {
			if (withoutalreadyinstalledvms.containsKey(pc)) {
				withoutalreadyinstalledvms.get(pc).removeAll(pc.getVirtualmachines());
			}
		}
		return withoutalreadyinstalledvms;
	}

	public static Map<Computer, List<VirtualMachine>> getConfWithoutIncompatibleVMs(
			final Map<Computer, List<VirtualMachine>> goal_setup) {
		
		Map<Computer, List<VirtualMachine>> goodsetup = new HashMap<>();

		for (Entry<Computer, List<VirtualMachine>> pc_vmlist : goal_setup.entrySet()) {
			if (hasEnoughSpace(pc_vmlist.getKey(), goal_setup.get(pc_vmlist.getKey()))) {
				goodsetup.put(pc_vmlist.getKey(), new ArrayList<VirtualMachine>());
				for (VirtualMachine vm : goal_setup.get(pc_vmlist.getKey())) {
					if (isCompatible(pc_vmlist.getKey(), vm)) {
						goodsetup.get(pc_vmlist.getKey()).add(vm);
					}
				}
			}
		}
		return goodsetup;
	}

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

	public static double getUsedSpace(final List<VirtualMachine> vms) {
		double space = 0;
		for (VirtualMachine vm : vms) {
			space = space + vm.getRequirements().getReqSpace();
		}
		return space;
	}

	public static boolean isCompatible(final Computer pc, final VirtualMachine vm) {
		boolean result = true;
		if (!"x64".equals(pc.getArchitecture()) && !pc.getArchitecture().equals(vm.getRequirements().getReqArchi())) {
			result = false;
			logger.log(Level.WARNING, "WARNING:_Computer:" + pc.getName() + " is not compatible with Virtual Machine:"
					+ vm.getName() + ", Architecture mismatch!");
		}
		if (pc.getInstalledRAM() < vm.getRequirements().getReqRAM()) {
			result = false;
			logger.log(Level.WARNING, "WARNING:_Computer:" + pc.getName() + " is not compatible with Virtual Machine:"
					+ vm.getName() + ", Not enough RAM!");
		}

		return result;
	}

	public static boolean hasEnoughSpace(final Computer pc, final List<VirtualMachine> vms) {
		boolean result;

		double pc_free_space = pc.getMaxSpaceForVMs() - getUsedSpace(pc.getVirtualmachines());
		double vms_toinstall_disk_usage = getUsedSpace(vms);

		if (pc_free_space >= vms_toinstall_disk_usage) {
			result = true;
		} else {
			result = false;
			logger.log(Level.WARNING,
					"WARNING:_Computer:" + pc.getName()
							+ " does not have enough free space for the new VMs! Available: " + pc_free_space
							+ " MB, Required: " + vms_toinstall_disk_usage + " MB");
		}
		return result;
	}
}