/*
 * generated by Xtext 2.23.0
 */
package ml.classification.tests

import com.google.inject.Inject
import ml.classification.dSL.ML
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import ml.classification.generator.DSLPrettyPrinter

@ExtendWith(InjectionExtension)
@InjectWith(DSLInjectorProvider)
class DSLParsingTest {
	@Inject
	ParseHelper<ML> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void pp() {
		val res = parseHelper.parse('''
		print "Hello World!"
		''')
		val pp = new DSLPrettyPrinter
		println(pp.prettyPrint(res))
		Assertions.assertTrue(true)
		
	}
}
