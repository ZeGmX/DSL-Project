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
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ml.classification.dSL.Constant

class Compiler2R extends AbstractGenerator{
	
	String initial_r_file = "
DSLclassifier <- function(algo = \"tree\",metric = \"accuracy\",strategy = \"train_test\",train_test_ratio = 0.5,cross_valid_nb = 3,predict_column = -1,dataset=NULL)
{
  
  ## Get the environment for this
  ## instance of the function.
  thisEnv <- environment()
  
  
  ## Create the list used to represent an
  ## object for this class
  me <- list(
    
    ## Define the environment where this list is defined so
    ## that I can refer to it later.
    thisEnv = thisEnv,
    
    ## Define the accessors for the data fields.
    getEnv = function()
    {
      return(get(\"thisEnv\",thisEnv))
    },
    
    getAlgo = function()
    {
      return(get(\"algo\",thisEnv))
    },
    
    setAlgo = function(value)
    {
      return(assign(\"algo\",value,thisEnv))
    },
    
    getMetric = function()
    {
      return(get(\"metric\",thisEnv))
    },
    
    setMetric = function(value)
    {
      return(assign(\"metric\",value,thisEnv))
    }
    
    read = function(path, sep=\",\")
    {
      assign(\"dataset\",read.csv(path,sep=sep),thisEnv)
    }
    
    add_columns=function(cols)
    {
      
    }
    
    remove_columns=function(cols)
    {
      
    }
  )
  
  ## Define the value of the list within the current environment.
  assign('this',me,envir=thisEnv)
  
  ## Set the name for the class
  class(me) <- append(class(me),\"DSLclassifier\")
  return(me)
}
"
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
       for (ml : resource.allContents.toIterable.filter(ML)){
       		 val name = resource.URI.lastSegment.replaceAll(".mldsl","") +"-compiled.r"
        	 fsa.generateFile(name, ml.compile())
       }
	}
	
	
	def String compile(ML ml) {
		var res = initial_r_file
		for (s : ml.statements){
			res += s.compile + "\n"
			
		}
		return res
	}
	
	def String compile(Statement s) {
		if (s.assign !== null){
			return s.assign.compile
		}
		else {
			return s.primitive.compile
		}
	}
	
	def String compile(Assign a) {
		return a.varname + " = " + a.assign_value.compile
	}
	
	def String compile (Expression e){
		if (e.expr_prim !== null){
			return e.expr_prim.compile
		}
		else {
			return e.expr_const.compile
		}
	}
	
	def String compile(Primitive p) {
		if (p.print !== null) return p.print.compile
		else if (p.algo_choose !== null) return p.algo_choose.compile
		else if (p.read !== null) return p.read.compile
		else if (p.strategy_choose !== null) return p.strategy_choose.compile
		else if (p.use_metric !== null) return p.use_metric.compile
		else if (p.column !== null) return p.column.compile
		else if (p.predict != "") return "classifier$predict()"
	}
	
	def String compile(Print p) {
		return "print(" + p.print.compile + ")"
	}
	
	def String compile(Algo_choose ac) {
		return "classifier$setAlgo(\"" + ac.algorithm + "\")"
	}
	
	def String compile(Read r) {
		var line = "classifier$read(" + r.path.compile
		if (r.separator != "") {
			line += ", \"" + r.separator + "\""
		} 
		return line + ')'
	}
	
	def String compile(Strategy_choose sc) {
		var line = "classifier$setStrategy(\"" + sc.strategy + "\")"
		if (sc.strategy == "train_test") {
			line += "\nclassifier$setTrain_test_ratio(" + sc.ratio.constantDouble + ")"
		}
		else if (sc.strategy == "cross_valid"){
			line += "\nclassifier$setCross_valid_nb(" + sc.nb.constantInt + ")"
		} 
		return line
	}
	
	def String compile(Use_Metric um) {
		return "classifier$setMetric(\"" + um.metric + "\")"
	}
	
	def String compile(Column c) {
		if (c.use.size > 0) {
			var line = "classifier$add_columns(list("
			for (i : c.use){
				line += i.constantInt + ", "
			}
			return line.substring(0, line.length - 2) + "))"
		} else if (c.unuse.size > 0) {
			var line = "classifier$remove_columns(list("
			for (i : c.unuse){
				line += i.constantInt + ", "
			}
			return line.substring(0, line.length - 2) + "))"
		} else {
			return "classifier$setPredict_column(" + c.predict.compile + ")"
		}
	}
	
	def String compile(Constant c) {
		if (c.varRef!==null){
			return c.varRef
		}
		else if (c.constantInt!==null){
			return c.constantInt
		}
		else if (c.constantDouble!==null){
			return c.constantDouble
		}
		else{
			return "\"" + c.constantString + "\""
		}
	}
	
}