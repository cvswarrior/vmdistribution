/**
 */
package hu.bme.mit.vmdistribution.vmdistribution.impl;

import hu.bme.mit.vmdistribution.vmdistribution.Computer;
import hu.bme.mit.vmdistribution.vmdistribution.Software;
import hu.bme.mit.vmdistribution.vmdistribution.VMProperty;
import hu.bme.mit.vmdistribution.vmdistribution.VirtualMachine;
import hu.bme.mit.vmdistribution.vmdistribution.VmdistributionPackage;

import java.io.File;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl#getComputer <em>Computer</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl#getBaseImage <em>Base Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl#isUseVagrant <em>Use Vagrant</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl#getDistributionImage <em>Distribution Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.vmdistribution.impl.VirtualMachineImpl#getVmproperty <em>Vmproperty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineImpl extends MinimalEObjectImpl.Container implements VirtualMachine {
	/**
	 * The cached value of the '{@link #getComputer() <em>Computer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputer()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> computer;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected EList<Software> software;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseImage() <em>Base Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseImage()
	 * @generated
	 * @ordered
	 */
	protected static final File BASE_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseImage() <em>Base Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseImage()
	 * @generated
	 * @ordered
	 */
	protected File baseImage = BASE_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseVagrant() <em>Use Vagrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseVagrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_VAGRANT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseVagrant() <em>Use Vagrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseVagrant()
	 * @generated
	 * @ordered
	 */
	protected boolean useVagrant = USE_VAGRANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistributionImage() <em>Distribution Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionImage()
	 * @generated
	 * @ordered
	 */
	protected static final File DISTRIBUTION_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistributionImage() <em>Distribution Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionImage()
	 * @generated
	 * @ordered
	 */
	protected File distributionImage = DISTRIBUTION_IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVmproperty() <em>Vmproperty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmproperty()
	 * @generated
	 * @ordered
	 */
	protected EList<VMProperty> vmproperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmdistributionPackage.Literals.VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getComputer() {
		if (computer == null) {
			computer = new EObjectWithInverseResolvingEList.ManyInverse<Computer>(Computer.class, this, VmdistributionPackage.VIRTUAL_MACHINE__COMPUTER, VmdistributionPackage.COMPUTER__VIRTUALMACHINES);
		}
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Software> getSoftware() {
		if (software == null) {
			software = new EObjectContainmentEList<Software>(Software.class, this, VmdistributionPackage.VIRTUAL_MACHINE__SOFTWARE);
		}
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmdistributionPackage.VIRTUAL_MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getBaseImage() {
		return baseImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseImage(File newBaseImage) {
		File oldBaseImage = baseImage;
		baseImage = newBaseImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmdistributionPackage.VIRTUAL_MACHINE__BASE_IMAGE, oldBaseImage, baseImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseVagrant() {
		return useVagrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseVagrant(boolean newUseVagrant) {
		boolean oldUseVagrant = useVagrant;
		useVagrant = newUseVagrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmdistributionPackage.VIRTUAL_MACHINE__USE_VAGRANT, oldUseVagrant, useVagrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getDistributionImage() {
		return distributionImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionImage(File newDistributionImage) {
		File oldDistributionImage = distributionImage;
		distributionImage = newDistributionImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmdistributionPackage.VIRTUAL_MACHINE__DISTRIBUTION_IMAGE, oldDistributionImage, distributionImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VMProperty> getVmproperty() {
		if (vmproperty == null) {
			vmproperty = new EObjectContainmentEList<VMProperty>(VMProperty.class, this, VmdistributionPackage.VIRTUAL_MACHINE__VMPROPERTY);
		}
		return vmproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void prepare() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatible(Computer computer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmdistributionPackage.VIRTUAL_MACHINE__COMPUTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComputer()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmdistributionPackage.VIRTUAL_MACHINE__COMPUTER:
				return ((InternalEList<?>)getComputer()).basicRemove(otherEnd, msgs);
			case VmdistributionPackage.VIRTUAL_MACHINE__SOFTWARE:
				return ((InternalEList<?>)getSoftware()).basicRemove(otherEnd, msgs);
			case VmdistributionPackage.VIRTUAL_MACHINE__VMPROPERTY:
				return ((InternalEList<?>)getVmproperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmdistributionPackage.VIRTUAL_MACHINE__COMPUTER:
				return getComputer();
			case VmdistributionPackage.VIRTUAL_MACHINE__SOFTWARE:
				return getSoftware();
			case VmdistributionPackage.VIRTUAL_MACHINE__NAME:
				return getName();
			case VmdistributionPackage.VIRTUAL_MACHINE__BASE_IMAGE:
				return getBaseImage();
			case VmdistributionPackage.VIRTUAL_MACHINE__USE_VAGRANT:
				return isUseVagrant();
			case VmdistributionPackage.VIRTUAL_MACHINE__DISTRIBUTION_IMAGE:
				return getDistributionImage();
			case VmdistributionPackage.VIRTUAL_MACHINE__VMPROPERTY:
				return getVmproperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmdistributionPackage.VIRTUAL_MACHINE__COMPUTER:
				getComputer().clear();
				getComputer().addAll((Collection<? extends Computer>)newValue);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__SOFTWARE:
				getSoftware().clear();
				getSoftware().addAll((Collection<? extends Software>)newValue);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__NAME:
				setName((String)newValue);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__BASE_IMAGE:
				setBaseImage((File)newValue);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__USE_VAGRANT:
				setUseVagrant((Boolean)newValue);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__DISTRIBUTION_IMAGE:
				setDistributionImage((File)newValue);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__VMPROPERTY:
				getVmproperty().clear();
				getVmproperty().addAll((Collection<? extends VMProperty>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VmdistributionPackage.VIRTUAL_MACHINE__COMPUTER:
				getComputer().clear();
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__SOFTWARE:
				getSoftware().clear();
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__BASE_IMAGE:
				setBaseImage(BASE_IMAGE_EDEFAULT);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__USE_VAGRANT:
				setUseVagrant(USE_VAGRANT_EDEFAULT);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__DISTRIBUTION_IMAGE:
				setDistributionImage(DISTRIBUTION_IMAGE_EDEFAULT);
				return;
			case VmdistributionPackage.VIRTUAL_MACHINE__VMPROPERTY:
				getVmproperty().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VmdistributionPackage.VIRTUAL_MACHINE__COMPUTER:
				return computer != null && !computer.isEmpty();
			case VmdistributionPackage.VIRTUAL_MACHINE__SOFTWARE:
				return software != null && !software.isEmpty();
			case VmdistributionPackage.VIRTUAL_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmdistributionPackage.VIRTUAL_MACHINE__BASE_IMAGE:
				return BASE_IMAGE_EDEFAULT == null ? baseImage != null : !BASE_IMAGE_EDEFAULT.equals(baseImage);
			case VmdistributionPackage.VIRTUAL_MACHINE__USE_VAGRANT:
				return useVagrant != USE_VAGRANT_EDEFAULT;
			case VmdistributionPackage.VIRTUAL_MACHINE__DISTRIBUTION_IMAGE:
				return DISTRIBUTION_IMAGE_EDEFAULT == null ? distributionImage != null : !DISTRIBUTION_IMAGE_EDEFAULT.equals(distributionImage);
			case VmdistributionPackage.VIRTUAL_MACHINE__VMPROPERTY:
				return vmproperty != null && !vmproperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VmdistributionPackage.VIRTUAL_MACHINE___PREPARE:
				prepare();
				return null;
			case VmdistributionPackage.VIRTUAL_MACHINE___IS_COMPATIBLE__COMPUTER:
				return isCompatible((Computer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", baseImage: ");
		result.append(baseImage);
		result.append(", useVagrant: ");
		result.append(useVagrant);
		result.append(", distributionImage: ");
		result.append(distributionImage);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineImpl
