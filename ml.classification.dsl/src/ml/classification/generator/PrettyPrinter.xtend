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
import ml.classification.dSL.Constant

class PrettyPrinter {
	def prettyprint (ML ml){
		'''
		 «FOR s : ml.statements»
		 	«s.prettyprint()»
		 «ENDFOR»
		'''
	}
	
	def prettyprint (Statement statement){
		'''
		«IF statement.assign !== null»
			«statement.assign.prettyprint()»
		«ENDIF»«IF statement.primitive !== null»
			«statement.primitive.prettyprint()»
		«ENDIF»
		'''
	
	}
	
	def prettyprint (Expression expression){
		'''
		«IF expression.expr_prim !== null»
			«expression.expr_prim.prettyprint()»
		«ENDIF»«IF expression.expr_const !== null»
			«expression.expr_const.prettyprint()»
		«ENDIF»
		'''
	
	}
	
	def prettyprint (Assign assign){
		'''
		«assign.varname» = «assign.assign_value.prettyprint()»
		'''
	
	}
	
	def prettyprint (Primitive primitive){
		'''
		«IF primitive.print !== null»
			«primitive.print.prettyprint()»
		«ELSE»«IF primitive.algo_choose !== null»
			«primitive.algo_choose.prettyprint()»
		«ELSE»«IF primitive.read !== null»
			«primitive.read.prettyprint()»
		«ELSE»«IF primitive.strategy_choose !== null»
			«primitive.strategy_choose.prettyprint()»
		«ELSE»«IF primitive.use_metric !== null»
			«primitive.use_metric.prettyprint()»
		«ELSE»«IF primitive.column !== null»
			«primitive.column.prettyprint()»
		«ELSE»«IF primitive.predict !== null»
			predict
		«ENDIF»«ENDIF»«ENDIF»«ENDIF»«ENDIF»«ENDIF»«ENDIF»
		'''
	
	}
	
	def prettyprint (Print print){
		'''
		print «print.print.prettyprint()»
		'''
	
	}
	
	def prettyprint (Algo_choose algo_choose){
		'''
		use_algorithm «algo_choose.algorithm»
		'''
	
	}
	
	def prettyprint (Read read){
		'''
		read «read.path.prettyprint()» «read.separator»
		'''
	
	}
	
	def prettyprint (Strategy_choose strat_choose){
		'''
		use_strategy «IF strat_choose.strategy=="train_test"»«strat_choose.strategy» «strat_choose.ratio.prettyprint»«ENDIF»«IF strat_choose.strategy=="cross_valid"»«strat_choose.strategy» «strat_choose.nb.prettyprint»«ENDIF»
		'''	
	}
	
	def prettyprint (Use_Metric use_metric){
		'''
		use_metric «use_metric.metric»
		'''
	
	}
	
	def prettyprint(Column c) {
		'''
		«IF c.use.size > 0»
			use_column «FOR i : c.use»«i.prettyprint()» «ENDFOR»
		«ELSE»«IF c.unuse.size > 0»
			unuse_column «FOR i : c.unuse»«i.prettyprint()» «ENDFOR»
		«ELSE»
			predict_column «c.predict.prettyprint()»
		«ENDIF»
		«ENDIF»
		'''
	}
	
	def String prettyprint(Constant c) {
		'''
		«IF c.constantInt !== null»«c.constantInt»«ELSE»
		«IF c.constantDouble !== null»«c.constantDouble»«ELSE»
		«IF c.constantString !== null»"«c.constantString»"«ELSE»
		«c.varRef»«ENDIF»«ENDIF»«ENDIF»'''
	}
	
}