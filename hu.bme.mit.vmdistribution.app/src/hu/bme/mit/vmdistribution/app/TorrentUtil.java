package hu.bme.mit.vmdistribution.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.resources.Properties;
import hu.bme.mit.vmdistribution.app.ssh.Host;

public class TorrentUtil {
	
	private static final Logger logger = Logger.getLogger(TorrentUtil.class.getName());
	
	public static void copyTorrentFile(Host targetpc, String torrentfilename) {
		logger.log(Level.INFO, "[Copying torrent file +"+torrentfilename+" to "+targetpc.getHostname()+".]");
		StringBuilder command = new StringBuilder(Properties.getPath("script_copy_torrent")+" ");
		command.append(targetpc.getHostname()+" ");
		command.append(String.valueOf(targetpc.getPassword())+" ");
		command.append(torrentfilename);
		Properties.getHostData("seed").remoteExec(command.toString());
	}
	
	public static void createTorrentFile(String vmzipname, String vmtorrentname){
		logger.log(Level.INFO, "[Createing torrent file for "+vmzipname+".]");
		StringBuilder command = new StringBuilder(Properties.getPath("script_create_torrrent")+" ");
		Host host = Properties.getHostData("seed");
		command.append(host.getHostname()+" ");
		command.append(vmzipname+" ");
		command.append(vmtorrentname);
		Properties.getHostData("seed").remoteExec(command.toString());
	}
	
	public static void startSeeding(){
		logger.log(Level.INFO, "[Seeding started.]");
		StringBuilder command = new StringBuilder(Properties.getPath("script_start_seeding")+" ");
		Host host = Properties.getHostData("seed");
		command.append(host.getHostname()+" ");
		command.append(String.valueOf(host.getPassword()));
		Properties.getHostData("seed").remoteExec(command.toString());
	}
	
	public static void startLeeching(Host targetpc){
		logger.log(Level.INFO, "[Torrent client started on "+targetpc.getHostname()+".]");
		StringBuilder command = new StringBuilder(Properties.getPath("script_start_leeching")+" ");
		command.append(targetpc.getHostname()+" ");
		command.append(String.valueOf(targetpc.getPassword()));
		Properties.getHostData("seed").remoteExec(command.toString());
	}
	

	
}
