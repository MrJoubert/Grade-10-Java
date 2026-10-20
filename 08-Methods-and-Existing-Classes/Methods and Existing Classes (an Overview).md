# Methods and Existing Classes

## Overview

Methods are an essential part of Java programming. They allow instructions to be grouped into reusable units, making programs easier to understand, maintain, test and extend.

Instead of writing the same instructions repeatedly, a programmer can create a method and call it whenever the operation is required. Methods can also divide a complicated problem into smaller, manageable tasks.

Java provides many existing classes containing useful methods. For example, the `Math` class provides methods for mathematical operations, while the `String` class provides methods for working with text.

Understanding methods and existing classes helps Students write more structured programs and reuse functionality rather than implementing every operation from scratch.

This topic introduces the fundamental concepts of methods, method calls, parameters, return values, local variables and code reuse at an appropriate introductory level for **Grade 10 Information Technology Students following the IEB curriculum**.

---

## Learning Objectives

By completing this topic, you should be able to:

- Explain the purpose of methods in Java.
- Distinguish between a method definition and a method call.
- Identify methods provided by existing Java classes.
- Use selected methods from the `Math` class.
- Explain the purpose of objects and built-in methods.
- Write and call simple `void` methods.
- Understand the role of parameters and arguments.
- Recognise method return types and return values.
- Identify the scope of local variables.
- Explain how methods improve code reuse and modularity.
- Trace the execution of a program that contains method calls.
- Identify common errors involving method declarations, calls and return types.

---

## Curriculum Alignment

This topic supports the Grade 10 Java concepts associated with methods, objects, existing classes and the use of built-in functionality.

It also introduces the ideas of parameters, arguments, return types, return values, local scope and modular programming, which are important for understanding how methods are used to organise a program.

The exact depth of method implementation should follow the distinction between the relevant IEB theoretical and practical requirements. This repository aims to explain the concepts clearly without assuming that every advanced method-writing technique is required at the same level.

**Curriculum note:** This repository is a supplementary learning resource. Students should use these notes alongside prescribed course material, practical activities and official IEB assessment guidance.

---

## Topic Structure

Work through the following eight subtopics in order.

| Subtopic | What You Will Learn |
|---|---|
| [Built-in Methods and Objects](Built-in-Methods-and-Objects/README.md) | Understand how existing Java classes and their methods provide reusable functionality. |
| [Math Class](Math-Class/README.md) | Use selected mathematical methods and constants provided by Java. |
| [Void Methods](Void-Methods/README.md) | Understand and create methods that perform an operation without returning a value. |
| [Method Calls](Method-Calls/README.md) | Understand how a method is invoked and how execution moves between methods. |
| [Parameters and Arguments](Parameters-and-Arguments/README.md) | Understand the difference between information defined in a method declaration and values supplied when calling it. |
| [Return Values and Return Types](Return-Values-and-Return-Types/README.md) | Understand how methods return results and how return types determine the kind of value produced. |
| [Scope and Local Variables](Scope-and-Local-Variables/README.md) | Understand where local variables are declared and where they can be accessed. |
| [Code Reuse and Modularity](Code-Reuse-and-Modularity/README.md) | Use methods to organise programs into smaller, reusable and understandable components. |

---

## 1. Understanding Methods

A **method** is a named block of code that performs a particular task.

Methods can be used to display messages, perform calculations, process information or carry out other operations.

For example, a program may need to display a heading several times. Instead of repeating the same output statements, the programmer can place them inside a method.

```java
public static void displayHeading() {
    System.out.println("====================");
    System.out.println("STUDENT INFORMATION");
    System.out.println("====================");
}
```

The method is defined once and can then be called whenever its functionality is needed.

A method definition does not automatically execute its body. The method must be called, either directly or through another part of the program.

---

## 2. Calling a Method

A method call instructs Java to execute the method.

Consider the following complete example:

```java
public class MethodExample {
    public static void main(String[] args) {
        displayMessage();
        displayMessage();
    }

    public static void displayMessage() {
        System.out.println("Welcome to Java!");
    }
}
```

Output:

```text
Welcome to Java!
Welcome to Java!
```

### Understanding the Example

1. Java begins executing the `main` method.
2. The first call to `displayMessage()` executes the statements in that method.
3. Control returns to `main` after the method finishes.
4. The second call executes the same method again.
5. The program finishes when the statements in `main` have been completed.

This demonstrates code reuse: one method definition can be executed multiple times.

---

## 3. Existing Classes and Built-in Methods

Java includes a large standard library of classes that provide functionality for common programming tasks.

A class groups related functionality and can provide methods that programmers use in their own applications.

Examples include:

| Class | Example Method | Purpose |
|---|---|---|
| `String` | `length()` | Determines the number of UTF-16 code units in a String. |
| `String` | `toUpperCase()` | Returns a String with its letters converted to uppercase where applicable. |
| `Math` | `sqrt()` | Calculates a square root. |
| `Math` | `pow()` | Calculates a value raised to a specified power. |
| `Math` | `abs()` | Returns the absolute value of a numeric argument. |

For example:

```java
String word = "Computer";

System.out.println(word.length());
System.out.println(word.toUpperCase());
```

Output:

```text
8
COMPUTER
```

The program uses existing methods rather than implementing the operations itself.

### Classes and Objects

Java is an object-oriented language. An object is an instance of a class and can provide access to instance methods and data.

For example, a String variable refers to a String object, allowing methods such as `length()` to be called on that value.

Some methods, including many methods in the `Math` class, are `static`. Static methods are called using the class name rather than an instance of that class.

Understanding this distinction helps you recognise the correct way to call a method.

---

## 4. The Math Class

The `Math` class provides methods and constants for common mathematical operations.

It is part of Java's standard library and can be used without creating a `Math` object.

### Example

```java
double number = 25.0;

double squareRoot = Math.sqrt(number);
double power = Math.pow(2, 3);
double absoluteValue = Math.abs(-12);

System.out.println(squareRoot);
System.out.println(power);
System.out.println(absoluteValue);
```

Output:

```text
5.0
8.0
12
```

The methods perform the following operations:

- `Math.sqrt(number)` calculates the square root of `number`.
- `Math.pow(2, 3)` calculates \(2^3\).
- `Math.abs(-12)` returns the absolute value of `-12`.

The `Math` class also provides constants such as `Math.PI`, which represents an approximation of pi.

### Practical Application

The following example calculates the area of a circle.

```java
double radius = 5.0;
double area = Math.PI * Math.pow(radius, 2);

System.out.println(area);
```

Output:

```text
78.53981633974483
```

The example combines a mathematical constant, a method call and arithmetic operators to solve a practical problem.

---

## 5. Void Methods

A `void` method performs an operation without returning a value to the caller.

It is useful when the purpose of a method is to carry out an action, such as displaying output.

### Example

```java
public static void displayWelcome() {
    System.out.println("Welcome to the program!");
}
```

The keyword `void` indicates that the method does not return a value.

The method can be called as follows:

```java
displayWelcome();
```

A `void` method may accept parameters, but a simple method with no parameters is a useful starting point.

### Why Use Void Methods?

Void methods help organise programs into smaller tasks.

For example, a program might have separate methods to display a heading, display instructions and display a summary. Each method can be called when its functionality is required.

This makes the program easier to read and maintain.

---

## 6. Parameters and Arguments

Methods can receive information from the code that calls them.

A **parameter** is a variable specified in a method declaration. An **argument** is the value or expression supplied when the method is called.

For example:

```java
public static void displayMark(int mark) {
    System.out.println("Mark: " + mark);
}
```

In this declaration, `mark` is a parameter.

The method can be called with different arguments:

```java
displayMark(75);
displayMark(92);
```

Output:

```text
Mark: 75
Mark: 92
```

The same method can process different values without requiring a separate method definition for every mark.

Parameters therefore support flexibility and code reuse.

---

## 7. Return Types and Return Values

Some methods calculate or produce a result that the calling code needs to use.

A **return type** specifies the type of value a method returns. A **return value** is the actual value produced by that method.

Consider the following example:

```java
public static int calculateTotal(int first, int second) {
    return first + second;
}
```

The method has an `int` return type because it returns an integer result.

It can be called as follows:

```java
int total = calculateTotal(30, 45);

System.out.println(total);
```

Output:

```text
75
```

The method calculates the sum and returns the result to the calling code.

Compare this with a `void` method, which performs an operation but does not return a value.

The distinction between void methods and methods that return values is important when deciding how to structure a program.

---

## 8. Scope and Local Variables

The **scope** of a variable describes the part of the program in which that variable can be accessed.

A local variable is declared inside a method or another block and is generally accessible only within its relevant scope.

For example:

```java
public static void displayMessage() {
    String message = "Hello!";
    System.out.println(message);
}
```

The variable `message` is local to the method's block. Code outside that scope cannot directly access it.

Local variables must be initialised before their values are read.

Understanding scope helps prevent errors involving variables declared in one method but used incorrectly in another.

---

## 9. Code Reuse and Modularity

**Modularity** means dividing a program into smaller, logically organised components.

Methods support modularity by allowing each method to perform a particular task.

For example, a program that calculates examination results might contain separate methods for:

- Calculating a total.
- Calculating an average.
- Determining whether a Student has passed.
- Displaying the results.

Each method has a clear responsibility.

This approach offers several advantages:

- Repeated code can be reduced.
- Individual tasks are easier to understand.
- Errors can be isolated more easily.
- Changes can be made to one method without unnecessarily rewriting the entire program.
- Code becomes easier to test and maintain.

Good method design encourages programmers to give each method a clear purpose and a meaningful name.

---

## 10. Common Errors

### Error 1: Defining a method but never calling it

A method definition alone does not cause its body to execute. The method must be called.

### Error 2: Calling a method using the wrong name

Java is case-sensitive. A method named `displayMessage()` is different from `DisplayMessage()`.

### Error 3: Calling a method with the wrong arguments

The number and types of arguments must be compatible with the method's parameters.

### Error 4: Returning a value from a void method

A `void` method cannot return a value in the same way as a method declared with a non-void return type.

### Error 5: Failing to return the required value

A method declared with a non-void return type must return a suitable value on every execution path that completes normally.

### Error 6: Accessing a local variable outside its scope

A local variable cannot be accessed from code outside its declared scope.

### Error 7: Confusing instance and static methods

Instance methods are called on an appropriate object, while static methods can be called using the class name. The correct form depends on how the method is declared.

---

## 11. Recommended Study Approach

For each subtopic:

1. Identify the purpose of the method or class.
2. Read the method declaration and identify its return type and parameters.
3. Trace the method call and follow the flow of execution.
4. Predict the output before running the code.
5. Change the arguments and observe how the results differ.
6. Distinguish between methods that return values and methods declared as `void`.
7. Practise writing small methods with a single, clear responsibility.
8. Explain how the method improves the structure or reusability of the program.

Understanding the purpose of a method is more important than memorising its syntax alone.

---

## 12. Practical Challenge

Create a Java program called `MethodPractice` that:

1. Contains a `void` method that displays a welcome message.
2. Contains a method that receives an integer mark and displays it.
3. Contains a method that receives two integers and returns their total.
4. Uses the `Math` class to calculate the square root of a positive number.
5. Calls each method from `main`.
6. Displays the results using meaningful output messages.

Use descriptive method and variable names.

**Extension:** Explain the difference between a parameter and an argument, and between a `void` method and a method that returns an integer.

---

## 13. Key Takeaways

By the end of this topic, you should understand that:

- Methods group instructions into reusable units.
- A method definition describes what a method does.
- A method call causes the method to execute.
- Existing Java classes provide useful functionality through their methods.
- The `Math` class provides common mathematical operations.
- A `void` method does not return a value.
- Parameters allow methods to receive information.
- Return types specify the type of value produced by a method.
- Local variables are restricted to their relevant scope.
- Methods support code reuse, modularity and maintainability.

These concepts provide a foundation for writing structured Java programs and preparing for more advanced object-oriented programming.

---

## Navigation

[**← Previous: Selection and Loops**](../07-Selection-and-Loops/README.md)

[**Next: Algorithms and Problem Solving →**](../09-Algorithms-and-Problem-Solving/README.md)

[Return to the Grade 10 Java repository](../README.md)
