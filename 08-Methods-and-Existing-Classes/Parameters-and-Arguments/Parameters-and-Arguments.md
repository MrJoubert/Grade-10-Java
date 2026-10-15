# Parameters and Arguments

## 1. Overview

Methods allow you to divide a Java program into smaller, reusable sections. However, a method sometimes needs information from the part of the program that calls it.

**Parameters and arguments allow you to pass information to a method.**

For example, instead of creating a separate method for greeting every student, you can create one method that accepts a student's name.

```java
public static void displayGreeting(String name)
{
    System.out.println("Hello, " + name);
}
```

You can then call the method with different arguments:

```java
displayGreeting("Alex");
displayGreeting("Sam");
```

**Output:**

```text
Hello, Alex
Hello, Sam
```

The method is defined once but can work with different values each time it is called.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain the difference between a parameter and an argument.
- Define a method that accepts parameters.
- Call a method and supply the correct arguments.
- Use parameters with different data types.
- Pass more than one argument to a method.
- Understand how arguments are matched to parameters.
- Identify common errors involving parameters and arguments.
- Use parameters to create reusable methods.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Defining and calling methods.
- Understanding parameters and arguments.
- Modular programming and code reuse.
- Using appropriate data types.
- Developing structured programming solutions.

The examples focus on foundational Java programming. Check the applicable IEB SAGS documentation for the precise requirements concerning parameters in practical assessments.

## 4. What Is a Parameter?

A **parameter** is a variable declared inside the parentheses of a method declaration. It receives a value when the method is called.

Consider this method:

```java
public static void displayGreeting(String name)
{
    System.out.println("Hello, " + name);
}
```

The parameter is:

```java
String name
```

Here:

- `String` is the parameter's data type.
- `name` is the parameter's variable name.

When the method is called, the supplied value becomes available through the parameter.

For example:

```java
displayGreeting("Alex");
```

Inside the method, the parameter `name` contains `"Alex"` during that call.

## 5. What Is an Argument?

An **argument** is the actual value or expression supplied when a method is called.

For example:

```java
displayGreeting("Alex");
```

The argument is:

```java
"Alex"
```

The method declaration contains the parameter, while the method call supplies the argument.

### Parameter versus argument

| Parameter | Argument |
|---|---|
| Declared in the method definition | Supplied in the method call |
| Acts as a variable that receives a value | Provides the value to be received |
| Example: `String name` | Example: `"Alex"` |

**Remember:** Parameters belong to the method declaration. Arguments belong to the method call.

## 6. Defining and Calling a Method with One Parameter

Consider the following complete program:

```java
public class ParameterExample
{
    public static void main(String[] args)
    {
        displayGreeting("Alex");
        displayGreeting("Sam");
    }

    public static void displayGreeting(String name)
    {
        System.out.println("Hello, " + name);
    }
}
```

**Output:**

```text
Hello, Alex
Hello, Sam
```

### How the program works

1. Java starts executing `main`.
2. The first call supplies `"Alex"` as an argument.
3. The parameter `name` receives the value `"Alex"`.
4. The method displays `Hello, Alex`.
5. Execution returns to `main`.
6. The second call supplies `"Sam"`.
7. The parameter receives `"Sam"`, and the method displays `Hello, Sam`.

Each method call uses the same method definition but supplies a different value.

## 7. Parameters with Different Data Types

A parameter can use different data types, depending on the information the method needs.

### 7.1 An integer parameter

```java
public static void displayAge(int age)
{
    System.out.println("Age: " + age);
}
```

Call the method:

```java
displayAge(16);
```

**Output:**

```text
Age: 16
```

### 7.2 A decimal parameter

```java
public static void displayPrice(double price)
{
    System.out.println("Price: R" + price);
}
```

Call the method:

```java
displayPrice(49.99);
```

**Output:**

```text
Price: R49.99
```

### 7.3 A Boolean parameter

```java
public static void displayStatus(boolean active)
{
    System.out.println("Active: " + active);
}
```

Call the method:

```java
displayStatus(true);
```

**Output:**

```text
Active: true
```

The argument must be compatible with the parameter's data type.

## 8. Methods with Multiple Parameters

A method can accept more than one parameter. Separate the parameters with commas.

### Example: Calculate the area of a rectangle

```java
public class RectangleExample
{
    public static void main(String[] args)
    {
        calculateArea(8, 4);
        calculateArea(10, 5);
    }

    public static void calculateArea(int length, int width)
    {
        int area;

        area = length * width;

        System.out.println("Area: " + area);
    }
}
```

**Output:**

```text
Area: 32
Area: 50
```

The method has two parameters:

```java
int length, int width
```

During the first call:

- `length` receives 8.
- `width` receives 4.

During the second call:

- `length` receives 10.
- `width` receives 5.

### Important rule

Arguments are matched to parameters according to their position in the method call.

For example:

```java
calculateArea(8, 4);
```

The first argument, `8`, is assigned to `length`, while the second argument, `4`, is assigned to `width`.

Changing the order of the arguments may change the result.

## 9. Using Parameters to Perform Calculations

Parameters are especially useful when the same calculation must be performed with different values.

### Example: Calculate the average of two numbers

```java
public class AverageExample
{
    public static void main(String[] args)
    {
        calculateAverage(60, 80);
        calculateAverage(45, 75);
    }

    public static void calculateAverage(int number1, int number2)
    {
        double average;

        average = (number1 + number2) / 2.0;

        System.out.println("Average: " + average);
    }
}
```

**Output:**

```text
Average: 70.0
Average: 60.0
```

