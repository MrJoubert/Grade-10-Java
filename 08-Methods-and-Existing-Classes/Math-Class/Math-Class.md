# Math Class

## 1. Overview

Java provides a built-in class called `Math` that contains methods for performing common mathematical calculations.

Instead of writing your own algorithms for every calculation, you can use existing methods provided by Java.

The `Math` class is useful when developing programs that involve:

- Finding square roots.
- Calculating powers.
- Rounding decimal values.
- Finding the absolute value of a number.
- Finding the minimum or maximum of two values.
- Working with mathematical constants such as pi.

The `Math` class is part of the `java.lang` package, which Java makes available automatically. You do not need to import it.

**Important:** The methods in the `Math` class are static. Call them using the class name, for example, `Math.sqrt(25)`.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of the `Math` class.
- Call mathematical methods using the `Math` class name.
- Use `Math.sqrt()` to calculate square roots.
- Use `Math.pow()` to calculate powers.
- Use `Math.abs()` to find absolute values.
- Use `Math.min()` and `Math.max()` to compare values.
- Understand the difference between rounding methods.
- Use mathematical methods in complete Java programs.
- Test calculations using appropriate input values.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Using existing Java classes and methods.
- Performing mathematical calculations.
- Using appropriate data types.
- Developing algorithms to solve problems.
- Testing and tracing calculations.

The examples focus on foundational Grade 10 Java programming.

## 4. Calling Methods from the `Math` Class

A static method is called using the class name followed by a dot and the method name.

The general syntax is:

```java
Math.methodName(arguments);
```

For example:

```java
double answer = Math.sqrt(36);

System.out.println(answer);
```

**Output:**

```text
6.0
```

The method `sqrt()` calculates the square root of the supplied number and returns a `double`.

The result is stored in the variable `answer`.

## 5. The `Math.sqrt()` Method

The `sqrt()` method calculates the square root of a number.

### Syntax

```java
Math.sqrt(number);
```

### Example 1: Calculate a square root

```java
double answer = Math.sqrt(49);

System.out.println(answer);
```

**Output:**

```text
7.0
```

### Example 2: Calculate and display a square root

```java
double number = 81;
double answer;

answer = Math.sqrt(number);

System.out.println("Square root: " + answer);
```

**Output:**

```text
Square root: 9.0
```

### Important points

- The method returns a `double`.
- A negative argument produces `NaN` (Not a Number).
- A square root does not always produce a whole number.

For example:

```java
System.out.println(Math.sqrt(2));
```

The output is approximately:

```text
1.4142135623730951
```

## 6. The `Math.pow()` Method

The `pow()` method calculates a number raised to a specified power.

### Syntax

```java
Math.pow(base, exponent);
```

### Example 1: Calculate a square

```java
double answer = Math.pow(5, 2);

System.out.println(answer);
```

**Output:**

```text
25.0
```

This calculates:

\[
5^2 = 5 \times 5 = 25
\]

### Example 2: Calculate a cube

```java
double answer = Math.pow(3, 3);

System.out.println(answer);
```

**Output:**

```text
27.0
```

This calculates:

\[
3^3 = 3 \times 3 \times 3 = 27
\]

### Example 3: Use a variable as the base

```java
int number = 4;
double answer;

answer = Math.pow(number, 3);

System.out.println("Cube: " + answer);
```

**Output:**

```text
Cube: 64.0
```

### Important points

- The first argument is the base.
- The second argument is the exponent.
- The method returns a `double`, even when the mathematical result is a whole number.
- For basic calculations, you can use multiplication directly when it is clearer.

For example, `number * number` can be used to calculate a square without calling `Math.pow()`.

## 7. The `Math.abs()` Method

The `abs()` method returns the absolute value of a number.

The absolute value represents the distance from zero, without considering whether the original value was positive or negative.

### Example 1: Absolute value of a negative integer

```java
int answer = Math.abs(-15);

System.out.println(answer);
```

**Output:**

```text
15
```

### Example 2: Absolute value of a decimal

```java
double answer = Math.abs(-7.5);

System.out.println(answer);
```

**Output:**

```text
7.5
```

### Example 3: Compare a difference without its sign

