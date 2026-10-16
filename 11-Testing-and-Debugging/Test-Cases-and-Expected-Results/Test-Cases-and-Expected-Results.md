# Test Cases and Expected Results

## Overview

A test case is a planned test used to check whether a program behaves as expected for a particular input. It identifies the data to be tested and the result that should be produced.

When developing a Java program, it is important to determine the expected result before running a test. You can then compare the actual result with the expected result to decide whether the test has passed or failed.

**A test passes when the actual result matches the expected result. A test fails when the results differ.**

In Grade 10 Information Technology, test cases help you check calculations, selection statements, loops and input validation. They also provide a systematic way to identify and correct errors.

## Learning Objectives

By the end of this section, you should be able to:

- Explain what a test case is.
- Distinguish between input data, expected results and actual results.
- Prepare a test table for a Java program.
- Select test cases that cover different conditions.
- Identify boundary values that should be tested.
- Determine whether a test has passed or failed.
- Use failed tests to identify possible programming errors.

---

## 1. What Is a Test Case?

A test case describes a particular situation in which a program is tested.

A basic test case contains:

- **Input:** The value or values supplied to the program.
- **Expected result:** The result that should occur according to the requirements.
- **Actual result:** The result produced when the test is performed.
- **Test outcome:** Whether the actual result matches the expected result.

Consider a program that adds two integers.

```java
int firstNumber = 12;
int secondNumber = 8;

int total = firstNumber + secondNumber;

System.out.println(total);
```

Expected result:

```text
20
```

Actual result:

```text
20
```

The test passes because the program produces the expected answer.

However, this test only checks one combination of inputs. Additional test cases are needed to investigate other situations.

## 2. Expected Results and Actual Results

The expected result is determined from the problem requirements before the program is tested.

The actual result is what the program produces when it runs.

These two results must be compared to determine whether the test has passed.

Consider a program that calculates the total cost of purchasing items.

```java
int price = 15;
int quantity = 4;

int total = price * quantity;

System.out.println(total);
```

The expected result is:

\[
15 \times 4 = 60
\]

The program displays:

```text
60
```

The actual result matches the expected result, so the test passes.

Now suppose the program incorrectly uses addition instead of multiplication:

```java
int total = price + quantity;
```

The actual result becomes:

```text
19
```

The expected result is still `60`, so the test fails.

This comparison helps identify a logical error in the calculation.

---

## 3. Creating a Test Table

A test table organises test cases so that results can be recorded and compared systematically.

Consider a program that determines whether a student has passed a test. A mark of 50 or higher is a pass, and valid marks range from 0 to 100, inclusive.

| Test case | Input mark | Expected result |
|---|---:|---|
| 1 | 75 | Pass |
| 2 | 35 | Fail |
| 3 | 50 | Pass |
| 4 | 49 | Fail |
| 5 | 0 | Fail |
| 6 | 100 | Pass |

These test cases check ordinary values and important boundaries.

The mark of `50` is especially useful because it checks the exact pass threshold. The marks `0` and `100` check the minimum and maximum permitted values.

After running the program, you can add the actual result and outcome.

| Test case | Input mark | Expected result | Actual result | Outcome |
|---|---:|---|---|---|
| 1 | 75 | Pass | Pass | Pass |
| 2 | 35 | Fail | Fail | Pass |
| 3 | 50 | Pass | Fail | Fail |
| 4 | 49 | Fail | Fail | Pass |
| 5 | 0 | Fail | Fail | Pass |
| 6 | 100 | Pass | Pass | Pass |

The third test fails because the program incorrectly rejects a mark of exactly 50.

This suggests that the condition may use `mark > 50` instead of `mark >= 50`.

A test table makes the problem visible and helps direct your debugging efforts.

---

## 4. Selecting Useful Test Cases

A good set of test cases should check more than just ordinary input.

The values selected depend on the program's requirements.

### 4.1 Standard test cases

Standard test cases use typical valid inputs.

For a mark out of 100, examples include:

- `65`
- `72`
- `85`

These values help determine whether the program works under normal conditions.

### 4.2 Boundary test cases

Boundary test cases check values at the limits of a permitted range.

For marks between 0 and 100, inclusive, test:

- `0`
- `100`

It is also useful to test values immediately outside the permitted range:

- `-1`
- `101`

These values help identify errors in the program's validation conditions.

### 4.3 Test cases for different branches

When a program uses an `if-else` statement, test data should be selected to check both branches.

For example:

```java
if (mark >= 50)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Fail");
}
```

At least one test should produce `Pass`, and another should produce `Fail`.

Testing the boundary value of `50` is also important because it checks whether the comparison operator matches the requirement.

### 4.4 Test cases for loops

When testing a loop, consider whether it executes the correct number of times.

For example, a loop designed to display numbers from 1 to 5 should display exactly five numbers.

Test the output to determine whether the first and last values are correct and whether any values are missing or repeated.

---

## 5. Testing a Calculation

Consider a program that calculates the average of two marks.

