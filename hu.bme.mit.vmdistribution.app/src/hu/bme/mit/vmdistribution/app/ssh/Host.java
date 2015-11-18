package hu.bme.mit.vmdistribution.app.ssh;

import hu.bme.mit.vmdistribution.app.Properties;

public class Host {

	private String hostname;
	private int port;
	private String username;
	private char[] password;

	public Host() {
	}

	public Host(final String hostname, final int port, final String username, final char[] password) {
		this.hostname = hostname;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	public Host getHostData(final String hostname) {
		return Properties.getHostData(hostname);
	}

	public String getHostname() {
		return hostname;
	}

	public int getPort() {
		return port;
	}

	public String getUsername() {
		return username;
	}

	public char[] getPassword() {
		return password;
	}
	
	public void remoteExec(final String command) {
		SSHUtil sshutil = new SSHUtil(this);
		sshutil.connect();
		sshutil.executeCommand(command);
		sshutil.disconnect();
	}

}
