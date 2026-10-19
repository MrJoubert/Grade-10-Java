# Code Reuse and Modularity

## Overview

Good programming is not just about writing code that works. It is also about writing code that is organised, understandable, maintainable and easy to test.

Two important programming principles are **code reuse** and **modularity**.

- **Code reuse** means using existing code to perform a task instead of writing the same instructions repeatedly.
- **Modularity** means dividing a program into smaller, manageable parts, such as methods, with each part responsible for a particular task.

In Java, methods help you achieve both of these goals. Instead of writing the same calculation or set of instructions in several places, you can create a method and call it whenever it is needed.

This topic brings together your understanding of methods, parameters, return values, local variables and existing Java classes.

---

## Learning Objectives

By the end of this topic, you should be able to:

- Explain code reuse and modularity.
- Identify repeated code in a program.
- Create methods that perform specific tasks.
- Call the same method more than once.
- Use parameters to provide different values to a method.
- Use return values to make methods more flexible.
- Explain the benefits of dividing a program into smaller methods.
- Recognise the difference between reusable methods and duplicated code.
- Apply modular programming principles when solving problems.

---

## 1. What Is Code Reuse?

Code reuse occurs when you use an existing section of code instead of rewriting the same instructions.

Consider a program that displays a welcome message three times.

### Example A: Repeated code

```java
public class RepeatedCode
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
    }
}
```

**Output:**

```text
Welcome to Java!
Welcome to Java!
Welcome to Java!
```

The program works, but the same instruction has been written three times.

If the message needed to change, you would have to update every occurrence.

### Example B: Reusing a method

```java
public class ReusableCode
{
    public static void displayWelcome()
    {
        System.out.println("Welcome to Java!");
    }

    public static void main(String[] args)
    {
        displayWelcome();
        displayWelcome();
        displayWelcome();
    }
}
```

The output is exactly the same, but the program now uses a single method that can be called repeatedly.

### Why is this better?

- The message is written in one place.
- Changes can be made more easily.
- The program contains less duplicated code.
- The method can be reused wherever it is needed.

**Key principle:** Write a task once in a method when the same task needs to be performed repeatedly.

---

## 2. What Is Modularity?

Modularity is the practice of dividing a program into smaller parts, each responsible for a specific task.

Imagine a program that calculates a student's result. It might need to:

1. Request the student's marks.
2. Calculate the average.
3. Determine whether the student passed.
4. Display the result.

You could place every instruction inside `main()`, but this can become difficult to read as the program grows.

A modular design separates these responsibilities into methods.

For example:

```java
public class StudentResult
{
    public static double calculateAverage(
        double testMark,
        double examMark)
    {
        double average;

        average = (testMark + examMark) / 2;

        return average;
    }

    public static void displayResult(double average)
    {
        System.out.println("Average: " + average);
    }

    public static void main(String[] args)
    {
        double average;

        average = calculateAverage(70, 80);

        displayResult(average);
    }
}
```

**Output:**

```text
Average: 75.0
```

The program is divided into methods with different responsibilities:

| Method | Responsibility |
|---|---|
| `calculateAverage()` | Calculates and returns the average. |
| `displayResult()` | Displays the average. |
| `main()` | Coordinates the program by calling the other methods. |

This makes the program easier to understand because each method has a clear purpose.

---

## 3. Methods as Reusable Building Blocks

A method is a named block of code that performs a task.

Once a method has been created, it can be called whenever that task is needed.

Consider this example:

```java
public class CalculationExample
{
    public static void displaySquare(int number)
    {
        int square;

        square = number * number;

        System.out.println("Square: " + square);
    }

    public static void main(String[] args)
    {
        displaySquare(3);
        displaySquare(5);
        displaySquare(8);
    }
}
```

**Output:**

```text
Square: 9
Square: 25
Square: 64
```

The method `displaySquare()` contains the instructions for calculating and displaying a square.

The method is called three times with different arguments. The same code performs three different calculations.

