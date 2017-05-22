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

import ter_metamodel.Boite;
import ter_metamodel.Feature;
import ter_metamodel.GroupeBoite;
import ter_metamodel.Mutex;
import ter_metamodel.Ter_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.impl.BoiteImpl#getGroupeboite <em>Groupeboite</em>}</li>
 *   <li>{@link ter_metamodel.impl.BoiteImpl#getMutex <em>Mutex</em>}</li>
 *   <li>{@link ter_metamodel.impl.BoiteImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoiteImpl extends ElementImpl implements Boite {
	/**
	 * The cached value of the '{@link #getGroupeboite() <em>Groupeboite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupeboite()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupeBoite> groupeboite;

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
	protected BoiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ter_metamodelPackage.Literals.BOITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupeBoite> getGroupeboite() {
		if (groupeboite == null) {
			groupeboite = new EObjectWithInverseResolvingEList.ManyInverse<GroupeBoite>(GroupeBoite.class, this, Ter_metamodelPackage.BOITE__GROUPEBOITE, Ter_metamodelPackage.GROUPE_BOITE__BOITE);
		}
		return groupeboite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mutex> getMutex() {
		if (mutex == null) {
			mutex = new EObjectWithInverseResolvingEList.ManyInverse<Mutex>(Mutex.class, this, Ter_metamodelPackage.BOITE__MUTEX, Ter_metamodelPackage.MUTEX__BOITE);
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
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, Ter_metamodelPackage.BOITE__FEATURE);
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
			case Ter_metamodelPackage.BOITE__GROUPEBOITE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupeboite()).basicAdd(otherEnd, msgs);
			case Ter_metamodelPackage.BOITE__MUTEX:
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
			case Ter_metamodelPackage.BOITE__GROUPEBOITE:
				return ((InternalEList<?>)getGroupeboite()).basicRemove(otherEnd, msgs);
			case Ter_metamodelPackage.BOITE__MUTEX:
				return ((InternalEList<?>)getMutex()).basicRemove(otherEnd, msgs);
			case Ter_metamodelPackage.BOITE__FEATURE:
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
			case Ter_metamodelPackage.BOITE__GROUPEBOITE:
				return getGroupeboite();
			case Ter_metamodelPackage.BOITE__MUTEX:
				return getMutex();
			case Ter_metamodelPackage.BOITE__FEATURE:
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
			case Ter_metamodelPackage.BOITE__GROUPEBOITE:
				getGroupeboite().clear();
				getGroupeboite().addAll((Collection<? extends GroupeBoite>)newValue);
				return;
			case Ter_metamodelPackage.BOITE__MUTEX:
				getMutex().clear();
				getMutex().addAll((Collection<? extends Mutex>)newValue);
				return;
			case Ter_metamodelPackage.BOITE__FEATURE:
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
			case Ter_metamodelPackage.BOITE__GROUPEBOITE:
				getGroupeboite().clear();
				return;
			case Ter_metamodelPackage.BOITE__MUTEX:
				getMutex().clear();
				return;
			case Ter_metamodelPackage.BOITE__FEATURE:
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
			case Ter_metamodelPackage.BOITE__GROUPEBOITE:
				return groupeboite != null && !groupeboite.isEmpty();
			case Ter_metamodelPackage.BOITE__MUTEX:
				return mutex != null && !mutex.isEmpty();
			case Ter_metamodelPackage.BOITE__FEATURE:
				return feature != null && !feature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoiteImpl
