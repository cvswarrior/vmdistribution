/**
 */
package hu.bme.mit.vmdistribution.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see hu.bme.mit.vmdistribution.model.VMDistributionFactory
 * @model kind="package"
 * @generated
 */
public interface VMDistributionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

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
	VMDistributionPackage eINSTANCE = hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.VirtualMachineImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getVirtualMachine()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__REQUIREMENTS = 2;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.LabSystemImpl <em>Lab System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.LabSystemImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getLabSystem()
	 * @generated
	 */
	int LAB_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Virtualmachine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM__VIRTUALMACHINE = 0;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM__COMPUTER = 1;

	/**
	 * The feature id for the '<em><b>Lab</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM__LAB = 2;

	/**
	 * The feature id for the '<em><b>Currentsetup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM__CURRENTSETUP = 3;

	/**
	 * The number of structural features of the '<em>Lab System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Lab System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.ComputerImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getComputer()
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
	 * The feature id for the '<em><b>Installed RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__INSTALLED_RAM = 4;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__ARCHITECTURE = 5;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.SoftwareImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getSoftware()
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
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.VMPropertyImpl <em>VM Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.VMPropertyImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getVMProperty()
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
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.LabImpl <em>Lab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.LabImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getLab()
	 * @generated
	 */
	int LAB = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Computerconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__COMPUTERCONFIG = 1;

	/**
	 * The number of structural features of the '<em>Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl <em>Vagrant VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getVagrant_VM()
	 * @generated
	 */
	int VAGRANT_VM = 6;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__COMPUTER = VIRTUAL_MACHINE__COMPUTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__NAME = VIRTUAL_MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__REQUIREMENTS = VIRTUAL_MACHINE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Distribution Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__DISTRIBUTION_IMAGE = VIRTUAL_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__BASE_IMAGE = VIRTUAL_MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__SOFTWARE = VIRTUAL_MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vmproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__VMPROPERTY = VIRTUAL_MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ready To Distribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__READY_TO_DISTRIBUTE = VIRTUAL_MACHINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vagrant VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM_FEATURE_COUNT = VIRTUAL_MACHINE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Vagrant VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM_OPERATION_COUNT = VIRTUAL_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.CustomVMImpl <em>Custom VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.CustomVMImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getCustomVM()
	 * @generated
	 */
	int CUSTOM_VM = 7;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VM__COMPUTER = VIRTUAL_MACHINE__COMPUTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VM__NAME = VIRTUAL_MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VM__REQUIREMENTS = VIRTUAL_MACHINE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Vm Zip Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VM__VM_ZIP_ARCHIVE = VIRTUAL_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VM_FEATURE_COUNT = VIRTUAL_MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VM_OPERATION_COUNT = VIRTUAL_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.RequirementsImpl <em>Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.RequirementsImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getRequirements()
	 * @generated
	 */
	int REQUIREMENTS = 8;

	/**
	 * The feature id for the '<em><b>Req Archi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__REQ_ARCHI = 0;

	/**
	 * The feature id for the '<em><b>Req RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__REQ_RAM = 1;

	/**
	 * The feature id for the '<em><b>Req Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__REQ_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.ComputerConfigImpl <em>Computer Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.ComputerConfigImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getComputerConfig()
	 * @generated
	 */
	int COMPUTER_CONFIG = 9;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_CONFIG__COMPUTER = 0;

	/**
	 * The feature id for the '<em><b>Virtualmachine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_CONFIG__VIRTUALMACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_CONFIG__NAME = 2;

	/**
	 * The number of structural features of the '<em>Computer Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Computer Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 10;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computer</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VirtualMachine#getComputer()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Computer();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VirtualMachine#getName()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Name();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VirtualMachine#getRequirements()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Requirements();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.LabSystem <em>Lab System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lab System</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem
	 * @generated
	 */
	EClass getLabSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.LabSystem#getVirtualmachine <em>Virtualmachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtualmachine</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem#getVirtualmachine()
	 * @see #getLabSystem()
	 * @generated
	 */
	EReference getLabSystem_Virtualmachine();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.LabSystem#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computer</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem#getComputer()
	 * @see #getLabSystem()
	 * @generated
	 */
	EReference getLabSystem_Computer();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.LabSystem#getLab <em>Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lab</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem#getLab()
	 * @see #getLabSystem()
	 * @generated
	 */
	EReference getLabSystem_Lab();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.vmdistribution.model.LabSystem#getCurrentsetup <em>Currentsetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currentsetup</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem#getCurrentsetup()
	 * @see #getLabSystem()
	 * @generated
	 */
	EReference getLabSystem_Currentsetup();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.vmdistribution.model.Computer#getVirtualmachines <em>Virtualmachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtualmachines</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer#getVirtualmachines()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Virtualmachines();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Computer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer#getName()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Computer#getIpAddr <em>Ip Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Addr</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer#getIpAddr()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_IpAddr();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Computer#getAvailableSpace <em>Available Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Space</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer#getAvailableSpace()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_AvailableSpace();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Computer#getInstalledRAM <em>Installed RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installed RAM</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer#getInstalledRAM()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_InstalledRAM();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Computer#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer#getArchitecture()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_Architecture();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Software#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Software#getName()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Software#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Software#getVersion()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Version();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Software#getInstallScript <em>Install Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Script</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Software#getInstallScript()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_InstallScript();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.VMProperty <em>VM Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Property</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VMProperty
	 * @generated
	 */
	EClass getVMProperty();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.VMProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VMProperty#getName()
	 * @see #getVMProperty()
	 * @generated
	 */
	EAttribute getVMProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.VMProperty#getVagrantCommand <em>Vagrant Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vagrant Command</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VMProperty#getVagrantCommand()
	 * @see #getVMProperty()
	 * @generated
	 */
	EAttribute getVMProperty_VagrantCommand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.Lab <em>Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lab</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Lab
	 * @generated
	 */
	EClass getLab();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Lab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Lab#getName()
	 * @see #getLab()
	 * @generated
	 */
	EAttribute getLab_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.Lab#getComputerconfig <em>Computerconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computerconfig</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Lab#getComputerconfig()
	 * @see #getLab()
	 * @generated
	 */
	EReference getLab_Computerconfig();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM <em>Vagrant VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vagrant VM</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Vagrant_VM
	 * @generated
	 */
	EClass getVagrant_VM();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getDistributionImage <em>Distribution Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution Image</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Vagrant_VM#getDistributionImage()
	 * @see #getVagrant_VM()
	 * @generated
	 */
	EAttribute getVagrant_VM_DistributionImage();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getBaseImage <em>Base Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Image</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Vagrant_VM#getBaseImage()
	 * @see #getVagrant_VM()
	 * @generated
	 */
	EAttribute getVagrant_VM_BaseImage();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Vagrant_VM#getSoftware()
	 * @see #getVagrant_VM()
	 * @generated
	 */
	EReference getVagrant_VM_Software();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#getVmproperty <em>Vmproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vmproperty</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Vagrant_VM#getVmproperty()
	 * @see #getVagrant_VM()
	 * @generated
	 */
	EReference getVagrant_VM_Vmproperty();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM#isReadyToDistribute <em>Ready To Distribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ready To Distribute</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Vagrant_VM#isReadyToDistribute()
	 * @see #getVagrant_VM()
	 * @generated
	 */
	EAttribute getVagrant_VM_ReadyToDistribute();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.CustomVM <em>Custom VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom VM</em>'.
	 * @see hu.bme.mit.vmdistribution.model.CustomVM
	 * @generated
	 */
	EClass getCustomVM();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.CustomVM#getVmZipArchive <em>Vm Zip Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Zip Archive</em>'.
	 * @see hu.bme.mit.vmdistribution.model.CustomVM#getVmZipArchive()
	 * @see #getCustomVM()
	 * @generated
	 */
	EAttribute getCustomVM_VmZipArchive();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Requirements
	 * @generated
	 */
	EClass getRequirements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Requirements#getReqArchi <em>Req Archi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Archi</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Requirements#getReqArchi()
	 * @see #getRequirements()
	 * @generated
	 */
	EAttribute getRequirements_ReqArchi();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Requirements#getReqRAM <em>Req RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req RAM</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Requirements#getReqRAM()
	 * @see #getRequirements()
	 * @generated
	 */
	EAttribute getRequirements_ReqRAM();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Requirements#getReqSpace <em>Req Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Space</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Requirements#getReqSpace()
	 * @see #getRequirements()
	 * @generated
	 */
	EAttribute getRequirements_ReqSpace();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.ComputerConfig <em>Computer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer Config</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ComputerConfig
	 * @generated
	 */
	EClass getComputerConfig();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computer</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ComputerConfig#getComputer()
	 * @see #getComputerConfig()
	 * @generated
	 */
	EReference getComputerConfig_Computer();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getVirtualmachine <em>Virtualmachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtualmachine</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ComputerConfig#getVirtualmachine()
	 * @see #getComputerConfig()
	 * @generated
	 */
	EReference getComputerConfig_Virtualmachine();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ComputerConfig#getName()
	 * @see #getComputerConfig()
	 * @generated
	 */
	EAttribute getComputerConfig_Name();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VMDistributionFactory getVMDistributionFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.VirtualMachineImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getVirtualMachine()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__NAME = eINSTANCE.getVirtualMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__REQUIREMENTS = eINSTANCE.getVirtualMachine_Requirements();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.LabSystemImpl <em>Lab System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.LabSystemImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getLabSystem()
		 * @generated
		 */
		EClass LAB_SYSTEM = eINSTANCE.getLabSystem();

		/**
		 * The meta object literal for the '<em><b>Virtualmachine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SYSTEM__VIRTUALMACHINE = eINSTANCE.getLabSystem_Virtualmachine();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SYSTEM__COMPUTER = eINSTANCE.getLabSystem_Computer();

		/**
		 * The meta object literal for the '<em><b>Lab</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SYSTEM__LAB = eINSTANCE.getLabSystem_Lab();

		/**
		 * The meta object literal for the '<em><b>Currentsetup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SYSTEM__CURRENTSETUP = eINSTANCE.getLabSystem_Currentsetup();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.ComputerImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getComputer()
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
		 * The meta object literal for the '<em><b>Installed RAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__INSTALLED_RAM = eINSTANCE.getComputer_InstalledRAM();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__ARCHITECTURE = eINSTANCE.getComputer_Architecture();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.SoftwareImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getSoftware()
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
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.VMPropertyImpl <em>VM Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.VMPropertyImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getVMProperty()
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
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.LabImpl <em>Lab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.LabImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getLab()
		 * @generated
		 */
		EClass LAB = eINSTANCE.getLab();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAB__NAME = eINSTANCE.getLab_Name();

		/**
		 * The meta object literal for the '<em><b>Computerconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB__COMPUTERCONFIG = eINSTANCE.getLab_Computerconfig();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl <em>Vagrant VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getVagrant_VM()
		 * @generated
		 */
		EClass VAGRANT_VM = eINSTANCE.getVagrant_VM();

		/**
		 * The meta object literal for the '<em><b>Distribution Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAGRANT_VM__DISTRIBUTION_IMAGE = eINSTANCE.getVagrant_VM_DistributionImage();

		/**
		 * The meta object literal for the '<em><b>Base Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAGRANT_VM__BASE_IMAGE = eINSTANCE.getVagrant_VM_BaseImage();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAGRANT_VM__SOFTWARE = eINSTANCE.getVagrant_VM_Software();

		/**
		 * The meta object literal for the '<em><b>Vmproperty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAGRANT_VM__VMPROPERTY = eINSTANCE.getVagrant_VM_Vmproperty();

		/**
		 * The meta object literal for the '<em><b>Ready To Distribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAGRANT_VM__READY_TO_DISTRIBUTE = eINSTANCE.getVagrant_VM_ReadyToDistribute();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.CustomVMImpl <em>Custom VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.CustomVMImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getCustomVM()
		 * @generated
		 */
		EClass CUSTOM_VM = eINSTANCE.getCustomVM();

		/**
		 * The meta object literal for the '<em><b>Vm Zip Archive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_VM__VM_ZIP_ARCHIVE = eINSTANCE.getCustomVM_VmZipArchive();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.RequirementsImpl <em>Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.RequirementsImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getRequirements()
		 * @generated
		 */
		EClass REQUIREMENTS = eINSTANCE.getRequirements();

		/**
		 * The meta object literal for the '<em><b>Req Archi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS__REQ_ARCHI = eINSTANCE.getRequirements_ReqArchi();

		/**
		 * The meta object literal for the '<em><b>Req RAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS__REQ_RAM = eINSTANCE.getRequirements_ReqRAM();

		/**
		 * The meta object literal for the '<em><b>Req Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS__REQ_SPACE = eINSTANCE.getRequirements_ReqSpace();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.ComputerConfigImpl <em>Computer Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.ComputerConfigImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getComputerConfig()
		 * @generated
		 */
		EClass COMPUTER_CONFIG = eINSTANCE.getComputerConfig();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER_CONFIG__COMPUTER = eINSTANCE.getComputerConfig_Computer();

		/**
		 * The meta object literal for the '<em><b>Virtualmachine</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER_CONFIG__VIRTUALMACHINE = eINSTANCE.getComputerConfig_Virtualmachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER_CONFIG__NAME = eINSTANCE.getComputerConfig_Name();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

	}

} //VMDistributionPackage
