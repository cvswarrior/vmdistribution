/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.*;

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
public class VMDistributionFactoryImpl extends EFactoryImpl implements VMDistributionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VMDistributionFactory init() {
		try {
			VMDistributionFactory theVMDistributionFactory = (VMDistributionFactory)EPackage.Registry.INSTANCE.getEFactory(VMDistributionPackage.eNS_URI);
			if (theVMDistributionFactory != null) {
				return theVMDistributionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VMDistributionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMDistributionFactoryImpl() {
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
			case VMDistributionPackage.LAB_SYSTEM: return createLabSystem();
			case VMDistributionPackage.COMPUTER: return createComputer();
			case VMDistributionPackage.LAB: return createLab();
			case VMDistributionPackage.VAGRANT_VM: return createVagrant_VM();
			case VMDistributionPackage.CUSTOM_VM: return createCustomVM();
			case VMDistributionPackage.REQUIREMENTS: return createRequirements();
			case VMDistributionPackage.COMPUTER_CONFIG: return createComputerConfig();
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
			case VMDistributionPackage.FILE:
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
			case VMDistributionPackage.FILE:
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
	public LabSystem createLabSystem() {
		LabSystemImpl labSystem = new LabSystemImpl();
		return labSystem;
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
	public VMDistributionPackage getVMDistributionPackage() {
		return (VMDistributionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VMDistributionPackage getPackage() {
		return VMDistributionPackage.eINSTANCE;
	}

} //VMDistributionFactoryImpl
