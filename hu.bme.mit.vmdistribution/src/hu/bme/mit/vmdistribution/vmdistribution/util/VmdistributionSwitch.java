/**
 */
package hu.bme.mit.vmdistribution.vmdistribution.util;

import hu.bme.mit.vmdistribution.vmdistribution.Computer;
import hu.bme.mit.vmdistribution.vmdistribution.ComputerConfig;
import hu.bme.mit.vmdistribution.vmdistribution.CustomVM;
import hu.bme.mit.vmdistribution.vmdistribution.Lab;
import hu.bme.mit.vmdistribution.vmdistribution.Requirements;
import hu.bme.mit.vmdistribution.vmdistribution.Software;
import hu.bme.mit.vmdistribution.vmdistribution.VMProperty;
import hu.bme.mit.vmdistribution.vmdistribution.Vagrant_VM;
import hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage
 * @generated
 */
public class VmdistributionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VmdistributionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmdistributionSwitch() {
		if (modelPackage == null) {
			modelPackage = VmdistributionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VmdistributionPackage.VIRTUAL_MACHINE: {
				VirtualMachine virtualMachine = (VirtualMachine)theEObject;
				T result = caseVirtualMachine(virtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.SYSTEM: {
				hu.bme.mit.vmdistribution.vmdistribution.System system = (hu.bme.mit.vmdistribution.vmdistribution.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.COMPUTER: {
				Computer computer = (Computer)theEObject;
				T result = caseComputer(computer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.SOFTWARE: {
				Software software = (Software)theEObject;
				T result = caseSoftware(software);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.VM_PROPERTY: {
				VMProperty vmProperty = (VMProperty)theEObject;
				T result = caseVMProperty(vmProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.LAB: {
				Lab lab = (Lab)theEObject;
				T result = caseLab(lab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.VAGRANT_VM: {
				Vagrant_VM vagrant_VM = (Vagrant_VM)theEObject;
				T result = caseVagrant_VM(vagrant_VM);
				if (result == null) result = caseVirtualMachine(vagrant_VM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.CUSTOM_VM: {
				CustomVM customVM = (CustomVM)theEObject;
				T result = caseCustomVM(customVM);
				if (result == null) result = caseVirtualMachine(customVM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.REQUIREMENTS: {
				Requirements requirements = (Requirements)theEObject;
				T result = caseRequirements(requirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmdistributionPackage.COMPUTER_CONFIG: {
				ComputerConfig computerConfig = (ComputerConfig)theEObject;
				T result = caseComputerConfig(computerConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachine(VirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(hu.bme.mit.vmdistribution.vmdistribution.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputer(Computer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftware(Software object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMProperty(VMProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLab(Lab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vagrant VM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vagrant VM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVagrant_VM(Vagrant_VM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom VM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom VM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomVM(CustomVM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirements(Requirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputerConfig(ComputerConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VmdistributionSwitch
