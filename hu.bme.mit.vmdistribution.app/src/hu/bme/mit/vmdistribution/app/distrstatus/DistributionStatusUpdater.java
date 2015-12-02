package hu.bme.mit.vmdistribution.app.distrstatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.model.Computer;

/**
 * For the live update of torrent-based file transfers. This class' instance
 * runs in a thread and polls torrent clients via the XMLRPC protocol for status
 * information. The thread terminates when all transfers are finished or the
 * main thread finishes.
 * 
 * @author BVincze
 */
public class DistributionStatusUpdater implements Runnable {
	/**
	 * A list of {@link Transfer}s, each representing a torrent-based download
	 * of a VM zipfile from the seed.
	 */
	private List<Transfer> transfers;
	/**
	 * A Map containing which {@link RTorrentXmlRpcClient} belongs to which
	 * {@link Computer}.
	 */
	private Map<Computer, RTorrentXmlRpcClient> xmlRpcClientsMap;
	/**
	 * How often we get status info in miliseconds.
	 */
	private static final int UPDATE_TIMEOUT_MILIS = 10000;
	private static final Logger LOGGER = Logger.getLogger(DistributionStatusUpdater.class.getName());

	/**
	 * Creates a {@link DistributionStatusUpdater} object. Initializes an
	 * {@link RTorrentXmlRpcClient} for each Computer, so we can get status info
	 * from them with XMLRPC.
	 * 
	 * @param transfers
	 *            A list of {@link Transfer}s, each representing a torrent-based
	 *            download of a VM zipfile from the seed.
	 */
	public DistributionStatusUpdater(final List<Transfer> transfers) {
		this.transfers = transfers;
		this.xmlRpcClientsMap = new HashMap<>();
		for (Transfer t : this.transfers) {
			if (!xmlRpcClientsMap.containsKey(t.getTargetPC())) {
				xmlRpcClientsMap.put(t.getTargetPC(), new RTorrentXmlRpcClient(t.getTargetPC()));
			}
		}
	}

	@Override
	public final void run() {
		while (true) {
			try {
				LOGGER.log(Level.INFO, "[Current status of transfers:");
				boolean allfinished = true;
				for (Entry<Computer, RTorrentXmlRpcClient> targetpc_xmlrpcclient : xmlRpcClientsMap.entrySet()) {
					LOGGER.log(Level.INFO, "\t" + targetpc_xmlrpcclient.getKey().getName() + ":");
					for (Transfer t : transfers) {
						if (targetpc_xmlrpcclient.getKey() == t.getTargetPC()) {
							// get next PC to be updated and call its
							// xmlrpcclient to update transfer status
							xmlRpcClientsMap.get(targetpc_xmlrpcclient.getKey()).updateTransferStatus(t);
							LOGGER.log(Level.INFO, "\t\t" + t.getStatusString());
							if (t.getTransferStatus() != TransferStatus.COMPLETED) {
								allfinished = false;
							} else if (t.getTransferStatus() == TransferStatus.COMPLETED) {
								// TODO it should update the other list right?
								// update the model instance with finished
								// transfers
								targetpc_xmlrpcclient.getKey().getVirtualmachines().add(t.getTransferItem());
							}
						}
					}
				}
				// stop the thread if we are finished
				if (allfinished) {
					LOGGER.log(Level.INFO,
							"[All transfers are finished, distribution is complete, press ENTER to continue.]");
					break;
				}
				// wait before next refresh
				LOGGER.log(Level.FINE, "Waiting " + UPDATE_TIMEOUT_MILIS / 1000 + " seconds before next refresh.");
				Thread.sleep(UPDATE_TIMEOUT_MILIS);
			} catch (InterruptedException e) {
				LOGGER.log(Level.SEVERE, "DistributionStatusUpdater thread interrupted.", e);
			}
		}
	}

	/**
	 * Returns a list of incomplete {@link Transfer}s, ready to be displayed to
	 * the user. This method gets called when the user stops the distribution
	 * manually.
	 * 
	 * @return A list of the incomplete transfers formatted to be displayed
	 *         right after the return.
	 */
	public final List<String> getIncompleteTransfers() {
		List<String> incompletetransfers = new ArrayList<>();
		for (Transfer t : transfers) {
			if (t.getTransferStatus() != TransferStatus.COMPLETED) {
				incompletetransfers.add(t.getTransferItem().getName() + "->" + t.getTargetPC().getName());
			}
		}
		return incompletetransfers;
	}
}
