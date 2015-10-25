/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getComputer <em>Computer</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVirtualMachine()
 * @model abstract="true"
 * @generated
 */
public interface VirtualMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Computer</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.Computer}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.vmdistribution.model.Computer#getVirtualmachines <em>Virtualmachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVirtualMachine_Computer()
	 * @see hu.bme.mit.vmdistribution.model.Computer#getVirtualmachines
	 * @model opposite="virtualmachines"
	 * @generated
	 */
	EList<Computer> getComputer();

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
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVirtualMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(Requirements)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVirtualMachine_Requirements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Requirements getRequirements();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(Requirements value);

} // VirtualMachine
