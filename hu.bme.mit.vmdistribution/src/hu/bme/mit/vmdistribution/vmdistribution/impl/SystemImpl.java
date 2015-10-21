/**
 */
package hu.bme.mit.vmdistribution.vmdistribution.impl;

import hu.bme.mit.vmdistribution.vmdistribution.Computer;
import hu.bme.mit.vmdistribution.vmdistribution.Lab;
import hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl#getVirtualmachine <em>Virtualmachine</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl#getComputer <em>Computer</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl#getLab <em>Lab</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl#getCurrentsetup <em>Currentsetup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements hu.bme.mit.vmdistribution.vmdistribution.System {
	/**
	 * The cached value of the '{@link #getVirtualmachine() <em>Virtualmachine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualmachine()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMachine> virtualmachine;

	/**
	 * The cached value of the '{@link #getComputer() <em>Computer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputer()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> computer;

	/**
	 * The cached value of the '{@link #getLab() <em>Lab</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLab()
	 * @generated
	 * @ordered
	 */
	protected EList<Lab> lab;

	/**
	 * The cached value of the '{@link #getCurrentsetup() <em>Currentsetup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentsetup()
	 * @generated
	 * @ordered
	 */
	protected Lab currentsetup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmdistributionPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualMachine> getVirtualmachine() {
		if (virtualmachine == null) {
			virtualmachine = new EObjectContainmentEList<VirtualMachine>(VirtualMachine.class, this, VmdistributionPackage.SYSTEM__VIRTUALMACHINE);
		}
		return virtualmachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getComputer() {
		if (computer == null) {
			computer = new EObjectContainmentEList<Computer>(Computer.class, this, VmdistributionPackage.SYSTEM__COMPUTER);
		}
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lab> getLab() {
		if (lab == null) {
			lab = new EObjectContainmentEList<Lab>(Lab.class, this, VmdistributionPackage.SYSTEM__LAB);
		}
		return lab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab getCurrentsetup() {
		if (currentsetup != null && currentsetup.eIsProxy()) {
			InternalEObject oldCurrentsetup = (InternalEObject)currentsetup;
			currentsetup = (Lab)eResolveProxy(oldCurrentsetup);
			if (currentsetup != oldCurrentsetup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmdistributionPackage.SYSTEM__CURRENTSETUP, oldCurrentsetup, currentsetup));
			}
		}
		return currentsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab basicGetCurrentsetup() {
		return currentsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentsetup(Lab newCurrentsetup) {
		Lab oldCurrentsetup = currentsetup;
		currentsetup = newCurrentsetup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmdistributionPackage.SYSTEM__CURRENTSETUP, oldCurrentsetup, currentsetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmdistributionPackage.SYSTEM__VIRTUALMACHINE:
				return ((InternalEList<?>)getVirtualmachine()).basicRemove(otherEnd, msgs);
			case VmdistributionPackage.SYSTEM__COMPUTER:
				return ((InternalEList<?>)getComputer()).basicRemove(otherEnd, msgs);
			case VmdistributionPackage.SYSTEM__LAB:
				return ((InternalEList<?>)getLab()).basicRemove(otherEnd, msgs);
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
			case VmdistributionPackage.SYSTEM__VIRTUALMACHINE:
				return getVirtualmachine();
			case VmdistributionPackage.SYSTEM__COMPUTER:
				return getComputer();
			case VmdistributionPackage.SYSTEM__LAB:
				return getLab();
			case VmdistributionPackage.SYSTEM__CURRENTSETUP:
				if (resolve) return getCurrentsetup();
				return basicGetCurrentsetup();
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
			case VmdistributionPackage.SYSTEM__VIRTUALMACHINE:
				getVirtualmachine().clear();
				getVirtualmachine().addAll((Collection<? extends VirtualMachine>)newValue);
				return;
			case VmdistributionPackage.SYSTEM__COMPUTER:
				getComputer().clear();
				getComputer().addAll((Collection<? extends Computer>)newValue);
				return;
			case VmdistributionPackage.SYSTEM__LAB:
				getLab().clear();
				getLab().addAll((Collection<? extends Lab>)newValue);
				return;
			case VmdistributionPackage.SYSTEM__CURRENTSETUP:
				setCurrentsetup((Lab)newValue);
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
			case VmdistributionPackage.SYSTEM__VIRTUALMACHINE:
				getVirtualmachine().clear();
				return;
			case VmdistributionPackage.SYSTEM__COMPUTER:
				getComputer().clear();
				return;
			case VmdistributionPackage.SYSTEM__LAB:
				getLab().clear();
				return;
			case VmdistributionPackage.SYSTEM__CURRENTSETUP:
				setCurrentsetup((Lab)null);
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
			case VmdistributionPackage.SYSTEM__VIRTUALMACHINE:
				return virtualmachine != null && !virtualmachine.isEmpty();
			case VmdistributionPackage.SYSTEM__COMPUTER:
				return computer != null && !computer.isEmpty();
			case VmdistributionPackage.SYSTEM__LAB:
				return lab != null && !lab.isEmpty();
			case VmdistributionPackage.SYSTEM__CURRENTSETUP:
				return currentsetup != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
