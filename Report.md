<div style="text-align: justify">

# Report of the DSL project

Lendy Mulot - Margot Masson

## Introduction

During our training at the SIF Master and as part of the DSL course, we learned more about DSLs and how to build them with Xtext. In addition to this course, we carried out a project to build a DSL. For this, we have chosen the subject "machine learning". We therefore had to build a DSL suitable for classification tasks, interpreted in R and Python.

First, we decided on the concrete and abstract grammar of our language. Then we implemented the different components, before testing them.

## Implementation of the ML-DSL

### Choice of the grammar

We have chosen a simple grammar, very refined but also human-readable. This grammar does not include a character used to mark the end of instructions and only has very few types (int, double, string). It is only suitable for the field of machine learning for classification tasks since it does not include loops or classic instructions but on the contrary has very specific functions such as `predict`, allowing to perform a prediction task on a dataset.

This grammar has evolved a lot throughout the project, and we have updated our meta model as it progresses. The final version of this meta model, whose concrete grammar was implemented in Xtext, can be seen below.

<p align="center">
    <img src="https://github.com/ZeGmX/DSL-Project/blob/main/report_images/Metamodel-v3.jpg?raw=true">
</p>

We can notice all the primitives, that facilitate the realization of classification tasks with very simple and explicit keywords. After implementing this grammar in Xtext, which automatically generates a parser, we also did a validator, that verify if the variables are defined before their use.

<p align="center">
    <img src="https://github.com/ZeGmX/DSL-Project/blob/main/report_images/screen_validator.png?raw=true">
</p>

Once the parser and the validator were defined, we could work on the files generation.

### Specifications

When making this DSL, we had to make several choices. First, the input CSV file should follow these rules:

- Having a comma or semicolon as a separator character
- Not having any missing values
- Having all the values numerical

Currently, the possible strategies are a train / test split or cross validation, the compatible algorithms for classification are SVM and random forest, and the metrics the DSL can compute are the accuracy, recall and F1 score.

Then, we decided that the user should not have to set every parameters if he does no need do. We dealt with that using default values. If not specified, they are as follow:  

- The algorithm is random tree
- The strategy is a train / test separation with 50% pf the dataset in each
- If the cross validation strategy is selected, the default number of sets is 3
- The column to predict is the last one
- All the other columns can be used to predict
- The default separator for the CSV file is the semicolon

Finally, the input CSV file is considered to have a header. You can still use a CSV file with no header but be aware that the first line will not be taken into account.

To use the tool, please refer to the `Readme.md` file.

### Implementation of the pretty printer, the compilers and the interpreter

The pretty printer was very simple to code for our project because we do not use loops so we do not need to indent instructions. The pretty print just generate a new version of the code without additional empty lines and puts spaces around instructions like "=".

For the two compilers, we had to lean more about Python and R, especially about R, and to find a way to make instructions easy to generate. We decided to use an object-oriented approach. So we implemented two "initial_file" that contain a "DSLClassifier" class that make all the job. We just had to transform the mldsl instruction into call of class methods.

The interpreter was pretty straightforward since the classification algorithm it uses is random. Thus the `use_algorithm` and `use_strategy` instructions have no consequences whatsoever. We needed class fields to keep track of the columns that should be used, the column to predict, the dataset and the metric to compute. Those fields are updated when the right statement is used. To interprete the `predict` keyword, we look at all the possible values in the column to predict (which represents the different classes) and for each entry of the dataset we pick one uniformly. We then implemented the computation of the different metric to compare the results.

### To go further

The object-oriented approach we used to implement the compilers allows us to easily add new metrics and algorithm (for instance in Python, we just have to add one line in the `metrics` or `classifiers` dictionnary in the `predict` method), solving part of the expression problem. Adding a new strategy can be a bit more tricky but should be doable too.

## Tests of the ML-DSL

### Tests of the pretty printer and the compilers

In order to test the generation of the pretty printed and compiled files, we created some input programs in our language, and we compared the generated files with oracles we had created. The test of the pretty printer did not pose a lot of problems and the comparison with a test oracle is enough to verify its good functioning.

The compilers needed more work because in addition to testing that the output corresponds to the oracle, we had to test that the output is syntactically correct in Python and R. We wanted to test the performance of the compilation, so we measured the exectution time of the r and py files generation. The following results are the mean execution time of creation of the Compiler object and the compilation of the input file for 1000 tries on a computer with the following specifications:

- CPU: Intel i5-4300U @ 1.90GHz 2.49GHz
- Memory: 4 Go
- OS: Windows 10
- Java: OpenJDK 13.0.1

