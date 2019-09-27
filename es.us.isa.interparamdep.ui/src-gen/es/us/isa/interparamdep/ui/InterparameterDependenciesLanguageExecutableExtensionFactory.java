/*
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.ui;

import com.google.inject.Injector;
import es.us.isa.interparamdep.ui.internal.InterparamdepActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class InterparameterDependenciesLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(InterparamdepActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		InterparamdepActivator activator = InterparamdepActivator.getInstance();
		return activator != null ? activator.getInjector(InterparamdepActivator.ES_US_ISA_INTERPARAMDEP_INTERPARAMETERDEPENDENCIESLANGUAGE) : null;
	}

}
