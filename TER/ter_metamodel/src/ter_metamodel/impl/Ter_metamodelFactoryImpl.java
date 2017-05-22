/**
 */
package ter_metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ter_metamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ter_metamodelFactoryImpl extends EFactoryImpl implements Ter_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ter_metamodelFactory init() {
		try {
			Ter_metamodelFactory theTer_metamodelFactory = (Ter_metamodelFactory)EPackage.Registry.INSTANCE.getEFactory(Ter_metamodelPackage.eNS_URI);
			if (theTer_metamodelFactory != null) {
				return theTer_metamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ter_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ter_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ter_metamodelPackage.BOX: return createBox();
			case Ter_metamodelPackage.GROUP_BOX: return createGroupBox();
			case Ter_metamodelPackage.MUTEX: return createMutex();
			case Ter_metamodelPackage.FEATURE: return createFeature();
			case Ter_metamodelPackage.ECFD: return createEcfd();
			case Ter_metamodelPackage.FILE: return createFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupBox createGroupBox() {
		GroupBoxImpl groupBox = new GroupBoxImpl();
		return groupBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mutex createMutex() {
		MutexImpl mutex = new MutexImpl();
		return mutex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecfd createEcfd() {
		EcfdImpl ecfd = new EcfdImpl();
		return ecfd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ter_metamodelPackage getTer_metamodelPackage() {
		return (Ter_metamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ter_metamodelPackage getPackage() {
		return Ter_metamodelPackage.eINSTANCE;
	}

} //Ter_metamodelFactoryImpl