The following experience measures the impact of the number of lines of the input on the execution time :

| Size of the input file (number of lines) | R compiler generation time (ms) | Python compiler generation time (ms) |
| ---------------------------------------- | ------------------------------- | ------------------------------------ |
| 10                                       | 138                             | 109                                  |
| 20                                       | 272                             | 138                                  |
| 40                                       | 571                             | 99                                   |
| 80                                       | 582                             | 160                                  |
| 160                                      | 1311                            | 355                                  |
| 320                                      | 3580                            | 1014                                 |
| 640                                      | 10952                           | 2840                                 |
| 1280                                     | 38264                           | 10548                                |
| 2560                                     | 132928                          | 35645                                |

We can notice that the R file is much longer to generate than the Python one. It can be explained by the fact that the initial R file is bigger than the initial Python file.

### Tests of the interpreters

To test the interpreter, we first tested its good functionning by unsing files targetting one particular keyword each. For each of them we verified that after interpreting each line, the corresponding field was set to the right value, and we did an additional test to check that if we interpret the whole file at once, the field value at the end is the right one.

We also wanted to test the performances of the interpreter with respect to the size of the dataset and the metric computed. The following results are the mean execution time of creation of the Interpreter object and the interpretation of the file for 10.000 tries on a computer with the following specifications:

- CPU: Intel i5-7200U (4) @ 3.100GHz
- Memory: 5847 MiB
- OS: Debian GNU/Linux 10 (buster) x86_64
- Java: OpenJDK 11.0.9

The first experience consist shows the load time (from a file containing only a `read` instruction) and the interpretation time for a file predicting for the two algorithms, the three metrics and the two strategies (in fact only the metric has an impact for the interpreter). The values are in milliseconds.

| Dataset size             | Load time (ms) | Every combination computation time (ms) |
| ------------------------ | -------------- | ---------------------------------------- |
| 15, 3 (manually created) | 15        | 26                                 |
| 150, 4 (iris dataset)    | 57        | 239                                |

The second experience focuses on the impact of the metric for a given dataset.

| Dataset size             | Metric   | Computation time (ms) |
| ------------------------ | -------- | --------------------- |
| 15, 3 (manually created) | F1       | 13                    |
| 15, 3 (manually created) | Recall   | 11                    |
| 15, 3 (manually created) | Accuracy | 11                    |
| 150, 4 (iris dataset)    | F1       | 84                    |
| 150, 4 (iris dataset)    | Recall   | 75                    |
| 150, 4 (iris dataset)    | Accuracy | 68                    |

We can see that the Recall and Accuracy take about as much time, which makes sense since the algorithm is pretty much the same to compute it. The F1 score takes a slightly higher time to compute.

We would to point out that this computation time can be function of other parameters, like the number of different classes.

## Cooperation with the other projects

We cooperated with the CSV project of Mathieu Poirier and Bastien Rousseau. We provided them with the dataset `data-individuals-very-tiny.csv` (containing information about gender, height, weight) we originally used to tests our compilers, and they used it to create two datasets:

* The first one replaced the gender randomly for each individual.
* The second one selected only the individuals with a height superior to 1.70m to get a biased dataset.

We then wrote a .mldsl file to compute every possible combination of strategy, algorithm and metric while predicting the gender and then we ran the compiled Python version giving us the following results:

<p align="center">
    <img src="https://github.com/ZeGmX/DSL-Project/blob/main/report_images/interop_initial.png?raw=true">
    Results for the initial file
</p>

<p align="center">
    <img src="https://github.com/ZeGmX/DSL-Project/blob/main/report_images/interop_biased.png?raw=true">
    Results for the biased file
</p>
<p align="center">
    <img src="https://github.com/ZeGmX/DSL-Project/blob/main/report_images/interop_random.png?raw=true">
    Results for the random file
</p>

As we can see, the initial dataset and the biased one got good scores while the random one got way less. We can also notice that the biased one got slightly lower scores, which makes sense since there was less data, and greater representation of one gender in the biased one. These tests tend to show the well functionning of our compiler, and of the compiler of Bastien and Mathieu. We would like to thank them for this cooperation.

They also provided us with their benchmark file that we used to predict the input size given the other parameters. We obtained the following results:

<p align="center">
    <img src="https://github.com/ZeGmX/DSL-Project/blob/main/report_images/interop_benchmark.png?raw=true">
    Results for the random file
</p>

We can see that the overall scores are not very high, but we want to point out that there was a lot of different possible classes comparet to the previous dataset (only two classes), and that the interpreter obtained between 0.04 and 0.06 scores using random classification , which is way less than the Python file.

## Conclusion

*TODO*
