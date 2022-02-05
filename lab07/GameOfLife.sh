jfx="--module-path ./lib --add-modules=javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.swing,javafx.web"
automata="src/unsw/automata"
test="src/unsw/test"

if [ "$1" == "--symlink" ]; then
    javac src/util/Symlink.java
    java -cp src/ util.Symlink
elif [ "$1" == "--test" ]; then
    javac $jfx $automata/*.java $test/*.java -cp "./lib/*"
    java $jfx -cp ./lib/*:src unsw.test.GameOfLifeTest
    # rm $automata/*.class
    # rm $test/*.class
else
    javac $jfx $automata/*.java -cp "./lib/*"
    java $jfx -cp ./lib/*:src/ unsw.automata.GameOfLifeApplication
    # rm $automata/*.class
fi
