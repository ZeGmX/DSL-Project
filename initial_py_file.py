import numpy as np
import sklearn

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
        self.dataset = np.genfromtxt(path, delimiter=sep, names=True)
        self.use_all_columns_but_one = set(range(len(self.dataset) - 1))
        # -1 because one column (the last one by default) is predicted
        self.predict_column = len(self.dataset) - 1


    def add_columns(self, l):
        """
        Adds predictive columns
        --
        input:
            l: int list -> the indices of the columns we want to add
        --
        output:
            None
        """
        for index in l:
            assert 0 <= index < len(self.dataset[0]), f"Index out of range, \
got {str(index)} for a dataset of size {len(self.dataset[0])}"
            self.use_column.add(index)


    def remove_columns(self, l):
        """
        Remove predictive columns
        --
        input:
            l: int list -> the indices of the columns we want to remove
        --
        output:
            None
        """
        for index in l:
            assert 0 <= index < len(self.dataset[0]), f"Index out of range, got \
            {str(index)} for a dataset of size {len(self.dataset[0])}"
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
        assert 0 <= self.predict_column < len(self.dataset[0]), f"Index out of \
range, got predictive index {self.predict_column} for a size \
{len(self.dataset[0])} dataset"
        print("hey")
        # TODO




classifier = DSL_Classifier()
