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

/**
 * Utility class to read a property file. The expected property file contains a
 * list of file paths.
 * 
 * @author BVincze
 */
public final class Properties {

	/**
	 * Name of the property file storing paths, such as the locations of all
	 * scripts.
	 */
	private static final String FILELOCATIONS_BUNDLE_NAME = "filelocations";
	/**
	 * {@link ResourceBundle} created from the property file.
	 */
	private static ResourceBundle FILELOCATIONS_BUNDLE;
	private static final Logger LOGGER = Logger.getLogger(Properties.class.getName());

	static {
		try {
			File executionPath = new File(UseModel.class.getProtectionDomain().getCodeSource().getLocation().getPath());
			String propertiesPath = executionPath.getParentFile().getAbsolutePath();
			File file = new File(propertiesPath);
			final URL[] urls = {
					file.toURI().toURL()
					};
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
			LOGGER.log(Level.SEVERE, "ERROR reading the propery file.", e);
		}
	}

	private Properties() {
	}

	/**
	 * Get the property value represented by the supplied key and return it as a
	 * {@link File} object.
	 * 
	 * @param name
	 *            The name of the property to be read.
	 * @return The {@link File} representing the read String.
	 */
	public static File getPath(final String name) {
		try {
			String path = FILELOCATIONS_BUNDLE.getString(name);
			return new File(path);
		} catch (MissingResourceException e) {
			LOGGER.log(Level.SEVERE, "Can't find entries in property file for " + name + ".* !", e);
			return null;
		}

	}

	/**
	 * Get the property value represented by the supplied key and return it as
	 * it is.
	 * 
	 * @param name
	 *            The name of the property to be read.
	 * @return The read String.
	 */
	public static String getPathString(final String name) {
		try {
			return FILELOCATIONS_BUNDLE.getString(name);
		} catch (MissingResourceException e) {
			LOGGER.log(Level.SEVERE, "Can't find entries in property file for " + name + ".* !", e);
			return null;
		}

	}
}
