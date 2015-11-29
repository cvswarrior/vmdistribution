package hu.bme.mit.vmdistribution.app.ssh;

import net.schmizz.sshj.common.StreamCopier;
import net.schmizz.sshj.xfer.TransferListener;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyProgressMonitor implements TransferListener {

	private static final Logger logger = Logger.getLogger(CopyProgressMonitor.class.getName());
	private int hundredmegs = 0;

	private final String relPath;

	public CopyProgressMonitor() {
		this("");
	}

	private CopyProgressMonitor(String relPath) {
		this.relPath = relPath;
	}

	@Override
	public TransferListener directory(String name) {
		return new CopyProgressMonitor(relPath + name + "/");
	}

	@Override
	public StreamCopier.Listener file(final String name, final long size) {
		final String path = relPath + name;

		return new StreamCopier.Listener() {
			@Override
			public void reportProgress(long transferred) throws IOException {
				if (transferred > 100000000L * hundredmegs) {
					logger.log(Level.INFO, ">> Transferred " + (int) (transferred / 1000000.0) + "MB("
							+ ((transferred * 100) / size) + "%) of " + path + "");
					hundredmegs++;
				}
			}
		};
	}

}
