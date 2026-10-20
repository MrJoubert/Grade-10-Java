# Testing and Debugging

## Overview

Writing Java code is only one part of developing a reliable program. You must also determine whether the program behaves as expected, identify errors and correct them.

**Testing** involves running or examining a program using selected inputs to determine whether it produces the expected results.

**Debugging** is the process of identifying, investigating and correcting errors in a program.

A program may compile and execute successfully but still produce an incorrect result. For this reason, testing must consider not only whether the program runs, but also whether its logic correctly solves the problem.

In Grade 10 Information Technology, testing and debugging are important skills for practical programming, algorithm development and examination questions. You should be able to select suitable test data, predict expected results, trace variables through an algorithm and distinguish between different types of programming errors.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of software testing.
- Explain the difference between testing and debugging.
- Identify suitable test cases for a programming problem.
- Distinguish between standard, extreme and abnormal test data.
- Determine expected results before running a program.
- Construct a test table containing inputs, expected results and actual results.
- Use trace tables to follow the execution of an algorithm.
- Identify syntax, runtime and logical errors.
- Explain common causes of programming errors.
- Debug Java code systematically.
- Evaluate whether a program behaves correctly under different conditions.
- Apply testing techniques to improve the reliability of a Java program.

## IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology requirements involving testing, robustness, trace tables, algorithm evaluation and the identification of syntax, runtime and logical errors.

The examples focus on introductory Java programming and the testing of algorithms involving variables, calculations, input, selection and loops.

The aim is to help you develop a systematic approach to checking your work and explaining why a program does or does not produce the expected result. This resource is intended for student learning and is not an official IEB publication.

## Topic Structure

Work through the following subtopics in order.

1. [Testing Strategies](Testing-Strategies/README.md)
2. [Standard, Extreme and Abnormal Data](Standard-Extreme-and-Abnormal-Data/README.md)
3. [Test Cases and Expected Results](Test-Cases-and-Expected-Results/README.md)
4. [Trace Tables](Trace-Tables/README.md)
5. [Syntax, Runtime and Logic Errors](Syntax-Runtime-and-Logic-Errors/README.md)
6. [Debugging and Correcting Errors](Debugging-and-Correcting-Errors/README.md)
7. [Robustness Testing](Robustness-Testing/README.md)

---

## 1. Why Is Testing Important?

Testing helps determine whether a program meets its requirements and produces correct results.

Consider a program that calculates the average of two marks.

```java
int mark1 = 60;
int mark2 = 81;

double average = (mark1 + mark2) / 2.0;

System.out.println("Average: " + average);
```

Output:

```text
Average: 70.5
```

The output is correct for these two marks. However, testing with only one pair of marks does not prove that the program will behave correctly for every relevant input.

You should also consider cases such as:

- Both marks being zero.
- Both marks being one hundred.
- The marks being equal.
- One mark being much higher than the other.
- An invalid mark being entered.
- Input that cannot be converted to a number.

Different test cases reveal different types of problems.

### Testing versus debugging

| Testing | Debugging |
|---|---|
| Checks whether a program behaves as expected. | Investigates and corrects errors. |
| Uses selected inputs and expected results. | Examines the code and its behaviour to find the cause of a problem. |
| May reveal that the output is incorrect. | Attempts to identify why the output is incorrect. |

Testing can reveal a problem, but debugging is the process of investigating and fixing it.

## 2. Testing Strategies

A testing strategy is a planned approach to checking a program.

Instead of entering random values, select inputs that help determine whether the program meets its requirements.

### Test individual calculations

Check whether calculations produce the expected result.

For example, if a program calculates the area of a rectangle, test it using dimensions for which the area is easy to calculate manually.

### Test selection statements

For an `if-else` statement, test values that cause both the true and false branches to execute.

For example, if a program checks whether a mark is at least `50`, test one mark below `50` and another at or above `50`.

### Test loops

Check that a loop:

- Executes when it should.
- Stops when its stopping condition is reached.
- Repeats the correct number of times.
- Updates its control variable correctly.

### Test input and validation

Check whether the program accepts valid values and responds appropriately to invalid values.

### Compare expected and actual results

Before running a test, determine the expected result. After running the program, compare its actual behaviour with that expectation.

A mismatch indicates that further investigation is needed.

## 3. Standard, Extreme and Abnormal Test Data

