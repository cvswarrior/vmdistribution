/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ConnectionInfo;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

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
 * An implementation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerImpl#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerImpl#getMaxSpaceForVMs <em>Max Space For VMs</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerImpl#getInstalledRAM <em>Installed RAM</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ComputerImpl#getConnectioninfo <em>Connectioninfo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputerImpl extends MinimalEObjectImpl.Container implements Computer {
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
	 * The default value of the '{@link #getMaxSpaceForVMs() <em>Max Space For VMs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpaceForVMs()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SPACE_FOR_VMS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxSpaceForVMs() <em>Max Space For VMs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpaceForVMs()
	 * @generated
	 * @ordered
	 */
	protected double maxSpaceForVMs = MAX_SPACE_FOR_VMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstalledRAM() <em>Installed RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledRAM()
	 * @generated
	 * @ordered
	 */
	protected static final double INSTALLED_RAM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInstalledRAM() <em>Installed RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledRAM()
	 * @generated
	 * @ordered
	 */
	protected double installedRAM = INSTALLED_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_EDEFAULT = "x86";

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectioninfo() <em>Connectioninfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectioninfo()
	 * @generated
	 * @ordered
	 */
	protected ConnectionInfo connectioninfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.COMPUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualMachine> getVirtualmachines() {
		if (virtualmachines == null) {
			virtualmachines = new EObjectWithInverseResolvingEList.ManyInverse<VirtualMachine>(VirtualMachine.class, this, VMDistributionPackage.COMPUTER__VIRTUALMACHINES, VMDistributionPackage.VIRTUAL_MACHINE__COMPUTERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.COMPUTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxSpaceForVMs() {
		return maxSpaceForVMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSpaceForVMs(double newMaxSpaceForVMs) {
		double oldMaxSpaceForVMs = maxSpaceForVMs;
		maxSpaceForVMs = newMaxSpaceForVMs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.COMPUTER__MAX_SPACE_FOR_VMS, oldMaxSpaceForVMs, maxSpaceForVMs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInstalledRAM() {
		return installedRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstalledRAM(double newInstalledRAM) {
		double oldInstalledRAM = installedRAM;
		installedRAM = newInstalledRAM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.COMPUTER__INSTALLED_RAM, oldInstalledRAM, installedRAM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(String newArchitecture) {
		String oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.COMPUTER__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInfo getConnectioninfo() {
		return connectioninfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectioninfo(ConnectionInfo newConnectioninfo, NotificationChain msgs) {
		ConnectionInfo oldConnectioninfo = connectioninfo;
		connectioninfo = newConnectioninfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMDistributionPackage.COMPUTER__CONNECTIONINFO, oldConnectioninfo, newConnectioninfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectioninfo(ConnectionInfo newConnectioninfo) {
		if (newConnectioninfo != connectioninfo) {
			NotificationChain msgs = null;
			if (connectioninfo != null)
				msgs = ((InternalEObject)connectioninfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMDistributionPackage.COMPUTER__CONNECTIONINFO, null, msgs);
			if (newConnectioninfo != null)
				msgs = ((InternalEObject)newConnectioninfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMDistributionPackage.COMPUTER__CONNECTIONINFO, null, msgs);
			msgs = basicSetConnectioninfo(newConnectioninfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.COMPUTER__CONNECTIONINFO, newConnectioninfo, newConnectioninfo));
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
			case VMDistributionPackage.COMPUTER__VIRTUALMACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualmachines()).basicAdd(otherEnd, msgs);
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
			case VMDistributionPackage.COMPUTER__VIRTUALMACHINES:
				return ((InternalEList<?>)getVirtualmachines()).basicRemove(otherEnd, msgs);
			case VMDistributionPackage.COMPUTER__CONNECTIONINFO:
				return basicSetConnectioninfo(null, msgs);
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
			case VMDistributionPackage.COMPUTER__VIRTUALMACHINES:
				return getVirtualmachines();
			case VMDistributionPackage.COMPUTER__NAME:
				return getName();
			case VMDistributionPackage.COMPUTER__MAX_SPACE_FOR_VMS:
				return getMaxSpaceForVMs();
			case VMDistributionPackage.COMPUTER__INSTALLED_RAM:
				return getInstalledRAM();
			case VMDistributionPackage.COMPUTER__ARCHITECTURE:
				return getArchitecture();
			case VMDistributionPackage.COMPUTER__CONNECTIONINFO:
				return getConnectioninfo();
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
			case VMDistributionPackage.COMPUTER__VIRTUALMACHINES:
				getVirtualmachines().clear();
				getVirtualmachines().addAll((Collection<? extends VirtualMachine>)newValue);
				return;
			case VMDistributionPackage.COMPUTER__NAME:
				setName((String)newValue);
				return;
			case VMDistributionPackage.COMPUTER__MAX_SPACE_FOR_VMS:
				setMaxSpaceForVMs((Double)newValue);
				return;
			case VMDistributionPackage.COMPUTER__INSTALLED_RAM:
				setInstalledRAM((Double)newValue);
				return;
			case VMDistributionPackage.COMPUTER__ARCHITECTURE:
				setArchitecture((String)newValue);
				return;
			case VMDistributionPackage.COMPUTER__CONNECTIONINFO:
				setConnectioninfo((ConnectionInfo)newValue);
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
			case VMDistributionPackage.COMPUTER__VIRTUALMACHINES:
				getVirtualmachines().clear();
				return;
			case VMDistributionPackage.COMPUTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VMDistributionPackage.COMPUTER__MAX_SPACE_FOR_VMS:
				setMaxSpaceForVMs(MAX_SPACE_FOR_VMS_EDEFAULT);
				return;
			case VMDistributionPackage.COMPUTER__INSTALLED_RAM:
				setInstalledRAM(INSTALLED_RAM_EDEFAULT);
				return;
			case VMDistributionPackage.COMPUTER__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case VMDistributionPackage.COMPUTER__CONNECTIONINFO:
				setConnectioninfo((ConnectionInfo)null);
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
			case VMDistributionPackage.COMPUTER__VIRTUALMACHINES:
				return virtualmachines != null && !virtualmachines.isEmpty();
			case VMDistributionPackage.COMPUTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VMDistributionPackage.COMPUTER__MAX_SPACE_FOR_VMS:
				return maxSpaceForVMs != MAX_SPACE_FOR_VMS_EDEFAULT;
			case VMDistributionPackage.COMPUTER__INSTALLED_RAM:
				return installedRAM != INSTALLED_RAM_EDEFAULT;
			case VMDistributionPackage.COMPUTER__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
			case VMDistributionPackage.COMPUTER__CONNECTIONINFO:
				return connectioninfo != null;
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
		result.append(", maxSpaceForVMs: ");
		result.append(maxSpaceForVMs);
		result.append(", installedRAM: ");
		result.append(installedRAM);
		result.append(", architecture: ");
		result.append(architecture);
		result.append(')');
		return result.toString();
	}

} //ComputerImpl
