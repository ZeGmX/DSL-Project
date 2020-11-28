# Report of the DSL project

Lendy Mulot - Margot Masson

## Introduction

During our training at the SIF Master and as part of the DSL course, we learned more about DSLs and how to build them with Xtext. In addition to this course, we carried out a project to build a DSL. For this, we have chosen the subject "machine learning". We therefore had to build a DSL suitable for classification tasks, interpreted in R and Python.

First, we decided on the concrete and abstract grammar of our language. Then we implemented the different components, before testing them.

## Implementation of the ML-DSL

### Choice of the grammar

We have chosen a simple grammar, very refined but also human-readable. This grammar does not include a character used to mark the end of instructions and only has very few types (int, double, string). It is only suitable for the field of machine learning for classification tasks since it does not include loops or classic instructions but on the contrary very has specific functions such as "predict", allowing to perform a prediction task on a dataset.

This grammar has evolved a lot throughout the project, and we have updated our meta model as it progresses. The final version of this meta model, whose concrete grammar was implemented in Xtext, can be seen below.

We can notice all the primitives, that facilitate the realization of classification tasks with very simple and explicit keywords. After implementing this grammar in Xtext, which automatically generates a parser, we also did a validator, that verify if the variables are defined before their use.

- *TODO insérer screenshot validator*

Once the parser and the validator were defined, we could work on the files generation.

### Implementation of the pretty printer, the compilers and the interpreter

The pretty printer was very simple to code for our project because we do not use loops so we do not need to indent instructions. The pretty print just generate a new version of the code without additional empty lines and puts spaces around instructions like "=".

For the two compilers, we had to lean more about Python and R, especially about R, and to find a way to make instructions easy to generate. We decided to use an object-oriented approach. So we implemented two "initial_file" that contain a "DSLClassifier" class that make all the job. We just had to transform the mldsl instruction into call of class methods.

The interpreter... 

## Tests of the ML-DSL

### Tests of the pretty printer and the compilers

In order to test the generation of the pretty printed and compiled files, we created some input programs in our language, and we compared the generated files with oracles we had created. The test of the pretty printer did not pose a lot of problems and the comparison with a test oracle is enough to verify its good functioning.

The compilers needed more work because in addition to testing that the output corresponds to the oracle, we had to test that the output is syntactically correct in Python and R.

### Tests of the interpreters

## Cooperation with the other projects

We cooperated with the csv project of Mathieu Poirier.

## Conclusion
