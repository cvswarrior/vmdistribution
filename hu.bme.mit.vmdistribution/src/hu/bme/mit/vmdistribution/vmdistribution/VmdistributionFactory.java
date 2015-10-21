/**
 */
package hu.bme.mit.vmdistribution.vmdistribution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage
 * @generated
 */
public interface VmdistributionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmdistributionFactory eINSTANCE = hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer</em>'.
	 * @generated
	 */
	Computer createComputer();

	/**
	 * Returns a new object of class '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software</em>'.
	 * @generated
	 */
	Software createSoftware();

	/**
	 * Returns a new object of class '<em>VM Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Property</em>'.
	 * @generated
	 */
	VMProperty createVMProperty();

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
	Vagrant_VM createVagrant_VM();

	/**
	 * Returns a new object of class '<em>Custom VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom VM</em>'.
	 * @generated
	 */
	CustomVM createCustomVM();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmdistributionPackage getVmdistributionPackage();

} //VmdistributionFactory
