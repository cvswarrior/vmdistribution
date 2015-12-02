package hu.bme.mit.vmdistribution.app.vmutil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Utility class to zip the contents of a directory.
 * 
 * @author BVincze
 */
public final class Archiver {
	/**
	 * Input buffer size in bytes.
	 */
	private static final int BUFFER = 2048;
	private static final Logger LOGGER = Logger.getLogger(Archiver.class.getName());

	private Archiver() {

	}

	/**
	 * Creates a zip archive from a source folder.
	 * 
	 * @param srcFolder
	 *            The folder whose contents will be added to the archive
	 * @param destFile
	 *            The output {@link File}
	 * @return {@code true} if the zip file was succesfully created,
	 *         {@code false} if not.
	 */
	public static boolean createZipArchive(final String srcFolder, final String destFile) {
		ZipOutputStream out = null;
		BufferedInputStream origin = null;
		try {
			LOGGER.log(Level.INFO, "Creating Archive: " + destFile);
			FileOutputStream dest = new FileOutputStream(new File(destFile));
			out = new ZipOutputStream(new BufferedOutputStream(dest));
			byte[] data = new byte[BUFFER];
			File subDir = new File(srcFolder);
			String[] subdirList = subDir.list();
			if (subdirList == null) {
				throw new IOException(subDir.getAbsolutePath() + " is not a directory!");
			}
			for (String sd : subdirList) {
				// get a list of files from current directory
				File f = new File(srcFolder + "/" + sd);
				if (f.isDirectory()) {
					String[] files = f.list();
					if (files == null) {
						throw new IOException("Could not list the contents of the directory: " + f.getAbsolutePath());
					}
					for (int i = 0; i < files.length; i++) {
						LOGGER.log(Level.INFO, "Compressing: " + files[i]);
						File currentfile = new File((srcFolder + "/" + sd + "/" + files[i]));
						FileInputStream fi = new FileInputStream(currentfile);
						origin = new BufferedInputStream(fi, BUFFER);
						ZipEntry entry = new ZipEntry(sd + "/" + files[i]);
						out.putNextEntry(entry);
						int count;
						long currentpos = 0;
						int hundredmegs = 1;
						while ((count = origin.read(data, 0, BUFFER)) != -1) {
							out.write(data, 0, count);
							out.flush();
							currentpos = currentpos + count;
							// monitor progress
							if (currentpos > hundredmegs * 100000000L) {
								LOGGER.log(Level.INFO,
										"Compressed " + String.valueOf(currentpos / 1000000) + " MBytes");
								hundredmegs++;
							}
						}

					}
				} else {
					LOGGER.log(Level.INFO, "Compressing: " + f.getName());
					FileInputStream fi = new FileInputStream(f);
					origin = new BufferedInputStream(fi, BUFFER);
					ZipEntry entry = new ZipEntry(sd);
					out.putNextEntry(entry);
					int count;
					long currentpos = 0;
					int hundredmegs = 1;
					while ((count = origin.read(data, 0, BUFFER)) != -1) {
						out.write(data, 0, count);
						out.flush();
						currentpos = currentpos + count;
						// monitor progress
						if (currentpos > hundredmegs * 100000000L) {
							LOGGER.log(Level.INFO, "Compressed " + String.valueOf(currentpos / 1000000) + " MBytes");
							hundredmegs++;
						}
					}
				}
			}
			out.flush();
			LOGGER.log(Level.INFO, "Archive Created.");
		} catch (IOException e) {
			LOGGER.log(Level.INFO, "createZipArchive threw exception: " + e.getMessage());
			return false;
		} finally {
			try {
				origin.close();
				out.close();
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, "ERROR closing I/O streams.", e);
				e.printStackTrace();
			}
		}
		return true;
	}
}
