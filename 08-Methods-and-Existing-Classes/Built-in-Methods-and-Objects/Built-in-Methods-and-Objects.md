# Built-in Methods and Objects

## 1. Overview

Java provides many existing classes and methods that allow programmers to perform common tasks without writing all the code themselves.

A **class** is a blueprint that defines the data and behaviour associated with a particular type of object or utility. An **object** is an instance of a class. A **method** is a named block of code that performs a particular task.

For example, Java provides:

- The `String` class for working with text.
- The `Math` class for performing mathematical calculations.
- The `JOptionPane` class for displaying dialog boxes and receiving user input.
- Methods such as `length()`, `toUpperCase()` and `sqrt()` for performing specific operations.

Using existing classes and methods makes programs shorter, clearer and easier to maintain.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain the difference between a class, an object and a method.
- Identify commonly used Java classes.
- Recognise and call built-in methods.
- Distinguish between instance methods and static methods.
- Use methods to perform calculations and manipulate text.
- Explain why reusing existing functionality is useful.
- Recognise the difference between calling a method and defining your own method.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Using existing classes and objects.
- Calling methods to perform specific tasks.
- Working with strings and mathematical operations.
- Developing modular and reusable solutions.
- Understanding methods as part of problem-solving.

The examples focus on foundational Java programming. The precise depth required for individual methods should be checked against the applicable IEB SAGS documentation.

## 4. Understanding Classes, Objects and Methods

### 4.1 What is a class?

A class defines a type of object or provides related functionality.

For example, Java's `String` class provides functionality for working with text.

```java
String name = "Alex";
```

Here, `String` is the class, and `name` is a variable that refers to a string object containing the text `"Alex"`.

The `Math` class provides mathematical methods, such as `Math.sqrt()` and `Math.pow()`.

### 4.2 What is an object?

An object is an instance of a class. Objects can have data and provide methods that operate on that data.

For example:

```java
String message = "Welcome";
```

The variable `message` refers to a `String` object.

You can call methods on this object to obtain information about or transform its text.

### 4.3 What is a method?

A method is a named operation that performs a task.

Consider:

```java
String message = "Welcome";

int length = message.length();

System.out.println(length);
```

**Output:**

```text
7
```

The method `length()` returns the number of characters in the string.

In this example:

- `message` identifies the object.
- `length()` is the method being called.
- `length` stores the returned integer value.

## 5. Calling a Method

A method call requests that a method perform its task.

The general pattern for calling an instance method is:

```java
objectName.methodName();
```

If the method requires information, that information is supplied inside the brackets as an argument.

For example:

```java
String name = "Alex";

System.out.println(name.toUpperCase());
```

**Output:**

```text
ALEX
```

The method `toUpperCase()` returns a new string containing the uppercase version of the original text.

### Methods that return values

Some methods produce a result that can be stored in a variable or used in a calculation.

```java
String word = "Computer";

int numberOfCharacters = word.length();

System.out.println(numberOfCharacters);
```

**Output:**

```text
8
```

The method returns an integer, which is assigned to `numberOfCharacters`.

### Methods that do not return a value

Some methods perform an action without returning a result.

For example, `JOptionPane.showMessageDialog()` displays a dialog box.

```java
import javax.swing.JOptionPane;

public class MethodExample
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(
            null,
            "Welcome to Java!"
        );
    }
}
```

The method displays a message. You do not assign its result to a variable.

## 6. Commonly Used Java Classes

The following classes are useful in Grade 10 programming.

| Class | Purpose | Example |
|---|---|---|
| `String` | Works with text | `name.length()` |
| `Math` | Performs mathematical operations | `Math.sqrt(25)` |
| `JOptionPane` | Displays dialog boxes and accepts input | `JOptionPane.showInputDialog(...)` |
| `Integer` | Provides operations related to the `int` type | `Integer.parseInt("25")` |
| `Double` | Provides operations related to the `double` type | `Double.parseDouble("12.5")` |
| `Character` | Provides operations for individual characters | `Character.toUpperCase('a')` |

Some methods require an object, while others can be called directly using the class name. The following sections explain this distinction.

## 7. Instance Methods and Static Methods

Java methods can be called in different ways, depending on how they are defined.

### 7.1 Instance methods

An instance method is called using an object.

For example:

```java
String text = "Java";

System.out.println(text.length());
```

The method `length()` is called on the `text` object.

### 7.2 Static methods

A static method belongs to the class rather than a particular object. It can be called using the class name.

For example:

```java
double answer = Math.sqrt(64);

System.out.println(answer);
```

**Output:**

```text
8.0
```

The method `sqrt()` is called using `Math.sqrt()` because it is a static method.

Another example is:

```java
int number = Integer.parseInt("42");

System.out.println(number);
```

**Output:**

```text
42
```

The static method `parseInt()` converts a numeric string to an integer.

### Comparison

