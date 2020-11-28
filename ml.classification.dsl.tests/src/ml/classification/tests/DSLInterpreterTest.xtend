package ml.classification.tests

import com.google.inject.Inject

import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import ml.classification.dSL.ML
import ml.classification.generator.Interpreter
import java.util.stream.Collectors
import java.util.stream.IntStream

@ExtendWith(InjectionExtension)
@InjectWith(DSLInjectorProvider)
class DSLInterpreterTest {
	@Inject
	ParseHelper<ML> parseHelper
	
	@Test
	// About the 'use_column' keyword
	def void testInterpreter1() {
		var interpreter = new Interpreter
		val input = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/1.mldsl")))
		Assertions.assertNotNull(input)
		
		interpreter.interpret(input.statements.get(0))
		Assertions.assertTrue(interpreter.use_columns.contains(1))
		Assertions.assertTrue(interpreter.use_columns.contains(2))
		Assertions.assertTrue(interpreter.use_columns.contains(3))
		Assertions.assertTrue(interpreter.use_columns.size == 3)
		
		interpreter.interpret(input.statements.get(1))
		Assertions.assertTrue(interpreter.use_columns.contains(1))
		Assertions.assertTrue(interpreter.use_columns.contains(2))
		Assertions.assertTrue(interpreter.use_columns.contains(3))
		Assertions.assertTrue(interpreter.use_columns.contains(4))
		Assertions.assertTrue(interpreter.use_columns.size == 4)
		
		interpreter.interpret(input.statements.get(2))
		Assertions.assertTrue(interpreter.use_columns.contains(1))
		Assertions.assertTrue(interpreter.use_columns.contains(2))
		Assertions.assertTrue(interpreter.use_columns.contains(3))
		Assertions.assertTrue(interpreter.use_columns.contains(4))
		Assertions.assertTrue(interpreter.use_columns.size == 4)
		
		interpreter.interpret(input.statements.get(3))
		Assertions.assertTrue(interpreter.use_columns.contains(1))
		Assertions.assertTrue(interpreter.use_columns.contains(2))
		Assertions.assertTrue(interpreter.use_columns.contains(3))
		Assertions.assertTrue(interpreter.use_columns.contains(4))
		Assertions.assertTrue(interpreter.use_columns.contains(5))
		Assertions.assertTrue(interpreter.use_columns.contains(6))
		Assertions.assertTrue(interpreter.use_columns.size == 6)
		
		interpreter = new Interpreter  // Reset to have it run the whole file
		interpreter.interpret(input)
		Assertions.assertTrue(interpreter.use_columns.contains(1))
		Assertions.assertTrue(interpreter.use_columns.contains(2))
		Assertions.assertTrue(interpreter.use_columns.contains(3))
		Assertions.assertTrue(interpreter.use_columns.contains(4))
		Assertions.assertTrue(interpreter.use_columns.contains(5))
		Assertions.assertTrue(interpreter.use_columns.contains(6))
		Assertions.assertTrue(interpreter.use_columns.size == 6)		
	}
	
	@Test
	// About the 'unuse_column' keyword
	def void testInterpreter2() {
		var interpreter = new Interpreter
		val input = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/2.mldsl")))
		Assertions.assertNotNull(input)
		
		interpreter.interpret(input.statements.get(0))
		Assertions.assertTrue(interpreter.use_columns.contains(1))
		Assertions.assertTrue(interpreter.use_columns.contains(2))
		Assertions.assertTrue(interpreter.use_columns.contains(3))
		Assertions.assertTrue(interpreter.use_columns.contains(4))
		Assertions.assertTrue(interpreter.use_columns.contains(5))
		Assertions.assertTrue(interpreter.use_columns.contains(6))
		Assertions.assertTrue(interpreter.use_columns.size == 6)
		
		interpreter.interpret(input.statements.get(1))
		Assertions.assertFalse(interpreter.use_columns.contains(3))
		Assertions.assertTrue(interpreter.use_columns.size == 5)
		
		interpreter.interpret(input.statements.get(2))
		Assertions.assertFalse(interpreter.use_columns.contains(3))
		Assertions.assertFalse(interpreter.use_columns.contains(4))
		Assertions.assertFalse(interpreter.use_columns.contains(5))
		Assertions.assertTrue(interpreter.use_columns.size == 3)
		
		interpreter.interpret(input.statements.get(3))
		Assertions.assertFalse(interpreter.use_columns.contains(3))
		Assertions.assertFalse(interpreter.use_columns.contains(4))
		Assertions.assertFalse(interpreter.use_columns.contains(5))
		Assertions.assertFalse(interpreter.use_columns.contains(6))
		Assertions.assertTrue(interpreter.use_columns.size == 2)
		
		interpreter = new Interpreter
		interpreter.interpret(input)
		Assertions.assertFalse(interpreter.use_columns.contains(3))
		Assertions.assertFalse(interpreter.use_columns.contains(4))
		Assertions.assertFalse(interpreter.use_columns.contains(5))
		Assertions.assertFalse(interpreter.use_columns.contains(6))
		Assertions.assertTrue(interpreter.use_columns.size == 2)
	}

