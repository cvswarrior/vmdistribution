package hu.bme.mit.vmdistribution.app.ssh;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.model.ConnectionInfo;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.common.IOUtils;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.connection.channel.direct.Session.Command;
import net.schmizz.sshj.transport.verification.HostKeyVerifier;
import net.schmizz.sshj.xfer.FileSystemFile;
import net.schmizz.sshj.xfer.scp.SCPFileTransfer;

public class SSHUtil {

	private SSHClient sshClient;
	private ConnectionInfo remoteHost;
	private static final Logger logger = Logger.getLogger(SSHUtil.class.getName());

	public SSHUtil(final ConnectionInfo host) {
		this.remoteHost = host;
		this.sshClient = new SSHClient();

		sshClient.addHostKeyVerifier(new HostKeyVerifier() {
			@Override
			public boolean verify(String arg0, int arg1, PublicKey arg2) {
				return true;
			}
		});

		try {
			sshClient.connect(host.getHostName());
			sshClient.authPassword(host.getSshUser(), host.getSshPass());
			sshClient.useCompression();
			logger.log(Level.INFO, "SSH: Connected to " + sshClient.getRemoteHostname());
		} catch (IOException e) {
			logger.log(Level.SEVERE, "ERROR connecting to host: " + sshClient.getRemoteHostname(), e);
		}
	}

	public void copyFiles(final List<File> files, final String destfolder) {
		try {
			for (File filetocopy : files) {
				SCPFileTransfer scpupload = sshClient.newSCPFileTransfer();
				scpupload.setTransferListener(new CopyProgressMonitor());
				scpupload.upload(new FileSystemFile(filetocopy.getAbsoluteFile()), destfolder);
			}
		} catch (IOException e) {
			logger.log(Level.SEVERE, "ERROR, SCP upload failed: ", e);
		} finally {
			try {
				sshClient.disconnect();
			} catch (IOException e) {
				logger.log(Level.SEVERE, "ERROR disconnecting ssh session.", e);
			}
		}
	}

	public void remoteExec(final String command) {

		Session session = null;
		try {
			session = this.sshClient.startSession();
			logger.log(Level.FINE, "[SSH session open.]");
			final Command cmd = session.exec(command);
			String commandprefix = remoteHost.getSshUser() + "@" + sshClient.getRemoteHostname() + ": ";
			logger.log(Level.INFO, "[Command sent: " + commandprefix + command + "]");
			logger.log(Level.INFO, IOUtils.readFully(cmd.getInputStream()).toString());
			logger.log(Level.SEVERE, IOUtils.readFully(cmd.getErrorStream()).toString());
		} catch (IOException e) {
			logger.log(Level.SEVERE, "ERROR executing command over ssh:", e);
		} finally {
			try {
				session.close();
				logger.log(Level.FINE, "[SSH session closed.]");
				sshClient.disconnect();
				logger.log(Level.INFO, "SSH: Disconnected from " + sshClient.getRemoteHostname());
			} catch (IOException e) {
				logger.log(Level.SEVERE, "ERROR disconnecting ssh session.", e);
			}
		}
	}

}
