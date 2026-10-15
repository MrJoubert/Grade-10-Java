# Common Algorithmic Tasks

## Overview

Many programming problems require similar calculations or operations. These recurring operations are known as common algorithmic tasks.

Learning to recognise these tasks helps you solve new problems more efficiently because you can apply familiar techniques instead of designing every solution from scratch.

In Grade 10 Java, common algorithmic tasks include calculating totals and averages, finding the smallest or largest value, determining factors and multiples, swapping values and isolating digits in a number.

Understanding these algorithms helps you develop logical solutions, write more accurate Java code and prepare for examination questions involving calculations, selection, loops and problem-solving.

---

## Learning Objectives

By the end of this topic, you should be able to:

- Identify common algorithmic tasks in programming problems.
- Calculate totals and averages.
- Find the smallest and largest of two or more values.
- Determine whether a number is a factor or multiple of another number.
- Swap the values stored in two variables.
- Explain the purpose of common arithmetic operations used in algorithms.
- Recognise when a loop is required to repeat a calculation.
- Trace algorithms and predict their output.
- Translate common algorithms into Java code.

---

## 1. Calculating a Total

Calculating a total means adding values together.

This is useful when calculating the total of marks, prices, expenses or quantities.

### Example

Calculate the total of three marks.

```java id="5p0f4x"
public class TotalCalculator
{
    public static void main(String[] args)
    {
        int mark1;
        int mark2;
        int mark3;
        int total;

        mark1 = 65;
        mark2 = 72;
        mark3 = 80;

        total = mark1 + mark2 + mark3;

        System.out.println("Total: " + total);
    }
}
```

**Output:**

```text
Total: 217
```

### Algorithm

1. Obtain the values.
2. Add the values together.
3. Store the result in a variable.
4. Display the total.

The general formula is:

\[
\text{Total}=v_1+v_2+\cdots+v_n
\]

The symbol \(n\) represents the number of values being added.

---

## 2. Calculating an Average

An average is calculated by dividing the total of the values by the number of values.

\[
\text{Average}=\frac{\text{Total}}{\text{Number of values}}
\]

### Example

Calculate the average of three marks.

```java id="lqaxze"
public class AverageCalculator
{
    public static void main(String[] args)
    {
        double mark1;
        double mark2;
        double mark3;
        double total;
        double average;

        mark1 = 65;
        mark2 = 72;
        mark3 = 80;

        total = mark1 + mark2 + mark3;
        average = total / 3.0;

        System.out.println("Average: " + average);
    }
}
```

**Output:**

```text
Average: 72.33333333333333
```

### Important consideration

Use an appropriate data type for the average. An average may contain a decimal value even when all the original marks are whole numbers.

Using `3.0` ensures that the division produces a decimal result.

---

## 3. Finding the Largest Value

Finding the largest value means comparing values to determine which one is greater.

### Example: Finding the largest of two numbers

```java id="s2v8cz"
public class LargestNumber
{
    public static void main(String[] args)
    {
        int number1;
        int number2;
        int largest;

        number1 = 25;
        number2 = 40;

        if (number1 > number2)
        {
            largest = number1;
        }
        else
        {
            largest = number2;
        }

        System.out.println("Largest: " + largest);
    }
}
```

**Output:**

```text
Largest: 40
```

### How the algorithm works

1. Obtain two numbers.
2. Compare the numbers.
3. If the first number is greater, store it as the largest.
4. Otherwise, store the second number as the largest.
5. Display the result.

**Important:** If the two numbers are equal, the `else` branch assigns the second number to `largest`. This is still correct because both values are the same.

### Alternative approach

You can also initialise `largest` to the first number and replace it only when the second number is greater.

```java id="k2a9v8"
int largest = number1;

if (number2 > largest)
{
    largest = number2;
}
```

This approach is useful when you need to compare additional values.

---

## 4. Finding the Smallest Value

Finding the smallest value follows the same principle as finding the largest, but the comparison is reversed.

### Example

```java id="b71x5a"
public class SmallestNumber
{
    public static void main(String[] args)
    {
        int number1;
        int number2;
        int smallest;

        number1 = 25;
        number2 = 40;

        if (number1 < number2)
        {
            smallest = number1;
        }
        else
        {
            smallest = number2;
        }

        System.out.println("Smallest: " + smallest);
    }
}
```

**Output:**

```text
Smallest: 25
```

### Algorithm

1. Obtain two numbers.
2. Compare the numbers.
3. If the first number is smaller, store it as the smallest.
4. Otherwise, store the second number as the smallest.
5. Display the result.

