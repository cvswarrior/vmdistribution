/**
 */
package hu.bme.mit.vmdistribution.vmdistribution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.System#getVirtualmachine <em>Virtualmachine</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.System#getComputer <em>Computer</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.System#getLab <em>Lab</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.System#getCurrentsetup <em>Currentsetup</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtualmachine</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtualmachine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualmachine</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSystem_Virtualmachine()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualMachine> getVirtualmachine();

	/**
	 * Returns the value of the '<em><b>Computer</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.vmdistribution.Computer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSystem_Computer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Computer> getComputer();

	/**
	 * Returns the value of the '<em><b>Lab</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.vmdistribution.Lab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lab</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lab</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSystem_Lab()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lab> getLab();

	/**
	 * Returns the value of the '<em><b>Currentsetup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currentsetup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentsetup</em>' reference.
	 * @see #setCurrentsetup(Lab)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSystem_Currentsetup()
	 * @model
	 * @generated
	 */
	Lab getCurrentsetup();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.System#getCurrentsetup <em>Currentsetup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentsetup</em>' reference.
	 * @see #getCurrentsetup()
	 * @generated
	 */
	void setCurrentsetup(Lab value);

} // System
