# Return Values and Return Types

## 1. Overview

Methods allow you to divide a Java program into smaller, reusable sections. Some methods perform an action, while others calculate a result and send that result back to the code that called them.

A **return value** is the result that a method sends back to its caller.

A **return type** specifies the type of value a method is expected to return.

For example, a method that calculates the sum of two integers could return an `int`. A method that calculates an average containing decimal places could return a `double`.

```java
public static int calculateTotal()
{
    int total = 10 + 20;

    return total;
}
```

The statement `return total;` sends the calculated value back to the calling code.

Return values are useful because they allow a method's result to be stored, displayed, compared or used in another calculation.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain the difference between a return value and a return type.
- Identify the return type in a method declaration.
- Use the `return` statement correctly.
- Write methods that return `int`, `double`, `String` and `boolean` values.
- Call methods that return values.
- Store and use returned values.
- Use returned values in calculations and conditions.
- Distinguish between `void` methods and methods that return values.
- Identify and correct common errors involving return statements.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Understanding method declarations.
- Using methods to solve programming problems.
- Parameters, arguments and return types.
- Code reuse and modular programming.
- Calculations, expressions and data types.
- Tracing, testing and debugging methods.

The examples focus on foundational Java programming. Consult the applicable IEB SAGS documentation for the exact requirements concerning return types in theory and practical assessments.

## 4. Understanding Return Types

The return type appears in a method declaration before the method name.

Consider:

```java
public static int calculateTotal()
{
    int total = 10 + 20;

    return total;
}
```

The declaration contains the following parts:

| Component | Example | Purpose |
|---|---|---|
| Access modifier | `public` | Specifies accessibility. |
| Static keyword | `static` | Allows the method to be called without creating an object of its class. |
| Return type | `int` | Specifies that the method returns an integer. |
| Method name | `calculateTotal` | Identifies the method. |
| Parameter list | `()` | Contains any required parameters. |
| Method body | `{ ... }` | Contains the instructions executed by the method. |
| Return statement | `return total;` | Sends the result back to the caller. |

The return type must be compatible with the value returned by the method.

For example:

- `int` returns an integer.
- `double` returns a decimal numeric value.
- `String` returns a string.
- `boolean` returns either `true` or `false`.
- `void` indicates that the method does not return a value.

## 5. The `return` Statement

The `return` statement sends a value back to the calling code and ends the current method execution.

### Example

```java
public static int calculateTotal()
{
    int total = 15 + 25;

    return total;
}
```

When this method is called, it calculates the total and returns `40`.

The statement:

```java
return total;
```

does two things:

1. Sends the value stored in `total` back to the caller.
2. Ends execution of the current method.

Any statements placed after an executed `return` statement in the same block cannot be reached.

## 6. Returning an Integer

Use `int` when a method must return a whole-number value.

### Example: Add two integers

```java
public class IntegerReturnExample
{
    public static void main(String[] args)
    {
        int answer;

        answer = calculateTotal();

        System.out.println("Total: " + answer);
    }

    public static int calculateTotal()
    {
        int number1 = 12;
        int number2 = 8;
        int total;

        total = number1 + number2;

        return total;
    }
}
```

**Output:**

```text
Total: 20
```

### How the program works

1. The `main` method calls `calculateTotal()`.
2. The method calculates the sum of 12 and 8.
3. The statement `return total;` sends the value 20 back to `main`.
4. The returned value is assigned to `answer`.
5. The program displays the answer.

Notice that `calculateTotal()` does not display the result itself. It returns the result so that the calling method can decide what to do with it.

## 7. Returning a Value Using Parameters

A method can receive arguments through parameters and return a calculated result.

### Example: Calculate the area of a rectangle

```java
public class RectangleReturnExample
{
    public static void main(String[] args)
    {
        int area;

        area = calculateArea(8, 4);

        System.out.println("Area: " + area);
    }

    public static int calculateArea(int length, int width)
    {
        int result;

        result = length * width;

        return result;
    }
}
```

**Output:**

```text
Area: 32
```

The method receives two arguments, calculates the area and returns the result.

The method can be reused with different dimensions:

```java
int firstArea = calculateArea(8, 4);
int secondArea = calculateArea(10, 5);
```

The returned values are 32 and 50 respectively.

This approach separates the calculation from the code that displays or uses the result.

## 8. Returning a `double`

Use `double` when a method needs to return a decimal numeric value.

### Example: Calculate an average

```java
public class AverageReturnExample
{
    public static void main(String[] args)
    {
        double average;

        average = calculateAverage(65, 80);

        System.out.println("Average: " + average);
    }

    public static double calculateAverage(int mark1, int mark2)
    {
        double result;

        result = (mark1 + mark2) / 2.0;

        return result;
    }
}
```

**Output:**

```text
Average: 72.5
```

The method returns a `double`, allowing the average to include a decimal component.

The use of `2.0` ensures that the division uses decimal arithmetic rather than integer division.

## 9. Returning a `String`

A method can return text using the `String` return type.

### Example: Create a greeting

```java
public class StringReturnExample
{
    public static void main(String[] args)
    {
        String message;

        message = createGreeting("Alex");

        System.out.println(message);
    }

    public static String createGreeting(String name)
    {
        String greeting;

        greeting = "Welcome, " + name + "!";

        return greeting;
    }
}
```

**Output:**

```text
Welcome, Alex!
```

The method receives a name, creates a greeting and returns the resulting string.

The returned string is stored in `message` and displayed by `main`.

This method can be reused with different names without rewriting the greeting logic.

## 10. Returning a `boolean`

A method can return a Boolean value: `true` or `false`.

This is useful when a method checks whether a condition is satisfied.

### Example: Check whether a number is positive

