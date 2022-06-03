# Makefile for MarkdownParse

CLASSPATH = lib/*:.

# Step 1: make MarkdownParse.class
MarkdownParse.class: MarkdownParse.java
	javac -cp $(CLASSPATH) MarkdownParse.java

# Step 2: make MarkdownParseTest.class
MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp $(CLASSPATH)  MarkdownParseTest.java

# Step 3: run test cases
test: MarkdownParseTest.class
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest


TryCommonMark.class: TryCommonMark.java
	javac -cp $(CLASSPATH) TryCommonMark.java