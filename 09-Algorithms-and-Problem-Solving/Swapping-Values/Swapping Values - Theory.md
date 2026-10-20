# Swapping Values

## Overview

Swapping values means exchanging the values stored in two variables.

For example, if `first` contains `10` and `second` contains `20`, swapping the values should result in `first` containing `20` and `second` containing `10`.

Swapping is a common algorithmic task in programming. It is useful when rearranging values, changing the order of information and implementing algorithms that move values between variables.

In Grade 10 Java, you should understand how assignment statements work, why a temporary variable is needed in the standard swapping algorithm, and how to trace the values after each instruction.

---

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what swapping values means.
- Use assignment statements to change variable values.
- Explain why a value can be lost when a variable is overwritten.
- Use a temporary variable to swap two values.
- Represent a swapping algorithm using pseudocode.
- Implement swapping in Java.
- Trace a swapping algorithm using a table.
- Identify and correct common swapping errors.

---

## 1. What Does Swapping Mean?

Swapping means exchanging the values stored in two variables.

Suppose you have these variables:

```java
int first = 10;
int second = 20;
```

Initially, their values are:

| Variable | Initial value |
|---|---:|
| `first` | 10 |
| `second` | 20 |

After swapping, the values should be:

| Variable | Final value |
|---|---:|
| `first` | 20 |
| `second` | 10 |

Notice that the variables themselves still exist. Only the values stored in them change.

### Where is swapping useful?

Swapping may be used when:

- Rearranging two values.
- Correcting the order of two numbers.
- Exchanging values as part of an algorithm.
- Moving values between positions in a sequence.
- Implementing algorithms that require values to change places.

The important skill is understanding how assignment changes the value stored in a variable.

---

## 2. Understanding Assignment

An assignment statement stores a value in a variable.

For example:

```java
int number = 10;

number = 25;
```

After the second statement, `number` contains `25`, not `10`.

The original value has been replaced.

This is important when swapping values because assigning one variable to another can overwrite a value that you still need.

### Example: Overwriting a value

```java
int first = 10;
int second = 20;

first = second;
```

After the assignment:

| Variable | Value |
|---|---:|
| `first` | 20 |
| `second` | 20 |

The original value of `first`, which was `10`, has been lost.

If you now try to assign `first` to `second`, both variables will contain `20`.

This is why the standard swapping algorithm uses a temporary variable.

---

## 3. Swapping Using a Temporary Variable

A temporary variable stores a value briefly while the other variables are updated.

Consider these initial values:

```java
int first = 10;
int second = 20;
int temporary;
```

The correct swapping algorithm uses three assignments.

### Step 1: Save the first value

```java
temporary = first;
```

The value of `first` is copied into `temporary`.

| Variable | Value |
|---|---:|
| `first` | 10 |
| `second` | 20 |
| `temporary` | 10 |

The original value of `first` is now safely stored in `temporary`.

### Step 2: Assign the second value to the first

```java
first = second;
```

Now `first` contains `20`.

| Variable | Value |
|---|---:|
| `first` | 20 |
| `second` | 20 |
| `temporary` | 10 |

At this stage, both `first` and `second` contain `20`. This is expected because the original value of `first` has been saved.

### Step 3: Restore the saved value

```java
second = temporary;
```

The saved value, `10`, is assigned to `second`.

| Variable | Value |
|---|---:|
| `first` | 20 |
| `second` | 10 |
| `temporary` | 10 |

The values have now been exchanged successfully.

### The complete algorithm

```java
temporary = first;
first = second;
second = temporary;
```

**Remember the order:** Save the first value, replace the first value, then restore the saved value into the second variable.

---

## 4. Complete Java Program

The following program demonstrates swapping two integer values.

```java
public class SwapExample
{
    public static void main(String[] args)
    {
        int first;
        int second;
        int temporary;

        first = 10;
        second = 20;

        System.out.println("Before swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        temporary = first;
        first = second;
        second = temporary;

        System.out.println("After swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}
```

**Output:**

```text
Before swapping:
First: 10
Second: 20
After swapping:
First: 20
Second: 10
```

The program displays the original values, performs the swapping algorithm and then displays the exchanged values.

---

## 5. Swapping Values Entered by a User

You can also swap values entered by a user.

The following program uses `JOptionPane` to obtain two integers.

```java
import javax.swing.JOptionPane;

public class UserSwapExample
{
    public static void main(String[] args)
    {
        int first;
        int second;
        int temporary;

        first = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the first number:")
        );

        second = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the second number:")
        );

        temporary = first;
        first = second;
        second = temporary;

        JOptionPane.showMessageDialog(
            null,
            "First number: " + first
            + "\nSecond number: " + second
        );
    }
}
```

### Example

