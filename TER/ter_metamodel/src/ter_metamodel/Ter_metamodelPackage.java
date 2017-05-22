/**
 */
package ter_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ter_metamodel.Ter_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Ter_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ter_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ter_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ter_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ter_metamodelPackage eINSTANCE = ter_metamodel.impl.Ter_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ter_metamodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ter_metamodel.impl.ElementImpl
	 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Super Box</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUPER_BOX = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ter_metamodel.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ter_metamodel.impl.BoxImpl
	 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 0;

	/**
	 * The feature id for the '<em><b>Super Box</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__SUPER_BOX = ELEMENT__SUPER_BOX;

	/**
	 * The feature id for the '<em><b>Groupbox</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__GROUPBOX = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mutex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__MUTEX = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__FEATURE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ter_metamodel.impl.GroupBoxImpl <em>Group Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ter_metamodel.impl.GroupBoxImpl
	 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getGroupBox()
	 * @generated
	 */
	int GROUP_BOX = 1;

	/**
	 * The feature id for the '<em><b>Super Box</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__SUPER_BOX = ELEMENT__SUPER_BOX;

	/**
	 * The feature id for the '<em><b>Box</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__BOX = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__EXCLUSION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ter_metamodel.impl.MutexImpl <em>Mutex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ter_metamodel.impl.MutexImpl
	 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getMutex()
	 * @generated
	 */
	int MUTEX = 3;

	/**
	 * The feature id for the '<em><b>Box</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX__BOX = 0;

	/**
	 * The number of structural features of the '<em>Mutex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mutex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ter_metamodel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ter_metamodel.impl.FeatureImpl
	 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ter_metamodel.impl.EcfdImpl <em>Ecfd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ter_metamodel.impl.EcfdImpl
	 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getEcfd()
	 * @generated
	 */
	int ECFD = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECFD__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Mutex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECFD__MUTEX = 1;

	/**
	 * The number of structural features of the '<em>Ecfd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECFD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ecfd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECFD_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ter_metamodel.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ter_metamodel.impl.FileImpl
	 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 6;

	/**
	 * The feature id for the '<em><b>Ecfd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ECFD = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ter_metamodel.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see ter_metamodel.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the reference list '{@link ter_metamodel.Box#getGroupbox <em>Groupbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groupbox</em>'.
	 * @see ter_metamodel.Box#getGroupbox()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Groupbox();

	/**
	 * Returns the meta object for the reference list '{@link ter_metamodel.Box#getMutex <em>Mutex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mutex</em>'.
	 * @see ter_metamodel.Box#getMutex()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Mutex();

	/**
	 * Returns the meta object for the containment reference list '{@link ter_metamodel.Box#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see ter_metamodel.Box#getFeature()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Feature();

	/**
	 * Returns the meta object for class '{@link ter_metamodel.GroupBox <em>Group Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Box</em>'.
	 * @see ter_metamodel.GroupBox
	 * @generated
	 */
	EClass getGroupBox();

	/**
	 * Returns the meta object for the reference list '{@link ter_metamodel.GroupBox#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Box</em>'.
	 * @see ter_metamodel.GroupBox#getBox()
	 * @see #getGroupBox()
	 * @generated
	 */
	EReference getGroupBox_Box();

	/**
	 * Returns the meta object for the attribute '{@link ter_metamodel.GroupBox#isExclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusion</em>'.
	 * @see ter_metamodel.GroupBox#isExclusion()
	 * @see #getGroupBox()
	 * @generated
	 */
	EAttribute getGroupBox_Exclusion();

	/**
	 * Returns the meta object for class '{@link ter_metamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ter_metamodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference list '{@link ter_metamodel.Element#getSuperBox <em>Super Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Box</em>'.
	 * @see ter_metamodel.Element#getSuperBox()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SuperBox();

	/**
	 * Returns the meta object for class '{@link ter_metamodel.Mutex <em>Mutex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutex</em>'.
	 * @see ter_metamodel.Mutex
	 * @generated
	 */
	EClass getMutex();

	/**
	 * Returns the meta object for the reference list '{@link ter_metamodel.Mutex#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Box</em>'.
	 * @see ter_metamodel.Mutex#getBox()
	 * @see #getMutex()
	 * @generated
	 */
	EReference getMutex_Box();

	/**
	 * Returns the meta object for class '{@link ter_metamodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see ter_metamodel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link ter_metamodel.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ter_metamodel.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link ter_metamodel.Ecfd <em>Ecfd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecfd</em>'.
	 * @see ter_metamodel.Ecfd
	 * @generated
	 */
	EClass getEcfd();

	/**
	 * Returns the meta object for the containment reference list '{@link ter_metamodel.Ecfd#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see ter_metamodel.Ecfd#getElement()
	 * @see #getEcfd()
	 * @generated
	 */
	EReference getEcfd_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link ter_metamodel.Ecfd#getMutex <em>Mutex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mutex</em>'.
	 * @see ter_metamodel.Ecfd#getMutex()
	 * @see #getEcfd()
	 * @generated
	 */
	EReference getEcfd_Mutex();

	/**
	 * Returns the meta object for class '{@link ter_metamodel.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see ter_metamodel.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link ter_metamodel.File#getEcfd <em>Ecfd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecfd</em>'.
	 * @see ter_metamodel.File#getEcfd()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Ecfd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ter_metamodelFactory getTer_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ter_metamodel.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ter_metamodel.impl.BoxImpl
		 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '<em><b>Groupbox</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__GROUPBOX = eINSTANCE.getBox_Groupbox();

		/**
		 * The meta object literal for the '<em><b>Mutex</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__MUTEX = eINSTANCE.getBox_Mutex();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__FEATURE = eINSTANCE.getBox_Feature();

		/**
		 * The meta object literal for the '{@link ter_metamodel.impl.GroupBoxImpl <em>Group Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ter_metamodel.impl.GroupBoxImpl
		 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getGroupBox()
		 * @generated
		 */
		EClass GROUP_BOX = eINSTANCE.getGroupBox();

		/**
		 * The meta object literal for the '<em><b>Box</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_BOX__BOX = eINSTANCE.getGroupBox_Box();

		/**
		 * The meta object literal for the '<em><b>Exclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BOX__EXCLUSION = eINSTANCE.getGroupBox_Exclusion();

		/**
		 * The meta object literal for the '{@link ter_metamodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ter_metamodel.impl.ElementImpl
		 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Super Box</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SUPER_BOX = eINSTANCE.getElement_SuperBox();

		/**
		 * The meta object literal for the '{@link ter_metamodel.impl.MutexImpl <em>Mutex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ter_metamodel.impl.MutexImpl
		 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getMutex()
		 * @generated
		 */
		EClass MUTEX = eINSTANCE.getMutex();

		/**
		 * The meta object literal for the '<em><b>Box</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTEX__BOX = eINSTANCE.getMutex_Box();

		/**
		 * The meta object literal for the '{@link ter_metamodel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ter_metamodel.impl.FeatureImpl
		 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link ter_metamodel.impl.EcfdImpl <em>Ecfd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ter_metamodel.impl.EcfdImpl
		 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getEcfd()
		 * @generated
		 */
		EClass ECFD = eINSTANCE.getEcfd();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECFD__ELEMENT = eINSTANCE.getEcfd_Element();

		/**
		 * The meta object literal for the '<em><b>Mutex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECFD__MUTEX = eINSTANCE.getEcfd_Mutex();

		/**
		 * The meta object literal for the '{@link ter_metamodel.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ter_metamodel.impl.FileImpl
		 * @see ter_metamodel.impl.Ter_metamodelPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Ecfd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__ECFD = eINSTANCE.getFile_Ecfd();

	}

} //Ter_metamodelPackage
