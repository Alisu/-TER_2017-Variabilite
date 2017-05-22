/**
 */
package ter_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.Element#getSuperBox <em>Super Box</em>}</li>
 * </ul>
 *
 * @see ter_metamodel.Ter_metamodelPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Box</b></em>' reference list.
	 * The list contents are of type {@link ter_metamodel.Box}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Box</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Box</em>' reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getElement_SuperBox()
	 * @model
	 * @generated
	 */
	EList<Box> getSuperBox();

} // Element