Test data can be grouped into categories. The categories help you select a useful range of test cases.

### Standard data

Standard data is ordinary, valid input that falls within the permitted requirements.

For a mark between `0` and `100`, examples include:

- `45`
- `68`
- `92`

These values help establish whether the program works under normal conditions.

### Extreme data

Extreme data tests the boundaries of the permitted range or values close to those boundaries.

If a mark must be between `0` and `100`, useful boundary values include:

- `0`
- `1`
- `99`
- `100`

These values can reveal errors involving comparison operators or incorrectly defined limits.

### Abnormal data

Abnormal data is invalid or unexpected input that should not be accepted under the program's requirements.

For a mark between `0` and `100`, examples include:

- `-1`
- `101`

If the program accepts only whole numbers, text such as `hello` is also inappropriate input. An empty response or a cancelled input dialog may need separate consideration.

### Example comparison

Suppose the requirement is to accept whole-number marks from `0` to `100`, inclusive.

| Category | Test input | Expected behaviour |
|---|---:|---|
| Standard | `65` | Accept the mark. |
| Standard | `80` | Accept the mark. |
| Extreme | `0` | Accept the lower boundary. |
| Extreme | `100` | Accept the upper boundary. |
| Abnormal | `-1` | Reject the mark. |
| Abnormal | `101` | Reject the mark. |
| Abnormal | `hello` | Display an appropriate numeric-input error. |

The expected behaviour depends on the program's stated requirements. Always identify those requirements before selecting your test data.

## 4. Test Cases and Expected Results

A **test case** is a specific test designed to check a particular aspect of a program.

A test case should identify the input or condition being tested and the result that should occur.

Consider a program that determines whether a mark is a pass. The requirement is that a mark of `50` or higher is a pass.

A suitable test table is:

| Test case | Input mark | Expected result |
|---|---:|---|
| Below the pass mark | `49` | Fail |
| Exactly at the pass mark | `50` | Pass |
| Above the pass mark | `75` | Pass |
| Minimum permitted mark | `0` | Fail |
| Maximum permitted mark | `100` | Pass |

The test case at `50` is particularly important because it checks the boundary between a pass and a fail.

### Expected versus actual results

- **Expected result:** What should happen according to the requirements.
- **Actual result:** What the program really does when tested.

For example, if the input is `50` and the program displays `Fail`, the actual result does not match the expected result.

The program may contain an incorrect comparison operator.

### Choosing useful test cases

When creating a test table:

1. Identify the program's requirements.
2. Identify the important conditions and boundaries.
3. Choose inputs that exercise different outcomes.
4. Predict the expected results.
5. Run the tests.
6. Record the actual results.
7. Investigate any differences.

A good test table demonstrates that the program has been checked systematically rather than with only one convenient example.

## 5. Trace Tables

A **trace table** is a table used to follow the values of variables as an algorithm executes.

Trace tables are particularly useful when analysing loops, calculations and selection statements.

Consider this Java code:

```java
int total = 0;

for (int number = 1; number <= 4; number++) {
    total = total + number;
}

System.out.println(total);
```

The loop adds the numbers `1`, `2`, `3` and `4` to `total`.

The trace table is:

| Iteration | `number` | `total` before addition | `total` after addition |
|---:|---:|---:|---:|
| 1 | 1 | 0 | 1 |
| 2 | 2 | 1 | 3 |
| 3 | 3 | 3 | 6 |
| 4 | 4 | 6 | 10 |

After the fourth iteration, `number` is incremented to `5`. The condition `number <= 4` is false, so the loop ends.

Output:

```text
10
```

### How to construct a trace table

1. Read the code carefully.
2. Identify the variables whose values change.
3. Create a column for each relevant variable.
4. Follow the instructions in their actual execution order.
5. Record each variable's new value after an assignment.
6. Evaluate conditions whenever they are checked.
7. Record the output when it occurs.

### Trace tables and loops

When tracing a loop, remember that the condition is checked at the appropriate point in the loop's execution.

For a `for` loop, the initialisation happens before the first iteration. The condition is checked before each iteration, and the update expression runs after the loop body.

For a `while` loop, the condition is checked before each execution of the body.

For a `do-while` loop, the body executes before the condition is checked.

Understanding these differences helps you trace the number of times each loop executes.

## 6. Syntax Errors

A **syntax error** occurs when code violates the rules of the Java programming language.

Examples include:

- Missing semicolons.
- Incorrectly written keywords.
- Unmatched braces.
- Missing quotation marks.
- Incorrect method-call syntax.

Example:

```java
int age = 16
System.out.println(age);
```

The declaration is missing a semicolon.

Corrected code:

```java
int age = 16;
System.out.println(age);
```

A syntax error may prevent the program from compiling successfully.

When debugging syntax errors, read the compiler message carefully. The reported location is useful, although the actual mistake may appear on an earlier line.

## 7. Runtime Errors

A **runtime error** occurs while a program is executing.

One example is attempting integer division by zero.

```java
int number = 10;
int divisor = 0;

int result = number / divisor;
```

This produces an `ArithmeticException` during execution.

The code may be syntactically valid, but the operation cannot be completed successfully.

A related example involves converting invalid numeric text:

```java
String input = "hello";
int number = Integer.parseInt(input);
```

This produces a `NumberFormatException`.

Runtime errors can often be prevented or handled by checking input, considering exceptional conditions and using appropriate error-handling techniques.

## 8. Logical Errors

A **logical error** occurs when a program executes but does not produce the intended result.

Consider this code:

```java
int length = 8;
int width = 5;

int area = length + width;

System.out.println(area);
```

Output:

```text
13
```

The program runs, but the formula is incorrect. The area of a rectangle is calculated by multiplying its length by its width.

Corrected code:

```java
int length = 8;
int width = 5;

int area = length * width;

System.out.println(area);
```

Output:

```text
40
```

Logical errors are not always obvious because the code may compile and execute without displaying an error message.

To find them, compare the program's algorithm and calculations with the original problem requirements.

## 9. Comparing the Three Error Types

| Error type | What happens? | Example |
|---|---|---|
| Syntax error | Code violates Java syntax rules and may not compile. | A missing semicolon. |
| Runtime error | A problem occurs while the program executes. | Integer division by zero. |
| Logical error | The program runs but produces an incorrect result. | Adding two dimensions instead of multiplying them to calculate area. |

When explaining an error in an examination, identify the type of error and explain the specific problem. Merely stating that the code is incorrect is not enough.

## 10. Debugging and Correcting Errors

Debugging should be a systematic process rather than a series of random code changes.

Use the following approach:

### Step 1: Reproduce the problem

Run the program with input that demonstrates the error.

### Step 2: Identify the expected result

Determine what should happen according to the requirements.

### Step 3: Compare the actual behaviour

Check the output, variable values and execution path.

### Step 4: Locate the likely cause

Inspect the relevant calculation, condition, assignment, loop or input-conversion statement.

### Step 5: Correct the code

Make a change that addresses the underlying problem.

### Step 6: Test again

Repeat the original test to confirm that the error has been corrected.

### Step 7: Check for unintended consequences

Run other relevant test cases to make sure the correction has not introduced a new problem.

### Example

The following code is intended to determine whether a mark is a pass:

