package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.ssh.Host;

public class Properties {

	private static final String HOSTS_BUNDLE_NAME = "hu.bme.mit.vmdistribution.app.resources.hosts";
	private static final String FILELOCATIONS_BUNDLE_NAME = "hu.bme.mit.vmdistribution.app.resources.filelocations";
	
	private static final ResourceBundle HOSTS_RESOURCE_BUNDLE = ResourceBundle.getBundle(HOSTS_BUNDLE_NAME);
	private static final ResourceBundle FILELOCATIONS_BUNDLE = ResourceBundle.getBundle(FILELOCATIONS_BUNDLE_NAME);
	
	private static final Logger logger = Logger.getLogger(Properties.class.getName());

	private Properties() {
	}

	public static Host getHostData(String name) {

		try {
			String hostname = HOSTS_RESOURCE_BUNDLE.getString(name + ".host");
			int port = Integer.parseInt(HOSTS_RESOURCE_BUNDLE.getString(name + ".port"));
			String username = HOSTS_RESOURCE_BUNDLE.getString(name + ".username");
			char[] password = HOSTS_RESOURCE_BUNDLE.getString(name + ".password").toCharArray();

			return new Host(hostname, port, username, password);
		} catch (MissingResourceException e) {
			logger.log(Level.SEVERE, "Can't find entries in property file for " + name + ".* !", e);
			return null;
		}

	}
	
	public static File getPath(String name) {

		try {
			String path = FILELOCATIONS_BUNDLE.getString(name);
			return new File(path);
		} catch (MissingResourceException e) {
			logger.log(Level.SEVERE, "Can't find entries in property file for " + name + ".* !", e);
			return null;
		}

	}
	
	public static String getPathString(String name) {
		try {
			return FILELOCATIONS_BUNDLE.getString(name);
		} catch (MissingResourceException e) {
			logger.log(Level.SEVERE, "Can't find entries in property file for " + name + ".* !", e);
			return null;
		}

	}
	
}