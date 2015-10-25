/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Requirements#getReqArchi <em>Req Archi</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Requirements#getReqRAM <em>Req RAM</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Requirements#getReqSpace <em>Req Space</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getRequirements()
 * @model
 * @generated
 */
public interface Requirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Req Archi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Archi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Archi</em>' attribute.
	 * @see #setReqArchi(String)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getRequirements_ReqArchi()
	 * @model
	 * @generated
	 */
	String getReqArchi();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Requirements#getReqArchi <em>Req Archi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Archi</em>' attribute.
	 * @see #getReqArchi()
	 * @generated
	 */
	void setReqArchi(String value);

	/**
	 * Returns the value of the '<em><b>Req RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req RAM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req RAM</em>' attribute.
	 * @see #setReqRAM(double)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getRequirements_ReqRAM()
	 * @model
	 * @generated
	 */
	double getReqRAM();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Requirements#getReqRAM <em>Req RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req RAM</em>' attribute.
	 * @see #getReqRAM()
	 * @generated
	 */
	void setReqRAM(double value);

	/**
	 * Returns the value of the '<em><b>Req Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Space</em>' attribute.
	 * @see #setReqSpace(double)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getRequirements_ReqSpace()
	 * @model
	 * @generated
	 */
	double getReqSpace();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Requirements#getReqSpace <em>Req Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Space</em>' attribute.
	 * @see #getReqSpace()
	 * @generated
	 */
	void setReqSpace(double value);

} // Requirements
