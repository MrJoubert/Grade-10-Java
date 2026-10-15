# Method Calls

## 1. Overview

A **method call** is an instruction that tells Java to execute a method. Methods allow programmers to divide a program into smaller tasks, reuse code and make programs easier to understand.

In Java, a method can be called to perform an action, calculate a result or obtain information from an object.

For example:

```java
displayMessage();
```

This statement calls a method named `displayMessage`.

A method call can also include arguments:

```java
double answer = Math.sqrt(25);
```

Here, `Math.sqrt(25)` calls an existing Java method and stores its returned value in `answer`.

Understanding how method calls work is essential when using built-in Java methods and writing your own methods.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain what a method call is.
- Distinguish between defining and calling a method.
- Call methods with and without arguments.
- Call methods that return values.
- Call void methods.
- Understand how program execution moves between methods.
- Call static methods using a class name.
- Call instance methods using an object.
- Identify common method-call errors.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Calling existing methods.
- Defining and calling methods.
- Code reuse and modular programming.
- Using objects and built-in classes.
- Understanding parameters, arguments and return values.
- Tracing program execution.

The examples focus on foundational Grade 10 Java programming.

## 4. What Is a Method Call?

A method call is a statement or expression that invokes a method.

Consider this method:

```java
public static void displayMessage()
{
    System.out.println("Welcome to Java!");
}
```

This is the **method definition**. It specifies what happens when the method executes.

To execute the method, call it:

```java
displayMessage();
```

### Complete example

```java
public class MethodCallExample
{
    public static void main(String[] args)
    {
        displayMessage();
    }

    public static void displayMessage()
    {
        System.out.println("Welcome to Java!");
    }
}
```

**Output:**

```text
Welcome to Java!
```

### How execution works

1. Java begins executing `main`.
2. Java reaches `displayMessage();`.
3. Execution moves to the `displayMessage()` method.
4. The statements inside the method execute.
5. The method finishes.
6. Execution returns to the statement after the method call in `main`.

This movement between methods allows a program to be divided into separate tasks.

## 5. Calling a Void Method

A void method performs a task without returning a value.

The general syntax for calling a static void method with no parameters is:

```java
methodName();
```

### Example: Display a heading

```java
public class HeadingExample
{
    public static void main(String[] args)
    {
        displayHeading();

        System.out.println("Student details follow.");
    }

    public static void displayHeading()
    {
        System.out.println("STUDENT REPORT");
        System.out.println("----------------");
    }
}
```

**Output:**

```text
STUDENT REPORT
----------------
Student details follow.
```

The method call executes both statements inside `displayHeading()`. When the method finishes, the program continues with the next statement in `main`.

**Remember:** Even though a void method does not return a value, it can still display output, change an object's state or perform another task.

## 6. Calling a Method More Than Once

A method can be called repeatedly without redefining it.

### Example: Reuse a method

```java
public class ReuseMethodExample
{
    public static void main(String[] args)
    {
        displayLine();
        System.out.println("First section");

        displayLine();
        System.out.println("Second section");

        displayLine();
    }

    public static void displayLine()
    {
        System.out.println("--------------------");
    }
}
```

**Output:**

```text
--------------------
First section
--------------------
Second section
--------------------
```

The method `displayLine()` is defined once but called three times.

This is an example of code reuse.

## 7. Calling Methods with Arguments

Some methods require information to be supplied when they are called.

An **argument** is the value supplied to a method call.

For example:

```java
double answer = Math.pow(2, 3);
```

The arguments are `2` and `3`.

They specify the base and exponent for the calculation.

**Output:**

```text
8.0
```

Another example is:

```java
String name = "Alex";

System.out.println(name.substring(0, 2));
```

**Output:**

```text
Al
```

The method `substring(0, 2)` receives two integer arguments. It returns the characters beginning at index 0 and ending before index 2.

Arguments allow a method to work with different values each time it is called.

## 8. Calling Methods That Return Values

Some methods calculate or obtain a value that can be used elsewhere in the program.

### Example: Calculate a square root

```java
public class ReturnValueCallExample
{
    public static void main(String[] args)
    {
        double answer;

        answer = Math.sqrt(64);

        System.out.println("Answer: " + answer);
    }
}
```

**Output:**

```text
Answer: 8.0
```

The method call `Math.sqrt(64)` returns a `double`.

The returned value is assigned to the variable `answer`.

A method call that returns a value can also be used directly in an expression.

For example:

```java
System.out.println(Math.sqrt(81));
```

**Output:**

```text
9.0
```

You do not always need to store a returned value in a separate variable.

## 9. Using a Method Call in a Calculation

A method call can form part of a larger expression.

### Example: Calculate the area of a circle

The formula for the area of a circle is:

\[
A = \pi r^2
\]

Java provides `Math.PI` and `Math.pow()` for this calculation.

```java
public class CircleAreaExample
{
    public static void main(String[] args)
    {
        double radius = 4;
        double area;

        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area: " + area);
    }
}
```

**Output:**

```text
Area: 50.26548245743669
```

The method call `Math.pow(radius, 2)` calculates the square of the radius. Its returned value is multiplied by `Math.PI`.

This demonstrates how method calls can be combined with variables and operators.

## 10. Calling Instance Methods and Static Methods

Java methods are not all called in the same way.

### 10.1 Instance methods

An instance method is called using an object.

