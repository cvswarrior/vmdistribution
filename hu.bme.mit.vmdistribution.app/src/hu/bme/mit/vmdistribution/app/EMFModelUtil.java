package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;

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