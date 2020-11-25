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
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ml.classification.dSL.Constant

class Compiler2R extends AbstractGenerator{
	// fichier généré dans runtime-EclipseXtext\projetTest\src-gen
	String initial_r_file = 
	"library(caret)
library(tidyverse)
library(e1071)
library(klaR)
library(rpart)
DSLclassifier <- function(algo = \"tree\",metric = \"accuracy\",strategy = \"train_test\",train_test_ratio = 0.5,cross_valid_nb = 3,predict_column = -1,use_column = list(),dataset=NULL)
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
    
    ######### ACCESSORS #########
    
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
    },
    
    getStrategy = function()
    {
      return(get(\"strategy\",thisEnv))
    },
    
    setStrategy = function(value)
    {
      return(assign(\"strategy\",value,thisEnv))
    },
    
    getTrain_test_ratio = function()
    {
      return(get(\"train_test_ratio\",thisEnv))
    },
    
    setTrain_test_ratio = function(value)
    {
      return(assign(\"train_test_ratio\",value,thisEnv))
    },
    
    getCross_valid_nb = function()
    {
      return(get(\"cross_valid_nb\",thisEnv))
    },
    
    setCross_valid_nb = function(value)
    {
      return(assign(\"cross_valid_nb\",value,thisEnv))
    },
    
    getPredict_column = function()
    {
      return(get(\"predict_column\",thisEnv))
    },
    
    setPredict_column = function(value)
    {
      return(assign(\"predict_column\",value,thisEnv))
    },
    
    getUse_column = function()
    {
      return(get(\"use_column\",thisEnv))
    },
    
    setUse_column = function(value)
    {
      return(assign(\"use_column\",value,thisEnv))
    },
    
    getDataset = function()
    {
      return(get(\"dataset\",thisEnv))
    },
    
    setDataset = function(dataset)
    {
      return(assign(\"dataset\",value,thisEnv))
    },
    
    ######### METHODS #########
    
    read = function(path, sep=\"\t\")
    {
      assign(\"dataset\",read.csv(file=path,sep=sep,header = T, stringsAsFactors = F),thisEnv)
    },
    
    add_columns=function(cols){
      for (i in cols){
        stopifnot(1 <= i)
        stopifnot(i <= length(dataset))
        assign(\"use_column\",append(use_column,list(i)),thisEnv)
      }
    },
    
    remove_columns=function(cols){
      res=use_column
      for (i in cols){
        stopifnot(1 <= i)
        stopifnot(i <= length(dataset))
        j=1
        while (j <length(res)){
          if (res[[j]] == i){
            res[j]<-NULL
          }
          j<-j+1
        }
      }
      assign(\"use_column\",res,thisEnv)
    },
    
    max=function(a,b){
      if (a>b){return(a)}
      else{return(b)}
    },

    doPrediction=function(){
      
      used_dataset <- dataset
      used_columns <- use_column
      
      # Removes the duplicates from the columns list
      doublons<-which(duplicated(used_columns))
      if (length(doublons)>0){
        used_columns<-used_columns[-doublons]
      }
      
      # Build train_columns = list of the columns used to train the model (without predict_column)
      train_columns <- used_columns
      
      if (!(predict_column %in% used_columns)){
        append(used_columns,list(predict_column))
      }
      
      else {
        train_columns[[match(predict_column,used_columns)]]<-NULL
      }
      
      # Transforms the list into vectors 
      used_columns <- unlist(used_columns)
      train_columns <- unlist(train_columns)
      
      used_dataset <- subset(used_dataset, select= used_columns)
      
      col_names = names(used_dataset)
      former_predict_name <- col_names[predict_column]
      col_names[predict_column]<-\"Predict\"
      colnames(used_dataset) <- col_names
      
      trainIndex <- caret::createDataPartition(used_dataset$Predict, p=train_test_ratio, list = FALSE)
      
      trainingData <- used_dataset[trainIndex,] # creation du jeu de données \"train\"
      
      testingData <- used_dataset[-trainIndex,] # creation du jeu de données \"test\"
      
      x_test <- testingData[,used_columns]
      y_test <- testingData[,predict_column]
      
      #if (algo == \"bayes\"){
      #  model.fit <- klaR::NaiveBayes(as.factor(Predict)~., data=trainingData)
      #  model.pred <- predict(model.fit, x_test, type = \"class\")
      #  model.pred <- model.pred$class
      #}
      
      if (algo == \"svm\"){
        model.fit <- svm(as.factor(Predict)~., data=trainingData, kernel=\"linear\",scale=F)
      }
      else if (algo==\"tree\"){
        model.fit <- rpart::rpart(as.factor(Predict)~., data=trainingData, method = 'class')
      }
      
      else {
        stop(\"algo must be either \"svm\" or \"tree\"\")
      }
      
      
      if (strategy == \"cross_valid\"){
        model.pred <- predict(model.fit, x_test, type = \"class\")
      }
      else if (strategy==\"train_test\"){
        model.pred <- predict(model.fit, x_test, type = \"class\")
      }
      else {
        stop(\"strategy must be either \"train_test\" or \"cross_valid\"\")
      }
      
      print(length(y_test))
      print(length(model.pred))
      result <- confusionMatrix(table(model.pred, y_test))
      
      if (metric == \"recall\"){
        recall <- result$byClass['Sensitivity']
        return(recall)
      }
      else if (metric == \"f1\"){
        f1 <- result$byClass['F1']
        return(f1)
      }
      else if (metric == \"accuracy\") {
        accuracy <- result$overall['Accuracy']
        return(accuracy)
      }
      else {
        stop(\"metric shoud be either \"accuracy\", \"recall\" or \"f1\"\")
      }
    }
  )
  
  ## Define the value of the list within the current environment.
  assign('this',me,envir=thisEnv)
  
  ## Set the name for the class
  class(me) <- append(class(me),\"DSLclassifier\")
  return(me)
}

classifier<-DSLclassifier()
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
		else if (p.predict != "") return "classifier$doPrediction()"
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
