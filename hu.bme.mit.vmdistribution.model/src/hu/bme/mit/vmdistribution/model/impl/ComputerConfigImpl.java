/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computer Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerConfigImpl#getComputer <em>Computer</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerConfigImpl#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerConfigImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputerConfigImpl extends MinimalEObjectImpl.Container implements ComputerConfig {
	/**
	 * The cached value of the '{@link #getComputer() <em>Computer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputer()
	 * @generated
	 * @ordered
	 */
	protected Computer computer;

	/**
	 * The cached value of the '{@link #getVirtualmachines() <em>Virtualmachines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualmachines()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMachine> virtualmachines;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.COMPUTER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer getComputer() {
		if (computer != null && computer.eIsProxy()) {
			InternalEObject oldComputer = (InternalEObject)computer;
			computer = (Computer)eResolveProxy(oldComputer);
			if (computer != oldComputer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMDistributionPackage.COMPUTER_CONFIG__COMPUTER, oldComputer, computer));
			}
		}
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer basicGetComputer() {
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputer(Computer newComputer) {
		Computer oldComputer = computer;
		computer = newComputer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.COMPUTER_CONFIG__COMPUTER, oldComputer, computer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualMachine> getVirtualmachines() {
		if (virtualmachines == null) {
			virtualmachines = new EObjectResolvingEList<VirtualMachine>(VirtualMachine.class, this, VMDistributionPackage.COMPUTER_CONFIG__VIRTUALMACHINES);
		}
		return virtualmachines;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.COMPUTER_CONFIG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VMDistributionPackage.COMPUTER_CONFIG__COMPUTER:
				if (resolve) return getComputer();
				return basicGetComputer();
			case VMDistributionPackage.COMPUTER_CONFIG__VIRTUALMACHINES:
				return getVirtualmachines();
			case VMDistributionPackage.COMPUTER_CONFIG__NAME:
				return getName();
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
			case VMDistributionPackage.COMPUTER_CONFIG__COMPUTER:
				setComputer((Computer)newValue);
				return;
			case VMDistributionPackage.COMPUTER_CONFIG__VIRTUALMACHINES:
				getVirtualmachines().clear();
				getVirtualmachines().addAll((Collection<? extends VirtualMachine>)newValue);
				return;
			case VMDistributionPackage.COMPUTER_CONFIG__NAME:
				setName((String)newValue);
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
			case VMDistributionPackage.COMPUTER_CONFIG__COMPUTER:
				setComputer((Computer)null);
				return;
			case VMDistributionPackage.COMPUTER_CONFIG__VIRTUALMACHINES:
				getVirtualmachines().clear();
				return;
			case VMDistributionPackage.COMPUTER_CONFIG__NAME:
				setName(NAME_EDEFAULT);
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
			case VMDistributionPackage.COMPUTER_CONFIG__COMPUTER:
				return computer != null;
			case VMDistributionPackage.COMPUTER_CONFIG__VIRTUALMACHINES:
				return virtualmachines != null && !virtualmachines.isEmpty();
			case VMDistributionPackage.COMPUTER_CONFIG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //ComputerConfigImpl
