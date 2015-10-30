/**
 */
package hu.bme.mit.vmdistribution.model.util;

import hu.bme.mit.vmdistribution.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.vmdistribution.model.VMDistributionPackage
 * @generated
 */
public class VMDistributionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VMDistributionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMDistributionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VMDistributionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMDistributionSwitch<Adapter> modelSwitch =
		new VMDistributionSwitch<Adapter>() {
			@Override
			public Adapter caseVirtualMachine(VirtualMachine object) {
				return createVirtualMachineAdapter();
			}
			@Override
			public Adapter caseLabSystem(LabSystem object) {
				return createLabSystemAdapter();
			}
			@Override
			public Adapter caseComputer(Computer object) {
				return createComputerAdapter();
			}
			@Override
			public Adapter caseLab(Lab object) {
				return createLabAdapter();
			}
			@Override
			public Adapter caseVagrant_VM(Vagrant_VM object) {
				return createVagrant_VMAdapter();
			}
			@Override
			public Adapter caseCustomVM(CustomVM object) {
				return createCustomVMAdapter();
			}
			@Override
			public Adapter caseRequirements(Requirements object) {
				return createRequirementsAdapter();
			}
			@Override
			public Adapter caseComputerConfig(ComputerConfig object) {
				return createComputerConfigAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.vmdistribution.model.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.vmdistribution.model.VirtualMachine
	 * @generated
	 */
	public Adapter createVirtualMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.vmdistribution.model.LabSystem <em>Lab System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.vmdistribution.model.LabSystem
	 * @generated
	 */
	public Adapter createLabSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.vmdistribution.model.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.vmdistribution.model.Computer
	 * @generated
	 */
	public Adapter createComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.vmdistribution.model.Lab <em>Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.vmdistribution.model.Lab
	 * @generated
	 */
	public Adapter createLabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.vmdistribution.model.Vagrant_VM <em>Vagrant VM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.vmdistribution.model.Vagrant_VM
	 * @generated
	 */
	public Adapter createVagrant_VMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.vmdistribution.model.CustomVM <em>Custom VM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.vmdistribution.model.CustomVM
	 * @generated
	 */
	public Adapter createCustomVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.vmdistribution.model.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.vmdistribution.model.Requirements
	 * @generated
	 */
	public Adapter createRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.vmdistribution.model.ComputerConfig <em>Computer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.vmdistribution.model.ComputerConfig
	 * @generated
	 */
	public Adapter createComputerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VMDistributionAdapterFactory
