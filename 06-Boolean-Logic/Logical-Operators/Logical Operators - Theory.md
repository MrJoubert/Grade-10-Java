# Logical Operators

## Learning Objectives

By the end of this section, you should be able to:

- Identify the three logical operators in Java.
- Use `&&` to combine conditions that must both be true.
- Use `||` to combine conditions where at least one must be true.
- Use `!` to reverse a boolean value.
- Predict the results of logical expressions.
- Use logical operators in `if` statements.

---

## 1. What Are Logical Operators?

Relational operators compare values and produce a boolean result.

Logical operators work with boolean expressions. They allow you to combine conditions or reverse a condition.

Java has three main logical operators:

| Operator | Name | Meaning |
|---|---|---|
| `&&` | AND | Both conditions must be true |
| `||` | OR | At least one condition must be true |
| `!` | NOT | Reverses a boolean value |

For example, a student might need to achieve a mark of at least 50 and have submitted a project to meet a particular requirement.

Logical operators allow both requirements to be checked in one expression.

---

## 2. The AND Operator (`&&`)

The AND operator returns `true` only when both conditions are true.

### Truth table

| Condition A | Condition B | `A && B` |
|---|---|---|
| `true` | `true` | `true` |
| `true` | `false` | `false` |
| `false` | `true` | `false` |
| `false` | `false` | `false` |

Remember: **AND means both conditions must be true.**

### Example

```java
int mark = 75;
boolean submittedProject = true;

System.out.println(mark >= 50 && submittedProject);
```

Output:

```text
true
```

The student achieved at least 50 and submitted the project. Both conditions are true, so the complete expression is true.

### Another example

```java
int mark = 45;
boolean submittedProject = true;

System.out.println(mark >= 50 && submittedProject);
```

Output:

```text
false
```

The project was submitted, but the mark is below 50. One condition is false, so the AND expression is false.

---

## 3. The OR Operator (`||`)

The OR operator returns `true` when at least one condition is true. It returns `false` only when both conditions are false.

### Truth table

| Condition A | Condition B | `A || B` |
|---|---|---|
| `true` | `true` | `true` |
| `true` | `false` | `true` |
| `false` | `true` | `true` |
| `false` | `false` | `false` |

Remember: **OR means at least one condition must be true.**

### Example

Suppose a student can attend a support session if they are available on Monday or Tuesday.

```java
boolean availableMonday = false;
boolean availableTuesday = true;

System.out.println(availableMonday || availableTuesday);
```

Output:

```text
true
```

The student is available on Tuesday, so at least one condition is true.

### Another example

```java
boolean availableMonday = false;
boolean availableTuesday = false;

System.out.println(availableMonday || availableTuesday);
```

Output:

```text
false
```

Neither condition is true.

---

## 4. The NOT Operator (`!`)

The NOT operator reverses a boolean value.

- `!true` becomes `false`.
- `!false` becomes `true`.

### Example

```java
boolean registered = true;

System.out.println(!registered);
```

Output:

```text
false
```

The variable `registered` is true, so `!registered` is false.

### Another example

```java
boolean resultsPublished = false;

System.out.println(!resultsPublished);
```

Output:

```text
true
```

The variable is false, so the NOT operator reverses it to true.

### Using NOT in a condition

```java
boolean absent = false;

if (!absent) {
    System.out.println("Student is present.");
}
```

Output:

```text
Student is present.
```

The expression `!absent` is true because `absent` is false.

---

## 5. Combining Relational and Logical Operators

Logical operators are often used with relational expressions.

```java
int mark = 75;
int attendance = 90;

boolean eligible = mark >= 50 && attendance >= 80;

System.out.println(eligible);
```

Output:

```text
true
```

The student has a mark of at least 50 and attendance of at least 80%. Both conditions are true.

Now consider:

```java
int mark = 75;
int attendance = 65;

boolean eligible = mark >= 50 && attendance >= 80;

System.out.println(eligible);
```

Output:

```text
false
```

The mark condition is true, but the attendance condition is false. Therefore, the complete AND expression is false.

### Example using OR