### Remember

- Use `>` when checking whether a value is greater.
- Use `<` when checking whether a value is smaller.

A common mistake is using the wrong comparison operator, which can cause the algorithm to return the opposite result.

---

## 5. Finding Factors

A factor is a whole number that divides another whole number exactly, without leaving a remainder.

For example, the positive factors of 12 are:

`1, 2, 3, 4, 6, 12`

You can use the modulus operator `%` to determine whether a number divides another number exactly.

If:

```java
number % divisor == 0
```

then `divisor` divides `number` exactly, provided the divisor is not zero.

### Example: Checking whether a number is a factor

```java id="v1q7n2"
public class FactorChecker
{
    public static void main(String[] args)
    {
        int number;
        int divisor;

        number = 12;
        divisor = 4;

        if (number % divisor == 0)
        {
            System.out.println(divisor + " is a factor of " + number);
        }
        else
        {
            System.out.println(divisor + " is not a factor of " + number);
        }
    }
}
```

**Output:**

```text
4 is a factor of 12
```

### Why does this work?

The calculation is:

\[
12 \bmod 4=0
\]

The remainder is zero, so 4 divides 12 exactly.

If the divisor were 5, the remainder would be 2, so 5 would not be a factor of 12.

**Important:** Do not use zero as the divisor because division or modulus by zero is invalid in Java.

---

## 6. Finding Multiples

A multiple of a number is the result of multiplying that number by an integer.

For example, the first five positive multiples of 4 are:

`4, 8, 12, 16, 20`

Multiples can be generated using multiplication or repeated addition.

### Example: Displaying the first five multiples of 4

```java id="n2p3v8"
public class MultiplesExample
{
    public static void main(String[] args)
    {
        int number;
        int multiple;

        number = 4;

        for (int count = 1; count <= 5; count++)
        {
            multiple = number * count;

            System.out.println(multiple);
        }
    }
}
```

**Output:**

```text
4
8
12
16
20
```

### How the algorithm works

1. Store the number whose multiples are required.
2. Use a loop to count from 1 to 5.
3. Multiply the original number by the counter.
4. Display each multiple.

This example combines multiplication with a count-controlled loop.

---

## 7. Swapping Values

Swapping means exchanging the values stored in two variables.

Suppose:

```text
first = 10
second = 20
```

After swapping:

```text
first = 20
second = 10
```

If you overwrite one variable before saving its original value, you may lose information.

### Incorrect approach

```java id="r4f6z1"
int first = 10;
int second = 20;

first = second;
second = first;
```

After the first assignment, `first` becomes 20. The original value of `first` has been lost.

The second assignment therefore also stores 20 in `second`.

### Correct approach using a temporary variable

```java id="z7c2n1"
public class SwapExample
{
    public static void main(String[] args)
    {
        int first;
        int second;
        int temporary;

        first = 10;
        second = 20;

        temporary = first;
        first = second;
        second = temporary;

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}
```

**Output:**

```text
First: 20
Second: 10
```

### Understanding the algorithm

| Step | `first` | `second` | `temporary` |
|---|---:|---:|---:|
| Initial values | 10 | 20 | — |
| `temporary = first` | 10 | 20 | 10 |
| `first = second` | 20 | 20 | 10 |
| `second = temporary` | 20 | 10 | 10 |

The temporary variable preserves the original value until it can be assigned to the second variable.

---

## 8. Isolating Digits

Isolating digits means extracting individual digits from a whole number.

Two useful operators are:

- Integer division `/`, which discards the fractional part when both operands are integers.
- Modulus `%`, which returns the remainder.

For a non-negative whole number:

- `number % 10` gives the last digit.
- `number / 10` removes the last digit when integer division is used.

### Example: Extracting the last digit

```java id="q3n8m1"
public class LastDigitExample
{
    public static void main(String[] args)
    {
        int number;
        int lastDigit;

        number = 527;

        lastDigit = number % 10;

        System.out.println("Last digit: " + lastDigit);
    }
}
```

**Output:**

```text
Last digit: 7
```

### Example: Removing the last digit

```java id="u9f4k2"
int number = 527;

number = number / 10;

System.out.println(number);
```

**Output:**

```text
52
```

Because both operands are integers, the division produces an integer result.

### Example: Extracting the last two digits separately

```java id="x4p9c6"
int number = 527;
int lastDigit;
int remainingNumber;
int nextDigit;

lastDigit = number % 10;
remainingNumber = number / 10;
nextDigit = remainingNumber % 10;

System.out.println(lastDigit);
System.out.println(nextDigit);
```