The parameters `number1` and `number2` receive the arguments supplied during each method call.

The calculation uses `2.0` rather than `2` to ensure that the division is performed using decimal arithmetic.

This method can calculate an average for any two integer arguments without rewriting the calculation.

## 10. Passing Variables as Arguments

Arguments do not have to be literal values. You can also supply variables or expressions.

### Example: Use variables as arguments

```java
public class VariableArgumentExample
{
    public static void main(String[] args)
    {
        int length = 12;
        int width = 7;

        calculateArea(length, width);
    }

    public static void calculateArea(int length, int width)
    {
        int area;

        area = length * width;

        System.out.println("Area: " + area);
    }
}
```

**Output:**

```text
Area: 84
```

The values stored in the variables are supplied to the method as arguments.

You can also supply an expression:

```java
calculateArea(5 + 3, 2 * 4);
```

The arguments evaluate to 8 and 8, so the method calculates an area of 64.

## 11. Parameters and Return Values

Parameters and return values serve different purposes.

- **Parameters** allow a method to receive information.
- **Return values** allow a method to send a result back to the calling code.

A void method can accept parameters without returning a value.

```java
public static void displaySquare(int number)
{
    int square;

    square = number * number;

    System.out.println("Square: " + square);
}
```

Call the method:

```java
displaySquare(6);
```

**Output:**

```text
Square: 36
```

The method receives an integer but does not return the square to the calling statement. It displays the result instead.

A method with a return type can receive parameters and return a result. This will be explored in more detail in the topic on **Return Values and Return Types**.

## 12. Common Mistakes

### Mistake 1: Supplying the wrong number of arguments

Suppose a method is defined as:

```java
public static void calculateArea(int length, int width)
{
    System.out.println(length * width);
}
```

Incorrect call:

```java
calculateArea(8);
```

The method requires two arguments, but only one is supplied.

Correct call:

```java
calculateArea(8, 4);
```

### Mistake 2: Supplying incompatible data types

Suppose the method is defined as:

```java
public static void displayAge(int age)
{
    System.out.println(age);
}
```

Incorrect call:

```java
displayAge("Sixteen");
```

The argument is a `String`, but the parameter expects an `int`.

A compatible call would be:

```java
displayAge(16);
```

### Mistake 3: Confusing parameters and arguments

In this declaration:

```java
public static void displayName(String name)
```

`String name` is the parameter.

In this call:

```java
displayName("Alex");
```

`"Alex"` is the argument.

### Mistake 4: Using the wrong order of arguments

Consider:

```java
public static void displayDetails(String name, int age)
{
    System.out.println(name + " is " + age);
}
```

Correct call:

```java
displayDetails("Alex", 16);
```

Incorrect call:

```java
displayDetails(16, "Alex");
```

The second call uses the wrong argument order and will not compile because the argument types do not match the parameter types.

### Mistake 5: Assuming a parameter automatically changes the original variable

Consider:

```java
public static void increaseNumber(int number)
{
    number++;
}
```

Calling the method with an integer variable does not change the caller's original integer variable.

For primitive values such as `int`, Java passes a copy of the value to the method. Changes to the parameter do not change the original variable.

### Mistake 6: Forgetting commas between parameters

Incorrect:

```java
public static void calculateArea(int length int width)
```

Correct:

```java
public static void calculateArea(int length, int width)
```

Each parameter must have a valid declaration, and multiple parameters must be separated by commas.

## 13. Testing and Debugging

When working with parameters and arguments, check the following:

- Does the method declare the correct parameters?
- Does the method call supply the correct number of arguments?
- Are the argument types compatible with the parameter types?
- Are arguments supplied in the correct order?
- Does the method perform the intended task?
- Does the method produce the correct output for different argument values?

Test methods with different values rather than relying on a single example.

For a method that calculates the area of a rectangle, try dimensions such as `8` and `4`, then `10` and `5`. Calculate the expected results manually and compare them with the program output.

## 14. Practical Challenge

Create a Java program that uses methods with parameters to calculate and display the details of a rectangle.

### Requirements

1. Create a method called `displayRectangleDetails`.
2. The method must accept two integer parameters: `length` and `width`.
3. Calculate the area using the formula:

   \[
   \text{Area} = \text{length} \times \text{width}
   \]

4. Calculate the perimeter using the formula:

   \[
   \text{Perimeter} = 2(\text{length} + \text{width})
   \]

5. Display the length, width, area and perimeter.
6. Call the method at least twice with different arguments.
7. Use meaningful variable names.

### Example

Calling:

```java
displayRectangleDetails(8, 4);
```

Should display:

```text
Length: 8
Width: 4
Area: 32
Perimeter: 24
```

### Extension challenge

Modify the program to ask the user for the length and width using `JOptionPane`. Convert the inputs to integers and pass the values as arguments to `displayRectangleDetails()`.

Test the program with different dimensions.

## 15. Key Takeaways

- A parameter is a variable declared in a method definition.
- An argument is a value or expression supplied in a method call.
- Parameters allow methods to work with different values.
- A method can have zero, one or several parameters.
- Arguments are matched to parameters by position.
- Argument types must be compatible with parameter types.
- Parameters allow programmers to reuse calculations without repeating code.
- Parameters and return values have different purposes.
- Testing methods with different arguments helps confirm that they work correctly.

## 16. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: Method Calls](../Method-Calls/README.md)
- **Current: Parameters and Arguments**
- [Next: Return Values and Return Types](../Return-Values-and-Return-Types/README.md)
- [Back to Methods and Existing Classes](../README.md)
