package hu.bme.mit.vmdistribution.app.distrstatus;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.UseModel;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class DistributionProgress {
	private List<Transfer> transfers;
	private static final Logger logger = Logger.getLogger(DistributionProgress.class.getName());

	
	public DistributionProgress(final Map<VirtualMachine, Computer> map){
		logger.log(Level.INFO, "[Giving 15s grace period for peers to connect.]");
	    try {
			Thread.sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    Object[][] infoHashes = (Object[][]) UseModel.getXmlRpcClient().getTorrentInfoHashes();
	    for (Object[] infoHash : infoHashes){
	    	
	    	//transfers.add(new Transfer())
	    }
	}
}
