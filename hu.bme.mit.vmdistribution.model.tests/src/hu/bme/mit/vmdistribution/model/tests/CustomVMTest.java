/**
 */
package hu.bme.mit.vmdistribution.model.tests;

import hu.bme.mit.vmdistribution.model.CustomVM;
import hu.bme.mit.vmdistribution.model.VMDistributionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Custom VM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomVMTest extends VirtualMachineTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomVMTest.class);
	}

	/**
	 * Constructs a new Custom VM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomVMTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Custom VM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CustomVM getFixture() {
		return (CustomVM)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VMDistributionFactory.eINSTANCE.createCustomVM());
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

} //CustomVMTest
