package hu.bme.mit.vmdistribution.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import hu.bme.mit.vmdistribution.app.distrstatus.DistributionStatusUpdater;
import hu.bme.mit.vmdistribution.app.distrstatus.RTorrentXmlRpcClient;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class UseModel {

	private static final Logger logger_parent = Logger.getLogger("");
	private static final Logger logger = Logger.getLogger(UseModel.class.getName());
	private static LabSystem myLabSystem;
	private static RTorrentXmlRpcClient xmlRPCClient;

	public static void initLogger() {
		System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
		logger_parent.setLevel(Level.FINER);
	}

	public static void main(final String[] args) {
		String goallabname = "";
		if(args.length > 0){
			goallabname = args[0];
		}
		//distrLoopTest();
		
		testXMLRPC();
		//System.out.println("why are we here?");
		System.exit(-1);
		
		initLogger();
		logger.log(Level.INFO, "[Starting tasks.]");
		EMFModelUtil emfutil = new EMFModelUtil();
		myLabSystem = emfutil.loadModelInstance();
		xmlRPCClient = new RTorrentXmlRpcClient(myLabSystem.getTorrentSeed());
		Lab goal = null;
		for (Lab lab : myLabSystem.getLabs()){
			if(goallabname.equals(lab.getName())){
				goal = lab;
			}
		}
		
		if(goal == null){
			logger.log(Level.SEVERE, "The goal lab doesn't exist, check command line arguments!");
			System.exit(1);
		}
		
		distribute(myLabSystem.getTorrentSeed(), goal);
		
		//save changes to model
		//emfutil.saveModelInstance();TODO
		logger.log(Level.INFO, "[Instance model updated.]");
		logger.log(Level.INFO, "[Done.]");
	}

	public static void distribute(final Computer seed, final Lab goal) {
		//get compat vms to install
		Map<Computer, List<VirtualMachine>> currentsetup = EMFModelUtil.buildComputerToVMsMapFromLabSystem(myLabSystem);
		Map<Computer, List<VirtualMachine>> goalsetup = EMFModelUtil.buildComputerToVMsMapFromLab(goal);

		Map<Computer, List<VirtualMachine>> vms_toinstall_notalreadyinstalled = EMFModelUtil.getConfWithoutAlreadyInstalledVMs(currentsetup, goalsetup);
		Map<Computer, List<VirtualMachine>> vms_toinstall_alsocompatible = EMFModelUtil.getConfWithoutIncompatibleVMs(vms_toinstall_notalreadyinstalled);
		
		Map<VirtualMachine, String> vm_torrentfilename_map = new HashMap<>();
		
		if(vms_toinstall_alsocompatible.values().size() == 0){
			logger.log(Level.WARNING, "No Virtual Machines can be distributed, see log above for reasons.");
			System.exit(1);
		}
		
		//copy vms to seed
		vm_torrentfilename_map = VMUtil.copyVmsToSeed(seed, goal);

		//start seeding
		TorrentUtil.startSeeding(seed);

		
		for(Computer pc : vms_toinstall_alsocompatible.keySet()){
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc);
			for(VirtualMachine vm : vmstodistr){
				TorrentUtil.copyTorrentFile(seed, pc, vm_torrentfilename_map.get(vm));
			}
			if(vmstodistr.size() > 0){
				TorrentUtil.startLeeching(seed, pc);
			}
			
			//update model TODO: only for pcs that actually got the vm
			/*for(VirtualMachine vm : vmstodistr){
				vm.getComputers().add(pc);
			}
			pc.getVirtualmachines().addAll(vmstodistr);*/
		}
		
		//distr progress loop
		
		
	}

	public static void testXMLRPC(){
		
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
	    try {
			config.setServerURL(new URL("http://192.168.100.101/RPC2"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    XmlRpcClient client = new XmlRpcClient();
	    client.setConfig(config);
	   /* Object[] params = new Object[1];
	    
	    String param1 = "d.multicall";
	    Object oparam1 = param1.v;
	    
	    params[0]=oparam1;
	    String[] asd = Arrays.t*/
	    // String[] params = new String[]{"main", "d.get_base_filename=", "cat=\\$d.get_peers_complete="};
	    String[] params = new String[]{"62294300D5DC2EE804FAAE38ADC38A7289631FA7", "main", "cat=\\$t.get_scrape_complete=", "cat=\\$t.get_scrape_downloaded=", "cat=\\$t.get_scrape_incomplete="};
	    //String[] params = new String[]{"62294300D5DC2EE804FAAE38ADC38A7289631FA7", "main", "cat=\\$p.get_address=", "cat=\\$p.get_completed_percent="};
	    try {
	    	//Object[] result = (Object[]) client.execute("d.multicall", params);
	    	Object[] result = (Object[]) client.execute("t.multicall", params);
	    	//Object[] result = (Object[]) client.execute("p.multicall", params);
	    	//System.out.println(result);
	    	for (Object o : result) {
	    		Object[] oarr = (Object[]) o;
	    		System.out.print(oarr[0]+" ");
	    		System.out.print(oarr[1]+" ");
	    		System.out.print(oarr[2]+" ");
	    		System.out.println();
			}
	   
	    //params = new Object[]{"system.hostname"};
	    //String  result2 = (String) client.execute("system.methodHelp", params);
	    //System.out.println(result2);
	    //String[] params1 = new String[]{"main", "d.get_base_filename=", "d.get_hash="};
	   // Object[] result1 = (Object[]) client.execute("d.multicall", params1);
			
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    //download_list -> összes filename + infohash
	    //vm -> infohash
	    //while(true) foreach vm: getdata(vm.infohash)
	    
	    //TODO set up test torrent with working tracker to test get_peers stuff
	    
		
		System.exit(0);
	}
	
	public static void distrLoopTest(){
		Thread statusthread = new Thread(new DistributionStatusUpdater(null, null));
		statusthread.setDaemon(true);
		//Thread controlthread = new Thread(new DistributionStatusController());
		statusthread.start();
		//controlthread.start();
		String msg = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try{
			msg=in.readLine();
			}catch(Exception e){
				e.printStackTrace();
			}
			if("QUIT".equalsIgnoreCase(msg)){
				System.out.println("quit due to user command");
				System.exit(0);
			}
		}
		
	}
	
	public static RTorrentXmlRpcClient getXmlRpcClient(){
		return xmlRPCClient;
	}
	

}