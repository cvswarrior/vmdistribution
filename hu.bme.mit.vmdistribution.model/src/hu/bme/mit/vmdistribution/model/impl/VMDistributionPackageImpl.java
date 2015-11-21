/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.ConnectionInfo;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.Requirements;
import hu.bme.mit.vmdistribution.model.VMDistributionFactory;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.VagrantVM;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

import java.io.File;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VMDistributionPackageImpl extends EPackageImpl implements VMDistributionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vagrantVMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VMDistributionPackageImpl() {
		super(eNS_URI, VMDistributionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VMDistributionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VMDistributionPackage init() {
		if (isInited) return (VMDistributionPackage)EPackage.Registry.INSTANCE.getEPackage(VMDistributionPackage.eNS_URI);

		// Obtain or create and register package
		VMDistributionPackageImpl theVMDistributionPackage = (VMDistributionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VMDistributionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VMDistributionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVMDistributionPackage.createPackageContents();

		// Initialize created meta-data
		theVMDistributionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVMDistributionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VMDistributionPackage.eNS_URI, theVMDistributionPackage);
		return theVMDistributionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachine() {
		return virtualMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachine_Computers() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Name() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachine_Requirements() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_VmZipArchive() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabSystem() {
		return labSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSystem_Virtualmachines() {
		return (EReference)labSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSystem_Computers() {
		return (EReference)labSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSystem_Labs() {
		return (EReference)labSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSystem_Currentsetup() {
		return (EReference)labSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSystem_TorrentSeed() {
		return (EReference)labSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputer() {
		return computerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Virtualmachines() {
		return (EReference)computerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_Name() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_MaxSpaceForVMs() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_InstalledRAM() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_Architecture() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Connectioninfo() {
		return (EReference)computerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLab() {
		return labEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLab_Name() {
		return (EAttribute)labEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLab_Computerconfigs() {
		return (EReference)labEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVagrantVM() {
		return vagrantVMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVagrantVM_ReadyToDistribute() {
		return (EAttribute)vagrantVMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVagrantVM_VagrantFile() {
		return (EAttribute)vagrantVMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirements() {
		return requirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirements_ReqArchi() {
		return (EAttribute)requirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirements_ReqRAM() {
		return (EAttribute)requirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirements_ReqSpace() {
		return (EAttribute)requirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputerConfig() {
		return computerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputerConfig_Computer() {
		return (EReference)computerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputerConfig_Virtualmachines() {
		return (EReference)computerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputerConfig_Name() {
		return (EAttribute)computerConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionInfo() {
		return connectionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionInfo_HostName() {
		return (EAttribute)connectionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionInfo_SshPort() {
		return (EAttribute)connectionInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionInfo_SshUser() {
		return (EAttribute)connectionInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionInfo_SshPass() {
		return (EAttribute)connectionInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMDistributionFactory getVMDistributionFactory() {
		return (VMDistributionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__COMPUTERS);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__NAME);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__REQUIREMENTS);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__VM_ZIP_ARCHIVE);

		labSystemEClass = createEClass(LAB_SYSTEM);
		createEReference(labSystemEClass, LAB_SYSTEM__VIRTUALMACHINES);
		createEReference(labSystemEClass, LAB_SYSTEM__COMPUTERS);
		createEReference(labSystemEClass, LAB_SYSTEM__LABS);
		createEReference(labSystemEClass, LAB_SYSTEM__CURRENTSETUP);
		createEReference(labSystemEClass, LAB_SYSTEM__TORRENT_SEED);

		computerEClass = createEClass(COMPUTER);
		createEReference(computerEClass, COMPUTER__VIRTUALMACHINES);
		createEAttribute(computerEClass, COMPUTER__NAME);
		createEAttribute(computerEClass, COMPUTER__MAX_SPACE_FOR_VMS);
		createEAttribute(computerEClass, COMPUTER__INSTALLED_RAM);
		createEAttribute(computerEClass, COMPUTER__ARCHITECTURE);
		createEReference(computerEClass, COMPUTER__CONNECTIONINFO);

		labEClass = createEClass(LAB);
		createEAttribute(labEClass, LAB__NAME);
		createEReference(labEClass, LAB__COMPUTERCONFIGS);

		vagrantVMEClass = createEClass(VAGRANT_VM);
		createEAttribute(vagrantVMEClass, VAGRANT_VM__READY_TO_DISTRIBUTE);
		createEAttribute(vagrantVMEClass, VAGRANT_VM__VAGRANT_FILE);

		requirementsEClass = createEClass(REQUIREMENTS);
		createEAttribute(requirementsEClass, REQUIREMENTS__REQ_ARCHI);
		createEAttribute(requirementsEClass, REQUIREMENTS__REQ_RAM);
		createEAttribute(requirementsEClass, REQUIREMENTS__REQ_SPACE);

		computerConfigEClass = createEClass(COMPUTER_CONFIG);
		createEReference(computerConfigEClass, COMPUTER_CONFIG__COMPUTER);
		createEReference(computerConfigEClass, COMPUTER_CONFIG__VIRTUALMACHINES);
		createEAttribute(computerConfigEClass, COMPUTER_CONFIG__NAME);

		connectionInfoEClass = createEClass(CONNECTION_INFO);
		createEAttribute(connectionInfoEClass, CONNECTION_INFO__HOST_NAME);
		createEAttribute(connectionInfoEClass, CONNECTION_INFO__SSH_PORT);
		createEAttribute(connectionInfoEClass, CONNECTION_INFO__SSH_USER);
		createEAttribute(connectionInfoEClass, CONNECTION_INFO__SSH_PASS);

		// Create data types
		fileEDataType = createEDataType(FILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vagrantVMEClass.getESuperTypes().add(this.getVirtualMachine());

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachine_Computers(), this.getComputer(), this.getComputer_Virtualmachines(), "computers", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_Requirements(), this.getRequirements(), null, "requirements", null, 1, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_VmZipArchive(), this.getFile(), "vmZipArchive", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labSystemEClass, LabSystem.class, "LabSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabSystem_Virtualmachines(), this.getVirtualMachine(), null, "virtualmachines", null, 1, -1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabSystem_Computers(), this.getComputer(), null, "computers", null, 1, -1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabSystem_Labs(), this.getLab(), null, "labs", null, 2, -1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabSystem_Currentsetup(), this.getLab(), null, "currentsetup", null, 1, 1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabSystem_TorrentSeed(), this.getComputer(), null, "torrentSeed", null, 1, 1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputer_Virtualmachines(), this.getVirtualMachine(), this.getVirtualMachine_Computers(), "virtualmachines", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_MaxSpaceForVMs(), ecorePackage.getEDouble(), "maxSpaceForVMs", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_InstalledRAM(), ecorePackage.getEDouble(), "installedRAM", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_Architecture(), ecorePackage.getEString(), "architecture", "x86", 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Connectioninfo(), this.getConnectionInfo(), null, "connectioninfo", null, 1, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labEClass, Lab.class, "Lab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLab_Name(), ecorePackage.getEString(), "name", null, 0, 1, Lab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLab_Computerconfigs(), this.getComputerConfig(), null, "computerconfigs", null, 1, -1, Lab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vagrantVMEClass, VagrantVM.class, "VagrantVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVagrantVM_ReadyToDistribute(), ecorePackage.getEBoolean(), "readyToDistribute", null, 0, 1, VagrantVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVagrantVM_VagrantFile(), this.getFile(), "vagrantFile", null, 0, 1, VagrantVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsEClass, Requirements.class, "Requirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirements_ReqArchi(), ecorePackage.getEString(), "reqArchi", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirements_ReqRAM(), ecorePackage.getEDouble(), "reqRAM", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirements_ReqSpace(), ecorePackage.getEDouble(), "reqSpace", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computerConfigEClass, ComputerConfig.class, "ComputerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputerConfig_Computer(), this.getComputer(), null, "computer", null, 1, 1, ComputerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputerConfig_Virtualmachines(), this.getVirtualMachine(), null, "virtualmachines", null, 1, -1, ComputerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputerConfig_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComputerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionInfoEClass, ConnectionInfo.class, "ConnectionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionInfo_HostName(), ecorePackage.getEString(), "hostName", null, 0, 1, ConnectionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionInfo_SshPort(), ecorePackage.getEInt(), "sshPort", "22", 0, 1, ConnectionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionInfo_SshUser(), ecorePackage.getEString(), "sshUser", "vagrant", 0, 1, ConnectionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionInfo_SshPass(), ecorePackage.getEString(), "sshPass", "vagrant", 0, 1, ConnectionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VMDistributionPackageImpl
