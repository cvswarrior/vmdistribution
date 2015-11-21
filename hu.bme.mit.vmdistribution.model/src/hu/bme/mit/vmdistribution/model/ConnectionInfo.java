/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getHostName <em>Host Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshPort <em>Ssh Port</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshPass <em>Ssh Pass</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getConnectionInfo()
 * @model
 * @generated
 */
public interface ConnectionInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Name</em>' attribute.
	 * @see #setHostName(String)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getConnectionInfo_HostName()
	 * @model
	 * @generated
	 */
	String getHostName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getHostName <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Name</em>' attribute.
	 * @see #getHostName()
	 * @generated
	 */
	void setHostName(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Port</b></em>' attribute.
	 * The default value is <code>"22"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh Port</em>' attribute.
	 * @see #setSshPort(int)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getConnectionInfo_SshPort()
	 * @model default="22"
	 * @generated
	 */
	int getSshPort();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshPort <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Port</em>' attribute.
	 * @see #getSshPort()
	 * @generated
	 */
	void setSshPort(int value);

	/**
	 * Returns the value of the '<em><b>Ssh User</b></em>' attribute.
	 * The default value is <code>"vagrant"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh User</em>' attribute.
	 * @see #setSshUser(String)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getConnectionInfo_SshUser()
	 * @model default="vagrant"
	 * @generated
	 */
	String getSshUser();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshUser <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh User</em>' attribute.
	 * @see #getSshUser()
	 * @generated
	 */
	void setSshUser(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Pass</b></em>' attribute.
	 * The default value is <code>"vagrant"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh Pass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh Pass</em>' attribute.
	 * @see #setSshPass(String)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getConnectionInfo_SshPass()
	 * @model default="vagrant"
	 * @generated
	 */
	String getSshPass();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshPass <em>Ssh Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Pass</em>' attribute.
	 * @see #getSshPass()
	 * @generated
	 */
	void setSshPass(String value);

} // ConnectionInfo
