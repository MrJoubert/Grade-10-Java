# Testing Strategies

## Overview

Testing is an important part of software development. It involves checking whether a program behaves as expected when it is given different inputs.

A program may compile successfully and run without crashing, but still produce incorrect results. Testing helps identify these problems before the program is used.

**A testing strategy is a planned approach to checking a program's behaviour using carefully selected test cases.**

In Grade 10 Information Technology, you should understand how to test algorithms and programs, compare actual results with expected results, identify errors and use suitable test data to improve the reliability of a solution.

## Learning Objectives

By the end of this section, you should be able to:

- Explain the purpose of software testing.
- Distinguish between expected and actual results.
- Describe the purpose of a test case.
- Select suitable test data for a program.
- Test normal, boundary and invalid inputs.
- Use trace tables to follow an algorithm.
- Identify possible errors by comparing actual and expected results.
- Explain why testing should be planned rather than performed randomly.

---

## 1. What Is Software Testing?

Software testing involves running or examining a program to determine whether it behaves as expected.

Consider a program that calculates the total cost of purchasing items.

```java
int price = 20;
int quantity = 3;

int total = price * quantity;

System.out.println(total);
```

Expected output:

```text
60
```

Actual output:

```text
60
```

The program produces the expected result for this particular test.

However, one successful test does not prove that the program works correctly for every possible input.

For example, the program may still contain errors that only appear when the quantity is zero, the price contains decimal places or the user enters invalid information.

Testing should therefore involve a range of suitable inputs.

## 2. Why Is Testing Important?

Testing helps programmers identify problems and improve the reliability of their programs.

It can help you determine whether:

- Calculations produce correct results.
- Selection statements choose the correct branch.
- Loops repeat the correct number of times.
- Input validation accepts and rejects the correct values.
- Output messages communicate the correct information.
- The program handles unusual or invalid inputs appropriately.

Testing is particularly important when a program processes information that users rely on.

A program that calculates an incorrect result may still appear to work correctly, making testing essential even when no obvious error occurs.

## 3. Understanding Test Cases

A **test case** is a specific set of input values, together with the expected result, used to check a program.

A test case normally identifies:

- The input supplied to the program.
- The expected result.
- The actual result obtained when the test is performed.
- Whether the test passed or failed.

Consider a program that determines whether a student has passed a test. A mark of 50 or higher is a pass.

| Test case | Input mark | Expected result |
|---|---:|---|
| 1 | 75 | Pass |
| 2 | 50 | Pass |
| 3 | 49 | Fail |
| 4 | 0 | Fail |
| 5 | 100 | Pass |

These test cases cover several different situations, including the exact pass mark and the minimum and maximum permitted values.

A test passes when the actual result matches the expected result. It fails when the results differ.

## 4. Choosing Suitable Test Data

Test data is the information supplied to a program during testing.

Choosing appropriate test data helps you identify errors that may not appear during ordinary use.

Three useful categories are normal, boundary and invalid test data.

### 4.1 Normal test data

Normal test data represents typical, valid inputs that the program is expected to process.

For a mark out of 100, examples include:

- `65`
- `72`
- `85`

These values help determine whether the program works correctly under ordinary conditions.

### 4.2 Boundary test data

Boundary test data checks values at the limits of the permitted range.

If a mark must be between 0 and 100, inclusive, the important boundaries are:

- `0`
- `100`

Values immediately outside the boundaries, such as `-1` and `101`, are also useful for checking whether validation is implemented correctly.

Boundary testing is particularly effective for identifying incorrect relational operators.

For example, using `mark > 50` instead of `mark >= 50` would incorrectly reject a mark of exactly 50 if the pass mark is 50.

### 4.3 Invalid test data

Invalid test data checks how the program responds to inputs that do not meet its requirements.

For a program expecting an integer mark between 0 and 100, invalid test data could include:

- `-5`
- `150`
- Text such as `hello`, when the program expects a number.

The last example is different from an out-of-range number. Text cannot be converted to an integer using `Integer.parseInt()` without causing a conversion error.

A robust program should handle both invalid numerical values and non-numeric input appropriately.

## 5. Comparing Expected and Actual Results

During testing, compare what should happen with what actually happens.

Consider this program:

```java
int mark = 50;

if (mark > 50)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Fail");
}
```

Actual output:

```text
Fail
```

Suppose the requirement states that a mark of 50 or higher is a pass.

Expected output:

```text
Pass
```

The program contains a logical error because the condition uses `>` instead of `>=`.

The corrected code is:

```java
int mark = 50;

if (mark >= 50)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Fail");
}
```

Actual output after correction:

```text
Pass
```

This example shows why testing boundary values is important.

