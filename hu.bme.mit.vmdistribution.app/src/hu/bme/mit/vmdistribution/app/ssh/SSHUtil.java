package hu.bme.mit.vmdistribution.app.ssh;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PublicKey;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import hu.bme.mit.vmdistribution.model.ConnectionInfo;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.transport.TransportException;
import net.schmizz.sshj.transport.verification.HostKeyVerifier;
import net.schmizz.sshj.userauth.UserAuthException;
import net.schmizz.sshj.xfer.FileSystemFile;
import net.schmizz.sshj.xfer.scp.SCPFileTransfer;

public class SSHUtil {

	private JSch jsch;// TODO remove
	private Session session;// TODO remove
	private SSHClient sshclient;
	private static final Logger logger = Logger.getLogger(SSHUtil.class.getName());

	public SSHUtil(final ConnectionInfo host) {
		this.jsch = new JSch();
		this.session = null;
		try {
			session = jsch.getSession(host.getSshUser(), host.getHostName(), host.getSshPort());
		} catch (JSchException e) {
			logger.log(Level.SEVERE, "ERROR connecting to host: " + host.getHostName(), e);
		}
		session.setPassword(String.valueOf(host.getSshPass()));
		session.setConfig("StrictHostKeyChecking", "no");
		session.setConfig("compression.s2c", "zlib@openssh.com, zlib, none");

		this.sshclient = new SSHClient();
		try {
			sshclient.addHostKeyVerifier(new HostKeyVerifier() {
				@Override
				public boolean verify(String arg0, int arg1, PublicKey arg2) {
					return true;
				}
			});
			sshclient.loadKnownHosts();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sshclient.connect(host.getHostName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			sshclient.authPassword(host.getSshUser(), host.getSshPass());
		} catch (UserAuthException | TransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sshclient.useCompression();
		} catch (TransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void copyFiles(final List<File> files, final String destfolder) {

		try {

			for (File filetocopy : files) {
				SCPFileTransfer scpupload = sshclient.newSCPFileTransfer();
				scpupload.setTransferListener(new CopyProgressMonitor());
				scpupload.upload(new FileSystemFile(filetocopy.getAbsoluteFile()), destfolder);
			}

		} catch (UserAuthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void executeCommand(final String command) {

		BufferedReader in = null;
		BufferedReader err = null;
		try {
			ChannelExec channel = (ChannelExec) session.openChannel("exec");
			in = new BufferedReader(new InputStreamReader(channel.getInputStream(), "UTF-8"));
			err = new BufferedReader(new InputStreamReader(channel.getErrStream(), "UTF-8"));
			channel.setCommand(command);
			channel.connect();
			logger.log(Level.FINE, "[SSH Channel open.]");
			String commandprefix = session.getUserName() + "@" + session.getHost() + ": ";
			logger.log(Level.INFO, "[Command sent: " + commandprefix + command + "]");
			String msg = null;
			while ((msg = in.readLine()) != null) {
				logger.log(Level.INFO, msg);
			}
			String errmsg = null;
			while ((errmsg = err.readLine()) != null) {
				logger.log(Level.SEVERE, errmsg);
			}
			channel.disconnect();
			logger.log(Level.FINE, "[SSH Channel closed.]");
		} catch (JSchException e) {
			logger.log(Level.SEVERE, "ERROR: Could not open SSH channel to host.", e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "ERROR: Could not open input stream on remote host.", e);
		} finally {
			try {
				in.close();
				err.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void remoteExec(String command) {
		this.connect();
		this.executeCommand(command);
		this.disconnect();
	}

	public void connect() {
		try {
			session.connect();
		} catch (JSchException e) {
			logger.log(Level.SEVERE, "ERROR connecting to host: " + session.getHost(), e);
		}
		logger.log(Level.INFO, "SSH: Connected to " + session.getHost());
	}

	public void disconnect() {
		session.disconnect();
		try {
			sshclient.disconnect();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sshclient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.log(Level.INFO, "SSH: Disconnected from " + session.getHost());
	}
}
