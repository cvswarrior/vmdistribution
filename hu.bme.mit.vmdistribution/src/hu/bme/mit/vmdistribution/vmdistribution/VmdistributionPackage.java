/**
 */
package hu.bme.mit.vmdistribution.vmdistribution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionFactory
 * @model kind="package"
 * @generated
 */
public interface VmdistributionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vmdistribution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.vmdistribution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.vmdistribution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmdistributionPackage eINSTANCE = hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__COMPUTER = 0;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__SOFTWARE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Base Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__BASE_IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Use Vagrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__USE_VAGRANT = 4;

	/**
	 * The feature id for the '<em><b>Distribution Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DISTRIBUTION_IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Vmproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__VMPROPERTY = 6;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Prepare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE___PREPARE = 0;

	/**
	 * The operation id for the '<em>Is Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE___IS_COMPATIBLE__COMPUTER = 1;

	/**
	 * The number of operations of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Virtualmachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VIRTUALMACHINE = 0;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPUTER = 1;

	/**
	 * The feature id for the '<em><b>Currentlab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CURRENTLAB = 2;

	/**
	 * The feature id for the '<em><b>Labsetup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LABSETUP = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Setup Lab</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___SETUP_LAB__LAB = 0;

	/**
	 * The operation id for the '<em>Init Vm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___INIT_VM__VIRTUALMACHINE = 1;

	/**
	 * The operation id for the '<em>Delete Vm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___DELETE_VM__VIRTUALMACHINE = 2;

	/**
	 * The operation id for the '<em>Distribute Vm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___DISTRIBUTE_VM__VIRTUALMACHINE = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.ComputerImpl
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 2;

	/**
	 * The feature id for the '<em><b>Virtualmachines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__VIRTUALMACHINES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ip Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__IP_ADDR = 2;

	/**
	 * The feature id for the '<em><b>Available Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__AVAILABLE_SPACE = 3;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.SoftwareImpl
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Install Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__INSTALL_SCRIPT = 2;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Set Install Script From File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE___SET_INSTALL_SCRIPT_FROM_FILE__FILE = 0;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VMPropertyImpl <em>VM Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VMPropertyImpl
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getVMProperty()
	 * @generated
	 */
	int VM_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Vagrant Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PROPERTY__VAGRANT_COMMAND = 1;

	/**
	 * The number of structural features of the '<em>VM Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VM Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.LabImpl <em>Lab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.LabImpl
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getLab()
	 * @generated
	 */
	int LAB = 5;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__COMPUTER = 0;

	/**
	 * The number of structural features of the '<em>Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.LabSetupImpl <em>Lab Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.LabSetupImpl
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getLabSetup()
	 * @generated
	 */
	int LAB_SETUP = 6;

	/**
	 * The feature id for the '<em><b>Lab</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SETUP__LAB = 0;

	/**
	 * The number of structural features of the '<em>Lab Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SETUP_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Save Current Setup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SETUP___SAVE_CURRENT_SETUP__STRING = 0;

	/**
	 * The operation id for the '<em>Get Difference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SETUP___GET_DIFFERENCE__LAB_LAB = 1;

	/**
	 * The number of operations of the '<em>Lab Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SETUP_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 7;

	/**
	 * The meta object id for the '<em>IP Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.InetAddress
	 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getIPAddress()
	 * @generated
	 */
	int IP_ADDRESS = 8;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computer</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getComputer()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Computer();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getSoftware()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Software();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getName()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getBaseImage <em>Base Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Image</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getBaseImage()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_BaseImage();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#isUseVagrant <em>Use Vagrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Vagrant</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#isUseVagrant()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_UseVagrant();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getDistributionImage <em>Distribution Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution Image</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getDistributionImage()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_DistributionImage();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getVmproperty <em>Vmproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vmproperty</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#getVmproperty()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Vmproperty();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#prepare() <em>Prepare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#prepare()
	 * @generated
	 */
	EOperation getVirtualMachine__Prepare();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#isCompatible(hu.bme.mit.vmdistribution.vmdistribution.Computer) <em>Is Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine#isCompatible(hu.bme.mit.vmdistribution.vmdistribution.Computer)
	 * @generated
	 */
	EOperation getVirtualMachine__IsCompatible__Computer();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.vmdistribution.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.vmdistribution.System#getVirtualmachine <em>Virtualmachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtualmachine</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System#getVirtualmachine()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Virtualmachine();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.vmdistribution.System#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computer</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System#getComputer()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Computer();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.vmdistribution.vmdistribution.System#getCurrentlab <em>Currentlab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currentlab</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System#getCurrentlab()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Currentlab();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.vmdistribution.vmdistribution.System#getLabsetup <em>Labsetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labsetup</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System#getLabsetup()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Labsetup();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.System#setupLab(hu.bme.mit.vmdistribution.vmdistribution.Lab) <em>Setup Lab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Setup Lab</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System#setupLab(hu.bme.mit.vmdistribution.vmdistribution.Lab)
	 * @generated
	 */
	EOperation getSystem__SetupLab__Lab();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.System#initVm(hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine) <em>Init Vm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Vm</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System#initVm(hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine)
	 * @generated
	 */
	EOperation getSystem__InitVm__VirtualMachine();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.System#deleteVm(hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine) <em>Delete Vm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Vm</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System#deleteVm(hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine)
	 * @generated
	 */
	EOperation getSystem__DeleteVm__VirtualMachine();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.System#distributeVm(hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine) <em>Distribute Vm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Distribute Vm</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.System#distributeVm(hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine)
	 * @generated
	 */
	EOperation getSystem__DistributeVm__VirtualMachine();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getVirtualmachines <em>Virtualmachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtualmachines</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Computer#getVirtualmachines()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Virtualmachines();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Computer#getName()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getIpAddr <em>Ip Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Addr</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Computer#getIpAddr()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_IpAddr();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.Computer#getAvailableSpace <em>Available Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Space</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Computer#getAvailableSpace()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_AvailableSpace();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.vmdistribution.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Software#getName()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Software#getVersion()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Version();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.Software#getInstallScript <em>Install Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Script</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Software#getInstallScript()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_InstallScript();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.Software#setInstallScriptFromFile(java.io.File) <em>Set Install Script From File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Install Script From File</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Software#setInstallScriptFromFile(java.io.File)
	 * @generated
	 */
	EOperation getSoftware__SetInstallScriptFromFile__File();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.vmdistribution.VMProperty <em>VM Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Property</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VMProperty
	 * @generated
	 */
	EClass getVMProperty();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.VMProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VMProperty#getName()
	 * @see #getVMProperty()
	 * @generated
	 */
	EAttribute getVMProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.vmdistribution.VMProperty#getVagrantCommand <em>Vagrant Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vagrant Command</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VMProperty#getVagrantCommand()
	 * @see #getVMProperty()
	 * @generated
	 */
	EAttribute getVMProperty_VagrantCommand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.vmdistribution.Lab <em>Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lab</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Lab
	 * @generated
	 */
	EClass getLab();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.vmdistribution.vmdistribution.Lab#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computer</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.Lab#getComputer()
	 * @see #getLab()
	 * @generated
	 */
	EReference getLab_Computer();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.vmdistribution.LabSetup <em>Lab Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lab Setup</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.LabSetup
	 * @generated
	 */
	EClass getLabSetup();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.vmdistribution.LabSetup#getLab <em>Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lab</em>'.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.LabSetup#getLab()
	 * @see #getLabSetup()
	 * @generated
	 */
	EReference getLabSetup_Lab();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.LabSetup#saveCurrentSetup(java.lang.String) <em>Save Current Setup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Current Setup</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.LabSetup#saveCurrentSetup(java.lang.String)
	 * @generated
	 */
	EOperation getLabSetup__SaveCurrentSetup__String();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.vmdistribution.vmdistribution.LabSetup#getDifference(hu.bme.mit.vmdistribution.vmdistribution.Lab, hu.bme.mit.vmdistribution.vmdistribution.Lab) <em>Get Difference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Difference</em>' operation.
	 * @see hu.bme.mit.vmdistribution.vmdistribution.LabSetup#getDifference(hu.bme.mit.vmdistribution.vmdistribution.Lab, hu.bme.mit.vmdistribution.vmdistribution.Lab)
	 * @generated
	 */
	EOperation getLabSetup__GetDifference__Lab_Lab();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the meta object for data type '{@link java.net.InetAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Address</em>'.
	 * @see java.net.InetAddress
	 * @model instanceClass="java.net.InetAddress"
	 * @generated
	 */
	EDataType getIPAddress();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmdistributionFactory getVmdistributionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__COMPUTER = eINSTANCE.getVirtualMachine_Computer();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__SOFTWARE = eINSTANCE.getVirtualMachine_Software();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__NAME = eINSTANCE.getVirtualMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Base Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__BASE_IMAGE = eINSTANCE.getVirtualMachine_BaseImage();

		/**
		 * The meta object literal for the '<em><b>Use Vagrant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__USE_VAGRANT = eINSTANCE.getVirtualMachine_UseVagrant();

		/**
		 * The meta object literal for the '<em><b>Distribution Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__DISTRIBUTION_IMAGE = eINSTANCE.getVirtualMachine_DistributionImage();

		/**
		 * The meta object literal for the '<em><b>Vmproperty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__VMPROPERTY = eINSTANCE.getVirtualMachine_Vmproperty();

		/**
		 * The meta object literal for the '<em><b>Prepare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_MACHINE___PREPARE = eINSTANCE.getVirtualMachine__Prepare();

		/**
		 * The meta object literal for the '<em><b>Is Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_MACHINE___IS_COMPATIBLE__COMPUTER = eINSTANCE.getVirtualMachine__IsCompatible__Computer();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.SystemImpl
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Virtualmachine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__VIRTUALMACHINE = eINSTANCE.getSystem_Virtualmachine();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPUTER = eINSTANCE.getSystem_Computer();

		/**
		 * The meta object literal for the '<em><b>Currentlab</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CURRENTLAB = eINSTANCE.getSystem_Currentlab();

		/**
		 * The meta object literal for the '<em><b>Labsetup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__LABSETUP = eINSTANCE.getSystem_Labsetup();

		/**
		 * The meta object literal for the '<em><b>Setup Lab</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___SETUP_LAB__LAB = eINSTANCE.getSystem__SetupLab__Lab();

		/**
		 * The meta object literal for the '<em><b>Init Vm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___INIT_VM__VIRTUALMACHINE = eINSTANCE.getSystem__InitVm__VirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Delete Vm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___DELETE_VM__VIRTUALMACHINE = eINSTANCE.getSystem__DeleteVm__VirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Distribute Vm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___DISTRIBUTE_VM__VIRTUALMACHINE = eINSTANCE.getSystem__DistributeVm__VirtualMachine();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.ComputerImpl
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '<em><b>Virtualmachines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__VIRTUALMACHINES = eINSTANCE.getComputer_Virtualmachines();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__NAME = eINSTANCE.getComputer_Name();

		/**
		 * The meta object literal for the '<em><b>Ip Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__IP_ADDR = eINSTANCE.getComputer_IpAddr();

		/**
		 * The meta object literal for the '<em><b>Available Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__AVAILABLE_SPACE = eINSTANCE.getComputer_AvailableSpace();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.SoftwareImpl
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__NAME = eINSTANCE.getSoftware_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__VERSION = eINSTANCE.getSoftware_Version();

		/**
		 * The meta object literal for the '<em><b>Install Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__INSTALL_SCRIPT = eINSTANCE.getSoftware_InstallScript();

		/**
		 * The meta object literal for the '<em><b>Set Install Script From File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOFTWARE___SET_INSTALL_SCRIPT_FROM_FILE__FILE = eINSTANCE.getSoftware__SetInstallScriptFromFile__File();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VMPropertyImpl <em>VM Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VMPropertyImpl
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getVMProperty()
		 * @generated
		 */
		EClass VM_PROPERTY = eINSTANCE.getVMProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_PROPERTY__NAME = eINSTANCE.getVMProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Vagrant Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_PROPERTY__VAGRANT_COMMAND = eINSTANCE.getVMProperty_VagrantCommand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.LabImpl <em>Lab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.LabImpl
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getLab()
		 * @generated
		 */
		EClass LAB = eINSTANCE.getLab();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB__COMPUTER = eINSTANCE.getLab_Computer();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.vmdistribution.impl.LabSetupImpl <em>Lab Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.LabSetupImpl
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getLabSetup()
		 * @generated
		 */
		EClass LAB_SETUP = eINSTANCE.getLabSetup();

		/**
		 * The meta object literal for the '<em><b>Lab</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SETUP__LAB = eINSTANCE.getLabSetup_Lab();

		/**
		 * The meta object literal for the '<em><b>Save Current Setup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAB_SETUP___SAVE_CURRENT_SETUP__STRING = eINSTANCE.getLabSetup__SaveCurrentSetup__String();

		/**
		 * The meta object literal for the '<em><b>Get Difference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAB_SETUP___GET_DIFFERENCE__LAB_LAB = eINSTANCE.getLabSetup__GetDifference__Lab_Lab();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>IP Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.InetAddress
		 * @see hu.bme.mit.vmdistribution.vmdistribution.impl.VmdistributionPackageImpl#getIPAddress()
		 * @generated
		 */
		EDataType IP_ADDRESS = eINSTANCE.getIPAddress();

	}

} //VmdistributionPackage
