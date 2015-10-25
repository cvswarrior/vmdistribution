package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hu.bme.mit.vmdistribution.model.*;

public class EMFModelLoad {
	public LabSystem load(){
		VMDistributionPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map <String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vmdistribution", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		File myModel = new File("../hu.bme.mit.vmdistribution.model.tests/modeltest/My.vmdistribution");
		Resource resource = resSet.getResource(URI.createURI(myModel.toURI().toString()), true);
		LabSystem myLabSystem = (LabSystem) resource.getContents().get(0);
		return myLabSystem;	
	}
	
}