```java
int firstNumber = 12;
int secondNumber = 20;
int difference;

difference = Math.abs(firstNumber - secondNumber);

System.out.println("Difference: " + difference);
```

**Output:**

```text
Difference: 8
```

Without `Math.abs()`, the result of `firstNumber - secondNumber` would be `-8`.

**Important:** For the most negative `int` value, `Math.abs()` cannot produce a positive `int` of the same magnitude because that value is outside the range of `int`. This is an advanced edge case, but it is useful to know that absolute value calculations have data-type limits.

## 8. The `Math.min()` and `Math.max()` Methods

These methods compare two values.

- `Math.min()` returns the smaller value.
- `Math.max()` returns the larger value.

### Example 1: Find the smaller value

```java
int answer = Math.min(12, 7);

System.out.println(answer);
```

**Output:**

```text
7
```

### Example 2: Find the larger value

```java
int answer = Math.max(12, 7);

System.out.println(answer);
```

**Output:**

```text
12
```

### Example 3: Compare two marks

```java
int mark1 = 68;
int mark2 = 82;

int highestMark = Math.max(mark1, mark2);
int lowestMark = Math.min(mark1, mark2);

System.out.println("Highest mark: " + highestMark);
System.out.println("Lowest mark: " + lowestMark);
```

**Output:**

```text
Highest mark: 82
Lowest mark: 68
```

These methods can make calculations more concise when only two values need to be compared.

## 9. Rounding Methods

Java provides several methods for working with decimal values. They do not all perform the same operation.

### 9.1 `Math.round()`

The `round()` method rounds a number to the nearest whole number.

```java
System.out.println(Math.round(4.3));
System.out.println(Math.round(4.7));
System.out.println(Math.round(4.5));
```

**Output:**

```text
4
5
5
```

For a `double` argument, `Math.round()` returns a `long`.

### 9.2 `Math.floor()`

The `floor()` method returns the greatest whole-number value that is less than or equal to the original number.

```java
System.out.println(Math.floor(4.9));
System.out.println(Math.floor(4.1));
```

**Output:**

```text
4.0
4.0
```

The method returns a `double`.

### 9.3 `Math.ceil()`

The `ceil()` method returns the smallest whole-number value that is greater than or equal to the original number.

```java
System.out.println(Math.ceil(4.1));
System.out.println(Math.ceil(4.9));
```

**Output:**

```text
5.0
5.0
```

The method returns a `double`.

### Comparison table

| Method | Purpose | Example | Result |
|---|---|---|---:|
| `Math.round()` | Round to the nearest whole number | `Math.round(4.7)` | `5` |
| `Math.floor()` | Round down towards negative infinity | `Math.floor(4.9)` | `4.0` |
| `Math.ceil()` | Round up towards positive infinity | `Math.ceil(4.1)` | `5.0` |

**Important:** `floor()` and `ceil()` behave according to the mathematical definitions of rounding down and rounding up. With negative values, the results may differ from what you expect if you simply think of rounding as removing decimal places.

For example:

```java
System.out.println(Math.floor(-4.2));
System.out.println(Math.ceil(-4.2));
```

**Output:**

```text
-5.0
-4.0
```

## 10. The `Math.PI` Constant

The `Math` class also provides the constant `Math.PI`, which represents an approximation of pi.

Pi is used in calculations involving circles.

For example, the area of a circle is:

\[
A = \pi r^2
\]

where \(r\) is the radius.

### Example: Calculate the area of a circle

```java
double radius = 5;
double area;

area = Math.PI * Math.pow(radius, 2);

System.out.println("Area: " + area);
```

**Output:**

```text
Area: 78.53981633974483
```

The result is a decimal value because the calculation uses pi.

If a question requires a specific number of decimal places, you must format the output accordingly.

## 11. Using `Math` Methods in a Complete Program

The following program asks the user to enter a number and displays its square root and square.

```java
import javax.swing.JOptionPane;

public class MathMethodsExample
{
    public static void main(String[] args)
    {
        double number;
        double square;
        double squareRoot;

        number = Double.parseDouble(
            JOptionPane.showInputDialog(
                "Enter a non-negative number:"
            )
        );

        square = Math.pow(number, 2);
        squareRoot = Math.sqrt(number);

        JOptionPane.showMessageDialog(
            null,
            "Number: " + number
            + "\nSquare: " + square
            + "\nSquare root: " + squareRoot
        );
    }
}
```

