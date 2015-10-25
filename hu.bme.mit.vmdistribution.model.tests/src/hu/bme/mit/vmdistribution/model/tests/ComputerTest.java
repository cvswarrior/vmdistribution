/**
 */
package hu.bme.mit.vmdistribution.model.tests;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.VMDistributionFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputerTest extends TestCase {

	/**
	 * The fixture for this Computer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Computer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComputerTest.class);
	}

	/**
	 * Constructs a new Computer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Computer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Computer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Computer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Computer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VMDistributionFactory.eINSTANCE.createComputer());
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

} //ComputerTest
