/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.ConnectionInfo;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ConnectionInfoImpl#getHostName <em>Host Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ConnectionInfoImpl#getSshPort <em>Ssh Port</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ConnectionInfoImpl#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.ConnectionInfoImpl#getSshPass <em>Ssh Pass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionInfoImpl extends MinimalEObjectImpl.Container implements ConnectionInfo {
	/**
	 * The default value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected String hostName = HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshPort() <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPort()
	 * @generated
	 * @ordered
	 */
	protected static final int SSH_PORT_EDEFAULT = 22;

	/**
	 * The cached value of the '{@link #getSshPort() <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPort()
	 * @generated
	 * @ordered
	 */
	protected int sshPort = SSH_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshUser() <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshUser()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = "vagrant";

	/**
	 * The cached value of the '{@link #getSshUser() <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshUser()
	 * @generated
	 * @ordered
	 */
	protected String sshUser = SSH_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshPass() <em>Ssh Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPass()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_PASS_EDEFAULT = "vagrant";

	/**
	 * The cached value of the '{@link #getSshPass() <em>Ssh Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPass()
	 * @generated
	 * @ordered
	 */
	protected String sshPass = SSH_PASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.CONNECTION_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostName(String newHostName) {
		String oldHostName = hostName;
		hostName = newHostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.CONNECTION_INFO__HOST_NAME, oldHostName, hostName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSshPort() {
		return sshPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshPort(int newSshPort) {
		int oldSshPort = sshPort;
		sshPort = newSshPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.CONNECTION_INFO__SSH_PORT, oldSshPort, sshPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshUser() {
		return sshUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshUser(String newSshUser) {
		String oldSshUser = sshUser;
		sshUser = newSshUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.CONNECTION_INFO__SSH_USER, oldSshUser, sshUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshPass() {
		return sshPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshPass(String newSshPass) {
		String oldSshPass = sshPass;
		sshPass = newSshPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.CONNECTION_INFO__SSH_PASS, oldSshPass, sshPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VMDistributionPackage.CONNECTION_INFO__HOST_NAME:
				return getHostName();
			case VMDistributionPackage.CONNECTION_INFO__SSH_PORT:
				return getSshPort();
			case VMDistributionPackage.CONNECTION_INFO__SSH_USER:
				return getSshUser();
			case VMDistributionPackage.CONNECTION_INFO__SSH_PASS:
				return getSshPass();
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
			case VMDistributionPackage.CONNECTION_INFO__HOST_NAME:
				setHostName((String)newValue);
				return;
			case VMDistributionPackage.CONNECTION_INFO__SSH_PORT:
				setSshPort((Integer)newValue);
				return;
			case VMDistributionPackage.CONNECTION_INFO__SSH_USER:
				setSshUser((String)newValue);
				return;
			case VMDistributionPackage.CONNECTION_INFO__SSH_PASS:
				setSshPass((String)newValue);
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
			case VMDistributionPackage.CONNECTION_INFO__HOST_NAME:
				setHostName(HOST_NAME_EDEFAULT);
				return;
			case VMDistributionPackage.CONNECTION_INFO__SSH_PORT:
				setSshPort(SSH_PORT_EDEFAULT);
				return;
			case VMDistributionPackage.CONNECTION_INFO__SSH_USER:
				setSshUser(SSH_USER_EDEFAULT);
				return;
			case VMDistributionPackage.CONNECTION_INFO__SSH_PASS:
				setSshPass(SSH_PASS_EDEFAULT);
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
			case VMDistributionPackage.CONNECTION_INFO__HOST_NAME:
				return HOST_NAME_EDEFAULT == null ? hostName != null : !HOST_NAME_EDEFAULT.equals(hostName);
			case VMDistributionPackage.CONNECTION_INFO__SSH_PORT:
				return sshPort != SSH_PORT_EDEFAULT;
			case VMDistributionPackage.CONNECTION_INFO__SSH_USER:
				return SSH_USER_EDEFAULT == null ? sshUser != null : !SSH_USER_EDEFAULT.equals(sshUser);
			case VMDistributionPackage.CONNECTION_INFO__SSH_PASS:
				return SSH_PASS_EDEFAULT == null ? sshPass != null : !SSH_PASS_EDEFAULT.equals(sshPass);
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
		result.append(" (hostName: ");
		result.append(hostName);
		result.append(", sshPort: ");
		result.append(sshPort);
		result.append(", sshUser: ");
		result.append(sshUser);
		result.append(", sshPass: ");
		result.append(sshPass);
		result.append(')');
		return result.toString();
	}

} //ConnectionInfoImpl
