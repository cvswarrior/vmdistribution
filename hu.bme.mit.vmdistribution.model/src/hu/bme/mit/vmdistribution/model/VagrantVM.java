/**
 */
package hu.bme.mit.vmdistribution.model;

import java.io.File;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vagrant VM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.VagrantVM#isReadyToDistribute <em>Ready To Distribute</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.VagrantVM#getVagrantFile <em>Vagrant File</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrantVM()
 * @model
 * @generated
 */
public interface VagrantVM extends VirtualMachine {
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
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrantVM_ReadyToDistribute()
	 * @model
	 * @generated
	 */
	boolean isReadyToDistribute();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.VagrantVM#isReadyToDistribute <em>Ready To Distribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ready To Distribute</em>' attribute.
	 * @see #isReadyToDistribute()
	 * @generated
	 */
	void setReadyToDistribute(boolean value);

	/**
	 * Returns the value of the '<em><b>Vagrant File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vagrant File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vagrant File</em>' attribute.
	 * @see #setVagrantFile(File)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getVagrantVM_VagrantFile()
	 * @model dataType="hu.bme.mit.vmdistribution.model.File"
	 * @generated
	 */
	File getVagrantFile();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.VagrantVM#getVagrantFile <em>Vagrant File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vagrant File</em>' attribute.
	 * @see #getVagrantFile()
	 * @generated
	 */
	void setVagrantFile(File value);

} // VagrantVM
