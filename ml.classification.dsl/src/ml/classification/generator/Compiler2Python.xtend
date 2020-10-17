package ml.classification.generator

import ml.classification.dSL.*

class Compiler2Python {
	def compile(ML ml) {
		var res = "" // TODO : add default values -> a dict ?
		for (s : ml.statements) res += s.compile + "\n"
	}
	
	def compile(Statement s) {
		if (s.assign !== null) s.assign.compile
		else s.primitive.compile
	}
	
	def compile(Expression e) {
		if (e.expr_prim !== null) e.expr_prim.compile
		else e.expr_const.toString
	}
	
	def compile(Assign a) {
		a.varname + " = " + a.assign_value.compile
	}
	
	def compile(Primitive p) {
		if (p.print !== null) p.print.compile
		else if (p.algo_choose !== null) p.algo_choose.compile
		else if (p.read !== null) p.read.compile
		else if (p.strategy_choose !== null) p.strategy_choose.compile
		else if (p.use_metric !== null) p.use_metric.compile
		else if (p.column !== null) p.column.compile
	}
	
	def compile(Print p) {
		"print(" + p.print + ")"
	}
	
	def compile(Algo_choose ac) {
		// TODO
	}
	
	def compile(Read r) {
		// TODO
	}
	
	def compile(Strategy_choose sc) {
		// TODO
	}
	
	def compile(Use_Metric um) {
		// TODO
	}
	
	def compile(Column c) {
		// TODO
	}
	
	
}