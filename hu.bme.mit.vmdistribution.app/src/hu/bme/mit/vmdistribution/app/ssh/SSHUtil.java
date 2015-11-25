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

	private JSch jsch;
	private Session session;
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
	}

	public void copyFiles(final List<File> files, final String destfolder){
		final SSHClient ssh = new SSHClient();
        try {
        	ssh.addHostKeyVerifier(new HostKeyVerifier() {
				@Override
				public boolean verify(String arg0, int arg1, PublicKey arg2) {
					return true;
				}
			});
			ssh.loadKnownHosts();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			ssh.connect("192.168.100.101");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
        	ssh.authPassword("vagrant", "vagrant");
        	 ssh.useCompression();
        	
        	 for(File filetocopy : files){
        		 SCPFileTransfer scpupload = ssh.newSCPFileTransfer();
            	 scpupload.setTransferListener(new CopyProgressMonitor());
            	 scpupload.upload(new FileSystemFile((filetocopy.getAbsoluteFile())), destfolder);
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
            try {
				ssh.disconnect();
				ssh.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
	

	public void executeCommand(final String command) {

		try {
			ChannelExec channel = (ChannelExec) session.openChannel("exec");
			BufferedReader in = new BufferedReader(new InputStreamReader(channel.getInputStream()));
			BufferedReader err = new BufferedReader(new InputStreamReader(channel.getErrStream()));
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
		logger.log(Level.INFO, "SSH: Disconnected from " + session.getHost());
	}
}
