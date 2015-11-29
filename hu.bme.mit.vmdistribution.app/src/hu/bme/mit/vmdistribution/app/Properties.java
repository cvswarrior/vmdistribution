package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Properties {

	private static final String FILELOCATIONS_BUNDLE_NAME = "filelocations";
	private static ResourceBundle FILELOCATIONS_BUNDLE;
	private static final Logger logger = Logger.getLogger(Properties.class.getName());

	static {
		try {

			File executionPath = new File(UseModel.class.getProtectionDomain().getCodeSource().getLocation().getPath());
			String propertiesPath = executionPath.getParentFile().getAbsolutePath();
			File file = new File(propertiesPath);
			final URL[] urls = { file.toURI().toURL() };
			// security fix, <static initializer for Properties>() creates a
			// java.net.URLClassLoader classloader,
			// which should be performed within a doPrivileged block
			ClassLoader loader = (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<Object>() {
				public Object run() {
					return new URLClassLoader(urls);
				}
			});
			FILELOCATIONS_BUNDLE = ResourceBundle.getBundle(FILELOCATIONS_BUNDLE_NAME, Locale.getDefault(), loader);
		} catch (MalformedURLException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Properties() {
	}

	public static File getPath(final String name) {

		try {
			String path = FILELOCATIONS_BUNDLE.getString(name);
			return new File(path);
		} catch (MissingResourceException e) {
			logger.log(Level.SEVERE, "Can't find entries in property file for " + name + ".* !", e);
			return null;
		}

	}

	public static String getPathString(final String name) {
		try {
			return FILELOCATIONS_BUNDLE.getString(name);
		} catch (MissingResourceException e) {
			logger.log(Level.SEVERE, "Can't find entries in property file for " + name + ".* !", e);
			return null;
		}

	}
}