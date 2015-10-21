/**
 */
package hu.bme.mit.vmdistribution.vmdistribution;

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
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.Lab#getComputer <em>Computer</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getLab()
 * @model
 * @generated
 */
public interface Lab extends EObject {
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
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getLab_Computer()
	 * @model
	 * @generated
	 */
	Computer getComputer();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.Lab#getComputer <em>Computer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computer</em>' reference.
	 * @see #getComputer()
	 * @generated
	 */
	void setComputer(Computer value);

} // Lab
