package hu.bme.mit.vmdistribution.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import hu.bme.mit.vmdistribution.app.distrstatus.DistributionStatusUpdater;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class UseModel {

	private static final Logger logger_parent = Logger.getLogger("");
	private static final Logger logger = Logger.getLogger(UseModel.class.getName());
	private static LabSystem myLabSystem;

	public static void init() {
		System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
		logger_parent.setLevel(Level.FINER);
	}

	public static void main(final String[] args) {
		
		
		distrLoopTest();
		System.out.println("why are we here?");
		System.exit(-1);
		testXMLRPC();
		
		init();
		logger.log(Level.INFO, "[Starting tasks.]");
		EMFModelUtil emfutil = new EMFModelUtil();
		myLabSystem = emfutil.loadModelInstance();
		Lab goal = null;
		//TODO replace with command line arguments
		for (Lab lab : myLabSystem.getLabs()){
			if("mixed_test".equals(lab.getName())){
				goal = lab;
			}
		}

		//Archiver.createZipArchive("E:\\_TSYS\\VirtualBox\\_VMs\\vagrantvm_test","E:\\vagrantvm_test.zip");
		//distribute(goal);
		
		 

		
		//save changes to model
		emfutil.saveModelInstance();
		logger.log(Level.INFO, "[Instance model updated.]");
		logger.log(Level.INFO, "[Done.]");
	}

	public static void distribute(final Lab goal) {
		
		
		//TODO skip if nothing to copy
		//copy vms to seed
		Map<VirtualMachine, String> vm_torrentfilename_map = VMUtil.copyVmsToSeed(goal);
		
		//start seeding
		TorrentUtil.startSeeding();

		//get compat vms to install
		Map<Computer, List<VirtualMachine>> currentsetup = EMFModelUtil.buildComputerToVMsMapFromLabSystem(myLabSystem);
		Map<Computer, List<VirtualMachine>> goalsetup = EMFModelUtil.buildComputerToVMsMapFromLab(goal);

		Map<Computer, List<VirtualMachine>> vms_toinstall_notalreadyinstalled = EMFModelUtil.getConfWithoutAlreadyInstalledVMs(currentsetup, goalsetup);
		Map<Computer, List<VirtualMachine>> vms_toinstall_alsocompatible = EMFModelUtil.getConfWithoutIncompatibleVMs(vms_toinstall_notalreadyinstalled);
		
		for(Computer pc : vms_toinstall_alsocompatible.keySet()){
			List<VirtualMachine> vmstodistr = vms_toinstall_alsocompatible.get(pc);
			for(VirtualMachine vm : vmstodistr){
				TorrentUtil.copyTorrentFile(Properties.getHostData(pc.getName()), vm_torrentfilename_map.get(vm));
			}
			if(vmstodistr.size() > 0){
				TorrentUtil.startLeeching(Properties.getHostData(pc.getName()));
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
			config.setServerURL(new URL("http://192.168.100.250/RPC2"));
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
	    //String[] params = new String[]{"main", "d.get_base_filename=", "d.get_hash="};
	    String[] params = new String[]{"72AB41F3EA30BE5CCA44B9098BC7FDC7CB9E2BE2", "main", "cat=\\$p.get_address=", "cat=\\$p.get_completed_percent="};
	    try {
	    	//Object[] result = (Object[]) client.execute("d.multicall", params);
	    	Object[] result = (Object[]) client.execute("p.multicall", params);
	    	//System.out.println(result);
	    	for (Object object : result) {
	    		System.out.println(object);
			}
	   
	    //params = new Object[]{"system.hostname"};
	    //String  result2 = (String) client.execute("system.methodHelp", params);
	    //System.out.println(result2);
	    String[] params1 = new String[]{"main", "d.get_base_filename=", "d.get_hash="};
	    Object[] result1 = (Object[]) client.execute("d.multicall", params1);
			
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
		Thread statusthread = new Thread(new DistributionStatusUpdater());
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
	

}