<div style="text-align: justify">

## Goal of our language

Given a CSV dataset our language gives the ability to use a classification algorithm to predict a column and output the metric relating the closeness of the results.

## How to write a .mldsl file

A .mldsl consists in a list of statements.

* `read path sep`: loads a csv dataset
* `use_column int+`: uses the columns at index specified to predict
* `unuse_column int+`: do not use the columns at index specified to predict
* `predict_column int`: selects the column to predict
* `use_strategy strat args`: selects the strategy to use for the prediction
* `use_algorithm algo`: selects the algorithm that will predict the output given the input
* `use_metric metric`: selects the metric that will be computed between the original column and the predicted one
* `predict`: starts a computation

To select columns, a dataset has to be loaded.  
Indexes start at 0.  
When loading a dataset, you cannot use the previous one anymore.

For additional information please refer to the `Report.md`.

## Requirements

To run the R compiled file you will need to run the following command in an R environment to install the required packages: `install.packages(c("caret", "tidyverse", "e1071", "klaR", "rpart"))`  
To run the Python compiled file you will need to run the following command in a terminal to install the required packages: `pip3 install numpy sklearn`

## How to test

When you have your .mldsl file ready you need to open a terminal and go to the `DSL-Project/` folder and then run the `./run.sh absolute/path/to/the/file.mldsl` command. If it is not executable, you can run `chmod 755 run.sh`.  

This script should pretty-print your file, run the interpreter, generate the compiled file in Python and R (in the same folder as the original .mldsl file) and execute them.

</div>
