package hu.bme.mit.vmdistribution.app.vagrantutil;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.Properties;

public class VagrantUtil {
	
	private static final Logger logger = Logger.getLogger(VagrantUtil.class.getName());
	
	public static void runVagrantCommand(String command, File vagrantfile){
		
		Process process;
		try {
			process = Runtime.getRuntime().exec(command, null, vagrantfile.getParentFile());
			InputStream is = process.getInputStream();
			InputStream eis = process.getErrorStream();
			InputStreamReader isr = new InputStreamReader(is);
			InputStreamReader eisr = new InputStreamReader(eis);
			BufferedReader br = new BufferedReader(isr);
			BufferedReader ebr = new BufferedReader(eisr);
			String line;
			String eline;
			
			while ((line = br.readLine()) != null) {
				logger.log(Level.INFO, line);
			}
			
			if((eline = ebr.readLine()) != null){
				logger.log(Level.SEVERE, "VAGRANT ERROR:");
				logger.log(Level.SEVERE, eline);
				while ((eline = ebr.readLine()) != null) {
						logger.log(Level.SEVERE, eline);
					}
			}
		} catch (IOException e) {
			logger.log(Level.SEVERE, "", e);
		}
	}	

	public static void createZip(File sourcefolder, File output){
		
		
		StringBuilder command = new StringBuilder(Properties.getPath("7zip_cli_exe").getAbsolutePath());
		command.append(" u ");
		command.append(output.getAbsolutePath()+" ");
		command.append(sourcefolder.getAbsolutePath());
		Process process;
		try {
			process = Runtime.getRuntime().exec(command.toString());
			InputStream is = process.getInputStream();
			InputStream eis = process.getErrorStream();
			InputStreamReader isr = new InputStreamReader(is);
			InputStreamReader eisr = new InputStreamReader(eis);
			BufferedReader br = new BufferedReader(isr);
			BufferedReader ebr = new BufferedReader(eisr);
			String line;
			String eline;
			
			while ((line = br.readLine()) != null) {
				logger.log(Level.INFO, line);
			}
			
			if((eline = ebr.readLine()) != null){
				logger.log(Level.SEVERE, "7ZIP ERROR:");
				logger.log(Level.SEVERE, eline);
				while ((eline = ebr.readLine()) != null) {
						logger.log(Level.SEVERE, eline);
					}
			}
		} catch (IOException e) {
			logger.log(Level.SEVERE, "", e);
		}
		
	}
	
}
