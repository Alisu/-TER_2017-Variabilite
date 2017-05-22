/**
 */
package ter_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ter_metamodel.Box;
import ter_metamodel.Feature;
import ter_metamodel.GroupBox;
import ter_metamodel.Mutex;
import ter_metamodel.Ter_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.impl.BoxImpl#getGroupbox <em>Groupbox</em>}</li>
 *   <li>{@link ter_metamodel.impl.BoxImpl#getMutex <em>Mutex</em>}</li>
 *   <li>{@link ter_metamodel.impl.BoxImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxImpl extends ElementImpl implements Box {
	/**
	 * The cached value of the '{@link #getGroupbox() <em>Groupbox</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupbox()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupBox> groupbox;

	/**
	 * The cached value of the '{@link #getMutex() <em>Mutex</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutex()
	 * @generated
	 * @ordered
	 */
	protected EList<Mutex> mutex;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ter_metamodelPackage.Literals.BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupBox> getGroupbox() {
		if (groupbox == null) {
			groupbox = new EObjectWithInverseResolvingEList.ManyInverse<GroupBox>(GroupBox.class, this, Ter_metamodelPackage.BOX__GROUPBOX, Ter_metamodelPackage.GROUP_BOX__BOX);
		}
		return groupbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mutex> getMutex() {
		if (mutex == null) {
			mutex = new EObjectWithInverseResolvingEList.ManyInverse<Mutex>(Mutex.class, this, Ter_metamodelPackage.BOX__MUTEX, Ter_metamodelPackage.MUTEX__BOX);
		}
		return mutex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, Ter_metamodelPackage.BOX__FEATURE);
		}
		return feature;
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
			case Ter_metamodelPackage.BOX__GROUPBOX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupbox()).basicAdd(otherEnd, msgs);
			case Ter_metamodelPackage.BOX__MUTEX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMutex()).basicAdd(otherEnd, msgs);
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
			case Ter_metamodelPackage.BOX__GROUPBOX:
				return ((InternalEList<?>)getGroupbox()).basicRemove(otherEnd, msgs);
			case Ter_metamodelPackage.BOX__MUTEX:
				return ((InternalEList<?>)getMutex()).basicRemove(otherEnd, msgs);
			case Ter_metamodelPackage.BOX__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
			case Ter_metamodelPackage.BOX__GROUPBOX:
				return getGroupbox();
			case Ter_metamodelPackage.BOX__MUTEX:
				return getMutex();
			case Ter_metamodelPackage.BOX__FEATURE:
				return getFeature();
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
			case Ter_metamodelPackage.BOX__GROUPBOX:
				getGroupbox().clear();
				getGroupbox().addAll((Collection<? extends GroupBox>)newValue);
				return;
			case Ter_metamodelPackage.BOX__MUTEX:
				getMutex().clear();
				getMutex().addAll((Collection<? extends Mutex>)newValue);
				return;
			case Ter_metamodelPackage.BOX__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
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
			case Ter_metamodelPackage.BOX__GROUPBOX:
				getGroupbox().clear();
				return;
			case Ter_metamodelPackage.BOX__MUTEX:
				getMutex().clear();
				return;
			case Ter_metamodelPackage.BOX__FEATURE:
				getFeature().clear();
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
			case Ter_metamodelPackage.BOX__GROUPBOX:
				return groupbox != null && !groupbox.isEmpty();
			case Ter_metamodelPackage.BOX__MUTEX:
				return mutex != null && !mutex.isEmpty();
			case Ter_metamodelPackage.BOX__FEATURE:
				return feature != null && !feature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoxImpl
