/**
 */
package hu.bme.mit.vmdistribution.model;

import java.io.File;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom VM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.CustomVM#getVmZipArchive <em>Vm Zip Archive</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getCustomVM()
 * @model
 * @generated
 */
public interface CustomVM extends VirtualMachine {
	/**
	 * Returns the value of the '<em><b>Vm Zip Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Zip Archive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Zip Archive</em>' attribute.
	 * @see #setVmZipArchive(File)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getCustomVM_VmZipArchive()
	 * @model dataType="hu.bme.mit.vmdistribution.model.File"
	 * @generated
	 */
	File getVmZipArchive();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.CustomVM#getVmZipArchive <em>Vm Zip Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Zip Archive</em>' attribute.
	 * @see #getVmZipArchive()
	 * @generated
	 */
	void setVmZipArchive(File value);

} // CustomVM
