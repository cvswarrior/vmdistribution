package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	//private IncQueryEngine engine;
	
	//private ComputersMatcher computersmatcher;

	public LabSystem loadModelInstance() {
		VMDistributionPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vmdistribution", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		File myModel = new File("../hu.bme.mit.vmdistribution.model.tests/modeltest/My.vmdistribution");
		Resource resource = resSet.getResource(URI.createURI(myModel.toURI().toString()), true);
		
		/*
		try {
			engine = IncQueryEngine.on(resource);
			computersmatcher = ComputersMatcher.on(engine);
		} catch (IncQueryException e) {
			logger.log(Level.SEVERE, "ERROR ", e);
		}*/
		
		LabSystem myLabSystem = (LabSystem) resource.getContents().get(0);
		logger.log(Level.INFO, "[Model data loaded from " + myModel.getAbsolutePath() + "]");
		return myLabSystem;
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
	
	
	/*
	public List<Computer> query_GetAllComputers(){
		List<Computer> result = new ArrayList<Computer>();
		Collection<ComputersMatch> matches = computersmatcher.getAllMatches();
		for(ComputersMatch cm : matches){
			result.add(cm.getC());
		}
		return result;
	}*/

}