Without the method, you would need to repeat the calculation and output instructions.

### Important distinction

Calling a method more than once does not mean the code is copied into multiple locations. Each call executes the instructions defined in the method.

---

## 4. Using Parameters to Make Methods Flexible

Parameters allow a method to receive information when it is called.

A method with parameters can perform the same task using different values.

Consider this method:

```java
public static void displayGreeting(String name)
{
    System.out.println("Hello, " + name + "!");
}
```

The parameter `name` allows the method to display a greeting for different people.

```java
displayGreeting("Alex");
displayGreeting("Sam");
displayGreeting("Jordan");
```

**Output:**

```text
Hello, Alex!
Hello, Sam!
Hello, Jordan!
```

The method does not need to be rewritten for each person.

### Why parameters improve code reuse

Without parameters, you might need to create a separate method for each person's greeting.

With parameters, one method can handle all three cases.

Parameters make methods more general and useful.

---

## 5. Using Return Values for Reusable Calculations

A method can return a value so that another part of the program can use the result.

Consider a method that calculates a discount:

```java
public static double calculateDiscount(double price)
{
    double discount;

    discount = price * 0.10;

    return discount;
}
```

This method calculates a 10% discount for a given price.

It can be reused for different prices:

```java
public class DiscountExample
{
    public static double calculateDiscount(double price)
    {
        double discount;

        discount = price * 0.10;

        return discount;
    }

    public static void main(String[] args)
    {
        double firstDiscount;
        double secondDiscount;

        firstDiscount = calculateDiscount(200);
        secondDiscount = calculateDiscount(500);

        System.out.println(firstDiscount);
        System.out.println(secondDiscount);
    }
}
```

**Output:**

```text
20.0
50.0
```

The method performs the same calculation each time, but the returned value depends on the argument.

### Why return values are useful

A method that returns a result can be used in different ways. The result could be displayed, stored in a variable or used in another calculation.

For example:

```java
double finalPrice;

finalPrice = 200 - calculateDiscount(200);

System.out.println(finalPrice);
```

**Output:**

```text
180.0
```

The method is reusable because it does not need to know how the calling code intends to use the result.

---

## 6. Using Existing Java Classes

Java provides existing classes that contain reusable methods and functionality.

You do not need to write every operation yourself.

For example, the `Math` class provides methods for mathematical calculations.

```java
public class MathReuseExample
{
    public static void main(String[] args)
    {
        double number;

        number = 25;

        System.out.println(Math.sqrt(number));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-10));
    }
}
```

**Output:**

```text
5.0
8.0
10
```

The program uses existing methods rather than writing its own instructions to calculate a square root, raise a number to a power or find an absolute value.

### Other examples

| Existing functionality | Purpose |
|---|---|
| `Math.sqrt()` | Calculates a square root. |
| `Math.pow()` | Raises a number to a power. |
| `Math.abs()` | Returns the absolute value of a number. |
| `String.length()` | Returns the number of characters in a string. |
| `String.toUpperCase()` | Converts a string to uppercase. |

Using existing classes is another form of code reuse.

---

## 7. Avoiding Code Duplication

Code duplication occurs when the same instructions are copied into multiple parts of a program.

Consider a program that calculates the total price of three separate orders.

### Duplicated calculations

```java
double total1;
double total2;
double total3;

total1 = 100 * 2;
total2 = 150 * 3;
total3 = 200 * 4;

System.out.println(total1);
System.out.println(total2);
System.out.println(total3);
```

Each calculation follows the same pattern: price multiplied by quantity.

The calculation can be placed in a reusable method.

```java
public class OrderCalculator
{
    public static double calculateTotal(
        double price,
        int quantity)
    {
        double total;

        total = price * quantity;

        return total;
    }

    public static void main(String[] args)
    {
        System.out.println(calculateTotal(100, 2));
        System.out.println(calculateTotal(150, 3));
        System.out.println(calculateTotal(200, 4));
    }
}
```

**Output:**

