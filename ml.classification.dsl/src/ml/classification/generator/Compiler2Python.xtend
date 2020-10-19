package ml.classification.generator

import ml.classification.dSL.ML
import ml.classification.dSL.Statement
import ml.classification.dSL.Expression
import ml.classification.dSL.Assign
import ml.classification.dSL.Primitive
import ml.classification.dSL.Print
import ml.classification.dSL.Algo_choose
import ml.classification.dSL.Read
import ml.classification.dSL.Strategy_choose
import ml.classification.dSL.Use_Metric
import ml.classification.dSL.Column
import java.nio.file.Files
import java.nio.file.Paths
import ml.classification.dSL.Constant

class Compiler2Python {
	def String compile(ML ml) {
		var res = Files.readString(Paths.get("Cours/M1/DSL/DSL-Project/initial_py_file.py"))
		// TODO : use relative path
		for (s : ml.statements) res += s.compile + "\n"
		return res
	}
	
	def String compile(Statement s) {
		if (s.assign !== null) return s.assign.compile
		else return s.primitive.compile
	}
	
	def String compile(Expression e) {
		if (e.expr_prim !== null) return e.expr_prim.compile
		else return e.expr_const.compile
	}
	
	def String compile(Assign a) {
		return a.varname + " = " + a.assign_value.compile
	}
	
	def String compile(Primitive p) {
		if (p.print !== null) return p.print.compile
		else if (p.algo_choose !== null) return p.algo_choose.compile
		else if (p.read !== null) return p.read.compile
		else if (p.strategy_choose !== null) return p.strategy_choose.compile
		else if (p.use_metric !== null) return p.use_metric.compile
		else if (p.column !== null) return p.column.compile
		else if (p.predict != "") return "classifier.predict()"
	}
	
	def String compile(Print p) {
		return "print(" + p.print.compile + ")"
	}
	
	def String compile(Algo_choose ac) {
		return "classifier.algo = \"" + ac.algorithm + "\""
	}
	
	def String compile(Read r) {
		var beginWith = "classifier.read(" + r.path.compile
		if (r.separator != "") {
			beginWith += ", \"" + r.separator + "\""
		} 
		return beginWith + ')'
	}
	
	def String compile(Strategy_choose sc) {
		var beginWith = "classifier.strategy = \"" + sc.strategy + "\""
		if (sc.strategy == "train_test") beginWith += "\nclassifier.train_test_ratio = " + sc.ratio.constantDouble
		else if (Integer.parseInt(sc.nb.constantInt) > 0) beginWith += "\nclassifier.cross_valid_nb = " + sc.nb.constantInt
		return beginWith
	}
	
	def String compile(Use_Metric um) {
		return "classifier.metric = \"" + um.metric + "\""
	}
	
	def String compile(Column c) {
		if (c.use.size > 0) {
			var beginWith = "classifier.add_columns(["
			for (index : c.use) beginWith += index.constantInt + ", "
			return beginWith.substring(0, beginWith.length - 2) + "])"
		} else if (c.unuse.size > 0) {
			var beginWith = "classifier.remove_columns(["
			for (index : c.unuse) beginWith += index.constantInt + ", "
			return beginWith.substring(0, beginWith.length - 2) + "])"
		} else {
			return "classifier.predict_column = " + c.predict.constantInt
		}
	}
	
	def String compile(Constant c) {
		if (c.constantInt !== null) return c.constantInt
		else if (c.constantDouble !== null) return c.constantDouble
		else if (c.constantString !== null) return '"' + c.constantString + '"'
		else return c.varRef
	}
	
	
}