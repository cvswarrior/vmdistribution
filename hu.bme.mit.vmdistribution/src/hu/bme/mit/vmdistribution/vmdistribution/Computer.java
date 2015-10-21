/**
 */
package hu.bme.mit.vmdistribution.vmdistribution;

import java.net.InetAddress;

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
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getIpAddr <em>Ip Addr</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getAvailableSpace <em>Available Space</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getComputer()
 * @model
 * @generated
 */
public interface Computer extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtualmachines</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtualmachines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualmachines</em>' reference list.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getComputer_Virtualmachines()
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getComputer
	 * @model opposite="computer"
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
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getComputer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ip Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Addr</em>' attribute.
	 * @see #setIpAddr(InetAddress)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getComputer_IpAddr()
	 * @model dataType="hu.bme.mit.vmdistribution.vmdistribution.IPAddress"
	 * @generated
	 */
	InetAddress getIpAddr();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getIpAddr <em>Ip Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Addr</em>' attribute.
	 * @see #getIpAddr()
	 * @generated
	 */
	void setIpAddr(InetAddress value);

	/**
	 * Returns the value of the '<em><b>Available Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Space</em>' attribute.
	 * @see #setAvailableSpace(double)
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#getComputer_AvailableSpace()
	 * @model
	 * @generated
	 */
	double getAvailableSpace();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getAvailableSpace <em>Available Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Space</em>' attribute.
	 * @see #getAvailableSpace()
	 * @generated
	 */
	void setAvailableSpace(double value);

} // Computer
