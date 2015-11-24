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
	 * The feature id for the '<em><b>Computers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__COMPUTERS = 0;

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
	 * The feature id for the '<em><b>Vm Zip Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__VM_ZIP_ARCHIVE = 3;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Virtualmachines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM__VIRTUALMACHINES = 0;

	/**
	 * The feature id for the '<em><b>Computers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM__COMPUTERS = 1;

	/**
	 * The feature id for the '<em><b>Labs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM__LABS = 2;

	/**
	 * The feature id for the '<em><b>Torrent Seed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_SYSTEM__TORRENT_SEED = 3;

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
	 * The feature id for the '<em><b>Max Space For VMs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__MAX_SPACE_FOR_VMS = 2;

	/**
	 * The feature id for the '<em><b>Installed RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__INSTALLED_RAM = 3;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__ARCHITECTURE = 4;

	/**
	 * The feature id for the '<em><b>Connectioninfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CONNECTIONINFO = 5;

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
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.LabImpl <em>Lab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.LabImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getLab()
	 * @generated
	 */
	int LAB = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Computerconfigs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__COMPUTERCONFIGS = 1;

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
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.VagrantVMImpl <em>Vagrant VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.VagrantVMImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getVagrantVM()
	 * @generated
	 */
	int VAGRANT_VM = 4;

	/**
	 * The feature id for the '<em><b>Computers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__COMPUTERS = VIRTUAL_MACHINE__COMPUTERS;

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
	 * The feature id for the '<em><b>Vm Zip Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__VM_ZIP_ARCHIVE = VIRTUAL_MACHINE__VM_ZIP_ARCHIVE;

	/**
	 * The feature id for the '<em><b>Ready To Distribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__READY_TO_DISTRIBUTE = VIRTUAL_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vagrant File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM__VAGRANT_FILE = VIRTUAL_MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vagrant VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM_FEATURE_COUNT = VIRTUAL_MACHINE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vagrant VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAGRANT_VM_OPERATION_COUNT = VIRTUAL_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.RequirementsImpl <em>Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.RequirementsImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getRequirements()
	 * @generated
	 */
	int REQUIREMENTS = 5;

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
	int COMPUTER_CONFIG = 6;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_CONFIG__COMPUTER = 0;

	/**
	 * The feature id for the '<em><b>Virtualmachines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_CONFIG__VIRTUALMACHINES = 1;

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
	 * The meta object id for the '{@link hu.bme.mit.vmdistribution.model.impl.ConnectionInfoImpl <em>Connection Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.vmdistribution.model.impl.ConnectionInfoImpl
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getConnectionInfo()
	 * @generated
	 */
	int CONNECTION_INFO = 7;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFO__HOST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ssh Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFO__SSH_PORT = 1;

	/**
	 * The feature id for the '<em><b>Ssh User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFO__SSH_USER = 2;

	/**
	 * The feature id for the '<em><b>Ssh Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFO__SSH_PASS = 3;

	/**
	 * The number of structural features of the '<em>Connection Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 8;


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
	 * Returns the meta object for the reference list '{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computers</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VirtualMachine#getComputers()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Computers();

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
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.VirtualMachine#getVmZipArchive <em>Vm Zip Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Zip Archive</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VirtualMachine#getVmZipArchive()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_VmZipArchive();

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
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.LabSystem#getVirtualmachines <em>Virtualmachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtualmachines</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem#getVirtualmachines()
	 * @see #getLabSystem()
	 * @generated
	 */
	EReference getLabSystem_Virtualmachines();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.LabSystem#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computers</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem#getComputers()
	 * @see #getLabSystem()
	 * @generated
	 */
	EReference getLabSystem_Computers();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.LabSystem#getLabs <em>Labs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labs</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem#getLabs()
	 * @see #getLabSystem()
	 * @generated
	 */
	EReference getLabSystem_Labs();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.vmdistribution.model.LabSystem#getTorrentSeed <em>Torrent Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Torrent Seed</em>'.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem#getTorrentSeed()
	 * @see #getLabSystem()
	 * @generated
	 */
	EReference getLabSystem_TorrentSeed();

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
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.Computer#getMaxSpaceForVMs <em>Max Space For VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Space For VMs</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer#getMaxSpaceForVMs()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_MaxSpaceForVMs();

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
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.vmdistribution.model.Computer#getConnectioninfo <em>Connectioninfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectioninfo</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Computer#getConnectioninfo()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Connectioninfo();

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
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.vmdistribution.model.Lab#getComputerconfigs <em>Computerconfigs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computerconfigs</em>'.
	 * @see hu.bme.mit.vmdistribution.model.Lab#getComputerconfigs()
	 * @see #getLab()
	 * @generated
	 */
	EReference getLab_Computerconfigs();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.VagrantVM <em>Vagrant VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vagrant VM</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VagrantVM
	 * @generated
	 */
	EClass getVagrantVM();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.VagrantVM#isReadyToDistribute <em>Ready To Distribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ready To Distribute</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VagrantVM#isReadyToDistribute()
	 * @see #getVagrantVM()
	 * @generated
	 */
	EAttribute getVagrantVM_ReadyToDistribute();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.VagrantVM#getVagrantFile <em>Vagrant File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vagrant File</em>'.
	 * @see hu.bme.mit.vmdistribution.model.VagrantVM#getVagrantFile()
	 * @see #getVagrantVM()
	 * @generated
	 */
	EAttribute getVagrantVM_VagrantFile();

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
	 * Returns the meta object for the reference list '{@link hu.bme.mit.vmdistribution.model.ComputerConfig#getVirtualmachines <em>Virtualmachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtualmachines</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ComputerConfig#getVirtualmachines()
	 * @see #getComputerConfig()
	 * @generated
	 */
	EReference getComputerConfig_Virtualmachines();

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
	 * Returns the meta object for class '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo <em>Connection Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Info</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ConnectionInfo
	 * @generated
	 */
	EClass getConnectionInfo();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getHostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Name</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ConnectionInfo#getHostName()
	 * @see #getConnectionInfo()
	 * @generated
	 */
	EAttribute getConnectionInfo_HostName();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshPort <em>Ssh Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Port</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshPort()
	 * @see #getConnectionInfo()
	 * @generated
	 */
	EAttribute getConnectionInfo_SshPort();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshUser <em>Ssh User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh User</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshUser()
	 * @see #getConnectionInfo()
	 * @generated
	 */
	EAttribute getConnectionInfo_SshUser();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshPass <em>Ssh Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Pass</em>'.
	 * @see hu.bme.mit.vmdistribution.model.ConnectionInfo#getSshPass()
	 * @see #getConnectionInfo()
	 * @generated
	 */
	EAttribute getConnectionInfo_SshPass();

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
		 * The meta object literal for the '<em><b>Computers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__COMPUTERS = eINSTANCE.getVirtualMachine_Computers();

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
		 * The meta object literal for the '<em><b>Vm Zip Archive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__VM_ZIP_ARCHIVE = eINSTANCE.getVirtualMachine_VmZipArchive();

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
		 * The meta object literal for the '<em><b>Virtualmachines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SYSTEM__VIRTUALMACHINES = eINSTANCE.getLabSystem_Virtualmachines();

		/**
		 * The meta object literal for the '<em><b>Computers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SYSTEM__COMPUTERS = eINSTANCE.getLabSystem_Computers();

		/**
		 * The meta object literal for the '<em><b>Labs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SYSTEM__LABS = eINSTANCE.getLabSystem_Labs();

		/**
		 * The meta object literal for the '<em><b>Torrent Seed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_SYSTEM__TORRENT_SEED = eINSTANCE.getLabSystem_TorrentSeed();

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
		 * The meta object literal for the '<em><b>Max Space For VMs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__MAX_SPACE_FOR_VMS = eINSTANCE.getComputer_MaxSpaceForVMs();

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
		 * The meta object literal for the '<em><b>Connectioninfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__CONNECTIONINFO = eINSTANCE.getComputer_Connectioninfo();

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
		 * The meta object literal for the '<em><b>Computerconfigs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB__COMPUTERCONFIGS = eINSTANCE.getLab_Computerconfigs();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.VagrantVMImpl <em>Vagrant VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.VagrantVMImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getVagrantVM()
		 * @generated
		 */
		EClass VAGRANT_VM = eINSTANCE.getVagrantVM();

		/**
		 * The meta object literal for the '<em><b>Ready To Distribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAGRANT_VM__READY_TO_DISTRIBUTE = eINSTANCE.getVagrantVM_ReadyToDistribute();

		/**
		 * The meta object literal for the '<em><b>Vagrant File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAGRANT_VM__VAGRANT_FILE = eINSTANCE.getVagrantVM_VagrantFile();

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
		 * The meta object literal for the '<em><b>Virtualmachines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER_CONFIG__VIRTUALMACHINES = eINSTANCE.getComputerConfig_Virtualmachines();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER_CONFIG__NAME = eINSTANCE.getComputerConfig_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.vmdistribution.model.impl.ConnectionInfoImpl <em>Connection Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.vmdistribution.model.impl.ConnectionInfoImpl
		 * @see hu.bme.mit.vmdistribution.model.impl.VMDistributionPackageImpl#getConnectionInfo()
		 * @generated
		 */
		EClass CONNECTION_INFO = eINSTANCE.getConnectionInfo();

		/**
		 * The meta object literal for the '<em><b>Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INFO__HOST_NAME = eINSTANCE.getConnectionInfo_HostName();

		/**
		 * The meta object literal for the '<em><b>Ssh Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INFO__SSH_PORT = eINSTANCE.getConnectionInfo_SshPort();

		/**
		 * The meta object literal for the '<em><b>Ssh User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INFO__SSH_USER = eINSTANCE.getConnectionInfo_SshUser();

		/**
		 * The meta object literal for the '<em><b>Ssh Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INFO__SSH_PASS = eINSTANCE.getConnectionInfo_SshPass();

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
