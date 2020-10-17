package ml.classification.generator

import ml.classification.dSL.*


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
			«expression.expr_const.toString()»
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
		«ENDIF»«ENDIF»«ENDIF»«ENDIF»«ENDIF»«ENDIF»
		'''
	
	}
	
	def prettyprint (Print print){
		'''
		print «print.print»
		'''
	
	}
	
	def prettyprint (Algo_choose algo_choose){
		'''
		use_algorithm «algo_choose.algorithm»
		'''
	
	}
	
	def prettyprint (Read read){
		'''
		read "«read.path»" «read.separator»
		'''
	
	}
	
	def prettyprint (Strategy_choose strat_choose){
		'''
		use_strategy«IF strat_choose.strategy=="train_test"» «strat_choose.strategy» «strat_choose.ratio»«ENDIF»«IF strat_choose.strategy=="cross_valid"» «strat_choose.strategy» «strat_choose.nb»«ENDIF»
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
			use_column «FOR i : c.use»«i.toString()» «ENDFOR»
		«ELSE»«IF c.unuse.size > 0»
			unuse_column «FOR i : c.unuse»«i.toString()» «ENDFOR»
		«ELSE»
			predict_column «c.predict.toString»
		«ENDIF»
		«ENDIF»
		'''
	}
	
}