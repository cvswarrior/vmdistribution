/**
 */
package hu.bme.mit.vmdistribution.model.tests;

import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VMDistributionFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lab System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabSystemTest extends TestCase {

	/**
	 * The fixture for this Lab System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LabSystemTest.class);
	}

	/**
	 * Constructs a new Lab System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Lab System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LabSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Lab System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabSystem getFixture() {
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
		setFixture(VMDistributionFactory.eINSTANCE.createLabSystem());
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

} //LabSystemTest
