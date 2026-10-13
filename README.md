# ICS4U1

Java exercises organized by unit and lesson, with no package declarations.

## Run in VS Code

1. Open this repository folder in VS Code with the Extension Pack for Java installed and a JDK available.
2. Let the Java extension import the lesson projects. After changing from the old layout, run **Developer: Reload Window** if needed.
3. Open a Java file with a `main` method and click **Run** or **Debug** above that method. Console input uses the integrated terminal.

Each lesson (and the Unit 1 assignment) is a separate Java project so repeated class names such as `Q3` and `Rectangle` do not conflict. The hidden `.project` and `.classpath` files provide this configuration; keep them in place. Helper classes run through the program that uses them. In Unit 2 Lesson 8, run the `main` methods in `RectangleTest` (in `Q2.java`) and `InvoiceTest` (in `Q3.java`).

## Run in a terminal

Compile the Java files for one lesson together, then run its main class:

```sh
cd unit2/lesson9
javac -d bin *.java
java -cp bin DateTest
```

Compile each lesson separately to avoid duplicate class names.
