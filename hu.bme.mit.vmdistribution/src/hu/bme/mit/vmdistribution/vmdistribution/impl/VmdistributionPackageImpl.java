/**
 */
package hu.bme.mit.vmdistribution.vmdistribution.impl;

import hu.bme.mit.vmdistribution.vmdistribution.Computer;
import hu.bme.mit.vmdistribution.vmdistribution.Lab;
import hu.bme.mit.vmdistribution.vmdistribution.LabSetup;
import hu.bme.mit.vmdistribution.vmdistribution.Software;
import hu.bme.mit.vmdistribution.vmdistribution.VMProperty;
import hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionFactory;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage;

import java.io.File;

import java.net.InetAddress;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmdistributionPackageImpl extends EPackageImpl implements VmdistributionPackage {
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
	private EClass systemEClass = null;

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
	private EClass labSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipAddressEDataType = null;

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
	 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VmdistributionPackageImpl() {
		super(eNS_URI, VmdistributionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VmdistributionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VmdistributionPackage init() {
		if (isInited) return (VmdistributionPackage)EPackage.Registry.INSTANCE.getEPackage(VmdistributionPackage.eNS_URI);

		// Obtain or create and register package
		VmdistributionPackageImpl theVmdistributionPackage = (VmdistributionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VmdistributionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VmdistributionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVmdistributionPackage.createPackageContents();

		// Initialize created meta-data
		theVmdistributionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVmdistributionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VmdistributionPackage.eNS_URI, theVmdistributionPackage);
		return theVmdistributionPackage;
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
	public EReference getVirtualMachine_Software() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Name() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_BaseImage() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_UseVagrant() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_DistributionImage() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachine_Vmproperty() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualMachine__Prepare() {
		return virtualMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualMachine__IsCompatible__Computer() {
		return virtualMachineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Virtualmachine() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Computer() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Currentlab() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Labsetup() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__SetupLab__Lab() {
		return systemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__InitVm__VirtualMachine() {
		return systemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__DeleteVm__VirtualMachine() {
		return systemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__DistributeVm__VirtualMachine() {
		return systemEClass.getEOperations().get(3);
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
	public EOperation getSoftware__SetInstallScriptFromFile__File() {
		return softwareEClass.getEOperations().get(0);
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
	public EReference getLab_Computer() {
		return (EReference)labEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabSetup() {
		return labSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabSetup_Lab() {
		return (EReference)labSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabSetup__SaveCurrentSetup__String() {
		return labSetupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabSetup__GetDifference__Lab_Lab() {
		return labSetupEClass.getEOperations().get(1);
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
	public EDataType getIPAddress() {
		return ipAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmdistributionFactory getVmdistributionFactory() {
		return (VmdistributionFactory)getEFactoryInstance();
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
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__SOFTWARE);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__NAME);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__BASE_IMAGE);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__USE_VAGRANT);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__DISTRIBUTION_IMAGE);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__VMPROPERTY);
		createEOperation(virtualMachineEClass, VIRTUAL_MACHINE___PREPARE);
		createEOperation(virtualMachineEClass, VIRTUAL_MACHINE___IS_COMPATIBLE__COMPUTER);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__VIRTUALMACHINE);
		createEReference(systemEClass, SYSTEM__COMPUTER);
		createEReference(systemEClass, SYSTEM__CURRENTLAB);
		createEReference(systemEClass, SYSTEM__LABSETUP);
		createEOperation(systemEClass, SYSTEM___SETUP_LAB__LAB);
		createEOperation(systemEClass, SYSTEM___INIT_VM__VIRTUALMACHINE);
		createEOperation(systemEClass, SYSTEM___DELETE_VM__VIRTUALMACHINE);
		createEOperation(systemEClass, SYSTEM___DISTRIBUTE_VM__VIRTUALMACHINE);

		computerEClass = createEClass(COMPUTER);
		createEReference(computerEClass, COMPUTER__VIRTUALMACHINES);
		createEAttribute(computerEClass, COMPUTER__NAME);
		createEAttribute(computerEClass, COMPUTER__IP_ADDR);
		createEAttribute(computerEClass, COMPUTER__AVAILABLE_SPACE);

		softwareEClass = createEClass(SOFTWARE);
		createEAttribute(softwareEClass, SOFTWARE__NAME);
		createEAttribute(softwareEClass, SOFTWARE__VERSION);
		createEAttribute(softwareEClass, SOFTWARE__INSTALL_SCRIPT);
		createEOperation(softwareEClass, SOFTWARE___SET_INSTALL_SCRIPT_FROM_FILE__FILE);

		vmPropertyEClass = createEClass(VM_PROPERTY);
		createEAttribute(vmPropertyEClass, VM_PROPERTY__NAME);
		createEAttribute(vmPropertyEClass, VM_PROPERTY__VAGRANT_COMMAND);

		labEClass = createEClass(LAB);
		createEReference(labEClass, LAB__COMPUTER);

		labSetupEClass = createEClass(LAB_SETUP);
		createEReference(labSetupEClass, LAB_SETUP__LAB);
		createEOperation(labSetupEClass, LAB_SETUP___SAVE_CURRENT_SETUP__STRING);
		createEOperation(labSetupEClass, LAB_SETUP___GET_DIFFERENCE__LAB_LAB);

		// Create data types
		fileEDataType = createEDataType(FILE);
		ipAddressEDataType = createEDataType(IP_ADDRESS);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachine_Computer(), this.getComputer(), this.getComputer_Virtualmachines(), "computer", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_Software(), this.getSoftware(), null, "software", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_BaseImage(), this.getFile(), "baseImage", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_UseVagrant(), theXMLTypePackage.getBoolean(), "useVagrant", "true", 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_DistributionImage(), this.getFile(), "distributionImage", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_Vmproperty(), this.getVMProperty(), null, "vmproperty", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVirtualMachine__Prepare(), null, "prepare", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getVirtualMachine__IsCompatible__Computer(), theXMLTypePackage.getBoolean(), "isCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComputer(), "computer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemEClass, hu.bme.mit.vmdistribution.vmdistribution.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Virtualmachine(), this.getVirtualMachine(), null, "virtualmachine", null, 0, -1, hu.bme.mit.vmdistribution.vmdistribution.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Computer(), this.getComputer(), null, "computer", null, 0, -1, hu.bme.mit.vmdistribution.vmdistribution.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Currentlab(), this.getLab(), null, "currentlab", null, 1, 1, hu.bme.mit.vmdistribution.vmdistribution.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Labsetup(), this.getLabSetup(), null, "labsetup", null, 1, 1, hu.bme.mit.vmdistribution.vmdistribution.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSystem__SetupLab__Lab(), null, "setupLab", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLab(), "goal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSystem__InitVm__VirtualMachine(), null, "initVm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVirtualMachine(), "vm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSystem__DeleteVm__VirtualMachine(), null, "deleteVm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVirtualMachine(), "todelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSystem__DistributeVm__VirtualMachine(), null, "distributeVm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVirtualMachine(), "todistribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputer_Virtualmachines(), this.getVirtualMachine(), this.getVirtualMachine_Computer(), "virtualmachines", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_IpAddr(), this.getIPAddress(), "ipAddr", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_AvailableSpace(), ecorePackage.getEDouble(), "AvailableSpace", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareEClass, Software.class, "Software", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftware_Name(), ecorePackage.getEString(), "name", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Version(), ecorePackage.getEString(), "version", "1.0.0", 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_InstallScript(), ecorePackage.getEString(), "installScript", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSoftware__SetInstallScriptFromFile__File(), null, "setInstallScriptFromFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "scriptlocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmPropertyEClass, VMProperty.class, "VMProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVMProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, VMProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMProperty_VagrantCommand(), ecorePackage.getEString(), "vagrantCommand", null, 0, 1, VMProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labEClass, Lab.class, "Lab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLab_Computer(), this.getComputer(), null, "computer", null, 0, 1, Lab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labSetupEClass, LabSetup.class, "LabSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabSetup_Lab(), this.getLab(), null, "lab", null, 0, -1, LabSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLabSetup__SaveCurrentSetup__String(), null, "saveCurrentSetup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "labname", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLabSetup__GetDifference__Lab_Lab(), this.getLab(), "getDifference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLab(), "current", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLab(), "new_", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipAddressEDataType, InetAddress.class, "IPAddress", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VmdistributionPackageImpl
