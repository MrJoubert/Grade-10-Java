# Isolating Digits

## Overview

Isolating digits is a useful programming technique that allows you to extract individual digits from an integer. In Java, you can use the **modulus operator (`%`)** and **integer division (`/`)** to access specific digits or process a number one digit at a time.

These techniques are important when developing algorithms that analyse numbers, calculate digit totals, reverse numbers, or determine whether a number has certain properties.

This section focuses on working with non-negative integers in Java.

## Learning Objectives

By the end of this section, you should be able to:

- Explain how the modulus operator can isolate the last digit of a number.
- Use integer division to remove the last digit of a number.
- Extract the tens, hundreds and other digit positions.
- Process each digit in an integer using a loop.
- Apply digit-isolation techniques to solve simple programming problems.
- Test digit-based algorithms using suitable test data.

---

## 1. Understanding the Modulus Operator

The modulus operator (`%`) returns the **remainder after division**.

For example:

```java
int answer = 47 % 10;
System.out.println(answer);
```

Output:

```text
7
```

When 47 is divided by 10, the quotient is 4 and the remainder is 7.

This means that using `% 10` on a non-negative integer gives you its last digit.

| Expression | Result | Explanation |
|---|---:|---|
| `47 % 10` | 7 | Last digit of 47 |
| `326 % 10` | 6 | Last digit of 326 |
| `805 % 10` | 5 | Last digit of 805 |
| `9 % 10` | 9 | Last digit of 9 |
| `120 % 10` | 0 | Last digit of 120 |

**Remember:** To isolate the last digit of a non-negative integer, use:

```java
int digit = number % 10;
```

## 2. Removing the Last Digit

Integer division (`/`) removes the fractional part of a division when both operands are integers.

For example:

```java
int answer = 326 / 10;
System.out.println(answer);
```

Output:

```text
32
```

The decimal part is discarded because Java performs integer division.

| Expression | Result | Explanation |
|---|---:|---|
| `326 / 10` | 32 | Removes the last digit |
| `805 / 10` | 80 | Removes the last digit |
| `47 / 10` | 4 | Removes the last digit |
| `9 / 10` | 0 | Removes the only digit |

**Remember:** To remove the last digit of a non-negative integer, use:

```java
number = number / 10;
```

You can also write:

```java
number /= 10;
```

Both statements perform the same calculation.

## 3. Extracting Specific Digits

You can combine integer division and modulus to isolate a digit at a particular position.

Consider the number `5837`.

<escape>
| Digit position | Calculation | Result |
|---|---|---:|
| Thousands | `(5837 / 1000) % 10` | 5 |
| Hundreds | `(5837 / 100) % 10` | 8 |
| Tens | `(5837 / 10) % 10` | 3 |
| Units | `5837 % 10` | 7 |
</escape>

### Extracting the units digit

```java
int number = 5837;
int units = number % 10;

System.out.println(units);
```

Output:

```text
7
```

### Extracting the tens digit

First, divide by 10 to remove the units digit. Then use `% 10` to isolate the new last digit.

```java
int number = 5837;
int tens = (number / 10) % 10;

System.out.println(tens);
```

Output:

```text
3
```

### Extracting the hundreds digit

```java
int number = 5837;
int hundreds = (number / 100) % 10;

System.out.println(hundreds);
```

Output:

```text
8
```

### Extracting the thousands digit

```java
int number = 5837;
int thousands = (number / 1000) % 10;

System.out.println(thousands);
```

Output:

```text
5
```

**Important:** These position-based calculations assume that the number contains enough digits for the position you want to extract. If a number has fewer digits, the result may be `0`.

---

## 4. Processing Digits from Right to Left

Sometimes you do not know how many digits a number contains. Instead of extracting each position separately, you can use a loop to process every digit.

The basic algorithm is:

1. Isolate the last digit using `% 10`.
2. Process that digit.
3. Remove the last digit using `/ 10`.
4. Repeat until no digits remain.

Consider the number `472`.

| Step | Current number | `number % 10` | `number / 10` |
|---|---:|---:|---:|
| 1 | 472 | 2 | 47 |
| 2 | 47 | 7 | 4 |
| 3 | 4 | 4 | 0 |

The digits are processed in the order **2, 7, 4** because the algorithm starts with the rightmost digit.

### Example: Display every digit

```java
int number = 472;

while (number > 0)
{
    int digit = number % 10;

    System.out.println(digit);

    number = number / 10;
}
```

Output:

```text
2
7
4
```

Notice that the loop condition is `number > 0`. Each iteration removes one digit until the number becomes zero.

This example assumes that `number` is positive. A separate check is needed if the original number is zero, because the loop would not execute.

---

## 5. Example: Calculating the Sum of the Digits

A common algorithmic task is to calculate the sum of all the digits in a number.

For example:

\[
472 \rightarrow 4 + 7 + 2 = 13
\]

We can calculate this by repeatedly isolating the last digit and adding it to a running total.

```java
int number = 472;
int sum = 0;

while (number > 0)
{
    int digit = number % 10;

    sum = sum + digit;

    number = number / 10;
}

System.out.println("Sum of digits: " + sum);
```

Output:

```text
Sum of digits: 13
```