```java
int mark = 65;

if (mark > 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

This code works for `65`, but consider the requirement that a mark of `50` or higher must be a pass.

The condition `mark > 50` excludes `50`.

The corrected condition is:

```java
if (mark >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

The change from `>` to `>=` corrects the boundary condition.

This illustrates why boundary testing is important.

## 11. Robustness Testing

A program is robust when it handles the relevant inputs and conditions appropriately, including invalid or unexpected input.

Robustness testing examines how a program behaves under such conditions.

For example, a program that accepts a mark from `0` to `100` should not simply assume that every entered value is valid.

It should consider:

- Values below the minimum.
- Values above the maximum.
- Values exactly at the boundaries.
- Text entered instead of a number.
- Empty or cancelled input, if applicable.
- Values that might cause an invalid calculation.

### Example: validating a mark

A basic range check is:

```java
if (mark >= 0 && mark <= 100) {
    System.out.println("Valid mark");
} else {
    System.out.println("Invalid mark");
}
```

This checks the permitted range once `mark` has been successfully stored as an integer.

It does not, by itself, handle text that cannot be converted into an integer. That requires a separate conversion check.

This distinction is important when evaluating whether a program is robust.

### Robustness and user feedback

When input is invalid, a useful program should provide an appropriate response.

For example:

```text
Invalid mark.
Please enter a whole number from 0 to 100.
```

The user should understand what went wrong and what is required to continue.

Robustness is not achieved by rejecting every unusual value. The program must follow its actual requirements and handle relevant situations correctly.

## Common Mistakes

Avoid the following mistakes when testing and debugging:

- Testing a program with only one input.
- Choosing test values without considering the requirements.
- Forgetting to test the minimum and maximum permitted values.
- Confusing extreme data with abnormal data.
- Recording an expected result after seeing the actual result instead of predicting it first.
- Ignoring a difference between expected and actual results.
- Confusing syntax errors, runtime errors and logical errors.
- Assuming that code which compiles must be correct.
- Tracing a loop without recording each variable update.
- Forgetting to evaluate the loop condition at the correct point.
- Changing code without identifying the underlying cause of an error.
- Correcting one test case without checking other cases.
- Assuming a range check also validates numeric conversion.
- Ignoring the possibility of invalid or cancelled input when the program must handle it.

## Recommended Study Approach

Use the following approach when preparing for practical assessments and examinations.

1. **Understand the requirements.** Identify what the program must do.
2. **Predict the result.** Work out the expected output for selected inputs.
3. **Choose test data.** Include standard, extreme and abnormal cases where relevant.
4. **Construct a test table.** Record each input and its expected result.
5. **Trace the code.** Use a trace table to follow variable values and loop execution.
6. **Identify the error type.** Decide whether the problem is a syntax, runtime or logical error.
7. **Explain the cause.** State precisely which instruction, condition or calculation is incorrect.
8. **Correct the code.** Make the smallest suitable change that addresses the problem.
9. **Retest the program.** Confirm that the correction works and does not create additional problems.

When answering a question about an incorrect program, do not immediately rewrite the entire program. First identify the error, explain its effect and then propose a correction.

## Practical Challenge

Develop a Java program that accepts three assessment marks and calculates their average.

Your program must:

1. Request three marks using `JOptionPane`.
2. Convert the entered values to integers.
3. Validate that each mark is between `0` and `100`.
4. Calculate the total and average only when all three marks are valid.
5. Display the total and average with meaningful labels.
6. Display an appropriate error message when a mark is outside the permitted range.
7. Consider how to handle input that cannot be converted into an integer.

### Test your program

Use the following test cases as a starting point.

| Test case | Mark 1 | Mark 2 | Mark 3 | Expected behaviour |
|---|---:|---:|---:|---|
| Standard data | 60 | 70 | 80 | Accept all marks and calculate the average. |
| Lower boundary | 0 | 50 | 100 | Accept all marks and calculate the average. |
| Upper boundary | 100 | 100 | 100 | Accept all marks and calculate the average. |
| Below range | -1 | 60 | 70 | Reject the invalid mark. |
| Above range | 101 | 60 | 70 | Reject the invalid mark. |
| Invalid numeric text | `hello` | 60 | 70 | Display an appropriate input error. |

For each test, record the actual result and compare it with the expected behaviour.

### Extension activities

- Write pseudocode for the program.
- Draw a flowchart for the validation process.
- Create a trace table for the average calculation.
- Deliberately introduce a logical error and determine which test case reveals it.
- Investigate how a loop could be used to repeat the input process when a mark is invalid.

## Key Takeaways

- Testing checks whether a program meets its requirements.
- Debugging involves identifying and correcting errors.
- Standard data tests normal valid inputs.
- Extreme data tests boundaries or values near boundaries.
- Abnormal data tests invalid or unexpected inputs.
- Test cases should have expected results determined before execution.
- Trace tables show how variables change as an algorithm executes.
- Syntax errors violate Java's language rules.
- Runtime errors occur during execution.
- Logical errors cause incorrect results even when the program runs.
- Debugging should be systematic and based on evidence.
- Robustness testing checks how a program responds to relevant invalid or unexpected conditions.
- A correction should always be tested again.
- Reliable programs are developed by combining correct logic, suitable test data and systematic debugging.

---

## Navigation

- [Previous: User Interface and Validation](../10-User-Interface-and-Validation/README.md)
- **Current topic: Testing and Debugging**
- [Next: Integrated Examples and Practice](../12-Integrated-Examples-and-Practice/README.md)
- [Back to the Grade 10 Java Library](../README.md)