```java
String word = "Java";

int numberOfCharacters = word.length();

System.out.println(numberOfCharacters);
```

**Output:**

```text
4
```

The method `length()` is called on the `word` object.

### 10.2 Static methods

A static method can be called using the class name.

```java
double answer = Math.sqrt(100);

System.out.println(answer);
```

**Output:**

```text
10.0
```

The method `sqrt()` belongs to the `Math` class and is called using `Math.sqrt()`.

### Comparison

| Instance method | Static method |
|---|---|
| Called using an object | Called using the class name |
| Example: `word.length()` | Example: `Math.sqrt(100)` |
| Operates in the context of an object | Does not require a particular object instance |

The correct calling style depends on how the method is defined.

## 11. Calling One User-Defined Method from Another

A method can call another method. This allows a program to be organised into a hierarchy of tasks.

### Example: Display a report

```java
public class ReportExample
{
    public static void main(String[] args)
    {
        displayReport();
    }

    public static void displayReport()
    {
        displayHeading();
        displayDetails();
        displayFooter();
    }

    public static void displayHeading()
    {
        System.out.println("STUDENT REPORT");
        System.out.println("----------------");
    }

    public static void displayDetails()
    {
        System.out.println("Grade: 10");
        System.out.println("Subject: Information Technology");
    }

    public static void displayFooter()
    {
        System.out.println("----------------");
        System.out.println("End of report.");
    }
}
```

**Output:**

```text
STUDENT REPORT
----------------
Grade: 10
Subject: Information Technology
----------------
End of report.
```

### How it works

1. `main` calls `displayReport()`.
2. `displayReport()` calls `displayHeading()`.
3. After the heading is displayed, `displayReport()` calls `displayDetails()`.
4. It then calls `displayFooter()`.
5. Once all three methods finish, execution returns to `main`.

The method `displayReport()` acts as a coordinator for the other methods.

## 12. Understanding the Order of Execution

The order in which methods are called determines the order in which their instructions execute.

Consider:

```java
public class ExecutionOrderExample
{
    public static void main(String[] args)
    {
        System.out.println("A");
        displayB();
        System.out.println("C");
    }

    public static void displayB()
    {
        System.out.println("B");
    }
}
```

**Output:**

```text
A
B
C
```

The call to `displayB()` interrupts the normal sequence of statements in `main`. Once the method finishes, execution returns to `main` and continues with `"C"`.

When tracing method calls, always follow the statements in the order in which they execute.

## 13. Common Mistakes

### Mistake 1: Defining a method without calling it

A method definition does not automatically execute.

If a method must display a message, make sure the program includes the appropriate method call.

### Mistake 2: Forgetting parentheses

Incorrect:

```java
displayMessage;
```

Correct:

```java
displayMessage();
```

The parentheses are required even when no arguments are supplied.

### Mistake 3: Using the wrong method name

Java is case-sensitive.

```java
displayMessage();
```

and

```java
DisplayMessage();
```

are different method names.

The method call must match the declaration.

### Mistake 4: Ignoring a returned value

Consider:

```java
Math.sqrt(25);
```

This calls the method, but the returned value is not stored or displayed.

If you need the result, use it:

```java
double answer = Math.sqrt(25);
```

### Mistake 5: Using a void method as though it returns a value

A void method cannot be used as a value in an assignment.

For example, a method declared as `public static void displayMessage()` cannot be assigned to an integer variable.

### Mistake 6: Calling an instance method incorrectly

For example, `length()` is an instance method of `String`.

Use:

```java
String word = "Java";

System.out.println(word.length());
```

Do not call it as `String.length()`.

## 14. Testing and Debugging

When testing method calls, check the following:

- Is the method defined?
- Is the method called where required?
- Is the correct method name used?
- Are the required arguments supplied?
- Is the method called using the correct object or class?
- Does the method return a value, and is that value used correctly?
- Does execution return to the calling method as expected?

To practise tracing, write down the order of every output statement in a program that calls several methods.

If the output appears in the wrong order, examine the sequence of method calls.

## 15. Practical Challenge

Create a Java program that displays a simple student report using several methods.

### Requirements

1. Define a method called `displayHeading()`.
2. Define a method called `displayStudentDetails()`.
3. Define a method called `displaySubjectDetails()`.
4. Define a method called `displayFooter()`.
5. Call these methods in the correct order from a method called `displayReport()`.
6. Call `displayReport()` from `main`.
7. Each method must perform a clearly defined task.
8. Use meaningful method names and readable output.

### Expected output

```text
STUDENT REPORT
--------------------
Student: Alex
Grade: 10
Subject: Information Technology
--------------------
End of report.
```

### Extension challenge

Add a method that displays the current student's mark and another method that displays whether the mark is a pass.

Call both methods from `displayReport()`.

## 16. Key Takeaways

- A method call invokes a method.
- Defining a method does not automatically execute it.
- Void methods perform tasks without returning values.
- Methods that return values can be used in assignments and expressions.
- Arguments supply information to a method.
- Instance methods are called using objects.
- Static methods can be called using class names.
- One method can call other methods.
- Execution returns to the calling method when a method finishes.
- Understanding method calls is essential for writing modular Java programs.

## 17. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: Void Methods](../Void-Methods/README.md)
- **Current: Method Calls**
- [Next: Parameters and Arguments](../Parameters-and-Arguments/README.md)
- [Back to Methods and Existing Classes](../README.md)
