/**
 */
package hu.bme.mit.vmdistribution.model.tests;

import hu.bme.mit.vmdistribution.model.VMDistributionFactory;
import hu.bme.mit.vmdistribution.model.Vagrant_VM;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vagrant VM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Vagrant_VMTest extends VirtualMachineTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Vagrant_VMTest.class);
	}

	/**
	 * Constructs a new Vagrant VM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vagrant_VMTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vagrant VM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Vagrant_VM getFixture() {
		return (Vagrant_VM)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VMDistributionFactory.eINSTANCE.createVagrant_VM());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //Vagrant_VMTest
