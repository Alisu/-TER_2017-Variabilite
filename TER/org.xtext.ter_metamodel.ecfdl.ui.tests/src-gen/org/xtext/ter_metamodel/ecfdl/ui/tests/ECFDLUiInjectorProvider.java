/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ter_metamodel.ecfdl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.ter_metamodel.ecfdl.ui.internal.EcfdlActivator;

public class ECFDLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EcfdlActivator.getInstance().getInjector("org.xtext.ter_metamodel.ecfdl.ECFDL");
	}

}
