/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getComputer <em>Computer</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputerConfig()
 * @model
 * @generated
 */
public interface ComputerConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Computer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' reference.
	 * @see #setComputer(Computer)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputerConfig_Computer()
	 * @model required="true"
	 * @generated
	 */
	Computer getComputer();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getComputer <em>Computer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computer</em>' reference.
	 * @see #getComputer()
	 * @generated
	 */
	void setComputer(Computer value);

	/**
	 * Returns the value of the '<em><b>Virtualmachines</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtualmachines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualmachines</em>' reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputerConfig_Virtualmachines()
	 * @model
	 * @generated
	 */
	EList<VirtualMachine> getVirtualmachines();

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
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputerConfig_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComputerConfig
