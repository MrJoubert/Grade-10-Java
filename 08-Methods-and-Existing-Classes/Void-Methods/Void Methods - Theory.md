# Void Methods

## 1. Overview

A **method** is a named block of code that performs a specific task. Methods allow programmers to divide a program into smaller, manageable sections instead of placing all the instructions inside the `main` method.

In Java, a method declared with the keyword `void` performs a task but does not return a value to the statement that called it.

Void methods are useful for tasks such as:

- Displaying messages.
- Displaying menus.
- Printing calculated results.
- Performing a sequence of instructions.
- Organising a program into smaller sections.
- Reusing code without rewriting the same instructions.

For example, instead of writing the same welcome message several times, you can create a method called `displayWelcomeMessage()` and call it whenever needed.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain what a method is.
- Explain what the `void` keyword means.
- Identify the parts of a method declaration.
- Define and call a void method.
- Understand the purpose of the `main` method.
- Call a method more than once.
- Use void methods to organise a program.
- Distinguish between defining a method and calling a method.
- Identify and correct common method errors.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Creating and using methods.
- Modular programming and code reuse.
- Using existing classes and methods.
- Understanding method declarations and method calls.
- Developing structured solutions to programming problems.

The examples focus on foundational Grade 10 Java programming.

## 4. Understanding the `void` Keyword

The keyword `void` indicates that a method does not return a value.

Consider the following method:

```java
public static void displayMessage()
{
    System.out.println("Welcome to Java!");
}
```

This method displays a message whenever it is called.

The declaration contains several important parts:

| Component | Example | Purpose |
|---|---|---|
| Access modifier | `public` | Specifies where the method can be accessed from. |
| `static` keyword | `static` | Allows the method to be called without creating an object of its class. |
| Return type | `void` | Indicates that the method does not return a value. |
| Method name | `displayMessage` | Identifies the method. |
| Parameter list | `()` | Contains parameters, if any. |
| Method body | `{ ... }` | Contains the instructions executed by the method. |

For the examples in this topic, methods are declared `public static void` so they can be called directly from the `main` method.

## 5. Defining a Void Method

Defining a method means writing the method declaration and the instructions it will execute.

For example:

```java
public static void displayGreeting()
{
    System.out.println("Hello!");
    System.out.println("Welcome to the program.");
}
```

This defines a method called `displayGreeting`.

However, **defining a method does not automatically execute it**. The method must be called.

### Important rules

- The method must have a valid name.
- The return type must be specified.
- The method body must be enclosed in curly brackets.
- Statements inside the method execute when the method is called.
- A void method does not return a value.

## 6. Calling a Void Method

A method call tells Java to execute the instructions inside the method.

The general syntax for calling a static method without parameters is:

```java
methodName();
```

### Example: Define and call a method

```java
public class VoidMethodExample
{
    public static void main(String[] args)
    {
        displayGreeting();
    }

    public static void displayGreeting()
    {
        System.out.println("Hello!");
        System.out.println("Welcome to the program.");
    }
}
```

**Output:**

```text
Hello!
Welcome to the program.
```

### How the program works

1. Java starts executing the `main` method.
2. It encounters the statement `displayGreeting();`.
3. Java moves to the `displayGreeting()` method.
4. The statements inside that method execute.
5. When the method finishes, execution returns to the statement after the method call in `main`.

The method is defined outside `main`, but both methods belong to the same class.

## 7. Calling a Method More Than Once

One advantage of methods is that the same code can be reused.

### Example: Display a message three times

```java
public class RepeatedMethodExample
{
    public static void main(String[] args)
    {
        displayMessage();
        displayMessage();
        displayMessage();
    }

    public static void displayMessage()
    {
        System.out.println("Practise makes progress!");
    }
}
```

**Output:**

```text
Practise makes progress!
Practise makes progress!
Practise makes progress!
```

The message is written only once in the method definition, but the method is called three times.

This reduces duplication and makes the program easier to maintain.

## 8. Using Void Methods to Organise a Program

A longer program can be divided into methods, with each method responsible for a particular task.

### Example: Display a simple menu

```java
import javax.swing.JOptionPane;

public class MenuMethodExample
{
    public static void main(String[] args)
    {
        displayMenu();
    }

    public static void displayMenu()
    {
        String menu = "1 - Start\n"
            + "2 - Instructions\n"
            + "3 - Exit";

        JOptionPane.showMessageDialog(null, menu);
    }
}
```

The `displayMenu()` method is responsible for displaying the menu.

If the menu needs to be changed later, the programmer can update the method without searching through the rest of the program.

This is an example of **modular programming**: dividing a program into smaller sections, each with a clear responsibility.

## 9. Using Several Void Methods

A program can contain several methods, each responsible for a different task.

### Example: Display a heading and a message

```java
public class MultipleMethodsExample
{
    public static void main(String[] args)
    {
        displayHeading();
        displayInformation();
        displayFooter();
    }

    public static void displayHeading()
    {
        System.out.println("JAVA PROGRAMMING");
        System.out.println("-----------------");
    }

    public static void displayInformation()
    {
        System.out.println("Methods help organise code.");
    }

    public static void displayFooter()
    {
        System.out.println("End of program.");
    }
}
```

**Output:**

```text
JAVA PROGRAMMING
-----------------
Methods help organise code.
End of program.
```

Each method performs a separate task.

The `main` method controls the order in which these tasks are performed.

## 10. The `main` Method

Every standard standalone Java application begins execution in its `main` method.

The familiar declaration is:

```java
public static void main(String[] args)
{
    // Program instructions
}
```

The `main` method is itself a method.

Its declaration includes:

- `public`: allows the Java runtime to access it.
- `static`: allows it to be invoked without creating an instance of the class.
- `void`: means it does not return a value.
- `main`: the method name recognised as the application's entry point.
- `String[] args`: receives command-line arguments.

In Grade 10 programming, you will normally write your program instructions inside `main` and define additional methods in the same class.

## 11. Void Methods and Return Values

A void method performs a task but does not return a result to its caller.

For example:

```java
public static void displayTotal()
{
    int total = 10 + 20;

    System.out.println(total);
}
```

The method calculates and displays the total.

It does not send the value `30` back to the calling statement.

Compare this with a method that returns a value:

```java
public static int calculateTotal()
{
    int total = 10 + 20;

    return total;
}
```

The second method has the return type `int`, so it can return an integer to the statement that called it.

You will explore return types and return values in more detail in the topic on **Return Values and Return Types**.

For now, remember:

- `void` means no value is returned.
- `int` means an integer is returned.
- `double` means a decimal numeric value is returned.
- A method's return type determines the type of value it must return, if any.

## 12. Common Mistakes

### Mistake 1: Defining a method but never calling it

```java
public static void displayMessage()
{
    System.out.println("Hello!");
}
```

This method is defined, but it will not execute unless something calls it.

Correct:

```java
public static void main(String[] args)
{
    displayMessage();
}
```

### Mistake 2: Forgetting the parentheses

Incorrect:

```java
displayMessage;
```

Correct:

```java
displayMessage();
```

The parentheses are required for a method call, even when the method has no parameters.

### Mistake 3: Placing a method inside another method

Incorrect:

```java
public static void main(String[] args)
{
    public static void displayMessage()
    {
        System.out.println("Hello!");
    }
}
```

In Java, you cannot define one method inside another method.

Correct:

```java
public static void main(String[] args)
{
    displayMessage();
}

public static void displayMessage()
{
    System.out.println("Hello!");
}
```

Both methods are defined separately within the class.

### Mistake 4: Using the wrong return type

Incorrect:

```java
public static int displayMessage()
{
    System.out.println("Hello!");
}
```

This method declares that it returns an `int`, but it does not return an integer.

If the method only displays a message, use `void`:

```java
public static void displayMessage()
{
    System.out.println("Hello!");
}
```

### Mistake 5: Forgetting curly brackets

Incorrect:

```java
public static void displayMessage()
    System.out.println("Hello!");
```

Correct:

```java
public static void displayMessage()
{
    System.out.println("Hello!");
}
```

The method body must be enclosed in curly brackets.

### Mistake 6: Calling the wrong method name

Java is case-sensitive.

For example, `displayMessage()` and `DisplayMessage()` are different names. The method call must match the method declaration exactly.

## 13. Testing and Debugging

When working with void methods, check the following:

- Is the method defined correctly?
- Does it have the correct return type?
- Is the method name spelt correctly?
- Is the method called where required?
- Are the instructions inside the method correct?
- Does the method execute the correct number of times?
- Does the output match the expected result?

Test a method by calling it once and checking the output. Then call it several times to confirm that it can be reused.

If a message does not appear, check whether the method was actually called.

## 14. Practical Challenge

Create a Java program that uses three void methods to display information about a student.

### Requirements

1. Create a method called `displayHeading()` that displays a heading.
2. Create a method called `displayStudentDetails()` that displays a student's name, grade and subject.
3. Create a method called `displayFooter()` that displays an ending message.
4. Call all three methods from `main`.
5. Ensure that the methods execute in the correct order.
6. Use meaningful method names and readable output.

### Example output

```text
STUDENT INFORMATION
-------------------
Name: Alex
Grade: 10
Subject: Information Technology
-------------------
End of report.
```

### Extension challenge

Add a method called `displayWelcomeMessage()` and call it before the other three methods.

Then modify the program so that `displayStudentDetails()` is called twice.

Observe how the program reuses the same method without repeating its definition.

## 15. Key Takeaways

- A method is a named block of code that performs a task.
- A void method does not return a value.
- A method definition describes the instructions to execute.
- A method call causes those instructions to execute.
- Methods help divide programs into smaller, manageable sections.
- A method can be called multiple times.
- Methods must be defined separately, not inside other methods.
- The `main` method is the entry point of a standard Java application.
- Good method names and clear responsibilities make programs easier to understand and maintain.

## 16. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: Math Class](../Math-Class/README.md)
- **Current: Void Methods**
- [Next: Method Calls](../Method-Calls/README.md)
- [Back to Methods and Existing Classes](../README.md)