### How the algorithm works

| Iteration | Digit isolated | Running sum | Number after division |
|---|---:|---:|---:|
| 1 | 2 | 2 | 47 |
| 2 | 7 | 9 | 4 |
| 3 | 4 | 13 | 0 |

The variable `sum` stores the total as the algorithm progresses.

**Important:** If the original number is `0`, initialise the sum to `0` and handle that case separately or allow the result to remain zero.

---

## 6. Example: Counting the Digits

You can also use this technique to count how many digits a positive integer contains.

```java
int number = 5837;
int count = 0;

while (number > 0)
{
    count = count + 1;

    number = number / 10;
}

System.out.println("Number of digits: " + count);
```

Output:

```text
Number of digits: 4
```

Each time the loop executes, one digit is removed. The variable `count` increases by one.

For this version, a value of `0` must be handled separately because zero is a one-digit number, but the loop will not execute.

---

## 7. Interactive Example Using JOptionPane

The following program asks the user to enter a positive integer and calculates the sum of its digits.

```java
import javax.swing.JOptionPane;

public class DigitSum
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(
                "Enter a positive integer:");

        int number = Integer.parseInt(input);
        int sum = 0;

        while (number > 0)
        {
            int digit = number % 10;

            sum = sum + digit;

            number = number / 10;
        }

        JOptionPane.showMessageDialog(null,
                "Sum of digits: " + sum);
    }
}
```

If the user enters `5837`, the message displayed is:

```text
Sum of digits: 23
```

This example assumes the user enters a valid, positive integer. It does not yet validate incorrect input or handle cancellation of the input dialog.

---

## 8. Common Mistakes

### Mistake 1: Using division instead of modulus

Incorrect:

```java
int digit = number / 10;
```

This removes the last digit rather than isolating it.

Correct:

```java
int digit = number % 10;
```

### Mistake 2: Forgetting to update the number

Incorrect:

```java
while (number > 0)
{
    int digit = number % 10;
    System.out.println(digit);
}
```

The value of `number` never changes, so the loop continues indefinitely.

Correct:

```java
number = number / 10;
```

Include this statement inside the loop.

### Mistake 3: Using real division

Incorrect:

```java
double result = number / 10.0;
```

This performs real-number division and does not remove the last digit in the way required by this algorithm.

Use integer division:

```java
number = number / 10;
```

### Mistake 4: Forgetting that digits are processed in reverse order

When processing `472` using `% 10`, the digits are extracted as `2`, then `7`, then `4`.

If a question requires the digits in their original order, additional processing is necessary.

### Mistake 5: Ignoring zero

A loop using `while (number > 0)` does not execute when `number` is zero. Remember that zero itself has one digit, and its digit sum is zero.

### Mistake 6: Ignoring negative numbers

The examples in this section assume non-negative integers. Java's remainder and integer division behave differently from a simple positive-digit algorithm when negative values are used. Decide how negative input should be handled before applying the algorithm.

---

## 9. Testing and Debugging

Test digit-isolation algorithms with a range of inputs.

| Input | Expected last digit | Expected digit sum | Expected digit count |
|---:|---:|---:|---:|
| 7 | 7 | 7 | 1 |
| 42 | 2 | 6 | 2 |
| 5837 | 7 | 23 | 4 |
| 120 | 0 | 3 | 3 |
| 0 | 0 | 0 | 1 |

The table describes the expected results for non-negative integers. Your implementation must handle zero explicitly for the digit-count algorithm.

When testing, ask yourself:

- Does the algorithm isolate the correct digit?
- Does the number decrease after each iteration?
- Does the loop terminate?
- Does the algorithm work when the number ends in zero?
- Does it handle zero as an input?
- Does the result match the expected answer?

A trace table can help you identify errors in the loop or in the calculation of the running total.

---

## 10. Practical Challenge

Write a Java program that asks the user to enter a positive integer using `JOptionPane`.

Your program must:

1. Display the last digit of the number.
2. Display the tens digit, if the number contains at least two digits.
3. Calculate and display the sum of the digits.
4. Count and display the number of digits.
5. Display clear messages for the results.

### Extension challenges

- Calculate the product of all the digits.
- Count how many digits are even.
- Count how many digits are odd.
- Determine whether the number contains a zero.
- Determine whether the sum of the digits is divisible by three.

Test your program using one-digit numbers, numbers ending in zero, and numbers containing repeated digits.

---

## Key Takeaways

- `% 10` isolates the last digit of a non-negative integer.
- Integer division by `10` removes the last digit.
- Combining division and modulus allows you to isolate specific digit positions.
- A loop can process every digit without knowing the number of digits in advance.
- Digit-processing algorithms commonly calculate sums, products and digit counts.
- Always consider zero, invalid input and negative values when designing a robust program.

Understanding these techniques will help you solve more complex algorithmic problems in Java.

---

## Navigation

- [Previous: Swapping Values](../Swapping-Values/README.md)
- [Next: Algorithm Evaluation and Efficiency](../Algorithm-Evaluation-and-Efficiency/README.md)
- [Back to Algorithms and Problem-Solving](../README.md)
- [Back to Grade 10 Java](../../README.md)
