package hu.bme.mit.vmdistribution.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.ssh.SSHUtil;
import hu.bme.mit.vmdistribution.model.Computer;

public class TorrentUtil {
	
	private static final Logger logger = Logger.getLogger(TorrentUtil.class.getName());
	
	public static void copyTorrentFile(final Computer seed, final Computer target, final String torrentfilename) {
		SSHUtil sshutil = new SSHUtil(seed.getConnectioninfo());
		logger.log(Level.INFO, "[Copying torrent file "+torrentfilename+" to "+target.getName()+".]");
		StringBuilder command = new StringBuilder(Properties.getPathString("script_copy_torrent")+" ");
		command.append(target.getConnectioninfo().getHostName()+" ");
		command.append(String.valueOf(target.getConnectioninfo().getSshPass())+" ");
		command.append(torrentfilename);
		sshutil.remoteExec(command.toString());
	}
	
	public static void createTorrentFile(final Computer seed, final String vmzipname, final String vmtorrentname){
		SSHUtil sshutil = new SSHUtil(seed.getConnectioninfo());
		logger.log(Level.INFO, "[Creating torrent file for "+vmzipname+".]");
		StringBuilder command = new StringBuilder(Properties.getPathString("script_create_torrrent")+" ");
		command.append(seed.getConnectioninfo().getHostName()+" ");
		command.append(vmzipname+" ");
		command.append(vmtorrentname);
		sshutil.remoteExec(command.toString());
	}
	
	public static void startSeeding(final Computer seed){
		SSHUtil sshutil = new SSHUtil(seed.getConnectioninfo());
		StringBuilder command = new StringBuilder(Properties.getPathString("script_start_seeding"));
		sshutil.remoteExec(command.toString());
		logger.log(Level.INFO, "[Seeding started.]");
	}
	
	public static void startLeeching(final Computer seed, final Computer target){
		SSHUtil sshutil = new SSHUtil(seed.getConnectioninfo());
		StringBuilder command = new StringBuilder(Properties.getPathString("script_start_leeching")+" ");
		command.append(target.getConnectioninfo().getHostName()+" ");
		command.append(String.valueOf(target.getConnectioninfo().getSshPass()));
		sshutil.remoteExec(command.toString());
		logger.log(Level.INFO, "[Torrent client started on "+target.getName()+".]");
	}

}
