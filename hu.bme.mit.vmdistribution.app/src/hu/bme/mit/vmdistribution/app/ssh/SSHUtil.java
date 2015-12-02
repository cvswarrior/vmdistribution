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

/**
 * This class is responsible for estabilishing SSH connections to remote
 * machines and executing commands over ssh and sending files via SCP.
 * 
 * @author BVincze
 */
public class SSHUtil {

	/**
	 * Represents the connection to the remote host.
	 */
	private SSHClient sshClient;
	/**
	 * Contains every information needed to establilish an SSH connection:
	 * hostname, user and password.
	 */
	private ConnectionInfo remoteHost;
	private static final Logger LOGGER = Logger.getLogger(SSHUtil.class.getName());

	/**
	 * Creates an SSH session to the remote host using the provided credentials.
	 * Host key verification is disabled to allow ease of use.
	 * 
	 * @param host
	 *            The {@link ConnectionInfo} which contains every information
	 *            needed to establilish an SSH connection, field of
	 *            {@link Computer} objects.
	 */
	public SSHUtil(final ConnectionInfo host) {
		this.remoteHost = host;
		this.sshClient = new SSHClient();

		// disable host key verification - return true for any combination
		sshClient.addHostKeyVerifier(new HostKeyVerifier() {
			@Override
			public boolean verify(final String arg0, final int arg1, final PublicKey arg2) {
				return true;
			}
		});

		try {
			sshClient.connect(host.getHostName());
			sshClient.authPassword(host.getSshUser(), host.getSshPass());
			sshClient.useCompression();
			LOGGER.log(Level.INFO, "SSH: Connected to " + sshClient.getRemoteHostname());
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "ERROR connecting to host: " + sshClient.getRemoteHostname(), e);
		}
	}

	/**
	 * Copies files via SCP to the host this instance is connected to. Uses
	 * {@link CopyProgressMonitor} to monitor upload progress.
	 * 
	 * @param files
	 *            A {@link List} of {@link File}s to copy
	 * @param destfolder
	 *            The destination folder on the remote host.
	 */
	public final void copyFiles(final List<File> files, final String destfolder) {
		try {
			for (File filetocopy : files) {
				SCPFileTransfer scpupload = sshClient.newSCPFileTransfer();
				scpupload.setTransferListener(new CopyProgressMonitor());
				scpupload.upload(new FileSystemFile(filetocopy.getAbsoluteFile()), destfolder);
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "ERROR, SCP upload failed: ", e);
		} finally {
			try {
				sshClient.disconnect();
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, "ERROR disconnecting ssh session.", e);
			}
		}
	}

	/**
	 * Executes a command on the remote host.
	 * 
	 * @param command
	 *            The command to be executed.
	 */
	public final void remoteExec(final String command) {
		Session session = null;
		try {
			session = this.sshClient.startSession();
			LOGGER.log(Level.FINE, "[SSH session open.]");
			final Command cmd = session.exec(command);
			String commandprefix = remoteHost.getSshUser() + "@" + sshClient.getRemoteHostname() + ": ";
			LOGGER.log(Level.INFO, "[Command sent: " + commandprefix + command + "]");
			LOGGER.log(Level.INFO, IOUtils.readFully(cmd.getInputStream()).toString());
			String execerrors = IOUtils.readFully(cmd.getErrorStream()).toString();
			if (execerrors != null && execerrors.length() > 0) {
				LOGGER.log(Level.SEVERE, execerrors);
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "ERROR executing command over ssh:", e);
		} finally {
			try {
				session.close();
				LOGGER.log(Level.FINE, "[SSH session closed.]");
				sshClient.disconnect();
				LOGGER.log(Level.INFO, "SSH: Disconnected from " + sshClient.getRemoteHostname());
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, "ERROR disconnecting ssh session.", e);
			}
		}
	}
}
