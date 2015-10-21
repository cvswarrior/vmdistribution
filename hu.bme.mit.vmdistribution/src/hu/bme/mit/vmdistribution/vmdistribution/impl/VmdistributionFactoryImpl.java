/**
 */
package hu.bme.mit.vmdistribution.vmdistribution.impl;

import hu.bme.mit.vmdistribution.vmdistribution.Computer;
import hu.bme.mit.vmdistribution.vmdistribution.ComputerConfig;
import hu.bme.mit.vmdistribution.vmdistribution.CustomVM;
import hu.bme.mit.vmdistribution.vmdistribution.Lab;
import hu.bme.mit.vmdistribution.vmdistribution.Requirements;
import hu.bme.mit.vmdistribution.vmdistribution.Software;
import hu.bme.mit.vmdistribution.vmdistribution.VMProperty;
import hu.bme.mit.vmdistribution.vmdistribution.Vagrant_VM;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionFactory;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage;

import java.io.File;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmdistributionFactoryImpl extends EFactoryImpl implements VmdistributionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmdistributionFactory init() {
		try {
			VmdistributionFactory theVmdistributionFactory = (VmdistributionFactory)EPackage.Registry.INSTANCE.getEFactory(VmdistributionPackage.eNS_URI);
			if (theVmdistributionFactory != null) {
				return theVmdistributionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmdistributionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmdistributionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VmdistributionPackage.SYSTEM: return createSystem();
			case VmdistributionPackage.COMPUTER: return createComputer();
			case VmdistributionPackage.SOFTWARE: return createSoftware();
			case VmdistributionPackage.VM_PROPERTY: return createVMProperty();
			case VmdistributionPackage.LAB: return createLab();
			case VmdistributionPackage.VAGRANT_VM: return createVagrant_VM();
			case VmdistributionPackage.CUSTOM_VM: return createCustomVM();
			case VmdistributionPackage.REQUIREMENTS: return createRequirements();
			case VmdistributionPackage.COMPUTER_CONFIG: return createComputerConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VmdistributionPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VmdistributionPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.bme.mit.vmdistribution.vmdistribution.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer createComputer() {
		ComputerImpl computer = new ComputerImpl();
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software createSoftware() {
		SoftwareImpl software = new SoftwareImpl();
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMProperty createVMProperty() {
		VMPropertyImpl vmProperty = new VMPropertyImpl();
		return vmProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab createLab() {
		LabImpl lab = new LabImpl();
		return lab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vagrant_VM createVagrant_VM() {
		Vagrant_VMImpl vagrant_VM = new Vagrant_VMImpl();
		return vagrant_VM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomVM createCustomVM() {
		CustomVMImpl customVM = new CustomVMImpl();
		return customVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements createRequirements() {
		RequirementsImpl requirements = new RequirementsImpl();
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerConfig createComputerConfig() {
		ComputerConfigImpl computerConfig = new ComputerConfigImpl();
		return computerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmdistributionPackage getVmdistributionPackage() {
		return (VmdistributionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmdistributionPackage getPackage() {
		return VmdistributionPackage.eINSTANCE;
	}

} //VmdistributionFactoryImpl