```java
double firstMark = 70;
double secondMark = 85;

double average = (firstMark + secondMark) / 2.0;

System.out.println(average);
```

Expected result:

\[
\frac{70+85}{2}=77.5
\]

Actual output:

```text
77.5
```

The test passes.

Now consider what happens if the program incorrectly uses integer division:

```java
int firstMark = 70;
int secondMark = 85;

int average = (firstMark + secondMark) / 2;

System.out.println(average);
```

Output:

```text
77
```

The result is incorrect if the requirement is to calculate an accurate average including decimal values.

This illustrates why expected results should be calculated carefully before testing.

A useful set of test cases for an average calculator might include:

| First mark | Second mark | Expected average |
|---:|---:|---:|
| 60 | 80 | 70.0 |
| 70 | 85 | 77.5 |
| 0 | 100 | 50.0 |
| 100 | 100 | 100.0 |

These examples check different numerical combinations, including a result with a decimal part and the limits of the permitted mark range.

---

## 6. Testing Input Validation

Test cases are especially important when checking whether a program accepts and rejects the correct values.

Suppose a program accepts an integer mark from 0 to 100, inclusive.

```java
int mark = 101;

if (mark >= 0 && mark <= 100)
{
    System.out.println("Valid mark.");
}
else
{
    System.out.println("Invalid mark.");
}
```

Expected output:

```text
Invalid mark.
```

Actual output:

```text
Invalid mark.
```

The test passes.

A suitable test table would include the following values.

| Input | Expected result | Purpose |
|---:|---|---|
| -1 | Invalid | Below the minimum |
| 0 | Valid | Minimum boundary |
| 45 | Valid | Ordinary valid input |
| 100 | Valid | Maximum boundary |
| 101 | Invalid | Above the maximum |

If your program accepts `101`, examine the upper-bound condition. If it rejects `100`, check whether the condition incorrectly uses `<` instead of `<=`.

Remember that text such as `hello` is a different type of invalid input. If the program expects an integer, you must also consider how it handles failed numeric conversion.

---

## 7. Recording Failed Tests

When a test fails, investigate the difference between the expected and actual results.

Consider this test table.

| Input | Expected result | Actual result | Outcome |
|---:|---|---|---|
| 40 | Fail | Fail | Pass |
| 50 | Pass | Fail | Fail |
| 60 | Pass | Pass | Pass |

The program fails only when the mark is exactly 50.

This suggests that the error may be in the comparison operator rather than the overall structure of the program.

For example, the incorrect condition:

```java
if (mark > 50)
```

should be changed to:

```java
if (mark >= 50)
```

After correcting the condition, repeat the failed test and any other relevant tests.

**Important:** Do not change the expected result simply to match what the program produces. The expected result must come from the original requirements.

---

## 8. Common Mistakes

### Mistake 1: Recording the actual result as the expected result

The expected result must be determined independently of the program's output.

**Improvement:** Work out what should happen before running the test.

### Mistake 2: Testing only ordinary values

A program may work for typical values but fail at the boundaries.

**Improvement:** Include minimum, maximum and just-outside-boundary values where appropriate.

### Mistake 3: Forgetting to test every relevant branch

A selection statement may contain branches that are never tested.

**Improvement:** Choose test data that causes each relevant branch to execute.

### Mistake 4: Assuming a successful test proves the entire program is correct

One successful test only provides evidence about that particular situation.

**Improvement:** Use a range of test cases that cover the program's important requirements.

### Mistake 5: Failing to repeat a test after making a correction

A correction may not solve the original problem or may introduce another error.

**Improvement:** Repeat failed tests and run relevant tests again after changing the code.

---

## 9. Practical Challenge

Create a Java program called `TestCasePractice`.

Your program must:

1. Ask the user to enter a mark out of 100.
2. Validate that the mark is between 0 and 100, inclusive.
3. If the mark is valid, determine whether it is a pass or fail, using 50 as the pass mark.
4. Display a clear message describing the result.

Prepare a test table containing at least six test cases.

Your table must include:

- The input value.
- The expected result.
- The actual result.
- Whether the test passed or failed.

Use values that test ordinary input, the pass threshold and the minimum and maximum permitted marks.

### Extension challenge

Introduce an intentional error into your program, such as changing `>= 50` to `> 50`.

Use your test table to identify the error, correct it and repeat the failed test.

This exercise demonstrates how planned test cases help identify logical errors.

---

## Key Takeaways

- A test case specifies input and the result expected from a program.
- Expected results should be determined from the problem requirements.
- Actual results are obtained by running the program.
- A test passes when the actual result matches the expected result.
- Test tables help organise testing and identify failed cases.
- Boundary values are useful for checking conditions.
- Different test cases should cover the important requirements and branches of a program.
- After correcting an error, repeat the relevant tests.

---

## Navigation

- [Previous: Standard, Extreme and Abnormal Data](../Standard-Extreme-and-Abnormal-Data/README.md)
- [Next: Trace Tables](../Trace-Tables/README.md)
- [Back to Testing and Debugging](../README.md)
- [Back to Grade 10 Java](../../README.md)
