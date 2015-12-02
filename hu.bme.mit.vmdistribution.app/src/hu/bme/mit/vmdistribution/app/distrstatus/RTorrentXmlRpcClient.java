package hu.bme.mit.vmdistribution.app.distrstatus;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import hu.bme.mit.vmdistribution.model.Computer;

/**
 * This class represents an {@link XmlRpcClient} to poll informations from a
 * remote torrent client capable of responding to XMLRPC calls, such as
 * rtorrent.
 * 
 * @author BVincze
 */
public class RTorrentXmlRpcClient extends XmlRpcClient {

	private static final Logger LOGGER = Logger.getLogger(RTorrentXmlRpcClient.class.getName());

	/**
	 * Configure the client to be able to connect to the target PC.
	 * 
	 * @param target
	 *            The Computer we want to get transfer status info from via
	 *            XMLRPC
	 */
	public RTorrentXmlRpcClient(final Computer target) {
		super();
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		try {
			config.setServerURL(new URL("http://" + target.getConnectioninfo().getHostName() + "/RPC2"));
			// we need to enable extensions to support i8 type responses from
			// rtorrent, also need to set XMLRPC dialect to apache in rtorrent's
			// config
			config.setEnabledForExtensions(true);
		} catch (MalformedURLException e) {
			LOGGER.log(Level.SEVERE, "[Malformed URL for XmlRpc server on " + target.getName() + "]", e);
		}
		this.setConfig(config);
	}

	/**
	 * Update status of {@link Transfer}
	 * 
	 * @param t
	 *            The {@link Transfer} to be updated.
	 */
	public final void updateTransferStatus(final Transfer t) {
		// get the infohash of the torrent being transferred
		String[] params = new String[] {
				t.getTransferItemHash()
				};
		try {
			// get relevant infos
			long downloaded_bytes = (long) this.execute("d.get_completed_bytes", params);
			long iscomplete = (long) this.execute("d.get_complete", params);
			long download_speed = (long) this.execute("d.get_down_rate", params);

			t.setTransferredBytes(downloaded_bytes);
			// set the Transfer's TransferStatus accordingly
			if (downloaded_bytes > 0 && iscomplete != 1) {
				t.setTransferStatus(TransferStatus.IN_PROGRESS);
			} else if (iscomplete == 1) {
				t.setTransferStatus(TransferStatus.COMPLETED);
			}
			t.setTransferSpeed(download_speed);
		} catch (XmlRpcException e) {
			LOGGER.log(Level.SEVERE, "ERROR executing XMLRPC call.", e);
		}
	}

	/**
	 * Gets torrent infohashes for all files being seeded.
	 * 
	 * @return A {@link Map} of {@link String}s, keys are the VM zipnames,
	 *         values are the related infohashes
	 */
	public final Map<String, String> getTorrentInfoHashes() {
		// get a filename/infohash pair from the "main" view
		String[] params = new String[] {
				"main", "d.get_base_filename=", "d.get_hash="
				};
		Object[] result = null;
		Map<String, String> infohashesmap = new HashMap<>();
		try {
			// multicall means we execute the command for every element in a
			// view -> get all filename/infohash paits
			result = (Object[]) this.execute("d.multicall", params);
			for (Object o : result) {
				Object[] oarr = (Object[]) o;
				// oarr[1] is the filename, oarr[0] is the infohash
				infohashesmap.put(String.valueOf(oarr[1]), String.valueOf(oarr[0]));
			}
		} catch (XmlRpcException e) {
			LOGGER.log(Level.SEVERE, "ERROR executing XMLRPC call.", e);
		}
		return infohashesmap;
	}
}
