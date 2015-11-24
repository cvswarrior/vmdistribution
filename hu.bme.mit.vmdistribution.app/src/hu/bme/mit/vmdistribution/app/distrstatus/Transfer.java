package hu.bme.mit.vmdistribution.app.distrstatus;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class Transfer {
	private VirtualMachine transferItem;
	private Computer targetPC;
	private long transferItemSize = 0;
	private long transferredBytes = 0;
	private long transferSpeed = 0;
	private String transferItemHash;
	private TransferStatus transferStatus = TransferStatus.NOT_STARTED;	
	
	public Transfer(final VirtualMachine transferItem, final Computer targetPC, final String transferItemHash){
		this.transferItem = transferItem;
		this.targetPC = targetPC;
		this.transferItemHash = transferItemHash;
		this.transferItemSize = this.transferItem.getVmZipArchive().length();
	}
	
	public void setTransferredBytes(final long transferredBytes){
		this.transferredBytes = transferredBytes;
	}
	
	public String getTransferredPercentage(){
		int tranferPercentage = (int)((transferredBytes/(double)transferItemSize) * 100);
		return String.valueOf(tranferPercentage)+"%";
	}
	
	public String getTransferredAmount(){
		double fileSizeMbRounded = Math.round(transferItemSize/Math.pow(10, 6) * 100) / 100;
		double transferredMbRounded  = Math.round(transferredBytes/Math.pow(10, 6) * 100) / 100;
		return String.valueOf(transferredMbRounded)+"/" + String.valueOf(fileSizeMbRounded)+" MB";
	}
	
	public String getTransferSpeedString(){
		long speed = this.transferSpeed;
		int speeddigits = String.valueOf(speed).length();
		String result;
		//B/s
		if(speeddigits < 3){
			result = String.valueOf(speed)+" B/s.";
		//KB/s
		}else if (speeddigits > 2 && speeddigits < 6){
			result = String.valueOf(Math.round(speed/Math.pow(10, 3) * 10) / 10)+" KB/s.";
		//MB/s
		}else{
			result = String.valueOf(Math.round(speed/Math.pow(10, 6) * 100.0) / 100.0)+" MB/s.";
		}
		return result;
	}
	
	public Computer getTargetPC(){
		return this.targetPC;
	}

	public VirtualMachine getTransferItem(){
		return this.transferItem;
	}
	
	public String getTransferItemHash() {
		return transferItemHash;
	}


	public TransferStatus getTransferStatus() {
		return transferStatus;
	}

	public void setTransferStatus(TransferStatus transferStatus) {
		this.transferStatus = transferStatus;
	}
	
	public String getStatusString(){
		//TODO somethingwrong
		StringBuilder status = new StringBuilder();
		status.append("[ "+this.transferItem.getName()+": ");
		if(this.getTransferStatus() == TransferStatus.COMPLETED){
			status.append("Completed: 100%, ");
		}else{
			status.append("Completed: "+this.getTransferredPercentage()+", ");
		}
		status.append("Downloaded: "+this.getTransferredAmount()+", ");
		status.append("Speed: "+this.getTransferSpeedString());
		
		return status.toString();
	}

	/*public long getTransferSpeed() {
		return transferSpeed;
	}*/

	public void setTransferSpeed(long transferSpeed) {
		this.transferSpeed = transferSpeed;
	}

}
