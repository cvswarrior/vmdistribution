/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Lab#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Lab#getComputerconfig <em>Computerconfig</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLab()
 * @model
 * @generated
 */
public interface Lab extends EObject {
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
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLab_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Lab#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Computerconfig</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.ComputerConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computerconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computerconfig</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLab_Computerconfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComputerConfig> getComputerconfig();

} // Lab
