package hu.bme.mit.vmdistribution.app.vmutil;

import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.Properties;
import hu.bme.mit.vmdistribution.app.ssh.SSHUtil;
import hu.bme.mit.vmdistribution.model.Computer;

/**
 * This class has methods which can copy/create torrent files, and start
 * seeding/leeching.
 * 
 * @author BVincze
 */
public final class TorrentUtil {

	private static final Logger LOGGER = Logger.getLogger(TorrentUtil.class.getName());

	private TorrentUtil() {
	}

	/**
	 * Copy torrent file from seed to the target Computer. It is done by
	 * invoking a bash script on the seed. This script is named
	 * "copy_torrent_from_seeder_to_leecher.sh" by default and has the following
	 * parameters:
	 * <ol>
	 * <li>hostname of target Computer</li>
	 * <li>password of vagrant user on target Computer</li>//TODO
	 * <li>name of the torrent file to be copied</li>
	 * </ol>
	 * The script copies the torrent file via SCP to the target's torrent
	 * client's watch directory.
	 * 
	 * @param seed
	 *            The {@link Computer} designated as the torrent seed.
	 * @param target
	 *            The target {@link Computer} to copy the torrent file to.
	 * @param torrentfilename
	 *            The name of the torrent file to be copied.
	 */
	public static void copyTorrentFile(final Computer seed, final Computer target, final String torrentfilename) {
		SSHUtil sshutil = new SSHUtil(seed.getConnectioninfo());
		LOGGER.log(Level.INFO, "[Copying torrent file " + torrentfilename + " to " + target.getName() + ".]");
		StringBuilder command = new StringBuilder(Properties.getPathString("script_copy_torrent") + " ");
		command.append(target.getConnectioninfo().getHostName() + " ");
		command.append(target.getConnectioninfo().getSshUser() + " ");
		command.append(target.getConnectioninfo().getSshPass() + " ");
		command.append(torrentfilename);
		sshutil.remoteExec(command.toString());
	}

	/**
	 * Creates a torrent file of an archive containing a VM. Invokes a bash
	 * script on the seed. This script is named "create_torrent.sh" by default
	 * and has the following parameters:
	 * 
	 * <ol>
	 * <li>IP address of the Computer running the torrent tracker (seed
	 * probably)</li>
	 * <li>Seeded item name (the VM zip)</li>
	 * <li>Name of the torrent file to be created</li>
	 * </ol>
	 * The script runs the mktorrent program to create the torrent file.
	 * 
	 * @param seed
	 *            The {@link Computer} designated as the torrent seed.
	 * @param vmzipname
	 *            name of an archive file containing a VM.
	 * @param vmtorrentname
	 *            name of the torrent file to be created.
	 */
	public static void createTorrentFile(final Computer seed, final String vmzipname, final String vmtorrentname) {
		SSHUtil sshutil = new SSHUtil(seed.getConnectioninfo());
		LOGGER.log(Level.INFO, "[Creating torrent file for " + vmzipname + ".]");
		StringBuilder command = new StringBuilder(Properties.getPathString("script_create_torrrent") + " ");
		command.append(seed.getConnectioninfo().getHostName() + " ");
		command.append(vmzipname + " ");
		command.append(vmtorrentname);
		sshutil.remoteExec(command.toString());
	}

	/**
	 * Start seeding on the Computer designated as seed. Invokes a bash script
	 * on the seed. This script is named "start_seeding.sh" by default. The
	 * script runs the tracker(opentracker) and the torrent client(rtorrent) in
	 * a separate user terminal via the tmux application.
	 * 
	 * @param seed
	 *            The {@link Computer} designated as the torrent seed.
	 */
	public static void startSeeding(final Computer seed) {
		SSHUtil sshutil = new SSHUtil(seed.getConnectioninfo());
		StringBuilder command = new StringBuilder(Properties.getPathString("script_start_seeding"));
		sshutil.remoteExec(command.toString());
		LOGGER.log(Level.INFO, "[Seeding started.]");
	}

	/**
	 * Start the leeching process on a target Computer. Invokes a bash script on
	 * the seed. This script is named "start_leeching.sh" by default and has the
	 * following parameters:
	 * 
	 * <ol>
	 * <li>hostname of target Computer</li>
	 * <li>password of vagrant user on target Computer</li>//TODO
	 * </ol>
	 * 
	 * @param seed
	 *            The {@link Computer} designated as the torrent seed.
	 * @param target
	 *            The target {@link Computer} to start leeching on.
	 */
	public static void startLeeching(final Computer seed, final Computer target) {
		SSHUtil sshutil = new SSHUtil(seed.getConnectioninfo());
		StringBuilder command = new StringBuilder(Properties.getPathString("script_start_leeching") + " ");
		command.append(target.getConnectioninfo().getHostName() + " ");
		command.append(target.getConnectioninfo().getSshUser() + " ");
		command.append(target.getConnectioninfo().getSshPass());
		sshutil.remoteExec(command.toString());
		LOGGER.log(Level.INFO, "[Torrent client started on " + target.getName() + ".]");
	}
}
