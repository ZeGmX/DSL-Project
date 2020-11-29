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
        stopifnot(0 <= i)
        stopifnot(i <= length(dataset))
        assign("use_column",append(use_column,list(i)),thisEnv)
      }
    },
    
    remove_columns=function(cols){
      res=use_column
      for (i in cols){
        stopifnot(0 <= i)
        stopifnot(i <= length(dataset))
        j=1
        while (j <=length(res)){
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
      predicted_column <- predict_column + 1
    
      j<-1
      
      while (j <= length(used_columns)){
        used_columns[[j]]<-used_columns[[j]]+1
        j<-j+1
      }
      
      
      # Removes the duplicates from the columns list
      doublons<-which(duplicated(used_columns))
      if (length(doublons)>0){
        used_columns<-used_columns[-doublons]
      }
      
      # Build train_columns = list of the columns used to train the model (without predict_column)
      train_columns <- used_columns
      
      if (!(predicted_column %in% used_columns)){
        used_columns<-append(used_columns,list(predicted_column))
      }
      
      else {
        train_columns[[match(predicted_column,used_columns)]]<-NULL
      }
      
      # Transforms the list into vectors 
      used_columns <- unlist(used_columns)
      train_columns <- unlist(train_columns)
      
      used_dataset <- subset(used_dataset, select= used_columns)
      
      col_names <- names(dataset)
      used_col_names <- names(used_dataset)
      former_predict_name <- col_names[predicted_column]
      indexOfPredict <- match(former_predict_name,used_col_names)
      used_col_names[[indexOfPredict]]<-"Predict"
      colnames(used_dataset) <- used_col_names
      
      
      trainIndex <- caret::createDataPartition(used_dataset$Predict, p=train_test_ratio, list = FALSE)
      
      
      trainingData <- used_dataset[trainIndex,] # creation du jeu de donnÃ©es "train"
      
      
      testingData <- used_dataset[-trainIndex,] # creation du jeu de donnÃ©es "test"
      
      
      j<-1
      
      while (j <= length(train_columns)){
        former_name <- col_names[train_columns[[j]]]
        index <- match(former_name,used_col_names)
        train_columns[[j]]<-index
        j<-j+1
      }
      
      train_columns <- unlist(train_columns)
      
      x_test <- testingData[,train_columns]
      y_test <- testingData[,indexOfPredict]

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
        ctrl <- trainControl(method = "repeatedcv", repeats = cross_valid_nb, savePred=T)
        if (algo == "svm"){
          model.fit <- train(as.factor(Predict)~., data=trainingData, method = "svmLinear", trControl = ctrl)
        }
        else if (algo=="tree"){
          model.fit <- train(as.factor(Predict)~., data=trainingData, method = "rpart", trControl = ctrl)
        }
        model.pred <- model.fit$pred$pred
        y_test <- model.fit$pred$obs
      }
      else if (strategy=="train_test"){
        model.pred <- predict(model.fit, x_test, type = "class")
      }
      else {
        stop("strategy must be either \"train_test\" or \"cross_valid\"")
      }
      
      cm = as.matrix(table(model.pred, y_test))
      n = sum(cm) # number of instances
      nc = nrow(cm) # number of classes
      diag = diag(cm) # number of correctly classified instances per class 
      rowsums = apply(cm, 1, sum) # number of instances per class
      colsums = apply(cm, 2, sum) # number of predictions per class
      
      
      if (metric == "recall"){
        recall<-mean(diag / rowsums)
        if (is.na(recall)){
          recall<-0
        }
        score<-recall
      }
      
      else if (metric == "f1"){
        precision = diag / colsums 
         recall = diag / rowsums 
         f1 <- mean(2 * precision * recall / (precision + recall))
        if (is.na(f1)){
          f1<-0
        }
        score<-f1
      }
      
      else if (metric == "accuracy") {
        accuracy<-sum(diag) / sum(cm)
        if (is.na(accuracy)){
          accuracy<-0
        }
        score<-accuracy
      }
      else {
        stop("metric shoud be either \"accuracy\", \"recall\" or \"f1\"")
      }
      
      cat("For the",algo,"algorithm, and the",strategy,"strategy, we found a",metric)
      cat("-score of",score)
    }
  )
  
  ## Define the value of the list within the current environment.
  assign('this',me,envir=thisEnv)
  
  ## Set the name for the class
  class(me) <- append(class(me),"DSLclassifier")
  return(me)
}

classifier<-DSLclassifier()
classifier$read("C:/Users/Utilisateur/Documents/ESIR/ESIR3-SIF/DSL/ProjetGit/DSL-Project/ml.classification.dsl.tests/TestFiles/runPyR/iris.csv", ",")
classifier$add_columns(list(0, 1, 2))
classifier$remove_columns(list(2))
classifier$setPredict_column(3)
classifier$setAlgo("tree")
classifier$setMetric("f1")
classifier$setStrategy("train_test")
classifier$doPrediction()
