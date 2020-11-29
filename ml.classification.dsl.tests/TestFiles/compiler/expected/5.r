library(caret)
library(tidyverse)
library(e1071)
library(klaR)
library(rpart)
DSLclassifier <- function(algo = "tree",metric = "accuracy",strategy = "train_test",train_test_ratio = 0.5,cross_valid_nb = 3,predict_column = -1,use_column = list(),dataset=NULL)
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
      return(get("thisEnv",thisEnv))
    },
    
    ######### ACCESSORS #########
    
    getAlgo = function()
    {
      return(get("algo",thisEnv))
    },
    
    setAlgo = function(value)
    {
      return(assign("algo",value,thisEnv))
    },
    
    getMetric = function()
    {
      return(get("metric",thisEnv))
    },
    
    setMetric = function(value)
    {
      return(assign("metric",value,thisEnv))
    },
    
    getStrategy = function()
    {
      return(get("strategy",thisEnv))
    },
    
    setStrategy = function(value)
    {
      return(assign("strategy",value,thisEnv))
    },
    
    getTrain_test_ratio = function()
    {
      return(get("train_test_ratio",thisEnv))
    },
    
    setTrain_test_ratio = function(value)
    {
      return(assign("train_test_ratio",value,thisEnv))
    },
    
    getCross_valid_nb = function()
    {
      return(get("cross_valid_nb",thisEnv))
    },
    
    setCross_valid_nb = function(value)
    {
      return(assign("cross_valid_nb",value,thisEnv))
    },
    
    getPredict_column = function()
    {
      return(get("predict_column",thisEnv))
    },
    
    setPredict_column = function(value)
    {
      return(assign("predict_column",value,thisEnv))
    },
    
    getUse_column = function()
    {
      return(get("use_column",thisEnv))
    },
    
    setUse_column = function(value)
    {
      return(assign("use_column",value,thisEnv))
    },
    
    getDataset = function()
    {
      return(get("dataset",thisEnv))
    },
    
    setDataset = function(dataset)
    {
      return(assign("dataset",value,thisEnv))
    },
    
    ######### METHODS #########
    
    read = function(path, sep=",")
    {
      assign("dataset",read.csv(file=path,sep=sep,header = T, stringsAsFactors = F),thisEnv)
    },
    
    add_columns=function(cols){
      for (i in cols){
        stopifnot(1 <= i)
        stopifnot(i <= length(dataset))
        assign("use_column",append(use_column,list(i)),thisEnv)
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
      assign("use_column",res,thisEnv)
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
      col_names[predict_column]<-"Predict"
      colnames(used_dataset) <- col_names
      
      trainIndex <- caret::createDataPartition(used_dataset$Predict, p=train_test_ratio, list = FALSE)
      
      trainingData <- used_dataset[trainIndex,] # creation du jeu de données "train"
      
      testingData <- used_dataset[-trainIndex,] # creation du jeu de données "test"
      
      x_test <- testingData[,used_columns]
      y_test <- testingData[,predict_column]
      
      #if (algo == "bayes"){
      #  model.fit <- klaR::NaiveBayes(as.factor(Predict)~., data=trainingData)
      #  model.pred <- predict(model.fit, x_test, type = "class")
      #  model.pred <- model.pred$class
      #}
      
      if (algo == "svm"){
        model.fit <- svm(as.factor(Predict)~., data=trainingData, kernel="linear",scale=F)
      }
      else if (algo=="tree"){
        model.fit <- rpart::rpart(as.factor(Predict)~., data=trainingData, method = 'class')
      }
      
      else {
        stop("algo must be either \"svm\" or \"tree\"")
      }
      
      
      if (strategy == "cross_valid"){
        model.pred <- predict(model.fit, x_test, type = "class")
      }
      else if (strategy=="train_test"){
        model.pred <- predict(model.fit, x_test, type = "class")
      }
      else {
        stop("strategy must be either \"train_test\" or \"cross_valid\"")
      }
      
      print(length(y_test))
      print(length(model.pred))
      result <- confusionMatrix(table(model.pred, y_test))
      
      if (metric == "recall"){
        recall <- result$byClass['Sensitivity']
        return(recall)
      }
      else if (metric == "f1"){
        f1 <- result$byClass['F1']
        return(f1)
      }
      else if (metric == "accuracy") {
        accuracy <- result$overall['Accuracy']
        return(accuracy)
      }
      else {
        stop("metric shoud be either \"accuracy\", \"recall\" or \"f1\"")
      }
    }
  )
  
  ## Define the value of the list within the current environment.
  assign('this',me,envir=thisEnv)
  
  ## Set the name for the class
  class(me) <- append(class(me),"DSLclassifier")
  return(me)
}

classifier<-DSLclassifier()
classifier$setStrategy("train_test")
classifier$setTrain_test_ratio(0.7)
classifier$setStrategy("cross_valid")
classifier$setStrategy("cross_valid")
classifier$setCross_valid_nb(6)
