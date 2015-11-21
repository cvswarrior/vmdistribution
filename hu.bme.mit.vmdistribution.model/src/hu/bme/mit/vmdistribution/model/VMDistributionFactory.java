/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage
 * @generated
 */
public interface VMDistributionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VMDistributionFactory eINSTANCE = hu.bme.mit.vmdistribution.model.impl.VMDistributionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine</em>'.
	 * @generated
	 */
	VirtualMachine createVirtualMachine();

	/**
	 * Returns a new object of class '<em>Lab System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lab System</em>'.
	 * @generated
	 */
	LabSystem createLabSystem();

	/**
	 * Returns a new object of class '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer</em>'.
	 * @generated
	 */
	Computer createComputer();

	/**
	 * Returns a new object of class '<em>Lab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lab</em>'.
	 * @generated
	 */
	Lab createLab();

	/**
	 * Returns a new object of class '<em>Vagrant VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vagrant VM</em>'.
	 * @generated
	 */
	VagrantVM createVagrantVM();

	/**
	 * Returns a new object of class '<em>Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements</em>'.
	 * @generated
	 */
	Requirements createRequirements();

	/**
	 * Returns a new object of class '<em>Computer Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer Config</em>'.
	 * @generated
	 */
	ComputerConfig createComputerConfig();

	/**
	 * Returns a new object of class '<em>Connection Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Info</em>'.
	 * @generated
	 */
	ConnectionInfo createConnectionInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VMDistributionPackage getVMDistributionPackage();

} //VMDistributionFactory