| Instance method | Static method |
|---|---|
| Called using an object | Usually called using the class name |
| Operates in the context of an object | Belongs to the class itself |
| Example: `text.length()` | Example: `Math.sqrt(64)` |

**Important:** Do not assume every method can be called in the same way. Check whether the method is an instance method or a static method.

## 8. Methods with Arguments

An argument is a value supplied to a method when it is called.

For example:

```java
double result = Math.pow(2, 3);

System.out.println(result);
```

**Output:**

```text
8.0
```

The arguments are `2` and `3`. They tell `Math.pow()` to calculate 2 raised to the power of 3.

Another example:

```java
String name = "Alex";

System.out.println(name.substring(0, 2));
```

**Output:**

```text
Al
```

The method `substring(0, 2)` returns the characters starting at index 0 and ending just before index 2.

Remember that Java string indexes start at 0.

## 9. Using Existing Methods in a Program

Existing methods can be combined to solve a problem.

### Example: Calculate the square root of a number

```java
import javax.swing.JOptionPane;

public class SquareRootExample
{
    public static void main(String[] args)
    {
        double number;
        double answer;

        number = Double.parseDouble(
            JOptionPane.showInputDialog(
                "Enter a non-negative number:"
            )
        );

        answer = Math.sqrt(number);

        JOptionPane.showMessageDialog(
            null,
            "Square root: " + answer
        );
    }
}
```

If the user enters `81`, the program displays:

```text
Square root: 9.0
```

This program combines several existing methods:

1. `showInputDialog()` requests input.
2. `Double.parseDouble()` converts the input to a numeric value.
3. `Math.sqrt()` calculates the square root.
4. `showMessageDialog()` displays the result.

The example assumes that the user enters a valid non-negative number.

## 10. Common Mistakes

### Mistake 1: Forgetting the brackets

Incorrect:

```java
int length = text.length;
```

Correct:

```java
int length = text.length();
```

For a `String`, `length()` is a method and requires brackets.

### Mistake 2: Calling a method on the wrong type

Incorrect:

```java
int number = "25".sqrt();
```

A string does not provide a `sqrt()` method.

Correct:

```java
double answer = Math.sqrt(25);
```

### Mistake 3: Using the wrong conversion method

Incorrect:

```java
int number = Integer.parseInt("12.5");
```

`parseInt()` expects a string representing an integer. The text `"12.5"` cannot be converted to an integer this way.

For a decimal value, use:

```java
double number = Double.parseDouble("12.5");
```

### Mistake 4: Forgetting that some methods return new values

Consider:

```java
String name = "alex";

name.toUpperCase();

System.out.println(name);
```

**Output:**

```text
alex
```

The `toUpperCase()` method returns a new string; it does not change the original string.

To use the uppercase result, assign it:

```java
name = name.toUpperCase();

System.out.println(name);
```

**Output:**

```text
ALEX
```

### Mistake 5: Confusing a method call with a method definition

A method call uses an existing method.

```java
Math.sqrt(25);
```

A method definition specifies the code that a programmer's own method will execute. You will explore this further in the upcoming topic on methods.

## 11. Testing and Debugging

When using existing methods, check the following:

- Is the correct class being used?
- Is the method name spelt correctly?
- Is the method called using the correct object or class name?
- Are the correct arguments supplied?
- Does the method return the expected data type?
- Is the returned value stored or used correctly?
- Are invalid inputs handled appropriately?

Test methods with different values. For example, test `length()` with an empty string, a single character and a longer string. Check that the results match your expectations.

## 12. Practical Challenge

Create a Java program that asks the user to enter their name and a decimal number.

### Requirements

1. Use `JOptionPane` to request the user's name.
2. Use `JOptionPane` to request a decimal number.
3. Use `Double.parseDouble()` to convert the number.
4. Use `Math.sqrt()` to calculate its square root.
5. Use `length()` to determine the number of characters in the name.
6. Display the name, the number of characters and the square root.
7. Use meaningful variable names.

### Example

If the user enters:

- Name: `Alex`
- Number: `49`

The program should display information equivalent to:

```text
Name: Alex
Number of characters: 4
Square root: 7.0
```

### Extension challenge

Use `toUpperCase()` to display the name in uppercase as well.

Test the program using different names and non-negative decimal numbers.

## 13. Key Takeaways

- A class defines a type of object or provides related functionality.
- An object is an instance of a class.
- A method performs a particular task.
- Existing Java classes provide useful functionality that programmers can reuse.
- Instance methods are called using objects.
- Static methods can be called using the class name.
- Methods may accept arguments and return values.
- Some methods perform actions without returning a useful result.
- Understanding method calls helps you write shorter, clearer and more reusable programs.

## 14. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous main topic: Selection and Loops](../../07-Selection-and-Loops/README.md)
- **Current: Built-in Methods and Objects**
- [Next: Math Class](../Math-Class/README.md)
- [Back to Methods and Existing Classes](../README.md)