## 6. Testing Selection Statements

Selection statements allow a program to choose between different actions.

Testing should check that each relevant branch produces the correct result.

Consider the following code:

```java
int temperature = 30;

if (temperature >= 35)
{
    System.out.println("Very hot");
}
else if (temperature >= 25)
{
    System.out.println("Warm");
}
else
{
    System.out.println("Cool");
}
```

For an input of `30`, the expected output is:

```text
Warm
```

Useful test values include:

| Temperature | Expected output |
|---:|---|
| 20 | Cool |
| 25 | Warm |
| 30 | Warm |
| 34 | Warm |
| 35 | Very hot |
| 40 | Very hot |

These values help test the different branches and the boundaries between them.

## 7. Testing Loops

Loops should be tested to check whether they repeat the correct number of times and terminate as expected.

Consider this program:

```java
for (int count = 1; count <= 5; count++)
{
    System.out.println(count);
}
```

Expected output:

```text
1
2
3
4
5
```

When testing loops, ask:

- Does the loop execute the correct number of times?
- Does it start with the correct value?
- Does the condition stop the loop at the correct point?
- Does the counter change correctly?
- Does the loop terminate?

For example, changing `count <= 5` to `count < 5` would cause the program to display only the numbers from 1 to 4.

Carefully selected test cases and trace tables can help identify such errors.

## 8. Using Trace Tables During Testing

A trace table records how variables change as an algorithm executes.

Consider this example:

```java
int number = 2;
int total = 0;

for (int count = 1; count <= 3; count++)
{
    total = total + number;
}

System.out.println(total);
```

The program adds 2 to `total` three times.

| Stage | `count` | `number` | `total` |
|---|---:|---:|---:|
| Initial values | — | 2 | 0 |
| First iteration | 1 | 2 | 2 |
| Second iteration | 2 | 2 | 4 |
| Third iteration | 3 | 2 | 6 |

Expected output:

```text
6
```

A trace table helps you understand the execution of the algorithm and check whether the final result is correct.

## 9. A Simple Testing Procedure

Follow these steps when testing a program:

1. Read the problem requirements carefully.
2. Identify the expected behaviour of the program.
3. Select suitable test data.
4. Predict the expected result for each test case.
5. Run the program using each input.
6. Record the actual results.
7. Compare actual results with expected results.
8. Investigate any differences.
9. Correct the errors and repeat the relevant tests.

Testing should be systematic. Randomly trying a few inputs may miss important conditions or boundary cases.

## 10. Common Testing Mistakes

### Mistake 1: Testing only one input

A program may work for one input but fail for another.

**Improvement:** Use a variety of normal, boundary and invalid test cases.

### Mistake 2: Ignoring boundary values

Conditions may behave incorrectly at the exact limits of a permitted range.

**Improvement:** Test the minimum and maximum allowed values, along with values just outside them.

### Mistake 3: Assuming that compiling successfully proves correctness

A program can compile and execute while still producing incorrect results.

**Improvement:** Compare actual results with expected results.

### Mistake 4: Forgetting to record expected results

Without an expected result, it is difficult to determine whether the program behaved correctly.

**Improvement:** Predict the result before running each test.

### Mistake 5: Failing to retest after correcting an error

A correction may introduce another problem or affect previously working functionality.

**Improvement:** Repeat relevant tests after making changes.

---

## 11. Practical Challenge

Create a Java program called `MarkTesting`.

Your program must:

1. Ask the user to enter a mark out of 100.
2. Check whether the mark is within the permitted range.
3. If the mark is valid, determine whether it is a pass or a fail, using 50 as the pass mark.
4. Display an appropriate message.

After developing the program, prepare a test table containing at least six test cases.

Include:

- A mark below zero.
- A mark of zero.
- A mark just below the pass mark.
- A mark equal to the pass mark.
- A mark of 100.
- A mark above 100.

For each test case, record the input, expected result, actual result and whether the test passed.

### Extension challenge

Identify how your program should respond if the user enters text instead of a number. Modify the program to handle this situation appropriately.

---

## Key Takeaways

- Testing checks whether a program behaves as expected.
- A test case includes input data and an expected result.
- Normal test data checks typical valid inputs.
- Boundary test data checks the limits of permitted values.
- Invalid test data checks how the program handles unacceptable input.
- Comparing expected and actual results helps identify errors.
- Trace tables help you follow an algorithm's execution.
- Programs should be tested systematically and retested after corrections.

---

## Navigation

- [Next: Standard, Extreme and Abnormal Data](../Standard-Extreme-and-Abnormal-Data/README.md)
- [Back to Testing and Debugging](../README.md)
- [Back to Grade 10 Java](../../README.md)
