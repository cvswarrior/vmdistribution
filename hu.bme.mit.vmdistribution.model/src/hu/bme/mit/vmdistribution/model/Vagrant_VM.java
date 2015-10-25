/**
 */
package hu.bme.mit.vmdistribution.model;

import java.io.File;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vagrant VM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getDistributionImage <em>Distribution Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getBaseImage <em>Base Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getSoftware <em>Software</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getVmproperty <em>Vmproperty</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#isReadyToDistribute <em>Ready To Distribute</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrant_VM()
 * @model
 * @generated
 */
public interface Vagrant_VM extends VirtualMachine {
	/**
	 * Returns the value of the '<em><b>Distribution Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Image</em>' attribute.
	 * @see #setDistributionImage(File)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrant_VM_DistributionImage()
	 * @model dataType="hu.bme.mit.vmdistribution.model.File"
	 * @generated
	 */
	File getDistributionImage();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getDistributionImage <em>Distribution Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Image</em>' attribute.
	 * @see #getDistributionImage()
	 * @generated
	 */
	void setDistributionImage(File value);

	/**
	 * Returns the value of the '<em><b>Base Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Image</em>' attribute.
	 * @see #setBaseImage(File)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrant_VM_BaseImage()
	 * @model dataType="hu.bme.mit.vmdistribution.model.File"
	 * @generated
	 */
	File getBaseImage();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getBaseImage <em>Base Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Image</em>' attribute.
	 * @see #getBaseImage()
	 * @generated
	 */
	void setBaseImage(File value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.Software}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrant_VM_Software()
	 * @model containment="true"
	 * @generated
	 */
	EList<Software> getSoftware();

	/**
	 * Returns the value of the '<em><b>Vmproperty</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.VMProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmproperty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmproperty</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrant_VM_Vmproperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMProperty> getVmproperty();

	/**
	 * Returns the value of the '<em><b>Ready To Distribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ready To Distribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ready To Distribute</em>' attribute.
	 * @see #setReadyToDistribute(boolean)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrant_VM_ReadyToDistribute()
	 * @model
	 * @generated
	 */
	boolean isReadyToDistribute();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#isReadyToDistribute <em>Ready To Distribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ready To Distribute</em>' attribute.
	 * @see #isReadyToDistribute()
	 * @generated
	 */
	void setReadyToDistribute(boolean value);

} // Vagrant_VM