A student qualifies for a support session if their mark is below 40 or their attendance is below 70%.

```java
int mark = 35;
int attendance = 85;

boolean needsSupport = mark < 40 || attendance < 70;

System.out.println(needsSupport);
```

Output:

```text
true
```

The mark is below 40, so at least one condition is true.

---

## 6. Using Logical Operators in `if` Statements

Logical operators allow a programme to make decisions based on multiple conditions.

### Example: Meeting two requirements

```java
int mark = 78;
boolean projectSubmitted = true;

if (mark >= 50 && projectSubmitted) {
    System.out.println("Requirements met.");
} else {
    System.out.println("Requirements not met.");
}
```

Output:

```text
Requirements met.
```

Both conditions are true, so the first block executes.

### Example: Checking for support

```java
int mark = 38;
int attendance = 90;

if (mark < 40 || attendance < 70) {
    System.out.println("Student requires support.");
} else {
    System.out.println("No additional support flagged.");
}
```

Output:

```text
Student requires support.
```

The mark is below 40, so the OR expression is true.

---

## 7. Understanding Short-Circuit Evaluation

Java uses short-circuit evaluation for `&&` and `||`.

With `&&`, if the first condition is false, Java already knows the complete result must be false. It may therefore skip evaluating the second condition.

With `||`, if the first condition is true, Java already knows the complete result must be true. It may therefore skip evaluating the second condition.

For example:

```java
int mark = 40;

if (mark >= 50 && mark <= 100) {
    System.out.println("Mark is in the passing range.");
} else {
    System.out.println("Mark is below the passing mark.");
}
```

Because `mark >= 50` is false, the complete AND expression is false.

Short-circuit evaluation can be useful when the second condition should only be checked if the first condition is satisfied. You should understand the behaviour even when you are not yet writing complex conditions.

---

## 8. Common Mistakes

### Mistake 1: Using `&` instead of `&&`

For ordinary logical conditions, use `&&` for AND.

```java
mark >= 50 && attendance >= 80
```

Java also has a single `&` operator, but its evaluation behaviour differs for boolean expressions because it does not short-circuit. Use `&&` when writing normal combined conditions.

### Mistake 2: Using `||` when both conditions are required

If both the mark and attendance requirements must be met, use:

```java
mark >= 50 && attendance >= 80
```

Using `||` would allow either condition to be true, which changes the requirement.

### Mistake 3: Forgetting the NOT operator's effect

```java
boolean registered = true;

System.out.println(!registered);
```

The result is `false`, not `true`. The NOT operator reverses the value.

### Mistake 4: Confusing `&&` and `||`

- `&&`: both conditions must be true.
- `||`: at least one condition must be true.

Read the requirement carefully before selecting the operator.

---

## 9. Practice Exercises

### Exercise 1: AND

Declare two boolean variables:

```java
boolean passed = true;
boolean projectSubmitted = false;
```

Display the result of `passed && projectSubmitted`.

Then change both values to `true` and predict the result.

### Exercise 2: OR

Declare two boolean variables representing availability on Monday and Tuesday.

Display the result using `||`. Test the programme with both values false and with one value true.

### Exercise 3: NOT

Declare a boolean variable called `registered` with the value `false`.

Display both `registered` and `!registered`.

### Exercise 4: Student Eligibility

Declare an integer variable called `mark` and a boolean variable called `projectSubmitted`.

A student meets the requirements only if the mark is at least 50 and the project has been submitted. Store the result in a boolean variable called `eligible`.

### Exercise 5: Support Requirement

Declare an integer variable called `mark` and an integer variable called `attendance`.

A student needs support if the mark is below 40 or attendance is below 70%. Write an expression that determines whether the student needs support.

### Exercise 6: Predict the Results

Determine the result of each expression:

```java
true && true
true && false
false || true
false || false
!true
!false
```

---

## Summary

- `&&` returns true only when both conditions are true.
- `||` returns true when at least one condition is true.
- `!` reverses a boolean value.
- Logical operators can combine relational expressions.
- Logical expressions can be stored in boolean variables or used in `if` statements.
- Java uses short-circuit evaluation with `&&` and `||`.
