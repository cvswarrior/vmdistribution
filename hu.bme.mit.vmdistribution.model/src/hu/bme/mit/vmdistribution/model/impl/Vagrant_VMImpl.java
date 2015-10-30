/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.Vagrant_VM;

import java.io.File;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vagrant VM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl#getDistributionImage <em>Distribution Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl#isReadyToDistribute <em>Ready To Distribute</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl#getVagrantFile <em>Vagrant File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vagrant_VMImpl extends VirtualMachineImpl implements Vagrant_VM {
	/**
	 * The default value of the '{@link #getDistributionImage() <em>Distribution Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionImage()
	 * @generated
	 * @ordered
	 */
	protected static final File DISTRIBUTION_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistributionImage() <em>Distribution Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionImage()
	 * @generated
	 * @ordered
	 */
	protected File distributionImage = DISTRIBUTION_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadyToDistribute() <em>Ready To Distribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadyToDistribute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READY_TO_DISTRIBUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadyToDistribute() <em>Ready To Distribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadyToDistribute()
	 * @generated
	 * @ordered
	 */
	protected boolean readyToDistribute = READY_TO_DISTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVagrantFile() <em>Vagrant File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVagrantFile()
	 * @generated
	 * @ordered
	 */
	protected static final File VAGRANT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVagrantFile() <em>Vagrant File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVagrantFile()
	 * @generated
	 * @ordered
	 */
	protected File vagrantFile = VAGRANT_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vagrant_VMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.VAGRANT_VM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getDistributionImage() {
		return distributionImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionImage(File newDistributionImage) {
		File oldDistributionImage = distributionImage;
		distributionImage = newDistributionImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE, oldDistributionImage, distributionImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadyToDistribute() {
		return readyToDistribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadyToDistribute(boolean newReadyToDistribute) {
		boolean oldReadyToDistribute = readyToDistribute;
		readyToDistribute = newReadyToDistribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE, oldReadyToDistribute, readyToDistribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getVagrantFile() {
		return vagrantFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVagrantFile(File newVagrantFile) {
		File oldVagrantFile = vagrantFile;
		vagrantFile = newVagrantFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VAGRANT_VM__VAGRANT_FILE, oldVagrantFile, vagrantFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE:
				return getDistributionImage();
			case VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE:
				return isReadyToDistribute();
			case VMDistributionPackage.VAGRANT_VM__VAGRANT_FILE:
				return getVagrantFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE:
				setDistributionImage((File)newValue);
				return;
			case VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE:
				setReadyToDistribute((Boolean)newValue);
				return;
			case VMDistributionPackage.VAGRANT_VM__VAGRANT_FILE:
				setVagrantFile((File)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE:
				setDistributionImage(DISTRIBUTION_IMAGE_EDEFAULT);
				return;
			case VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE:
				setReadyToDistribute(READY_TO_DISTRIBUTE_EDEFAULT);
				return;
			case VMDistributionPackage.VAGRANT_VM__VAGRANT_FILE:
				setVagrantFile(VAGRANT_FILE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE:
				return DISTRIBUTION_IMAGE_EDEFAULT == null ? distributionImage != null : !DISTRIBUTION_IMAGE_EDEFAULT.equals(distributionImage);
			case VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE:
				return readyToDistribute != READY_TO_DISTRIBUTE_EDEFAULT;
			case VMDistributionPackage.VAGRANT_VM__VAGRANT_FILE:
				return VAGRANT_FILE_EDEFAULT == null ? vagrantFile != null : !VAGRANT_FILE_EDEFAULT.equals(vagrantFile);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (distributionImage: ");
		result.append(distributionImage);
		result.append(", readyToDistribute: ");
		result.append(readyToDistribute);
		result.append(", vagrantFile: ");
		result.append(vagrantFile);
		result.append(')');
		return result.toString();
	}

} //Vagrant_VMImpl
