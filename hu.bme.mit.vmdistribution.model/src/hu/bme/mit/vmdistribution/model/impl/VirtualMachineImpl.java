/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.Requirements;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.VirtualMachineImpl#getComputers <em>Computers</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.VirtualMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.VirtualMachineImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.VirtualMachineImpl#getVmZipArchive <em>Vm Zip Archive</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VirtualMachineImpl extends MinimalEObjectImpl.Container implements VirtualMachine {
	/**
	 * The cached value of the '{@link #getComputers() <em>Computers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputers()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> computers;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected Requirements requirements;

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
	protected VirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getComputers() {
		if (computers == null) {
			computers = new EObjectWithInverseResolvingEList.ManyInverse<Computer>(Computer.class, this, VMDistributionPackage.VIRTUAL_MACHINE__COMPUTERS, VMDistributionPackage.COMPUTER__VIRTUALMACHINES);
		}
		return computers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VIRTUAL_MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(Requirements newRequirements, NotificationChain msgs) {
		Requirements oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(Requirements newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS, newRequirements, newRequirements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VIRTUAL_MACHINE__VM_ZIP_ARCHIVE, oldVmZipArchive, vmZipArchive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VMDistributionPackage.VIRTUAL_MACHINE__COMPUTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComputers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VMDistributionPackage.VIRTUAL_MACHINE__COMPUTERS:
				return ((InternalEList<?>)getComputers()).basicRemove(otherEnd, msgs);
			case VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VMDistributionPackage.VIRTUAL_MACHINE__COMPUTERS:
				return getComputers();
			case VMDistributionPackage.VIRTUAL_MACHINE__NAME:
				return getName();
			case VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS:
				return getRequirements();
			case VMDistributionPackage.VIRTUAL_MACHINE__VM_ZIP_ARCHIVE:
				return getVmZipArchive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VMDistributionPackage.VIRTUAL_MACHINE__COMPUTERS:
				getComputers().clear();
				getComputers().addAll((Collection<? extends Computer>)newValue);
				return;
			case VMDistributionPackage.VIRTUAL_MACHINE__NAME:
				setName((String)newValue);
				return;
			case VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS:
				setRequirements((Requirements)newValue);
				return;
			case VMDistributionPackage.VIRTUAL_MACHINE__VM_ZIP_ARCHIVE:
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
			case VMDistributionPackage.VIRTUAL_MACHINE__COMPUTERS:
				getComputers().clear();
				return;
			case VMDistributionPackage.VIRTUAL_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS:
				setRequirements((Requirements)null);
				return;
			case VMDistributionPackage.VIRTUAL_MACHINE__VM_ZIP_ARCHIVE:
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
			case VMDistributionPackage.VIRTUAL_MACHINE__COMPUTERS:
				return computers != null && !computers.isEmpty();
			case VMDistributionPackage.VIRTUAL_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VMDistributionPackage.VIRTUAL_MACHINE__REQUIREMENTS:
				return requirements != null;
			case VMDistributionPackage.VIRTUAL_MACHINE__VM_ZIP_ARCHIVE:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", vmZipArchive: ");
		result.append(vmZipArchive);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineImpl
