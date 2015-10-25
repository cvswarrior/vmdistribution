/**
 */
package hu.bme.mit.vmdistribution.model.tests;

import hu.bme.mit.vmdistribution.model.Requirements;
import hu.bme.mit.vmdistribution.model.VMDistributionFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsTest extends TestCase {

	/**
	 * The fixture for this Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirements fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementsTest.class);
	}

	/**
	 * Constructs a new Requirements test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Requirements fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirements getFixture() {
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
		setFixture(VMDistributionFactory.eINSTANCE.createRequirements());
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

} //RequirementsTest
