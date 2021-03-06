"""
classification
"""

import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.model_selection import cross_val_predict
from sklearn.svm import SVC
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, recall_score, f1_score


class DSL_Classifier:
    """
    fields:
        algo: string -> the name of the algorithm we want to use
        metric: string -> the metric we want to compute
        strategy: string -> wether we do train/test or cross validation
        train_test_ratio: float -> if strategy="train_test", this is the ratio
            of the dataset that will be used as a train set
        cross_valid_nb: int -> if strategy="cross_validation", this is the
            number of sets that will be used
        predict_column: int -> the index of the column used as a result
        use_column: int set -> the indices of the columns that can be use to
            predict
        dataset: numpy array -> the last dataset loaded
    """

    def __init__(self):
        """
        Initialize the fields with their defaul values
        --
        input:
            None
        --
        output:
            None
        """
        self.algo = "tree"
        self.metric = "accuracy"
        self.strategy = "train_test"
        self.train_test_ratio = 0.5
        self.cross_valid_nb = 3
        self.predict_column = -1
        self.use_column = set()
        self.dataset = np.array(())

    def read(self, path, sep=","):
        """
        Loads the CSV file into the dataset field
        --
        input:
            path: string -> path to the csv file
            sep: string -> delimiter between two values
        --
        output:
            None
        """
        self.dataset = np.genfromtxt(path, delimiter=sep, skip_header=1)
        # -1 because one column (the last one by default) is predicted
        self.predict_column = len(self.dataset[0]) - 1
        self.use_column = set(range(len(self.dataset[0]) - 1))

    def add_columns(self, cols):
        """
        Adds predictive columns
        --
        input:
            cols: int list -> the indices of the columns we want to add
        --
        output:
            None
        """
        for index in cols:
            assert 0 <= index < len(self.dataset[0]), f"Index out of range, got {str(index)} for a dataset of size {len(self.dataset[0])}"
            self.use_column.add(index)

    def remove_columns(self, cols):
        """
        Remove predictive columns
        --
        input:
            cols: int list -> the indices of the columns we want to remove
        --
        output:
            None
        """
        for index in cols:
            assert 0 <= index < len(self.dataset[0]), f"Index out of range, got {str(index)} for a dataset of size {len(self.dataset[0])}"
            self.use_column.discard(index)

    def predict(self):
        """
        Use a machine learnig algorithm to classify according to the fields of
        the object
        --
        input:
            None
        --
        output:
            None
        """
        assert 0 <= self.predict_column < len(self.dataset[0]), f"Index out of range, got predictive index {self.predict_column} for a size {len(self.dataset[0])} dataset"

        classifiers = { "svm": SVC(kernel="linear", C=0.025),
                        "tree": DecisionTreeClassifier(max_depth=5)}

        metrics = { "accuracy": accuracy_score,
                    "recall": lambda x, y: recall_score(x, y, average="micro"),
                    "f1": lambda x, y: f1_score(x, y, average="micro")}

        # Setting the classifier according to the algorithm
        if self.algo in classifiers:
            clf = classifiers[self.algo]
        else:
            raise ValueError("algo must be either \"svm\" or \"tree\"")

        # Setting the metric
        if self.metric in metrics:
            metric = metrics[self.metric]
        else:
            raise ValueError("metric shoud be either \"accuracy\", \"recall\" or \"f1\"")

        expected = self.dataset[:, self.predict_column]
        others = np.zeros(len(self.dataset[0]), dtype=np.bool)
        others[list(self.use_column)] = True
        data = self.dataset[:, others]

        if self.strategy == "train_test":
            assert 0 <= self.train_test_ratio <= 1, f"Train/test ratio should be between 0 and 1, got {self.train_test_ratio}"

            X_train, X_test, y_train, expected = train_test_split(data, expected,
                                              train_size=self.train_test_ratio)
            clf.fit(X_train, y_train)
            predicted = clf.predict(X_test)

        elif self.strategy == "cross_valid":
            assert self.cross_valid_nb > 1, f"The number of folds in cross-validation should be greater or equal to 2, got {self.cross_valid_nb}"

            predicted = cross_val_predict(clf, data, y=expected,
                                          cv=self.cross_valid_nb)

        else:
            raise ValueError("strategy must be either \"train_test\" or \"cross_valid\"")

        res = metric(expected, predicted)
        print(f"For the {self.algo} algorithm, and the {self.strategy} strategy, we found a {self.metric}-score of {res}")


classifier = DSL_Classifier()
classifier.read("database.csv", ";")
classifier.add_columns([1, 2])
classifier.remove_columns([3, 4, 5])
classifier.remove_columns([9])
classifier.predict_column = 4
classifier.algo = "tree"
classifier.metric = "f1"
classifier.strategy = "cross_valid"
classifier.predict()
classifier.read("database2.csv", "null")
classifier.add_columns([4, 5])
classifier.remove_columns([6])
classifier.predict()
