/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lab System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getVirtualmachine <em>Virtualmachine</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getComputer <em>Computer</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getLab <em>Lab</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getCurrentsetup <em>Currentsetup</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem()
 * @model
 * @generated
 */
public interface LabSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtualmachine</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtualmachine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualmachine</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_Virtualmachine()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualMachine> getVirtualmachine();

	/**
	 * Returns the value of the '<em><b>Computer</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.Computer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_Computer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Computer> getComputer();

	/**
	 * Returns the value of the '<em><b>Lab</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.Lab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lab</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lab</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_Lab()
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
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_Currentsetup()
	 * @model
	 * @generated
	 */
	Lab getCurrentsetup();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.LabSystem#getCurrentsetup <em>Currentsetup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentsetup</em>' reference.
	 * @see #getCurrentsetup()
	 * @generated
	 */
	void setCurrentsetup(Lab value);

} // LabSystem
