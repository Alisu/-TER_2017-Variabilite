/**
 */
package ter_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ter_metamodel.Ecfd;
import ter_metamodel.Element;
import ter_metamodel.Mutex;
import ter_metamodel.Ter_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecfd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.impl.EcfdImpl#getElement <em>Element</em>}</li>
 *   <li>{@link ter_metamodel.impl.EcfdImpl#getMutex <em>Mutex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcfdImpl extends MinimalEObjectImpl.Container implements Ecfd {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The cached value of the '{@link #getMutex() <em>Mutex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutex()
	 * @generated
	 * @ordered
	 */
	protected EList<Mutex> mutex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcfdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ter_metamodelPackage.Literals.ECFD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, Ter_metamodelPackage.ECFD__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mutex> getMutex() {
		if (mutex == null) {
			mutex = new EObjectContainmentEList<Mutex>(Mutex.class, this, Ter_metamodelPackage.ECFD__MUTEX);
		}
		return mutex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ter_metamodelPackage.ECFD__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case Ter_metamodelPackage.ECFD__MUTEX:
				return ((InternalEList<?>)getMutex()).basicRemove(otherEnd, msgs);
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
			case Ter_metamodelPackage.ECFD__ELEMENT:
				return getElement();
			case Ter_metamodelPackage.ECFD__MUTEX:
				return getMutex();
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
			case Ter_metamodelPackage.ECFD__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case Ter_metamodelPackage.ECFD__MUTEX:
				getMutex().clear();
				getMutex().addAll((Collection<? extends Mutex>)newValue);
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
			case Ter_metamodelPackage.ECFD__ELEMENT:
				getElement().clear();
				return;
			case Ter_metamodelPackage.ECFD__MUTEX:
				getMutex().clear();
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
			case Ter_metamodelPackage.ECFD__ELEMENT:
				return element != null && !element.isEmpty();
			case Ter_metamodelPackage.ECFD__MUTEX:
				return mutex != null && !mutex.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EcfdImpl
