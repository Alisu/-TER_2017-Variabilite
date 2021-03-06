/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ter_metamodel.ecfdl.ecfd;

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
 *   <li>{@link org.xtext.ter_metamodel.ecfdl.ecfd.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ter_metamodel.ecfdl.ecfd.Element#getSuperBox <em>Super Box</em>}</li>
 * </ul>
 *
 * @see org.xtext.ter_metamodel.ecfdl.ecfd.EcfdPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
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
   * @see org.xtext.ter_metamodel.ecfdl.ecfd.EcfdPackage#getElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ter_metamodel.ecfdl.ecfd.Element#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Box</b></em>' reference list.
   * The list contents are of type {@link org.xtext.ter_metamodel.ecfdl.ecfd.Box}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Box</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Box</em>' reference list.
   * @see org.xtext.ter_metamodel.ecfdl.ecfd.EcfdPackage#getElement_SuperBox()
   * @model
   * @generated
   */
  EList<Box> getSuperBox();

} // Element
