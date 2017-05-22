/**
 */
package ter_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.Box#getGroupbox <em>Groupbox</em>}</li>
 *   <li>{@link ter_metamodel.Box#getMutex <em>Mutex</em>}</li>
 *   <li>{@link ter_metamodel.Box#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see ter_metamodel.Ter_metamodelPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends Element {
	/**
	 * Returns the value of the '<em><b>Groupbox</b></em>' reference list.
	 * The list contents are of type {@link ter_metamodel.GroupBox}.
	 * It is bidirectional and its opposite is '{@link ter_metamodel.GroupBox#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupbox</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupbox</em>' reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getBox_Groupbox()
	 * @see ter_metamodel.GroupBox#getBox
	 * @model opposite="box"
	 * @generated
	 */
	EList<GroupBox> getGroupbox();

	/**
	 * Returns the value of the '<em><b>Mutex</b></em>' reference list.
	 * The list contents are of type {@link ter_metamodel.Mutex}.
	 * It is bidirectional and its opposite is '{@link ter_metamodel.Mutex#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutex</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutex</em>' reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getBox_Mutex()
	 * @see ter_metamodel.Mutex#getBox
	 * @model opposite="box"
	 * @generated
	 */
	EList<Mutex> getMutex();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link ter_metamodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getBox_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

} // Box
