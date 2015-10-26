package hu.bme.mit.vmdistribution.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.LabSystem;

public class ModelValidator {
       
        private static final Logger logger = Logger.getLogger(ModelValidator.class.getName());
       
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
                                logger.log(Level.INFO, "[Model validation succeeded.]");
                                return validateresult.append("Model is valid.\n").toString();
                        }
                        else{
                                logger.log(Level.WARNING, "[Model validation failed.]");
                                return validateresult.toString();
                        }
                       
                }
               
} 