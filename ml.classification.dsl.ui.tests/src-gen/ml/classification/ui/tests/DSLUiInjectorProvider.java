/*
 * generated by Xtext 2.23.0
 */
package ml.classification.ui.tests;

import com.google.inject.Injector;
import ml.classification.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("ml.classification.DSL");
	}

}
