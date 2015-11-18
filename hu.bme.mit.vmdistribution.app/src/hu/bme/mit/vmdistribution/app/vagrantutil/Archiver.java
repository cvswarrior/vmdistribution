package hu.bme.mit.vmdistribution.app.vagrantutil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import hu.bme.mit.vmdistribution.app.UseModel;

public class Archiver {
	final static int BUFFER = 2048;
	private static final Logger logger = Logger.getLogger(UseModel.class.getName());

	public static boolean createZipArchive(final String srcFolder, final String destFile) {

		try {
			logger.log(Level.INFO, "Creating Archive: "+destFile);
			BufferedInputStream origin = null;

			FileOutputStream dest = new FileOutputStream(new File(destFile));

			ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
			byte data[] = new byte[BUFFER];

			File subDir = new File(srcFolder);
			String subdirList[] = subDir.list();
			for (String sd : subdirList) {
				// get a list of files from current directory
				File f = new File(srcFolder + "/" + sd);
				if (f.isDirectory()) {
					String files[] = f.list();

					for (int i = 0; i < files.length; i++) {
						logger.log(Level.INFO, "Compressing: "+files[i]);
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
							if(currentpos > hundredmegs * 100000000){
								logger.log(Level.INFO,"Compressed "+String.valueOf(currentpos/1000000)+" MBytes");
								hundredmegs++;
							}
						}

					}
				} else // it is just a file
				{
					logger.log(Level.INFO, "Compressing: "+f.getName());
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
						if(currentpos > hundredmegs * 100000000){
							logger.log(Level.INFO,"Compressed "+String.valueOf(currentpos/1000000)+" MBytes");
							hundredmegs++;
						}
					}

				}
			}
			origin.close();
			out.flush();
			out.close();
			logger.log(Level.INFO, "Archive Created.");
		} catch (Exception e) {
			logger.info("createZipArchive threw exception: " + e.getMessage());
			return false;

		}

		return true;
	}
	
	
}