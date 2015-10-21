/**
 */
package hu.bme.mit.vmdistribution.vmdistribution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lab Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.LabSetup#getLab <em>Lab</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getLabSetup()
 * @model
 * @generated
 */
public interface LabSetup extends EObject {
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
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getLabSetup_Lab()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lab> getLab();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void saveCurrentSetup(String labname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Lab getDifference(Lab current, Lab new_);

} // LabSetup
