/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.Requirements;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.RequirementsImpl#getReqArchi <em>Req Archi</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.RequirementsImpl#getReqRAM <em>Req RAM</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.RequirementsImpl#getReqSpace <em>Req Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsImpl extends MinimalEObjectImpl.Container implements Requirements {
	/**
	 * The default value of the '{@link #getReqArchi() <em>Req Archi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqArchi()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_ARCHI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqArchi() <em>Req Archi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqArchi()
	 * @generated
	 * @ordered
	 */
	protected String reqArchi = REQ_ARCHI_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqRAM() <em>Req RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqRAM()
	 * @generated
	 * @ordered
	 */
	protected static final double REQ_RAM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReqRAM() <em>Req RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqRAM()
	 * @generated
	 * @ordered
	 */
	protected double reqRAM = REQ_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqSpace() <em>Req Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqSpace()
	 * @generated
	 * @ordered
	 */
	protected static final double REQ_SPACE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReqSpace() <em>Req Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqSpace()
	 * @generated
	 * @ordered
	 */
	protected double reqSpace = REQ_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReqArchi() {
		return reqArchi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqArchi(String newReqArchi) {
		String oldReqArchi = reqArchi;
		reqArchi = newReqArchi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.REQUIREMENTS__REQ_ARCHI, oldReqArchi, reqArchi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReqRAM() {
		return reqRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqRAM(double newReqRAM) {
		double oldReqRAM = reqRAM;
		reqRAM = newReqRAM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.REQUIREMENTS__REQ_RAM, oldReqRAM, reqRAM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReqSpace() {
		return reqSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqSpace(double newReqSpace) {
		double oldReqSpace = reqSpace;
		reqSpace = newReqSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.REQUIREMENTS__REQ_SPACE, oldReqSpace, reqSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VMDistributionPackage.REQUIREMENTS__REQ_ARCHI:
				return getReqArchi();
			case VMDistributionPackage.REQUIREMENTS__REQ_RAM:
				return getReqRAM();
			case VMDistributionPackage.REQUIREMENTS__REQ_SPACE:
				return getReqSpace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VMDistributionPackage.REQUIREMENTS__REQ_ARCHI:
				setReqArchi((String)newValue);
				return;
			case VMDistributionPackage.REQUIREMENTS__REQ_RAM:
				setReqRAM((Double)newValue);
				return;
			case VMDistributionPackage.REQUIREMENTS__REQ_SPACE:
				setReqSpace((Double)newValue);
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
			case VMDistributionPackage.REQUIREMENTS__REQ_ARCHI:
				setReqArchi(REQ_ARCHI_EDEFAULT);
				return;
			case VMDistributionPackage.REQUIREMENTS__REQ_RAM:
				setReqRAM(REQ_RAM_EDEFAULT);
				return;
			case VMDistributionPackage.REQUIREMENTS__REQ_SPACE:
				setReqSpace(REQ_SPACE_EDEFAULT);
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
			case VMDistributionPackage.REQUIREMENTS__REQ_ARCHI:
				return REQ_ARCHI_EDEFAULT == null ? reqArchi != null : !REQ_ARCHI_EDEFAULT.equals(reqArchi);
			case VMDistributionPackage.REQUIREMENTS__REQ_RAM:
				return reqRAM != REQ_RAM_EDEFAULT;
			case VMDistributionPackage.REQUIREMENTS__REQ_SPACE:
				return reqSpace != REQ_SPACE_EDEFAULT;
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
		result.append(" (reqArchi: ");
		result.append(reqArchi);
		result.append(", reqRAM: ");
		result.append(reqRAM);
		result.append(", reqSpace: ");
		result.append(reqSpace);
		result.append(')');
		return result.toString();
	}

} //RequirementsImpl
