/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.VMProperty#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.VMProperty#getVagrantCommand <em>Vagrant Command</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVMProperty()
 * @model
 * @generated
 */
public interface VMProperty extends EObject {
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
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVMProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.VMProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vagrant Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vagrant Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vagrant Command</em>' attribute.
	 * @see #setVagrantCommand(String)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVMProperty_VagrantCommand()
	 * @model
	 * @generated
	 */
	String getVagrantCommand();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.VMProperty#getVagrantCommand <em>Vagrant Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vagrant Command</em>' attribute.
	 * @see #getVagrantCommand()
	 * @generated
	 */
	void setVagrantCommand(String value);

} // VMProperty
