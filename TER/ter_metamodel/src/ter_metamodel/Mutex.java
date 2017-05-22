/**
 */
package ter_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mutex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.Mutex#getBox <em>Box</em>}</li>
 * </ul>
 *
 * @see ter_metamodel.Ter_metamodelPackage#getMutex()
 * @model
 * @generated
 */
public interface Mutex extends EObject {
	/**
	 * Returns the value of the '<em><b>Box</b></em>' reference list.
	 * The list contents are of type {@link ter_metamodel.Box}.
	 * It is bidirectional and its opposite is '{@link ter_metamodel.Box#getMutex <em>Mutex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getMutex_Box()
	 * @see ter_metamodel.Box#getMutex
	 * @model opposite="mutex" lower="2"
	 * @generated
	 */
	EList<Box> getBox();

} // Mutex
