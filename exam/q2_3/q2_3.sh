# Compile
sources="$(find . -name "*.java")"
javac $sources -cp "./lib/*"

# Execute
main="part2Q3.Main"
java -cp ./lib/*:src $main

# Clean
classes="$(find . -name "*.class")"
rm $classes
