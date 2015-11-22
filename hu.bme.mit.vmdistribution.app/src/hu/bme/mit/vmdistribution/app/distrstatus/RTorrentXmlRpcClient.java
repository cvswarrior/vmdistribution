package hu.bme.mit.vmdistribution.app.distrstatus;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import hu.bme.mit.vmdistribution.model.Computer;

public class RTorrentXmlRpcClient extends XmlRpcClient{

	private XmlRpcClientConfigImpl config;
	private static final Logger logger = Logger.getLogger(RTorrentXmlRpcClient.class.getName());
	
	public RTorrentXmlRpcClient(Computer seed){
		config = new XmlRpcClientConfigImpl();
		try {
			config.setServerURL(new URL("http://"+seed.getConnectioninfo().getHostName()+"/RPC2"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Map<String, Integer> getPeerStatus(String infoHash){
		String[] params = new String[]{infoHash, "main", "cat=\\$p.get_address=", "cat=\\$p.get_completed_percent="};
		Object[] result = null;
		Map<String, Integer> percentagesmap = new HashMap<>();
	  
	    try {
			result = (Object[]) this.execute("p.multicall", params);
			for (Object o : result) {
	    		Object[] oarr = (Object[]) o;
	    		percentagesmap.put(String.valueOf(oarr[0]), (Integer)oarr[1]);
			}
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return percentagesmap;
	}
	
	public Map<String, String> getTorrentInfoHashes(){
	    String[] params = new String[]{"main", "d.get_base_filename=", "d.get_hash="};
	    Object[] result = null;
	    Map<String, String> infohashesmap = new HashMap<>();
	    try {
	    	result = (Object[]) this.execute("d.multicall", params);
	    	for (Object o : result) {
	    		Object[] oarr = (Object[]) o;
	    		infohashesmap.put(String.valueOf(oarr[0]), String.valueOf(oarr[1]));
			}
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return infohashesmap;
	}
	  
}
