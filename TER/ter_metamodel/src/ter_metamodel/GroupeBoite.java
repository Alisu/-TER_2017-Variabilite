/**
 */
package ter_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Groupe Boite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.GroupeBoite#getBoite <em>Boite</em>}</li>
 *   <li>{@link ter_metamodel.GroupeBoite#isExclusion <em>Exclusion</em>}</li>
 * </ul>
 *
 * @see ter_metamodel.Ter_metamodelPackage#getGroupeBoite()
 * @model
 * @generated
 */
public interface GroupeBoite extends Element {
	/**
	 * Returns the value of the '<em><b>Boite</b></em>' reference list.
	 * The list contents are of type {@link ter_metamodel.Boite}.
	 * It is bidirectional and its opposite is '{@link ter_metamodel.Boite#getGroupeboite <em>Groupeboite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boite</em>' reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getGroupeBoite_Boite()
	 * @see ter_metamodel.Boite#getGroupeboite
	 * @model opposite="groupeboite" lower="2"
	 * @generated
	 */
	EList<Boite> getBoite();

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
	 * @see ter_metamodel.Ter_metamodelPackage#getGroupeBoite_Exclusion()
	 * @model
	 * @generated
	 */
	boolean isExclusion();

	/**
	 * Sets the value of the '{@link ter_metamodel.GroupeBoite#isExclusion <em>Exclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusion</em>' attribute.
	 * @see #isExclusion()
	 * @generated
	 */
	void setExclusion(boolean value);

} // GroupeBoite
