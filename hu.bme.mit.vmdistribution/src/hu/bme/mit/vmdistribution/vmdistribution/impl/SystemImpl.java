/**
 */
package hu.bme.mit.vmdistribution.vmdistribution.impl;

import hu.bme.mit.vmdistribution.vmdistribution.Computer;
import hu.bme.mit.vmdistribution.vmdistribution.Lab;
import hu.bme.mit.vmdistribution.vmdistribution.LabSetup;
import hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage;

import java.lang.reflect.InvocationTargetException;

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
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl#getCurrentlab <em>Currentlab</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl#getLabsetup <em>Labsetup</em>}</li>
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
	 * The cached value of the '{@link #getCurrentlab() <em>Currentlab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlab()
	 * @generated
	 * @ordered
	 */
	protected Lab currentlab;

	/**
	 * The cached value of the '{@link #getLabsetup() <em>Labsetup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabsetup()
	 * @generated
	 * @ordered
	 */
	protected LabSetup labsetup;

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
	public Lab getCurrentlab() {
		if (currentlab != null && currentlab.eIsProxy()) {
			InternalEObject oldCurrentlab = (InternalEObject)currentlab;
			currentlab = (Lab)eResolveProxy(oldCurrentlab);
			if (currentlab != oldCurrentlab) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmdistributionPackage.SYSTEM__CURRENTLAB, oldCurrentlab, currentlab));
			}
		}
		return currentlab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab basicGetCurrentlab() {
		return currentlab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentlab(Lab newCurrentlab) {
		Lab oldCurrentlab = currentlab;
		currentlab = newCurrentlab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmdistributionPackage.SYSTEM__CURRENTLAB, oldCurrentlab, currentlab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabSetup getLabsetup() {
		return labsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabsetup(LabSetup newLabsetup, NotificationChain msgs) {
		LabSetup oldLabsetup = labsetup;
		labsetup = newLabsetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmdistributionPackage.SYSTEM__LABSETUP, oldLabsetup, newLabsetup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabsetup(LabSetup newLabsetup) {
		if (newLabsetup != labsetup) {
			NotificationChain msgs = null;
			if (labsetup != null)
				msgs = ((InternalEObject)labsetup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmdistributionPackage.SYSTEM__LABSETUP, null, msgs);
			if (newLabsetup != null)
				msgs = ((InternalEObject)newLabsetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmdistributionPackage.SYSTEM__LABSETUP, null, msgs);
			msgs = basicSetLabsetup(newLabsetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmdistributionPackage.SYSTEM__LABSETUP, newLabsetup, newLabsetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setupLab(Lab goal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initVm(VirtualMachine vm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteVm(VirtualMachine todelete) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void distributeVm(VirtualMachine todistribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case VmdistributionPackage.SYSTEM__LABSETUP:
				return basicSetLabsetup(null, msgs);
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
			case VmdistributionPackage.SYSTEM__CURRENTLAB:
				if (resolve) return getCurrentlab();
				return basicGetCurrentlab();
			case VmdistributionPackage.SYSTEM__LABSETUP:
				return getLabsetup();
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
			case VmdistributionPackage.SYSTEM__CURRENTLAB:
				setCurrentlab((Lab)newValue);
				return;
			case VmdistributionPackage.SYSTEM__LABSETUP:
				setLabsetup((LabSetup)newValue);
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
			case VmdistributionPackage.SYSTEM__CURRENTLAB:
				setCurrentlab((Lab)null);
				return;
			case VmdistributionPackage.SYSTEM__LABSETUP:
				setLabsetup((LabSetup)null);
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
			case VmdistributionPackage.SYSTEM__CURRENTLAB:
				return currentlab != null;
			case VmdistributionPackage.SYSTEM__LABSETUP:
				return labsetup != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VmdistributionPackage.SYSTEM___SETUP_LAB__LAB:
				setupLab((Lab)arguments.get(0));
				return null;
			case VmdistributionPackage.SYSTEM___INIT_VM__VIRTUALMACHINE:
				initVm((VirtualMachine)arguments.get(0));
				return null;
			case VmdistributionPackage.SYSTEM___DELETE_VM__VIRTUALMACHINE:
				deleteVm((VirtualMachine)arguments.get(0));
				return null;
			case VmdistributionPackage.SYSTEM___DISTRIBUTE_VM__VIRTUALMACHINE:
				distributeVm((VirtualMachine)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemImpl
