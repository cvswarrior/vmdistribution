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

public class RTorrentXmlRpcClient extends XmlRpcClient{

	private static final Logger logger = Logger.getLogger(RTorrentXmlRpcClient.class.getName());
	
	public RTorrentXmlRpcClient(Computer target){
		super();
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		try {
			config.setServerURL(new URL("http://"+target.getConnectioninfo().getHostName()+"/RPC2"));
			config.setEnabledForExtensions(true);
		} catch (MalformedURLException e) {
			logger.log(Level.SEVERE, "[Malformed URL for XmlRpc server on "+target.getName()+"]", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setConfig(config);
	}
	
	public void updateTransferStatus(Transfer t){
		String[] params = new String[]{t.getTransferItemHash()};	  
	    try {
	    	long downloaded_bytes = (long) this.execute("d.get_completed_bytes", params);
	    	long iscomplete = (long) this.execute("d.get_complete", params);
	    	long download_speed = (long) this.execute("d.get_down_rate", params);

	    	t.setTransferredBytes(downloaded_bytes);
	    	if(downloaded_bytes > 0 && iscomplete != 1 ){
	    		t.setTransferStatus(TransferStatus.IN_PROGRESS);
	    	}else if(iscomplete == 1){
	    		t.setTransferStatus(TransferStatus.COMPLETED);
	    	}
	    	t.setTransferSpeed(download_speed);
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Map<String, String> getTorrentInfoHashes(){
	    String[] params = new String[]{"main", "d.get_base_filename=", "d.get_hash="};
	    Object[] result = null;
	    Map<String, String> infohashesmap = new HashMap<>();
	    try {
	    	result = (Object[]) this.execute("d.multicall", params);
	    	for (Object o : result) {
	    		Object[] oarr = (Object[]) o;
	    		infohashesmap.put(String.valueOf(oarr[1]), String.valueOf(oarr[0]));
			}
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return infohashesmap;
	}
	  
}
