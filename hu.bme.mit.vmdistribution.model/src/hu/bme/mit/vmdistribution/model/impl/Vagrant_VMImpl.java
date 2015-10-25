/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.Software;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.VMProperty;
import hu.bme.mit.vmdistribution.model.Vagrant_VM;

import java.io.File;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vagrant VM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl#getDistributionImage <em>Distribution Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl#getBaseImage <em>Base Image</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl#getVmproperty <em>Vmproperty</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.Vagrant_VMImpl#isReadyToDistribute <em>Ready To Distribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vagrant_VMImpl extends VirtualMachineImpl implements Vagrant_VM {
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
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected EList<Software> software;

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
	 * The default value of the '{@link #isReadyToDistribute() <em>Ready To Distribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadyToDistribute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READY_TO_DISTRIBUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadyToDistribute() <em>Ready To Distribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadyToDistribute()
	 * @generated
	 * @ordered
	 */
	protected boolean readyToDistribute = READY_TO_DISTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vagrant_VMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.VAGRANT_VM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE, oldDistributionImage, distributionImage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VAGRANT_VM__BASE_IMAGE, oldBaseImage, baseImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Software> getSoftware() {
		if (software == null) {
			software = new EObjectContainmentEList<Software>(Software.class, this, VMDistributionPackage.VAGRANT_VM__SOFTWARE);
		}
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VMProperty> getVmproperty() {
		if (vmproperty == null) {
			vmproperty = new EObjectContainmentEList<VMProperty>(VMProperty.class, this, VMDistributionPackage.VAGRANT_VM__VMPROPERTY);
		}
		return vmproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadyToDistribute() {
		return readyToDistribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadyToDistribute(boolean newReadyToDistribute) {
		boolean oldReadyToDistribute = readyToDistribute;
		readyToDistribute = newReadyToDistribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE, oldReadyToDistribute, readyToDistribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VMDistributionPackage.VAGRANT_VM__SOFTWARE:
				return ((InternalEList<?>)getSoftware()).basicRemove(otherEnd, msgs);
			case VMDistributionPackage.VAGRANT_VM__VMPROPERTY:
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
			case VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE:
				return getDistributionImage();
			case VMDistributionPackage.VAGRANT_VM__BASE_IMAGE:
				return getBaseImage();
			case VMDistributionPackage.VAGRANT_VM__SOFTWARE:
				return getSoftware();
			case VMDistributionPackage.VAGRANT_VM__VMPROPERTY:
				return getVmproperty();
			case VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE:
				return isReadyToDistribute();
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
			case VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE:
				setDistributionImage((File)newValue);
				return;
			case VMDistributionPackage.VAGRANT_VM__BASE_IMAGE:
				setBaseImage((File)newValue);
				return;
			case VMDistributionPackage.VAGRANT_VM__SOFTWARE:
				getSoftware().clear();
				getSoftware().addAll((Collection<? extends Software>)newValue);
				return;
			case VMDistributionPackage.VAGRANT_VM__VMPROPERTY:
				getVmproperty().clear();
				getVmproperty().addAll((Collection<? extends VMProperty>)newValue);
				return;
			case VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE:
				setReadyToDistribute((Boolean)newValue);
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
			case VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE:
				setDistributionImage(DISTRIBUTION_IMAGE_EDEFAULT);
				return;
			case VMDistributionPackage.VAGRANT_VM__BASE_IMAGE:
				setBaseImage(BASE_IMAGE_EDEFAULT);
				return;
			case VMDistributionPackage.VAGRANT_VM__SOFTWARE:
				getSoftware().clear();
				return;
			case VMDistributionPackage.VAGRANT_VM__VMPROPERTY:
				getVmproperty().clear();
				return;
			case VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE:
				setReadyToDistribute(READY_TO_DISTRIBUTE_EDEFAULT);
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
			case VMDistributionPackage.VAGRANT_VM__DISTRIBUTION_IMAGE:
				return DISTRIBUTION_IMAGE_EDEFAULT == null ? distributionImage != null : !DISTRIBUTION_IMAGE_EDEFAULT.equals(distributionImage);
			case VMDistributionPackage.VAGRANT_VM__BASE_IMAGE:
				return BASE_IMAGE_EDEFAULT == null ? baseImage != null : !BASE_IMAGE_EDEFAULT.equals(baseImage);
			case VMDistributionPackage.VAGRANT_VM__SOFTWARE:
				return software != null && !software.isEmpty();
			case VMDistributionPackage.VAGRANT_VM__VMPROPERTY:
				return vmproperty != null && !vmproperty.isEmpty();
			case VMDistributionPackage.VAGRANT_VM__READY_TO_DISTRIBUTE:
				return readyToDistribute != READY_TO_DISTRIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (distributionImage: ");
		result.append(distributionImage);
		result.append(", baseImage: ");
		result.append(baseImage);
		result.append(", readyToDistribute: ");
		result.append(readyToDistribute);
		result.append(')');
		return result.toString();
	}

} //Vagrant_VMImpl
