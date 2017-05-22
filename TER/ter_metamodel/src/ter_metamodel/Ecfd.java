/**
 */
package ter_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecfd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.Ecfd#getElement <em>Element</em>}</li>
 *   <li>{@link ter_metamodel.Ecfd#getMutex <em>Mutex</em>}</li>
 * </ul>
 *
 * @see ter_metamodel.Ter_metamodelPackage#getEcfd()
 * @model
 * @generated
 */
public interface Ecfd extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link ter_metamodel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getEcfd_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Mutex</b></em>' containment reference list.
	 * The list contents are of type {@link ter_metamodel.Mutex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutex</em>' containment reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getEcfd_Mutex()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mutex> getMutex();

} // Ecfd