Suppose the user enters:

- First number: `35`
- Second number: `12`

The program displays:

```text
First number: 12
Second number: 35
```

The same algorithm works regardless of the values entered, provided the inputs can be converted to integers.

---

## 6. Representing Swapping Using Pseudocode

Pseudocode describes the algorithm without requiring Java-specific syntax.

Suppose `first` contains `10` and `second` contains `20`.

The pseudocode is:

```text
START
    first = 10
    second = 20

    temporary = first
    first = second
    second = temporary

    OUTPUT first
    OUTPUT second
STOP
```

The algorithm follows three assignment steps:

1. Save the original value of `first`.
2. Copy the value of `second` into `first`.
3. Copy the saved value into `second`.

The resulting output is:

```text
20
10
```

When writing pseudocode in an assessment, use the notation required by your teacher or examination instructions.

---

## 7. Tracing the Swapping Algorithm

Tracing allows you to follow each assignment and record how the variable values change.

Consider the following code:

```java
int first = 5;
int second = 9;
int temporary;

temporary = first;
first = second;
second = temporary;
```

Complete the following trace table.

| Instruction | `first` | `second` | `temporary` |
|---|---:|---:|---:|
| Initial values | 5 | 9 | Not assigned |
| `temporary = first` | 5 | 9 | 5 |
| `first = second` | 9 | 9 | 5 |
| `second = temporary` | 9 | 5 | 5 |

The final values are:

- `first = 9`
- `second = 5`

### Why tracing matters

Tracing helps you understand that assignment statements execute in sequence. Each assignment changes the state of the program before the next statement is executed.

If you can trace the algorithm correctly, you should be able to predict its final values without running the program.

---

## 8. Common Swapping Mistakes

### Mistake 1: Overwriting a value

Incorrect code:

```java
first = second;
second = first;
```

If `first` initially contains `10` and `second` contains `20`, both variables end up containing `20`.

The original value of `first` has been lost.

**Correction:** Save the original value in a temporary variable before overwriting it.

### Mistake 2: Using the temporary variable in the wrong order

Incorrect code:

```java
temporary = first;
second = temporary;
first = second;
```

This does not swap the values correctly. The saved value is copied into `second`, and then that same value is copied into `first`.

**Correction:** Follow the correct sequence:

```java
temporary = first;
first = second;
second = temporary;
```

### Mistake 3: Forgetting to declare the temporary variable

If you use `temporary` without declaring it, Java will produce a compilation error.

Declare it before using it:

```java
int temporary;
```

### Mistake 4: Assuming the temporary variable is the final result

The temporary variable only helps preserve a value during the swap. The final values of interest are those stored in `first` and `second`.

---

## 9. Testing and Debugging

A swapping algorithm should work for different starting values.

Use test cases such as the following:

| First value | Second value | Expected first value | Expected second value |
|---:|---:|---:|---:|
| 10 | 20 | 20 | 10 |
| 5 | 9 | 9 | 5 |
| 7 | 7 | 7 | 7 |
| -3 | 8 | 8 | -3 |
| 0 | 15 | 15 | 0 |

These tests help you check whether the algorithm handles equal values, negative values and zero correctly.

### Debugging checklist

If your swapping program produces the wrong result, check:

1. Was the first value saved before being overwritten?
2. Was the second value assigned to the first variable?
3. Was the saved value assigned to the second variable?
4. Were the statements executed in the correct order?
5. Are you displaying the correct variables after swapping?

---

## 10. Practical Challenge

Create a Java program called `NumberSwapper`.

Your program must:

1. Request two whole numbers using `JOptionPane`.
2. Display the original values.
3. Swap the values using a temporary variable.
4. Display the values after swapping.
5. Use meaningful variable names.
6. Test the program with at least three different pairs of values.

### Extension challenge

Create a program that requests three integer values.

Swap the first and second values, then swap the second and third values.

Before running the program, trace each assignment and predict the final values.

Be careful: the second swap must use the values that exist after the first swap, not the original values.

---

## 11. Key Takeaways

- Swapping exchanges the values stored in two variables.
- Assignment replaces the value currently stored in a variable.
- Overwriting a value before saving it can cause information to be lost.
- A temporary variable preserves a value while the swap takes place.
- The standard algorithm is:

  ```java
  temporary = first;
  first = second;
  second = temporary;
  ```

- The order of the assignment statements is important.
- Trace tables help you follow the changes to each variable.
- Testing different values helps confirm that the algorithm works correctly.

---

## Navigation

- **Previous topic:** [Common Algorithmic Tasks](../Common-Algorithmic-Tasks/README.md)
- **Next topic:** [Isolating Digits](../Isolating-Digits/README.md)
- **Back to Algorithms and Problem-Solving:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
