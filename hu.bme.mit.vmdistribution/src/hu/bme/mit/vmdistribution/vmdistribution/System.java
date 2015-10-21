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
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.System#getCurrentlab <em>Currentlab</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.System#getLabsetup <em>Labsetup</em>}</li>
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
	 * Returns the value of the '<em><b>Currentlab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currentlab</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentlab</em>' reference.
	 * @see #setCurrentlab(Lab)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSystem_Currentlab()
	 * @model required="true"
	 * @generated
	 */
	Lab getCurrentlab();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.System#getCurrentlab <em>Currentlab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentlab</em>' reference.
	 * @see #getCurrentlab()
	 * @generated
	 */
	void setCurrentlab(Lab value);

	/**
	 * Returns the value of the '<em><b>Labsetup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labsetup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labsetup</em>' containment reference.
	 * @see #setLabsetup(LabSetup)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getSystem_Labsetup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LabSetup getLabsetup();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.System#getLabsetup <em>Labsetup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labsetup</em>' containment reference.
	 * @see #getLabsetup()
	 * @generated
	 */
	void setLabsetup(LabSetup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setupLab(Lab goal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initVm(VirtualMachine vm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteVm(VirtualMachine todelete);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void distributeVm(VirtualMachine todistribute);

} // System
