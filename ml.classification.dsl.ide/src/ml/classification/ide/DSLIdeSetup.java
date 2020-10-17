/*
 * generated by Xtext 2.23.0
 */
package ml.classification.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ml.classification.DSLRuntimeModule;
import ml.classification.DSLStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DSLIdeSetup extends DSLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DSLRuntimeModule(), new DSLIdeModule()));
	}
	
}