package hu.bme.mit.vmdistribution.app.ssh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SSHUtil {

	private JSch jsch;
	private Session session;
	private static final Logger logger = Logger.getLogger(SSHUtil.class.getName());

	public SSHUtil(Host host) {
		this.jsch = new JSch();
		this.session = null;
		try {
			session = jsch.getSession(host.getUsername(), host.getHostname(), host.getPort());
		} catch (JSchException e) {
			logger.log(Level.SEVERE, "ERROR connecting to host: " + host.getHostname(), e);
		}
		session.setPassword(String.valueOf(host.getPassword()));
		session.setConfig("StrictHostKeyChecking", "no");
	}

	public void copyFiles(List<File> files, String destfolder) {
		try {
			ChannelSftp channel = null;
			channel = (ChannelSftp) session.openChannel("sftp");
			channel.connect();
			logger.log(Level.FINE, "[SFTP Channel open.]");
			channel.cd(destfolder);
			logger.log(Level.INFO, "[Changed working directory to: " + channel.lpwd() + "]");
			for (File file : files) {
				logger.log(Level.INFO, "[Copying " + file.getName() + " to remote host...]");
				channel.put(new FileInputStream(file), file.getName());
				logger.log(Level.INFO, "[" + file.getName() + " copied to remote host.]");
			}
			channel.disconnect();
			logger.log(Level.FINE, "[SFTP Channel closed.]");
		} catch (JSchException e) {
			logger.log(Level.SEVERE, "ERROR: Could not open SFTP channel to host.", e);
		} catch (SftpException e) {
			logger.log(Level.SEVERE, "SFTP ERROR.", e);
		} catch (FileNotFoundException e) {
			logger.log(Level.SEVERE, "SFTP ERROR.", e);
		}

	}

	public void executeCommand(String command) {

		try {
			ChannelExec channel = (ChannelExec) session.openChannel("exec");
			BufferedReader in = new BufferedReader(new InputStreamReader(channel.getInputStream()));
			channel.setCommand(command);
			channel.connect();
			logger.log(Level.FINE, "[SSH Channel open.]");
			String commandprefix = session.getUserName() + "@" + session.getHost() + ": ";
			logger.log(Level.INFO, "[Command sent: " + commandprefix + command + "]");
			String msg = null;

			while ((msg = in.readLine()) != null) {
				logger.log(Level.INFO, msg);
			}
			channel.disconnect();
			logger.log(Level.FINE, "[SSH Channel closed.]");
		} catch (JSchException e) {
			logger.log(Level.SEVERE, "ERROR: Could not open SSH channel to host.", e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "ERROR: Could not open input stream on remote host.", e);
		}

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
		logger.log(Level.INFO, "SSH: Disconnected from " + session.getHost());
	}
}
