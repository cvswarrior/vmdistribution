/**
 */
package hu.bme.mit.vmdistribution.model.impl;

import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.LabSystem;
import hu.bme.mit.vmdistribution.model.VMDistributionPackage;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lab System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.LabSystemImpl#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.LabSystemImpl#getComputers <em>Computers</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.LabSystemImpl#getLabs <em>Labs</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.LabSystemImpl#getCurrentsetup <em>Currentsetup</em>}</li>
 *   <li>{@link hu.bme.mit.vmdistribution.model.impl.LabSystemImpl#getTorrentSeed <em>Torrent Seed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabSystemImpl extends MinimalEObjectImpl.Container implements LabSystem {
	/**
	 * The cached value of the '{@link #getVirtualmachines() <em>Virtualmachines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualmachines()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMachine> virtualmachines;

	/**
	 * The cached value of the '{@link #getComputers() <em>Computers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputers()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> computers;

	/**
	 * The cached value of the '{@link #getLabs() <em>Labs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabs()
	 * @generated
	 * @ordered
	 */
	protected EList<Lab> labs;

	/**
	 * The cached value of the '{@link #getCurrentsetup() <em>Currentsetup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentsetup()
	 * @generated
	 * @ordered
	 */
	protected Lab currentsetup;

	/**
	 * The cached value of the '{@link #getTorrentSeed() <em>Torrent Seed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorrentSeed()
	 * @generated
	 * @ordered
	 */
	protected Computer torrentSeed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMDistributionPackage.Literals.LAB_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualMachine> getVirtualmachines() {
		if (virtualmachines == null) {
			virtualmachines = new EObjectContainmentEList<VirtualMachine>(VirtualMachine.class, this, VMDistributionPackage.LAB_SYSTEM__VIRTUALMACHINES);
		}
		return virtualmachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getComputers() {
		if (computers == null) {
			computers = new EObjectContainmentEList<Computer>(Computer.class, this, VMDistributionPackage.LAB_SYSTEM__COMPUTERS);
		}
		return computers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lab> getLabs() {
		if (labs == null) {
			labs = new EObjectContainmentEList<Lab>(Lab.class, this, VMDistributionPackage.LAB_SYSTEM__LABS);
		}
		return labs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab getCurrentsetup() {
		if (currentsetup != null && currentsetup.eIsProxy()) {
			InternalEObject oldCurrentsetup = (InternalEObject)currentsetup;
			currentsetup = (Lab)eResolveProxy(oldCurrentsetup);
			if (currentsetup != oldCurrentsetup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMDistributionPackage.LAB_SYSTEM__CURRENTSETUP, oldCurrentsetup, currentsetup));
			}
		}
		return currentsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab basicGetCurrentsetup() {
		return currentsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentsetup(Lab newCurrentsetup) {
		Lab oldCurrentsetup = currentsetup;
		currentsetup = newCurrentsetup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.LAB_SYSTEM__CURRENTSETUP, oldCurrentsetup, currentsetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer getTorrentSeed() {
		if (torrentSeed != null && torrentSeed.eIsProxy()) {
			InternalEObject oldTorrentSeed = (InternalEObject)torrentSeed;
			torrentSeed = (Computer)eResolveProxy(oldTorrentSeed);
			if (torrentSeed != oldTorrentSeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMDistributionPackage.LAB_SYSTEM__TORRENT_SEED, oldTorrentSeed, torrentSeed));
			}
		}
		return torrentSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer basicGetTorrentSeed() {
		return torrentSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorrentSeed(Computer newTorrentSeed) {
		Computer oldTorrentSeed = torrentSeed;
		torrentSeed = newTorrentSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMDistributionPackage.LAB_SYSTEM__TORRENT_SEED, oldTorrentSeed, torrentSeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VMDistributionPackage.LAB_SYSTEM__VIRTUALMACHINES:
				return ((InternalEList<?>)getVirtualmachines()).basicRemove(otherEnd, msgs);
			case VMDistributionPackage.LAB_SYSTEM__COMPUTERS:
				return ((InternalEList<?>)getComputers()).basicRemove(otherEnd, msgs);
			case VMDistributionPackage.LAB_SYSTEM__LABS:
				return ((InternalEList<?>)getLabs()).basicRemove(otherEnd, msgs);
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
			case VMDistributionPackage.LAB_SYSTEM__VIRTUALMACHINES:
				return getVirtualmachines();
			case VMDistributionPackage.LAB_SYSTEM__COMPUTERS:
				return getComputers();
			case VMDistributionPackage.LAB_SYSTEM__LABS:
				return getLabs();
			case VMDistributionPackage.LAB_SYSTEM__CURRENTSETUP:
				if (resolve) return getCurrentsetup();
				return basicGetCurrentsetup();
			case VMDistributionPackage.LAB_SYSTEM__TORRENT_SEED:
				if (resolve) return getTorrentSeed();
				return basicGetTorrentSeed();
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
			case VMDistributionPackage.LAB_SYSTEM__VIRTUALMACHINES:
				getVirtualmachines().clear();
				getVirtualmachines().addAll((Collection<? extends VirtualMachine>)newValue);
				return;
			case VMDistributionPackage.LAB_SYSTEM__COMPUTERS:
				getComputers().clear();
				getComputers().addAll((Collection<? extends Computer>)newValue);
				return;
			case VMDistributionPackage.LAB_SYSTEM__LABS:
				getLabs().clear();
				getLabs().addAll((Collection<? extends Lab>)newValue);
				return;
			case VMDistributionPackage.LAB_SYSTEM__CURRENTSETUP:
				setCurrentsetup((Lab)newValue);
				return;
			case VMDistributionPackage.LAB_SYSTEM__TORRENT_SEED:
				setTorrentSeed((Computer)newValue);
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
			case VMDistributionPackage.LAB_SYSTEM__VIRTUALMACHINES:
				getVirtualmachines().clear();
				return;
			case VMDistributionPackage.LAB_SYSTEM__COMPUTERS:
				getComputers().clear();
				return;
			case VMDistributionPackage.LAB_SYSTEM__LABS:
				getLabs().clear();
				return;
			case VMDistributionPackage.LAB_SYSTEM__CURRENTSETUP:
				setCurrentsetup((Lab)null);
				return;
			case VMDistributionPackage.LAB_SYSTEM__TORRENT_SEED:
				setTorrentSeed((Computer)null);
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
			case VMDistributionPackage.LAB_SYSTEM__VIRTUALMACHINES:
				return virtualmachines != null && !virtualmachines.isEmpty();
			case VMDistributionPackage.LAB_SYSTEM__COMPUTERS:
				return computers != null && !computers.isEmpty();
			case VMDistributionPackage.LAB_SYSTEM__LABS:
				return labs != null && !labs.isEmpty();
			case VMDistributionPackage.LAB_SYSTEM__CURRENTSETUP:
				return currentsetup != null;
			case VMDistributionPackage.LAB_SYSTEM__TORRENT_SEED:
				return torrentSeed != null;
		}
		return super.eIsSet(featureID);
	}

} //LabSystemImpl