	@Test
	// About the 'predict_column' keyword
	def void testInterpreter3() {
		var interpreter = new Interpreter
		val input = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/3.mldsl")))
		Assertions.assertNotNull(input)
		
		interpreter.interpret(input.statements.get(0))
		Assertions.assertTrue(interpreter.predict_column == 3)
		
		interpreter.interpret(input.statements.get(1))
		Assertions.assertTrue(interpreter.predict_column == 1)
		
		interpreter.interpret(input.statements.get(2))
		Assertions.assertTrue(interpreter.predict_column == 2)
		
		interpreter.interpret(input.statements.get(3))
		Assertions.assertTrue(interpreter.predict_column == 3)
	}	

	@Test
	// About the 'use_metric' keyword
	def void testInterpreter4() {
		var interpreter = new Interpreter
		val input = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/4.mldsl")))
		Assertions.assertNotNull(input)
		
		Assertions.assertTrue(interpreter.metric == "accuracy")
		interpreter.interpret(input.statements.get(0))
		Assertions.assertTrue(interpreter.metric == "f1")
		
		interpreter.interpret(input.statements.get(1))
		Assertions.assertTrue(interpreter.metric == "recall")
		
		interpreter.interpret(input.statements.get(2))
		Assertions.assertTrue(interpreter.metric == "accuracy")
	}

	@Test
	// About the 'read' keyword
	def void testInterpreter5() {
		var interpreter = new Interpreter
		val input = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/5.mldsl")))
		Assertions.assertNotNull(input)

		Assertions.assertTrue(interpreter.dataset.size == 0)
		interpreter.interpret(input.statements.get(0))
		Assertions.assertTrue(interpreter.predict_column == 3)
		Assertions.assertTrue(interpreter.use_columns == IntStream.range(0, 3).boxed.collect(Collectors.toList))
		Assertions.assertTrue(interpreter.dataset.size == 150)
		Assertions.assertTrue(interpreter.dataset.get(0).size == 4)
		Assertions.assertTrue(interpreter.dataset.get(0).get(0) == "3.500000000000000000e+00")
		
		interpreter.interpret(input.statements.get(1))
		Assertions.assertTrue(interpreter.predict_column == 2)
		Assertions.assertTrue(interpreter.use_columns == IntStream.range(0, 2).boxed.collect(Collectors.toList))
		Assertions.assertTrue(interpreter.dataset.size == 15)
		Assertions.assertTrue(interpreter.dataset.get(0).size == 3)
		Assertions.assertTrue(interpreter.dataset.get(0).get(0) == "1")
	}
	
	@Test
	def void testInterpreterExecutionTime1() {
		val input = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/6.mldsl")))
		Assertions.assertNotNull(input)
		
		val nbTests = 100000
		var Interpreter interpreter
		val startTime = System.nanoTime
		for (i: 0..< nbTests) {
			interpreter = new Interpreter
			interpreter.printVal = false
			interpreter.interpret(input)	
		}
		val meanTime = (System.nanoTime - startTime) / (nbTests * 1000)
		System.out.println("***\nMean time on a 15 * 3 database to compute all combination of metric-strategy-algorithm: " + meanTime + "ms\n***")
	}
	
	@Test
	def void testInterpreterExecutionTime2() {
		val input = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/7.mldsl")))
		Assertions.assertNotNull(input)
		
		val nbTests = 100000
		var Interpreter interpreter
		val startTime = System.nanoTime
		for (i: 0..< nbTests) {
			interpreter = new Interpreter
			interpreter.printVal = false
			interpreter.interpret(input)	
		}
		val meanTime = (System.nanoTime - startTime) / (nbTests * 1000)
		System.out.println("***\nMean time on a 150 * 4 database to compute all combination of metric-strategy-algorithm: " + meanTime + "ms\n***")
	}

	@Test
	def void testInterpreterBenchmarkMetric() {
		val inputF1 = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/8.mldsl")))
		val inputRecall = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/9.mldsl")))
		val inputAccuracy = parseHelper.parse(Files.readString(Paths.get("../../DSL-Project/ml.classification.dsl.tests/TestFiles/interpreter/input/10.mldsl")))
		Assertions.assertNotNull(inputF1)
		Assertions.assertNotNull(inputRecall)
		Assertions.assertNotNull(inputAccuracy)
		
		val nbTests = 100000
		var Interpreter interpreter
		var startTime = System.nanoTime
		
		for (i: 0..< nbTests) {
			interpreter = new Interpreter
			interpreter.printVal = false
			interpreter.interpret(inputF1)	
		}
		val meanTimeF1 = (System.nanoTime - startTime) / (nbTests * 1000)
		
		startTime = System.nanoTime
		
		for (i: 0..< nbTests) {
			interpreter = new Interpreter
			interpreter.printVal = false
			interpreter.interpret(inputRecall)	
		}
		val meanTimeRecall = (System.nanoTime - startTime) / (nbTests * 1000)
		
		startTime = System.nanoTime
		
		for (i: 0..< nbTests) {
			interpreter = new Interpreter
			interpreter.printVal = false
			interpreter.interpret(inputAccuracy)	
		}
		val meanTimeAccuracy = (System.nanoTime - startTime) / (nbTests * 1000)
		
		System.out.println("***\nMean time on a 150 * 4 database: ")
		System.out.println("Computing F1 score: " + meanTimeF1 + "ms")
		System.out.println("Computing Recall: " + meanTimeRecall + "ms")
		System.out.println("Computing Accuracy: " + meanTimeAccuracy + "ms\n***")
	}
}