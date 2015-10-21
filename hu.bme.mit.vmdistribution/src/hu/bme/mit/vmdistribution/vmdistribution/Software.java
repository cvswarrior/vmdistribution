/**
 */
package hu.bme.mit.vmdistribution.vmdistribution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getVersion <em>Version</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getInstallScript <em>Install Script</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSoftware()
 * @model
 * @generated
 */
public interface Software extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSoftware_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSoftware_Version()
	 * @model default="1.0.0"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Install Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Install Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install Script</em>' attribute.
	 * @see #setInstallScript(String)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSoftware_InstallScript()
	 * @model
	 * @generated
	 */
	String getInstallScript();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getInstallScript <em>Install Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Script</em>' attribute.
	 * @see #getInstallScript()
	 * @generated
	 */
	void setInstallScript(String value);

} // Software
