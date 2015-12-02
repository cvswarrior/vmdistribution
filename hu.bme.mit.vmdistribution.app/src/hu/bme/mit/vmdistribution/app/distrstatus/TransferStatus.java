package hu.bme.mit.vmdistribution.app.distrstatus;

/**
 * Enum that represents the states a {@link Transfer} can be in:
 * <ul>
 * <li>{@code NOT_STARTED}: For Transfer not started yet</li>
 * <li>{@code IN_PROGRESS}: For Transfers in progress</li>
 * <li>{@code COMPLETED}: For Completed Transfers.</li>
 * </ul>
 * 
 * @author BVincze
 *
 */
public enum TransferStatus {
	NOT_STARTED, IN_PROGRESS, COMPLETED
}
