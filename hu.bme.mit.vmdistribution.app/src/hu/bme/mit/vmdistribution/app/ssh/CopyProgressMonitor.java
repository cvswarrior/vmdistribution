package hu.bme.mit.vmdistribution.app.ssh;

import net.schmizz.sshj.common.StreamCopier;
import net.schmizz.sshj.xfer.TransferListener;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class implements {@link TransferListener} and is for monitoring SCP
 * uploads' progresses.
 * 
 * @author BVincze
 */
public class CopyProgressMonitor implements TransferListener {

	private static final Logger LOGGER = Logger.getLogger(CopyProgressMonitor.class.getName());
	/**
	 * Counter for each 100MB transferred.
	 */
	private int hundredmegs = 0;

	/**
	 * @see TransferListener
	 */
	private final String relPath;

	public CopyProgressMonitor() {
		this("");
	}

	private CopyProgressMonitor(final String relPath) {
		this.relPath = relPath;
	}

	@Override
	public final TransferListener directory(final String name) {
		return new CopyProgressMonitor(relPath + name + "/");
	}

	@Override
	public final StreamCopier.Listener file(final String name, final long size) {
		final String path = relPath + name;
		return new StreamCopier.Listener() {
			@Override
			public void reportProgress(final long transferred) throws IOException {
				// This method gets called pretty often while transfering so we
				// only display a log message every 100MBs.
				if (transferred > 100000000L * hundredmegs) {
					LOGGER.log(Level.INFO, ">> Transferred " + (int) (transferred / 1000000.0) + "MB("
							+ ((transferred * 100) / size) + "%) of " + path + "");
					hundredmegs++;
				}
			}
		};
	}
}
