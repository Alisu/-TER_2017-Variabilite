/**
 */
package ter_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ter_metamodel.Box;
import ter_metamodel.GroupBox;
import ter_metamodel.Ter_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.impl.GroupBoxImpl#getBox <em>Box</em>}</li>
 *   <li>{@link ter_metamodel.impl.GroupBoxImpl#isExclusion <em>Exclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupBoxImpl extends ElementImpl implements GroupBox {
	/**
	 * The cached value of the '{@link #getBox() <em>Box</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBox()
	 * @generated
	 * @ordered
	 */
	protected EList<Box> box;

	/**
	 * The default value of the '{@link #isExclusion() <em>Exclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusion() <em>Exclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusion()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusion = EXCLUSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ter_metamodelPackage.Literals.GROUP_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Box> getBox() {
		if (box == null) {
			box = new EObjectWithInverseResolvingEList.ManyInverse<Box>(Box.class, this, Ter_metamodelPackage.GROUP_BOX__BOX, Ter_metamodelPackage.BOX__GROUPBOX);
		}
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusion() {
		return exclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusion(boolean newExclusion) {
		boolean oldExclusion = exclusion;
		exclusion = newExclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ter_metamodelPackage.GROUP_BOX__EXCLUSION, oldExclusion, exclusion));
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
			case Ter_metamodelPackage.GROUP_BOX__BOX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBox()).basicAdd(otherEnd, msgs);
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
			case Ter_metamodelPackage.GROUP_BOX__BOX:
				return ((InternalEList<?>)getBox()).basicRemove(otherEnd, msgs);
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
			case Ter_metamodelPackage.GROUP_BOX__BOX:
				return getBox();
			case Ter_metamodelPackage.GROUP_BOX__EXCLUSION:
				return isExclusion();
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
			case Ter_metamodelPackage.GROUP_BOX__BOX:
				getBox().clear();
				getBox().addAll((Collection<? extends Box>)newValue);
				return;
			case Ter_metamodelPackage.GROUP_BOX__EXCLUSION:
				setExclusion((Boolean)newValue);
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
			case Ter_metamodelPackage.GROUP_BOX__BOX:
				getBox().clear();
				return;
			case Ter_metamodelPackage.GROUP_BOX__EXCLUSION:
				setExclusion(EXCLUSION_EDEFAULT);
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
			case Ter_metamodelPackage.GROUP_BOX__BOX:
				return box != null && !box.isEmpty();
			case Ter_metamodelPackage.GROUP_BOX__EXCLUSION:
				return exclusion != EXCLUSION_EDEFAULT;
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
		result.append(" (Exclusion: ");
		result.append(exclusion);
		result.append(')');
		return result.toString();
	}

} //GroupBoxImpl
