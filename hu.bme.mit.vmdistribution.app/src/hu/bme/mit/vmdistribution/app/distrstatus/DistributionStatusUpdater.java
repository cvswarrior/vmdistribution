package hu.bme.mit.vmdistribution.app.distrstatus;

import java.util.List;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.Properties;
import hu.bme.mit.vmdistribution.app.UseModel;

public class DistributionStatusUpdater implements Runnable {

	private List<String> infoHashes;
	private List<Transfer> transfers;
	private static final int UPDATE_TIMEOUT_MILIS = 10000;
	private static final Logger logger = Logger.getLogger(DistributionStatusUpdater.class.getName());
	
	public DistributionStatusUpdater(final List<String> infoHashes, final List<Transfer> transfers){
		this.infoHashes = infoHashes;
		this.transfers = transfers;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){/*
			try {
				for(String infoHash : infoHashes){//TODO store hostnames in model!
					Object[] peers = ((Object[][][]) UseModel.getXmlRpcClient().getPeerStatus(infoHash))[0][0];
					for(Transfer transfer : transfers){
						if(Properties.getHostData(transfer.getTargetPC().getName()).getHostname().equals(anObject)))
					}
					
					
				}
				
				
				
				Thread.sleep(UPDATE_TIMEOUT_MILIS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			//TODO break on finish
		}
	}

}
