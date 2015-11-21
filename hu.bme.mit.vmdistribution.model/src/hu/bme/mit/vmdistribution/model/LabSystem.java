/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lab System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getComputers <em>Computers</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getLabs <em>Labs</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getCurrentsetup <em>Currentsetup</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.LabSystem#getTorrentSeed <em>Torrent Seed</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem()
 * @model
 * @generated
 */
public interface LabSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtualmachines</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtualmachines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualmachines</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_Virtualmachines()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VirtualMachine> getVirtualmachines();

	/**
	 * Returns the value of the '<em><b>Computers</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.Computer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computers</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_Computers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Computer> getComputers();

	/**
	 * Returns the value of the '<em><b>Labs</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.vmdistribution.model.Lab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labs</em>' containment reference list.
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_Labs()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Lab> getLabs();

	/**
	 * Returns the value of the '<em><b>Currentsetup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currentsetup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentsetup</em>' reference.
	 * @see #setCurrentsetup(Lab)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_Currentsetup()
	 * @model required="true"
	 * @generated
	 */
	Lab getCurrentsetup();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.LabSystem#getCurrentsetup <em>Currentsetup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentsetup</em>' reference.
	 * @see #getCurrentsetup()
	 * @generated
	 */
	void setCurrentsetup(Lab value);

	/**
	 * Returns the value of the '<em><b>Torrent Seed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torrent Seed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torrent Seed</em>' reference.
	 * @see #setTorrentSeed(Computer)
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#getLabSystem_TorrentSeed()
	 * @model required="true"
	 * @generated
	 */
	Computer getTorrentSeed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.vmdistribution.model.LabSystem#getTorrentSeed <em>Torrent Seed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torrent Seed</em>' reference.
	 * @see #getTorrentSeed()
	 * @generated
	 */
	void setTorrentSeed(Computer value);

} // LabSystem
