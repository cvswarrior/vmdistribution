/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.CustomVM;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;

import java.io.File;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom VM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.CustomVMImpl#getVmZipArchive <em>Vm Zip Archive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomVMImpl extends VirtualMachineImpl implements CustomVM {
	/**
	 * The default value of the '{@link #getVmZipArchive() <em>Vm Zip Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmZipArchive()
	 * @generated
	 * @ordered
	 */
	protected static final File VM_ZIP_ARCHIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmZipArchive() <em>Vm Zip Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmZipArchive()
	 * @generated
	 * @ordered
	 */
	protected File vmZipArchive = VM_ZIP_ARCHIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomVMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.CUSTOM_VM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getVmZipArchive() {
		return vmZipArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmZipArchive(File newVmZipArchive) {
		File oldVmZipArchive = vmZipArchive;
		vmZipArchive = newVmZipArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.CUSTOM_VM__VM_ZIP_ARCHIVE, oldVmZipArchive, vmZipArchive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VMDistributionPackage.CUSTOM_VM__VM_ZIP_ARCHIVE:
				return getVmZipArchive();
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
			case VMDistributionPackage.CUSTOM_VM__VM_ZIP_ARCHIVE:
				setVmZipArchive((File)newValue);
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
			case VMDistributionPackage.CUSTOM_VM__VM_ZIP_ARCHIVE:
				setVmZipArchive(VM_ZIP_ARCHIVE_EDEFAULT);
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
			case VMDistributionPackage.CUSTOM_VM__VM_ZIP_ARCHIVE:
				return VM_ZIP_ARCHIVE_EDEFAULT == null ? vmZipArchive != null : !VM_ZIP_ARCHIVE_EDEFAULT.equals(vmZipArchive);
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
		result.append(" (vmZipArchive: ");
		result.append(vmZipArchive);
		result.append(')');
		return result.toString();
	}

} //CustomVMImpl
