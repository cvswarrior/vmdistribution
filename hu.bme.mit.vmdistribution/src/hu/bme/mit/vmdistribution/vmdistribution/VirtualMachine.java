/**
 */
package hu.bme.mit.vmdistribution.vmdistribution;

import java.io.File;

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
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getComputer <em>Computer</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getSoftware <em>Software</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getBaseImage <em>Base Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#isUseVagrant <em>Use Vagrant</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getDistributionImage <em>Distribution Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getVmproperty <em>Vmproperty</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Computer</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.vmdistribution.Computer}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getVirtualmachines <em>Virtualmachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' reference list.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getVirtualMachine_Computer()
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Computer#getVirtualmachines
	 * @model opposite="virtualmachines"
	 * @generated
	 */
	EList<Computer> getComputer();

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.vmdistribution.Software}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getVirtualMachine_Software()
	 * @model containment="true"
	 * @generated
	 */
	EList<Software> getSoftware();

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
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getVirtualMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getVirtualMachine_BaseImage()
	 * @model dataType="hu.bme.mit.vmdistribution.vmdistribution.File"
	 * @generated
	 */
	File getBaseImage();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getBaseImage <em>Base Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Image</em>' attribute.
	 * @see #getBaseImage()
	 * @generated
	 */
	void setBaseImage(File value);

	/**
	 * Returns the value of the '<em><b>Use Vagrant</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Vagrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Vagrant</em>' attribute.
	 * @see #setUseVagrant(boolean)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getVirtualMachine_UseVagrant()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isUseVagrant();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#isUseVagrant <em>Use Vagrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Vagrant</em>' attribute.
	 * @see #isUseVagrant()
	 * @generated
	 */
	void setUseVagrant(boolean value);

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
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getVirtualMachine_DistributionImage()
	 * @model dataType="hu.bme.mit.vmdistribution.vmdistribution.File"
	 * @generated
	 */
	File getDistributionImage();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getDistributionImage <em>Distribution Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Image</em>' attribute.
	 * @see #getDistributionImage()
	 * @generated
	 */
	void setDistributionImage(File value);

	/**
	 * Returns the value of the '<em><b>Vmproperty</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.vmdistribution.VMProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmproperty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmproperty</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getVirtualMachine_Vmproperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMProperty> getVmproperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void prepare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCompatible(Computer computer);

} // VirtualMachine
