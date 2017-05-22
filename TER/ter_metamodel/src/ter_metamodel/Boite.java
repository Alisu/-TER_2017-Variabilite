/**
 */
package ter_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.Boite#getGroupeboite <em>Groupeboite</em>}</li>
 *   <li>{@link ter_metamodel.Boite#getMutex <em>Mutex</em>}</li>
 *   <li>{@link ter_metamodel.Boite#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see ter_metamodel.Ter_metamodelPackage#getBoite()
 * @model
 * @generated
 */
public interface Boite extends Element {
	/**
	 * Returns the value of the '<em><b>Groupeboite</b></em>' reference list.
	 * The list contents are of type {@link ter_metamodel.GroupeBoite}.
	 * It is bidirectional and its opposite is '{@link ter_metamodel.GroupeBoite#getBoite <em>Boite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupeboite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupeboite</em>' reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getBoite_Groupeboite()
	 * @see ter_metamodel.GroupeBoite#getBoite
	 * @model opposite="boite"
	 * @generated
	 */
	EList<GroupeBoite> getGroupeboite();

	/**
	 * Returns the value of the '<em><b>Mutex</b></em>' reference list.
	 * The list contents are of type {@link ter_metamodel.Mutex}.
	 * It is bidirectional and its opposite is '{@link ter_metamodel.Mutex#getBoite <em>Boite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutex</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutex</em>' reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getBoite_Mutex()
	 * @see ter_metamodel.Mutex#getBoite
	 * @model opposite="boite"
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
	 * @see ter_metamodel.Ter_metamodelPackage#getBoite_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

} // Boite