```text
200.0
450.0
800.0
```

The calculation is defined once and reused for each order.

If the calculation logic needed to change, you would only need to update `calculateTotal()`.

---

## 8. Choosing Appropriate Methods

Not every single instruction needs its own method. Methods should be created when they help organise a program or make a task reusable.

A useful method generally:

- Has a clear, descriptive name.
- Performs a specific task.
- Avoids unnecessary repetition.
- Uses parameters when it needs input from the calling code.
- Returns a value when the calling code needs a result.
- Keeps related instructions together.

For example, `calculateAverage()` is more descriptive than `doStuff()` because the method name explains its purpose.

### A simple planning example

Suppose you need to create a program that calculates and displays the area of a rectangle.

You could divide the problem into these tasks:

| Task | Possible method |
|---|---|
| Calculate the area | `calculateArea()` |
| Display the result | `displayArea()` |
| Coordinate the program | `main()` |

This division is not compulsory for every short program. The goal is to organise code where doing so improves clarity and reuse.

---

## 9. Common Mistakes

| Mistake | Why it is a problem | How to improve |
|---|---|---|
| Copying the same calculation repeatedly | Changes must be made in several places. | Create a reusable method. |
| Creating methods with unclear names | Other programmers may struggle to understand the code. | Use descriptive names such as `calculateTotal()`. |
| Hard-coding values inside a reusable method | The method may only work for one specific case. | Use parameters for values that can change. |
| Forgetting to return a required result | The calling code cannot receive the calculated value. | Use the correct return type and a `return` statement. |
| Putting every instruction into `main()` | Larger programs can become difficult to follow. | Divide the program into logical tasks. |
| Creating unnecessary methods | Excessive separation can make simple programs harder to follow. | Create methods when they improve clarity or reuse. |

---

## 10. Testing and Debugging

Reusable methods should be tested with different arguments to check that they work correctly.

Consider the following method:

```java
public static int calculateSquare(int number)
{
    int square;

    square = number * number;

    return square;
}
```

Test it with the following values:

| Argument | Expected result |
|---:|---:|
| `2` | `4` |
| `5` | `25` |
| `0` | `0` |
| `-3` | `9` |

If the method returns the correct results for these inputs, you have evidence that it handles different cases correctly.

When debugging a reusable method, ask yourself:

1. Does the method perform the intended task?
2. Are its parameters the correct data types?
3. Does it return the correct value, if required?
4. Can it be called more than once?
5. Does it work with different valid arguments?
6. Is the method doing one clear, manageable task?

Testing a method independently can make it easier to find errors before the method is used in a larger program.

---

## 11. Practical Challenge

Create a Java program called `SalesCalculator`.

Your program must:

1. Create a method called `calculateTotal()` that accepts a price and a quantity.
2. Calculate and return the total cost.
3. Create a method called `displayReceipt()` that accepts a product name and total cost.
4. Display the product name and total cost using `JOptionPane`.
5. Call the methods from `main()`.
6. Use the same methods to process at least three different products.
7. Avoid repeating the calculation and receipt-display instructions.

### Extension challenge

Create a method called `calculateDiscount()` that accepts a total cost and returns a 10% discount.

Use the returned discount to calculate the final price.

Test your program with different prices and quantities. Check the expected results manually before running the program.

---

## 12. Key Takeaways

- **Code reuse** means using existing code instead of rewriting the same instructions.
- **Modularity** means dividing a program into smaller, manageable parts.
- Methods help you organise programs and reduce duplicated code.
- Parameters allow methods to work with different input values.
- Return values allow methods to provide results to other parts of a program.
- Existing Java classes provide useful functionality that you can reuse.
- Descriptive method names make programs easier to understand.
- Reusable methods should be tested with different arguments.
- Methods should be designed to perform clear, meaningful tasks.

---

## Navigation

- **Previous topic:** [Scope and Local Variables](../Scope-and-Local-Variables/README.md)
- **Back to Methods and Existing Classes:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
