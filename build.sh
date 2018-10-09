# Compiles all the classes
javac -classpath build/ -sourcepath src/ -d build/ $(find src -name "*.java")
