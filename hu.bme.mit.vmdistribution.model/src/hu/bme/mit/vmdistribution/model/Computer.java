/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Computer#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Computer#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Computer#getMaxSpaceForVMs <em>Max Space For VMs</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Computer#getInstalledRAM <em>Installed RAM</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Computer#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.Computer#getConnectioninfo <em>Connectioninfo</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputer()
 * @model
 * @generated
 */
public interface Computer extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtualmachines</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.VirtualMachine}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtualmachines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualmachines</em>' reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputer_Virtualmachines()
	 * @see hu.bme.mit.vmdistribution.model.VirtualMachine#getComputers
	 * @model opposite="computers"
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
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Computer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Max Space For VMs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Space For VMs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Space For VMs</em>' attribute.
	 * @see #setMaxSpaceForVMs(double)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputer_MaxSpaceForVMs()
	 * @model
	 * @generated
	 */
	double getMaxSpaceForVMs();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Computer#getMaxSpaceForVMs <em>Max Space For VMs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Space For VMs</em>' attribute.
	 * @see #getMaxSpaceForVMs()
	 * @generated
	 */
	void setMaxSpaceForVMs(double value);

	/**
	 * Returns the value of the '<em><b>Installed RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installed RAM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed RAM</em>' attribute.
	 * @see #setInstalledRAM(double)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputer_InstalledRAM()
	 * @model
	 * @generated
	 */
	double getInstalledRAM();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Computer#getInstalledRAM <em>Installed RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installed RAM</em>' attribute.
	 * @see #getInstalledRAM()
	 * @generated
	 */
	void setInstalledRAM(double value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The default value is <code>"x86"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputer_Architecture()
	 * @model default="x86"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Computer#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Connectioninfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectioninfo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectioninfo</em>' containment reference.
	 * @see #setConnectioninfo(ConnectionInfo)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getComputer_Connectioninfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionInfo getConnectioninfo();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.Computer#getConnectioninfo <em>Connectioninfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectioninfo</em>' containment reference.
	 * @see #getConnectioninfo()
	 * @generated
	 */
	void setConnectioninfo(ConnectionInfo value);

} // Computer
