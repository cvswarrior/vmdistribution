package hu.bme.mit.vmdistribution.app;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.LabSystem;

public class UseModel {

	public static void main(String[] args) {
		EMFModelLoad loader = new EMFModelLoad();
		LabSystem myLabSystem = loader.load();
		java.lang.System.out.println(validateModel(myLabSystem));
	}
	
	//validate test stub
	public static String validateModel(LabSystem myLabSystem){
		StringBuilder validateresult = new StringBuilder();
		
		
		//emf incquery
		for (Computer c : myLabSystem.getComputer()){
			if(!(c.getArchitecture().equalsIgnoreCase("x86") || c.getArchitecture().equalsIgnoreCase("x64"))){
				validateresult.append("Computer "+c.getName()+" architecture invalid!("+c.getArchitecture()+")\n");
			}
		}
		
		if(validateresult.length() == 0 ){
			return validateresult.append("Model is valid.\n").toString();
		}
		else{
			return validateresult.toString();
		}
		
	}
	
	
}
