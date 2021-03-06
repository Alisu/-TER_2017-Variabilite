/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ter_metamodel.ecfdl.ecfd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.ter_metamodel.ecfdl.ecfd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcfdFactoryImpl extends EFactoryImpl implements EcfdFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EcfdFactory init()
  {
    try
    {
      EcfdFactory theEcfdFactory = (EcfdFactory)EPackage.Registry.INSTANCE.getEFactory(EcfdPackage.eNS_URI);
      if (theEcfdFactory != null)
      {
        return theEcfdFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EcfdFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcfdFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EcfdPackage.FILE: return createFile();
      case EcfdPackage.ECFD: return createEcfd();
      case EcfdPackage.ELEMENT: return createElement();
      case EcfdPackage.MUTEX: return createMutex();
      case EcfdPackage.BOX: return createBox();
      case EcfdPackage.GROUP_BOX: return createGroupBox();
      case EcfdPackage.FEATURE: return createFeature();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ecfd createEcfd()
  {
    EcfdImpl ecfd = new EcfdImpl();
    return ecfd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mutex createMutex()
  {
    MutexImpl mutex = new MutexImpl();
    return mutex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Box createBox()
  {
    BoxImpl box = new BoxImpl();
    return box;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupBox createGroupBox()
  {
    GroupBoxImpl groupBox = new GroupBoxImpl();
    return groupBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcfdPackage getEcfdPackage()
  {
    return (EcfdPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EcfdPackage getPackage()
  {
    return EcfdPackage.eINSTANCE;
  }

} //EcfdFactoryImpl
