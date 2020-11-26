package ml.classification.generator

import java.util.Map
import ml.classification.dSL.ML
import ml.classification.dSL.Statement
import ml.classification.dSL.Expression
import ml.classification.dSL.Assign
import ml.classification.dSL.Primitive
import ml.classification.dSL.Print
import ml.classification.dSL.Read
import ml.classification.dSL.Use_Metric
import ml.classification.dSL.Constant
import ml.classification.dSL.Column
import java.io.BufferedReader
import java.io.FileReader
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import java.util.Random;
import java.util.HashMap
import java.util.stream.IntStream
import java.util.stream.Collectors

class Interpreter {
	public var Map<String, Expression> environment = new HashMap<String, Expression>
	public var List<Integer> use_columns = new ArrayList<Integer>()
	public var int predict_column = -1
	public var String metric = "accuracy"
	public var List<List<String>> dataset = new ArrayList<List<String>>()
	
	
	def interpret(ML ml) {
		for (s: ml.statements) s.interpret
	}
	
	def interpret(Statement s) {
		if (s.assign !== null) s.assign.interpret
		else s.primitive.interpret
	}
	
	def interpret(Expression e) {
		if (e.expr_prim !== null) {
			e.expr_prim.interpret
			return null	
		}
		else return e.expr_const.interpret
	}
	
	def interpret(Assign a) {
		environment.put(a.varname, a.assign_value)
	}
	
	def void interpret(Primitive p) {
		if (p.print !== null) p.print.interpret
		else if (p.read !== null) p.read.interpret
		else if (p.use_metric !== null) p.use_metric.interpret
		else if (p.column !== null) p.column.interpret
		else if (p.predict !== null) {
			var ArrayList<String> differentVars = new ArrayList<String>()
			
			for (i: 0..< dataset.size) { // Collecting the different possible values
				var currentvar = dataset.get(i).get(predict_column)
				if (! differentVars.contains(currentvar)) {
					differentVars.add(currentvar)
				}
			}
			
			var random = new Random() 
			var predicted = new ArrayList<String>()
			for (i: 0..< dataset.size) { // Creating the random predicted values
				predicted.add(differentVars.get(random.nextInt(differentVars.size)))
			}
			
			var Double metricValue
			if (metric == "accuracy") {
				metricValue = computeAccuracy(predicted)
			} else if (metric == "recall") {
				metricValue = computeRecall(predicted, differentVars)
			} else if (metric == "f1") {
				metricValue = computeF1(predicted, differentVars)
			}
			System.out.println(metric + ": " + metricValue.toString)
		}
		// Nothing to interpet for algo_choose and strategy_choose
	}
	
	def interpret(Print p) {
		if (p.print.varRef !== null) {
			val valueToPrint = environment.getOrDefault(p.print.varRef, null)
			if (valueToPrint !== null) System.out.println("value printed: " + valueToPrint.interpret)
			else System.out.println("Should i really print?")
		}
		else System.out.println("value printed: " + p.print.interpret)
	}
	
	def interpret(Read r) {
	
		dataset = new ArrayList<List<String>>()
		var BufferedReader br = new BufferedReader(new FileReader(r.path.constantString))	
	    var String line;
	    while ((line = br.readLine()) !== null) {
	    	var String sep = ";"
	    	if (r.separator !== null) sep = r.separator 
	        var String[] values = line.split(sep)
	        dataset.add(Arrays.asList(values))
    	}
    	predict_column = dataset.get(0).size - 1
    	use_columns = IntStream.range(0, dataset.get(0).size - 1).boxed().collect(Collectors.toList());
	}
	
	def interpret(Use_Metric um) {
		metric = um.metric
	}
	
	def interpret(Column c) {
		if (c.use.size > 0) {
			for (index: c.use) {
				val intIndex = index.interpret as Integer
				if (!use_columns.contains(intIndex)) use_columns.add(intIndex)
			}
				
		}
		else if (c.unuse.size > 0) {
			for (index: c.unuse) {
				use_columns.remove(index.interpret)
			}
		}
		else predict_column = c.predict.interpret as Integer
	}
	
	def interpret(Constant c) {
		if (c.constantInt !== null) return Integer.parseInt(c.constantInt)
		else if (c.constantDouble !== null) return Double.parseDouble(c.constantDouble)
		else if (c.constantString !== null) return c.constantString
		else return environment.get(c.varRef).interpret
	}
	
	def Double computeAccuracy(ArrayList<String> predicted) {
		var goodguess = 0.0
		for (i: 0..< dataset.size) {
			if (dataset.get(i).get(predict_column) == predicted.get(i)) {
				goodguess += 1
			}
		}
		return goodguess / predicted.size
	}
	
	def Double computeRecall(ArrayList<String> predicted, ArrayList<String> differentVars) {
		var recall = 0.0
		for (i: 0..< differentVars.size) {
			// Computing recall for the class i
			var truePos = 0.0
			var falseNeg = 0.0
			val positiveVal = differentVars.get(i)
			for (j: 0..< predicted.size) {
				val predictedVal = predicted.get(j)
				val expectedVal = dataset.get(j).get(predict_column)
				if (predictedVal == positiveVal && predictedVal == expectedVal) {
					truePos += 1
				} else if (predictedVal != positiveVal && expectedVal == positiveVal) {
					falseNeg += 1
				}
			}
			recall += truePos / (truePos + falseNeg)
		}
		return recall / differentVars.size
	}
	
	def Double computePrecision(ArrayList<String> predicted, ArrayList<String> differentVars) {
		var precision = 0.0
		for (i: 0..< differentVars.size) {
			// Computing recall for the class i
			var truePos = 0.0
			var falsePos = 0.0
			val positiveVal = differentVars.get(i)
			for (j: 0..< predicted.size) {
				val predictedVal = predicted.get(j)
				val expectedVal = dataset.get(j).get(predict_column)
				if (predictedVal == positiveVal && predictedVal == expectedVal) {
					truePos += 1
				} else if (predictedVal == positiveVal && expectedVal == positiveVal) {
					falsePos += 1
				}
			}
			precision += truePos / (truePos + falsePos)
		}
		return precision / differentVars.size
	}
	
	def Double computeF1(ArrayList<String> predicted, ArrayList<String> differentVars) {
		val precision = computePrecision(predicted, differentVars)
		val recall = computeRecall(predicted, differentVars)
		return 2.0 / ((1.0 / precision) + (1.0 / recall))
	}
}