**Output:**

```text
7
2
```

These techniques are useful when a problem requires you to examine or manipulate individual digits.

---

## 9. Combining Algorithmic Tasks

Programming problems often require more than one algorithmic task.

Consider a program that calculates the average of two marks and displays the higher mark.

The algorithm must:

1. Obtain two marks.
2. Calculate their average.
3. Compare the marks.
4. Determine the higher mark.
5. Display both results.

### Example Java implementation

```java id="p7q3m5"
import javax.swing.JOptionPane;

public class MarkAnalysis
{
    public static void main(String[] args)
    {
        int mark1;
        int mark2;
        int highest;
        double average;

        mark1 = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the first mark:")
        );

        mark2 = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the second mark:")
        );

        average = (mark1 + mark2) / 2.0;

        if (mark1 > mark2)
        {
            highest = mark1;
        }
        else
        {
            highest = mark2;
        }

        JOptionPane.showMessageDialog(
            null,
            "Average: " + average
            + "\nHighest mark: " + highest
        );
    }
}
```

The program combines input, calculations, selection and output.

When solving a problem that combines several tasks, identify each task before writing the code.

---

## 10. Common Mistakes

| Mistake | Why it is a problem | How to improve |
|---|---|---|
| Adding values when calculating a product total | The required result is incorrect. | Identify the correct formula first. |
| Using integer division when a decimal average is required | The fractional part may be lost. | Use a suitable decimal calculation. |
| Using the wrong comparison operator | The wrong value may be identified as the smallest or largest. | Check whether the task asks for greater or smaller. |
| Dividing by zero when checking factors | The program encounters an invalid arithmetic operation. | Ensure the divisor is not zero. |
| Swapping values without a temporary variable | An original value may be overwritten. | Store one value temporarily before replacing it. |
| Confusing `/` and `%` when isolating digits | The wrong part of the number is obtained. | Use `% 10` for the last digit and integer division by 10 to remove it. |
| Forgetting to test boundary cases | The algorithm may fail for important values. | Test equal values, zero where appropriate and values at the boundaries. |

---

## 11. Testing and Tracing

A common algorithm should be tested with values that demonstrate its behaviour.

For a largest-value algorithm, test:

| First value | Second value | Expected largest |
|---:|---:|---:|
| 10 | 20 | 20 |
| 30 | 15 | 30 |
| 12 | 12 | 12 |
| -5 | -2 | -2 |

Testing equal values is useful because it confirms that the algorithm still returns a correct result when neither value is greater than the other.

For a factor-checking algorithm, test:

- A divisor that divides exactly.
- A divisor that leaves a remainder.
- A divisor of 1.
- A zero divisor, which must be rejected before using `%`.

For a digit-isolation algorithm, use non-negative whole numbers such as `527`, `40` and `8` to understand how integer division and modulus behave.

### Tracing questions

When tracing an algorithm, ask:

1. What are the initial variable values?
2. Which operation is performed first?
3. How does each operation change the values?
4. Which condition is evaluated?
5. What is displayed at the end?

---

## 12. Practical Challenge

Create a Java program called `NumberAnalysis`.

The program must:

1. Request two whole numbers using `JOptionPane`.
2. Calculate and display their sum.
3. Calculate and display their average.
4. Determine and display the larger number.
5. Determine whether the first number is a factor of the second number, provided the first number is not zero.
6. Display the last digit of the first number if it is non-negative.

### Extension challenge

Add a feature that swaps the two numbers and displays their new values.

Before writing the code, create an algorithm for each task. Then combine the algorithms into one program.

Test your program with:

- Two different positive numbers.
- Two equal numbers.
- One number that is zero.
- A pair of values where the first number divides the second exactly.

Pay attention to division, modulus and the order in which values are assigned.

---

## 13. Key Takeaways

- Common algorithmic tasks appear repeatedly in programming problems.
- A total is calculated by adding values.
- An average is calculated by dividing the total by the number of values.
- Selection can be used to identify the smallest or largest value.
- The modulus operator helps determine factors and isolate digits.
- Loops can generate multiples and repeat calculations.
- A temporary variable can be used to swap two values safely.
- Integer division and modulus are useful for digit manipulation.
- Complex programs can combine several common algorithms.
- Testing and tracing help confirm that an algorithm works correctly.

---

## Navigation

- **Previous topic:** [Flowcharts](../Flowcharts/README.md)
- **Next topic:** [Swapping Values](../Swapping-Values/README.md)
- **Back to Algorithms and Problem-Solving:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
