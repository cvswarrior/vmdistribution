/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.CustomVM;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.Requirements;
import hu.bme.mit.vmdistribution.model.Software;
import hu.bme.mit.vmdistribution.model.VMDistributionFactory;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.VMProperty;
import hu.bme.mit.vmdistribution.model.Vagrant_VM;
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
	private EClass softwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmPropertyEClass = null;

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
	private EClass vagrant_VMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customVMEClass = null;

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
	public EReference getVirtualMachine_Computer() {
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
	public EClass getLabSystem() {
		return labSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSystem_Virtualmachine() {
		return (EReference)labSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSystem_Computer() {
		return (EReference)labSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSystem_Lab() {
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
	public EAttribute getComputer_IpAddr() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_AvailableSpace() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_InstalledRAM() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_Architecture() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftware() {
		return softwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Name() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Version() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_InstallScript() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMProperty() {
		return vmPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMProperty_Name() {
		return (EAttribute)vmPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMProperty_VagrantCommand() {
		return (EAttribute)vmPropertyEClass.getEStructuralFeatures().get(1);
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
	public EReference getLab_Computerconfig() {
		return (EReference)labEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVagrant_VM() {
		return vagrant_VMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVagrant_VM_DistributionImage() {
		return (EAttribute)vagrant_VMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVagrant_VM_BaseImage() {
		return (EAttribute)vagrant_VMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVagrant_VM_Software() {
		return (EReference)vagrant_VMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVagrant_VM_Vmproperty() {
		return (EReference)vagrant_VMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVagrant_VM_ReadyToDistribute() {
		return (EAttribute)vagrant_VMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomVM() {
		return customVMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomVM_VmZipArchive() {
		return (EAttribute)customVMEClass.getEStructuralFeatures().get(0);
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
	public EReference getComputerConfig_Virtualmachine() {
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
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__COMPUTER);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__NAME);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__REQUIREMENTS);

		labSystemEClass = createEClass(LAB_SYSTEM);
		createEReference(labSystemEClass, LAB_SYSTEM__VIRTUALMACHINE);
		createEReference(labSystemEClass, LAB_SYSTEM__COMPUTER);
		createEReference(labSystemEClass, LAB_SYSTEM__LAB);
		createEReference(labSystemEClass, LAB_SYSTEM__CURRENTSETUP);

		computerEClass = createEClass(COMPUTER);
		createEReference(computerEClass, COMPUTER__VIRTUALMACHINES);
		createEAttribute(computerEClass, COMPUTER__NAME);
		createEAttribute(computerEClass, COMPUTER__IP_ADDR);
		createEAttribute(computerEClass, COMPUTER__AVAILABLE_SPACE);
		createEAttribute(computerEClass, COMPUTER__INSTALLED_RAM);
		createEAttribute(computerEClass, COMPUTER__ARCHITECTURE);

		softwareEClass = createEClass(SOFTWARE);
		createEAttribute(softwareEClass, SOFTWARE__NAME);
		createEAttribute(softwareEClass, SOFTWARE__VERSION);
		createEAttribute(softwareEClass, SOFTWARE__INSTALL_SCRIPT);

		vmPropertyEClass = createEClass(VM_PROPERTY);
		createEAttribute(vmPropertyEClass, VM_PROPERTY__NAME);
		createEAttribute(vmPropertyEClass, VM_PROPERTY__VAGRANT_COMMAND);

		labEClass = createEClass(LAB);
		createEAttribute(labEClass, LAB__NAME);
		createEReference(labEClass, LAB__COMPUTERCONFIG);

		vagrant_VMEClass = createEClass(VAGRANT_VM);
		createEAttribute(vagrant_VMEClass, VAGRANT_VM__DISTRIBUTION_IMAGE);
		createEAttribute(vagrant_VMEClass, VAGRANT_VM__BASE_IMAGE);
		createEReference(vagrant_VMEClass, VAGRANT_VM__SOFTWARE);
		createEReference(vagrant_VMEClass, VAGRANT_VM__VMPROPERTY);
		createEAttribute(vagrant_VMEClass, VAGRANT_VM__READY_TO_DISTRIBUTE);

		customVMEClass = createEClass(CUSTOM_VM);
		createEAttribute(customVMEClass, CUSTOM_VM__VM_ZIP_ARCHIVE);

		requirementsEClass = createEClass(REQUIREMENTS);
		createEAttribute(requirementsEClass, REQUIREMENTS__REQ_ARCHI);
		createEAttribute(requirementsEClass, REQUIREMENTS__REQ_RAM);
		createEAttribute(requirementsEClass, REQUIREMENTS__REQ_SPACE);

		computerConfigEClass = createEClass(COMPUTER_CONFIG);
		createEReference(computerConfigEClass, COMPUTER_CONFIG__COMPUTER);
		createEReference(computerConfigEClass, COMPUTER_CONFIG__VIRTUALMACHINE);
		createEAttribute(computerConfigEClass, COMPUTER_CONFIG__NAME);

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
		vagrant_VMEClass.getESuperTypes().add(this.getVirtualMachine());
		customVMEClass.getESuperTypes().add(this.getVirtualMachine());

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachine_Computer(), this.getComputer(), this.getComputer_Virtualmachines(), "computer", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_Requirements(), this.getRequirements(), null, "requirements", null, 1, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labSystemEClass, LabSystem.class, "LabSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabSystem_Virtualmachine(), this.getVirtualMachine(), null, "virtualmachine", null, 0, -1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabSystem_Computer(), this.getComputer(), null, "computer", null, 0, -1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabSystem_Lab(), this.getLab(), null, "lab", null, 0, -1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabSystem_Currentsetup(), this.getLab(), null, "currentsetup", null, 0, 1, LabSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputer_Virtualmachines(), this.getVirtualMachine(), this.getVirtualMachine_Computer(), "virtualmachines", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_IpAddr(), ecorePackage.getEString(), "ipAddr", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_AvailableSpace(), ecorePackage.getEDouble(), "AvailableSpace", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_InstalledRAM(), ecorePackage.getEDouble(), "installedRAM", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_Architecture(), ecorePackage.getEString(), "architecture", "x86", 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareEClass, Software.class, "Software", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftware_Name(), ecorePackage.getEString(), "name", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Version(), ecorePackage.getEString(), "version", "1.0.0", 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_InstallScript(), ecorePackage.getEString(), "installScript", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmPropertyEClass, VMProperty.class, "VMProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVMProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, VMProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMProperty_VagrantCommand(), ecorePackage.getEString(), "vagrantCommand", null, 0, 1, VMProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labEClass, Lab.class, "Lab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLab_Name(), ecorePackage.getEString(), "name", null, 0, 1, Lab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLab_Computerconfig(), this.getComputerConfig(), null, "computerconfig", null, 1, -1, Lab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vagrant_VMEClass, Vagrant_VM.class, "Vagrant_VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVagrant_VM_DistributionImage(), this.getFile(), "distributionImage", null, 0, 1, Vagrant_VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVagrant_VM_BaseImage(), this.getFile(), "baseImage", null, 0, 1, Vagrant_VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVagrant_VM_Software(), this.getSoftware(), null, "software", null, 0, -1, Vagrant_VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVagrant_VM_Vmproperty(), this.getVMProperty(), null, "vmproperty", null, 0, -1, Vagrant_VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVagrant_VM_ReadyToDistribute(), ecorePackage.getEBoolean(), "readyToDistribute", null, 0, 1, Vagrant_VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customVMEClass, CustomVM.class, "CustomVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomVM_VmZipArchive(), this.getFile(), "vmZipArchive", null, 0, 1, CustomVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsEClass, Requirements.class, "Requirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirements_ReqArchi(), ecorePackage.getEString(), "reqArchi", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirements_ReqRAM(), ecorePackage.getEDouble(), "reqRAM", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirements_ReqSpace(), ecorePackage.getEDouble(), "reqSpace", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computerConfigEClass, ComputerConfig.class, "ComputerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputerConfig_Computer(), this.getComputer(), null, "computer", null, 1, 1, ComputerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputerConfig_Virtualmachine(), this.getVirtualMachine(), null, "virtualmachine", null, 0, -1, ComputerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputerConfig_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComputerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VMDistributionPackageImpl
