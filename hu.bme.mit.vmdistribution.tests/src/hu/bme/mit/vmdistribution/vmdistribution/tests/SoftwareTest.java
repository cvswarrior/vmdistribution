/**
 */
package hu.bme.mit.vmdistribution.vmdistribution.tests;

import hu.bme.mit.vmdistribution.vmdistribution.Software;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareTest extends TestCase {

	/**
	 * The fixture for this Software test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Software fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareTest.class);
	}

	/**
	 * Constructs a new Software test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Software test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Software fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Software test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Software getFixture() {
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
		setFixture(VmdistributionFactory.eINSTANCE.createSoftware());
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

} //SoftwareTest
