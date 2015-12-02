package hu.bme.mit.vmdistribution.app.distrstatus;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

/**
 * This class represents a torrent-based download of a VM zipfile from the seed.
 * 
 * @author BVincze
 */
public class Transfer {
	/**
	 * The VM that is being transferred.
	 */
	private VirtualMachine transferItem;
	/**
	 * The target of the tranfer.
	 */
	private Computer targetPC;
	/**
	 * Size of the VM zipfile.
	 */
	private long transferItemSize = 0;
	/**
	 * Transfer progress, how many bytes are already done.
	 */
	private long transferredBytes = 0;
	/**
	 * Current rate of the transfer in B/s.
	 */
	private long transferSpeed = 0;
	/**
	 * The infohash of the VM zip's torrentfile. We need to use this to get this
	 * Transfers info from torrent clients.
	 */
	private String transferItemHash;
	/**
	 * Status of this Transfer, @see {@link TransferStatus} for possible values.
	 */
	private TransferStatus transferStatus = TransferStatus.NOT_STARTED;

	/**
	 * Creates and initializes a {@link Transfer}.
	 * 
	 * @param transferItem
	 *            The VM that is being transferred.
	 * @param targetPC
	 *            The target of the tranfer
	 * @param transferItemHash
	 *            The infohash of the VM zip's torrentfile.
	 */
	public Transfer(final VirtualMachine transferItem, final Computer targetPC, final String transferItemHash) {
		this.transferItem = transferItem;
		this.targetPC = targetPC;
		this.transferItemHash = transferItemHash;
		this.transferItemSize = this.transferItem.getVmZipArchive().length();
	}

	// setters
	public final void setTransferredBytes(final long transferredBytes) {
		this.transferredBytes = transferredBytes;
	}

	public final void setTransferStatus(final TransferStatus transferStatus) {
		this.transferStatus = transferStatus;
	}

	public final void setTransferSpeed(final long transferSpeed) {
		this.transferSpeed = transferSpeed;
	}

	// basic getters
	public final Computer getTargetPC() {
		return this.targetPC;
	}

	public final VirtualMachine getTransferItem() {
		return this.transferItem;
	}

	public final String getTransferItemHash() {
		return transferItemHash;
	}

	public final TransferStatus getTransferStatus() {
		return transferStatus;
	}

	/**
	 * Gets the transfer progress in percentage.
	 * 
	 * @return a formatted string that represents the transfer progress in
	 *         percentage.
	 */
	public final String getTransferredPercentage() {
		int tranferPercentage = (int) ((transferredBytes / (double) transferItemSize) * 100);
		return String.valueOf(tranferPercentage) + "%";
	}

	/**
	 * Gets the transferred amount in MegaBytes, rounded to 2 decimal places.
	 * 
	 * @return a formatted string representing the transferred/total amount in
	 *         MBs rounded to 2 decimal places.
	 */
	public final String getTransferredAmount() {
		double fileSizeMbRounded = Math.round(transferItemSize / Math.pow(10, 6) * 100) / 100.0;
		double transferredMbRounded = Math.round(transferredBytes / Math.pow(10, 6) * 100) / 100.0;
		return String.valueOf(transferredMbRounded) + "/" + String.valueOf(fileSizeMbRounded) + " MB";
	}

	/**
	 * Gets the transfer speed in a smartly formatted fashion.
	 * 
	 * @return a formatted string representing the transfer's speed in B/s, KB/s
	 *         or MB/s depending on the speed itself.
	 */
	public final String getTransferSpeedString() {
		long speed = this.transferSpeed;
		int speeddigits = String.valueOf(speed).length();
		String result;
		// B/s
		if (speeddigits < 3) {
			result = String.valueOf(speed) + " B/s.";
			// KB/s
		} else if (speeddigits < 6) {
			result = String.valueOf(Math.round(speed / Math.pow(10, 3) * 10) / 10) + " KB/s.";
			// MB/s
		} else {
			result = String.valueOf(Math.round(speed / Math.pow(10, 6) * 100.0) / 100.0) + " MB/s.";
		}
		return result;
	}

	/**
	 * Creates and returns a status string to diplay every info about the
	 * transfer's progress.
	 * 
	 * @return a formatted string containing the transferred percentage, amount
	 *         and speed.
	 */
	public final String getStatusString() {
		StringBuilder status = new StringBuilder();
		status.append("[ " + this.transferItem.getName() + ": ");
		if (this.getTransferStatus() == TransferStatus.COMPLETED) {
			status.append("Completed: 100%, ");
		} else {
			status.append("Completed: " + this.getTransferredPercentage() + ", ");
		}
		status.append("Downloaded: " + this.getTransferredAmount() + ", ");
		status.append("Speed: " + this.getTransferSpeedString());

		return status.toString();
	}
}
