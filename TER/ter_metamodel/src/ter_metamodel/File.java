/**
 */
package ter_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ter_metamodel.File#getEcfd <em>Ecfd</em>}</li>
 * </ul>
 *
 * @see ter_metamodel.Ter_metamodelPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject {
	/**
	 * Returns the value of the '<em><b>Ecfd</b></em>' containment reference list.
	 * The list contents are of type {@link ter_metamodel.Ecfd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecfd</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecfd</em>' containment reference list.
	 * @see ter_metamodel.Ter_metamodelPackage#getFile_Ecfd()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ecfd> getEcfd();

} // File