```java
public class BooleanReturnExample
{
    public static void main(String[] args)
    {
        boolean result;

        result = isPositive(12);

        System.out.println(result);
    }

    public static boolean isPositive(int number)
    {
        return number > 0;
    }
}
```

**Output:**

```text
true
```

The expression `number > 0` evaluates to either `true` or `false`.

The method returns that Boolean result directly.

You can also use the returned value in a selection statement:

```java
if (isPositive(12))
{
    System.out.println("The number is positive.");
}
else
{
    System.out.println("The number is not positive.");
}
```

**Output:**

```text
The number is positive.
```

This demonstrates how returned values can be used to control the execution of another part of a program.

## 11. Using a Returned Value Directly

A returned value does not always need to be stored in a separate variable.

For example:

```java
System.out.println(calculateArea(8, 4));
```

If `calculateArea(8, 4)` returns 32, the program displays:

```text
32
```

You can also use a returned value in a calculation:

```java
int total = calculateArea(8, 4) + calculateArea(10, 5);

System.out.println(total);
```

**Output:**

```text
82
```

The first method call returns 32, and the second returns 50. Their results are added together.

Use a separate variable when it makes the program easier to understand or when the value needs to be reused.

## 12. Void Methods Compared with Methods That Return Values

The main difference is whether the method sends a value back to the caller.

### Void method

```java
public static void displayTotal()
{
    System.out.println(30);
}
```

This method displays the total but does not return it.

### Method that returns a value

```java
public static int calculateTotal()
{
    int total = 10 + 20;

    return total;
}
```

This method returns the integer 30. The calling code can decide whether to display it, store it or use it in another calculation.

| Feature | Void method | Method that returns a value |
|---|---|---|
| Return type | `void` | A data type such as `int` or `double` |
| Returns a value to the caller | No | Yes |
| Can display output | Yes | Yes, although calculations are often kept separate from output |
| Can be used as a value in an assignment | No | Yes, if the returned type is compatible |
| Example | `displayTotal();` | `int total = calculateTotal();` |

A method that returns a value does not automatically display that value. The calling code must use the returned result if it needs to be displayed.

## 13. Common Mistakes

### Mistake 1: Missing the return statement

Incorrect:

```java
public static int calculateTotal()
{
    int total = 10 + 20;
}
```

The method declares an `int` return type but does not return an integer.

Correct:

```java
public static int calculateTotal()
{
    int total = 10 + 20;

    return total;
}
```

### Mistake 2: Returning the wrong data type

Incorrect:

```java
public static int getName()
{
    return "Alex";
}
```

The method declares an `int` return type but attempts to return a `String`.

Correct:

```java
public static String getName()
{
    return "Alex";
}
```

### Mistake 3: Confusing displaying a value with returning it

Incorrect:

```java
public static int calculateTotal()
{
    System.out.println(30);
}
```

Displaying the number does not satisfy the requirement to return an integer.

Correct:

```java
public static int calculateTotal()
{
    return 30;
}
```

### Mistake 4: Trying to assign the result of a void method

Incorrect:

```java
int result = displayMessage();
```

This is invalid if `displayMessage()` has a `void` return type.

Call the method without assigning a result:

```java
displayMessage();
```

### Mistake 5: Returning the wrong variable

```java
public static int calculateTotal()
{
    int number1 = 10;
    int number2 = 20;
    int total = number1 + number2;

    return number1;
}
```

This method returns 10 rather than the calculated total of 30.

Correct:

```java
return total;
```

Always check that the returned value matches the purpose of the method.

### Mistake 6: Writing statements after an unconditional return

Incorrect:

```java
public static int calculateTotal()
{
    return 30;

    // This statement cannot execute.
    // System.out.println("Finished");
}
```

An executed `return` statement immediately ends the method. Place any required instructions before the return statement.

## 14. Testing and Debugging

When testing methods that return values, ask yourself:

- Does the method have the correct return type?
- Does it return a value of a compatible type?
- Does the calculation produce the correct result?
- Are the parameters and arguments correct?
- Is the returned value used correctly by the caller?
- Does the method behave correctly with different inputs?
- Are boundary conditions handled appropriately?

For a method that calculates an average, test both even and odd totals. For a method that checks whether a number is positive, test a positive number, zero and a negative number.

Compare the actual output with the expected result to identify errors.

## 15. Practical Challenge

Create a Java program that calculates the total cost of purchasing items.

### Requirements

1. Create a method called `calculateTotalCost`.
2. The method must accept two parameters:
   - `price`, a `double`.
   - `quantity`, an `int`.
3. Calculate the total cost by multiplying the price by the quantity.
4. Return the result as a `double`.
5. Call the method from `main`.
6. Display the returned value using `JOptionPane`.
7. Use meaningful variable names.

### Example

Calling:

```java
calculateTotalCost(49.99, 3);
```

The method should return approximately:

```text
149.97
```

### Extension challenge

Modify the program so that the user enters the price and quantity using `JOptionPane`.

Convert the input to the correct data types, pass the values to `calculateTotalCost()` and display the returned result.

Test your program using different prices and quantities.

## 16. Key Takeaways

- A return type specifies the type of value a method returns.
- A return value is the result sent back to the calling code.
- The `return` statement sends the value back and ends the method execution.
- Methods can return types such as `int`, `double`, `String` and `boolean`.
- A method's return type must be compatible with its returned value.
- Parameters allow methods to receive information, while return values allow them to send results back.
- Returned values can be stored, displayed, compared or used in calculations.
- A `void` method does not return a value.
- Always test the returned result using different inputs.

## 17. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: Parameters and Arguments](../Parameters-and-Arguments/README.md)
- **Current: Return Values and Return Types**
- [Next: Scope and Local Variables](../Scope-and-Local-Variables/README.md)
- [Back to Methods and Existing Classes](../README.md)
