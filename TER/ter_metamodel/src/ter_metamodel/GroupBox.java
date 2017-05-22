/**
 */
package ter_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.GroupBox#getBox <em>Box</em>}</li>
 *   <li>{@link ter_metamodel.GroupBox#isExclusion <em>Exclusion</em>}</li>
 * </ul>
 *
 * @see ter_metamodel.Ter_metamodelPackage#getGroupBox()
 * @model
 * @generated
 */
public interface GroupBox extends Element {
	/**
	 * Returns the value of the '<em><b>Box</b></em>' reference list.
	 * The list contents are of type {@link ter_metamodel.Box}.
	 * It is bidirectional and its opposite is '{@link ter_metamodel.Box#getGroupbox <em>Groupbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getGroupBox_Box()
	 * @see ter_metamodel.Box#getGroupbox
	 * @model opposite="groupbox" lower="2"
	 * @generated
	 */
	EList<Box> getBox();

	/**
	 * Returns the value of the '<em><b>Exclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion</em>' attribute.
	 * @see #setExclusion(boolean)
	 * @see ter_metamodel.Ter_metamodelPackage#getGroupBox_Exclusion()
	 * @model
	 * @generated
	 */
	boolean isExclusion();

	/**
	 * Sets the value of the '{@link ter_metamodel.GroupBox#isExclusion <em>Exclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusion</em>' attribute.
	 * @see #isExclusion()
	 * @generated
	 */
	void setExclusion(boolean value);

} // GroupBox