If the user enters `25`, the program displays:

```text
Number: 25.0
Square: 625.0
Square root: 5.0
```

### How the program works

1. The program requests a number using `JOptionPane`.
2. `Double.parseDouble()` converts the input to a `double`.
3. `Math.pow()` calculates the square.
4. `Math.sqrt()` calculates the square root.
5. `JOptionPane.showMessageDialog()` displays the results.

The example assumes the user enters a valid non-negative number.

## 12. Common Mistakes

### Mistake 1: Forgetting the class name

Incorrect:

```java
double answer = sqrt(25);
```

Correct:

```java
double answer = Math.sqrt(25);
```

The method is called using the `Math` class name.

### Mistake 2: Confusing the arguments of `Math.pow()`

Incorrect:

```java
Math.pow(2, 3);
```

This does not mean \(3^2\). It means \(2^3\), which equals 8.

The first argument is the base, and the second is the exponent.

### Mistake 3: Storing a decimal result in an integer

Incorrect:

```java
int answer = Math.sqrt(25);
```

The method returns a `double`, so this assignment causes a compilation error.

Correct:

```java
double answer = Math.sqrt(25);
```

### Mistake 4: Assuming `Math.round()` always returns an `int`

For a `double` argument, `Math.round()` returns a `long`.

For example:

```java
long answer = Math.round(4.7);
```

If a question requires an integer variable, make sure the chosen type is appropriate for the returned value.

### Mistake 5: Confusing rounding methods

`Math.round()`, `Math.floor()` and `Math.ceil()` perform different operations.

Always identify whether the question requires rounding to the nearest whole number, rounding down or rounding up.

## 13. Testing and Debugging

When testing mathematical calculations, consider:

- Is the correct method being used?
- Are the arguments supplied in the correct order?
- Is the returned value stored in a suitable data type?
- Does the calculation work for whole numbers and decimal numbers?
- Are negative values allowed?
- Could the calculation produce an unexpected result?
- Is the displayed output sufficiently accurate?

For a square-root program, test perfect squares such as 25 and 81, as well as a non-perfect square such as 2. If negative values are not allowed by the requirements, test that the program handles them appropriately.

For rounding methods, test values immediately below, at and above a whole-number boundary.

## 14. Practical Challenge

Create a Java program that calculates the area and circumference of a circle.

### Requirements

1. Ask the user to enter the radius using `JOptionPane`.
2. Convert the input to a `double`.
3. Calculate the area using:

   \[
   A = \pi r^2
   \]

4. Calculate the circumference using:

   \[
   C = 2\pi r
   \]

5. Use `Math.PI` for pi.
6. Use `Math.pow()` to calculate the square of the radius.
7. Display both results using `JOptionPane`.
8. Use meaningful variable names.

### Example

If the radius is `3`, the results should be approximately:

```text
Area: 28.2743
Circumference: 18.8496
```

Your displayed values may contain more decimal places unless you format them.

### Extension challenge

Modify the program to display the radius rounded to the nearest whole number using `Math.round()`.

Test your program with different positive radii and check the calculations manually.

## 15. Key Takeaways

- The `Math` class provides methods for common mathematical calculations.
- Its methods are called using the class name, such as `Math.sqrt()`.
- `Math.sqrt()` calculates a square root.
- `Math.pow()` calculates a power.
- `Math.abs()` returns an absolute value.
- `Math.min()` and `Math.max()` compare two values.
- `Math.round()`, `Math.floor()` and `Math.ceil()` perform different rounding operations.
- `Math.PI` provides an approximation of pi.
- Always use an appropriate data type for the returned result.
- Test calculations with a variety of values to confirm that the program behaves correctly.

## 16. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: Built-in Methods and Objects](../Built-in-Methods-and-Objects/README.md)
- **Current: Math Class**
- [Next: Void Methods](../Void-Methods/README.md)
- [Back to Methods and Existing Classes](../README.md)
