package hu.bme.mit.vmdistribution.app.distrstatus;

import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class Transfer {
	private VirtualMachine transferItem;
	private Computer targetPC;
	private long transferItemSize = 0;
	private long transferredBytes = 0;
	private static final Logger logger = Logger.getLogger(Transfer.class.getName());
	
	
	public Transfer(final VirtualMachine transferItem, final Computer targetPC, String transferItemHash){
		this.transferItem = transferItem;
		this.targetPC = targetPC;
		this.transferItemSize = this.transferItem.getVmZipArchive().length();
	}
	
	public void setTransferredBytes(final long transferredBytes){
		this.transferredBytes = transferredBytes;
	}
	
	public String getTransferredPercentage(){
		int tranferPercentage = ((int)(transferredBytes/transferItemSize)) * 100;
		return String.valueOf(tranferPercentage)+"%";
	}
	
	public String getTransferredAmount(){
		double fileSizeMbRounded = Math.round(transferItemSize/Math.pow(10, 6) * 100) / 100;
		double transferredMbRounded  = Math.round(transferredBytes/Math.pow(10, 6) * 100) / 100;
		return String.valueOf(transferredMbRounded)+"/" + String.valueOf(fileSizeMbRounded)+" Mb";
	}
	
	public Computer getTargetPC(){
		return this.targetPC;
	}

}
