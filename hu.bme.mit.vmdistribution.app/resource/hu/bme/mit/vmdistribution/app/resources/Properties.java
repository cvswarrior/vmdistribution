package hu.bme.mit.vmdistribution.app.resources;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.ssh.Host;

public class Properties {

	private static final String BUNDLE_NAME = "hu.bme.mit.vmdistribution.app.resources.hosts";
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
	private static final Logger logger = Logger.getLogger(Properties.class.getName());

	private Properties() {
	}

	public static Host getHostData(String name) {

		try {
			String hostname = RESOURCE_BUNDLE.getString(name + ".host");
			int port = Integer.parseInt(RESOURCE_BUNDLE.getString(name + ".port"));
			String username = RESOURCE_BUNDLE.getString(name + ".username");
			char[] password = RESOURCE_BUNDLE.getString(name + ".password").toCharArray();

			return new Host(hostname, port, username, password);
		} catch (MissingResourceException e) {
			logger.log(Level.SEVERE, "Can't find entries in property file for " + name + ".* !", e);
			return new Host();
		}

	}
}