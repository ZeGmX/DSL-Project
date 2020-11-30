if [ $# -lt 1 ]
then
    echo "Use a .mldsl file as input"
    exit
else
    if [ ${1##*.} = mldsl ]
    then
        #echo "Starting the java project for the file $1..."
        #java -jar main.jar $1
        name=$1
        echo "Interpreting the compiled Python file..."
        python3 "${name//.mldsl/.py}"
        echo "Interpreting the compiled R file..."
        Rscript "${name//.mldsl/.r}"
    else
        echo "Input file is not a .mldsl file"
    fi
fi
