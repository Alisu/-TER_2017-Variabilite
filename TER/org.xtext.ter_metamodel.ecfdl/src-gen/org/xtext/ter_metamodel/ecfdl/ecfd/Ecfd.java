/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ter_metamodel.ecfdl.ecfd;

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
 *   <li>{@link org.xtext.ter_metamodel.ecfdl.ecfd.Ecfd#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ter_metamodel.ecfdl.ecfd.Ecfd#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link org.xtext.ter_metamodel.ecfdl.ecfd.Ecfd#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.xtext.ter_metamodel.ecfdl.ecfd.Ecfd#getMutex <em>Mutex</em>}</li>
 * </ul>
 *
 * @see org.xtext.ter_metamodel.ecfdl.ecfd.EcfdPackage#getEcfd()
 * @model
 * @generated
 */
public interface Ecfd extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ter_metamodel.ecfdl.ecfd.EcfdPackage#getEcfd_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ter_metamodel.ecfdl.ecfd.Ecfd#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Boxes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ter_metamodel.ecfdl.ecfd.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boxes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boxes</em>' containment reference list.
   * @see org.xtext.ter_metamodel.ecfdl.ecfd.EcfdPackage#getEcfd_Boxes()
   * @model containment="true"
   * @generated
   */
  EList<Element> getBoxes();

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ter_metamodel.ecfdl.ecfd.GroupBox}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see org.xtext.ter_metamodel.ecfdl.ecfd.EcfdPackage#getEcfd_Groups()
   * @model containment="true"
   * @generated
   */
  EList<GroupBox> getGroups();

  /**
   * Returns the value of the '<em><b>Mutex</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ter_metamodel.ecfdl.ecfd.Mutex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mutex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mutex</em>' containment reference list.
   * @see org.xtext.ter_metamodel.ecfdl.ecfd.EcfdPackage#getEcfd_Mutex()
   * @model containment="true"
   * @generated
   */
  EList<Mutex> getMutex();

} // Ecfd
