package hu.bme.mit.vmdistribution.app.distrstatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.model.Computer;

public class DistributionStatusUpdater implements Runnable {

	private List<Transfer> transfers;
	private Map<Computer, RTorrentXmlRpcClient> xmlRpcClientsMap;
	private static final int UPDATE_TIMEOUT_MILIS = 10000;
	private static final Logger logger = Logger.getLogger(DistributionStatusUpdater.class.getName());

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
	public void run() {
		while (true) {
			try {
				logger.log(Level.INFO, "[Current status of transfers:");
				boolean allfinished = true;
				for (Entry<Computer, RTorrentXmlRpcClient> targetpc_xmlrpcclient : xmlRpcClientsMap.entrySet()) {
					logger.log(Level.INFO, "\t" + targetpc_xmlrpcclient.getKey().getName() + ":");
					for (Transfer t : transfers) {
						if (targetpc_xmlrpcclient.getKey() == t.getTargetPC()) {
							xmlRpcClientsMap.get(targetpc_xmlrpcclient.getKey()).updateTransferStatus(t);
							logger.log(Level.INFO, "\t\t" + t.getStatusString());
							if (t.getTransferStatus() != TransferStatus.COMPLETED) {
								allfinished = false;
							} else if (t.getTransferStatus() == TransferStatus.COMPLETED) {
								// TODO it should update the other list right?
								targetpc_xmlrpcclient.getKey().getVirtualmachines().add(t.getTransferItem());
							}
						}
					}
				}
				if (allfinished) {
					logger.log(Level.INFO, "[All transfers are finished, distribution is complete]");
					break;
				}

				logger.log(Level.FINE, "Waiting " + UPDATE_TIMEOUT_MILIS / 1000 + " seconds before next refresh.");
				Thread.sleep(UPDATE_TIMEOUT_MILIS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public List<String> getIncompleteTransfers() {
		List<String> incompletetransfers = new ArrayList<>();
		for (Transfer t : transfers) {
			if (t.getTransferStatus() != TransferStatus.COMPLETED) {
				incompletetransfers.add(t.getTransferItem().getName() + "->" + t.getTargetPC().getName());
			}
		}
		return incompletetransfers;
	}
}
