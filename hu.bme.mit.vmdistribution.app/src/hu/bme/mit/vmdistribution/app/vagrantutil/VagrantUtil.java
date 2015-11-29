package hu.bme.mit.vmdistribution.app.vagrantutil;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VagrantUtil {

	private static final Logger logger = Logger.getLogger(VagrantUtil.class.getName());

	public static void runVagrantCommand(final String command, final File vagrantfile) {

		Process process;
		BufferedReader br = null;
		BufferedReader ebr = null;
		try {
			process = Runtime.getRuntime().exec(command, null, vagrantfile.getParentFile());
			InputStream is = process.getInputStream();
			InputStream eis = process.getErrorStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			InputStreamReader eisr = new InputStreamReader(eis, "UTF-8");
			br = new BufferedReader(isr);
			ebr = new BufferedReader(eisr);
			String line;
			String eline;

			while ((line = br.readLine()) != null) {
				logger.log(Level.INFO, line);
			}

			if ((eline = ebr.readLine()) != null) {
				logger.log(Level.SEVERE, "VAGRANT ERROR:");
				logger.log(Level.SEVERE, eline);
				while ((eline = ebr.readLine()) != null) {
					logger.log(Level.SEVERE, eline);
				}
			}
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Got I/O exception while executing Vagrant command:", e);
		} finally {
			try {
				br.close();
				ebr.close();
			} catch (IOException e) {
				logger.log(Level.SEVERE, "ERROR closing input streams!", e);
			}
		}
	}
}
