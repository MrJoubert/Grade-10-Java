# Relational Operators

## Learning Objectives

By the end of this section, you should be able to:

- Identify the six relational operators used in Java.
- Explain what each relational operator means.
- Compare numeric values using relational operators.
- Store comparison results in boolean variables.
- Use relational expressions in `if` statements.
- Distinguish between assignment (`=`) and equality comparison (`==`).

---

## 1. What Are Relational Operators?

Relational operators compare two values.

The result of a relational expression is always a boolean value:

- `true` if the comparison is correct.
- `false` if the comparison is incorrect.

For example, suppose a student receives a mark of 75.

```java
int mark = 75;

System.out.println(mark > 50);
```

Output:

```text
true
```

The expression checks whether 75 is greater than 50. Because the statement is correct, Java returns `true`.

## 2. The Six Relational Operators

| Operator | Meaning | Example | Result |
|---|---|---|---|
| `==` | Equal to | `75 == 75` | `true` |
| `!=` | Not equal to | `75 != 50` | `true` |
| `>` | Greater than | `75 > 50` | `true` |
| `<` | Less than | `75 < 50` | `false` |
| `>=` | Greater than or equal to | `75 >= 75` | `true` |
| `<=` | Less than or equal to | `75 <= 50` | `false` |

These operators are commonly used to check whether values meet particular conditions.

---

## 3. Equal To: `==`

The `==` operator checks whether two primitive values are equal.

```java
int mark = 80;

System.out.println(mark == 80);
System.out.println(mark == 70);
```

Output:

```text
true
false
```

The first comparison is true because the mark is 80. The second comparison is false because the mark is not 70.

**Important:** Use `==` for equality comparisons, not `=`.

```java
mark = 80;
```

The single equals sign assigns a value to a variable.

```java
mark == 80
```

The double equals sign compares the value stored in the variable with 80.

---

## 4. Not Equal To: `!=`

The `!=` operator checks whether two values are different.

```java
int mark = 65;

System.out.println(mark != 50);
System.out.println(mark != 65);
```

Output:

```text
true
false
```

The mark is different from 50 but is equal to 65.

---

## 5. Greater Than: `>`

The `>` operator checks whether the value on the left is greater than the value on the right.

```java
int mark = 85;

System.out.println(mark > 50);
System.out.println(mark > 85);
```

Output:

```text
true
false
```

A value is not greater than itself. Therefore, `85 > 85` is false.

---

## 6. Less Than: `<`

The `<` operator checks whether the value on the left is less than the value on the right.

```java
int mark = 42;

System.out.println(mark < 50);
System.out.println(mark < 42);
```

Output:

```text
true
false
```

A value is not less than itself, so `42 < 42` is false.

---

## 7. Greater Than or Equal To: `>=`

The `>=` operator checks whether a value is greater than another value or equal to it.

```java
int mark = 50;

System.out.println(mark >= 50);
System.out.println(mark >= 51);
```

Output:

```text
true
false
```

The first expression is true because 50 is equal to 50.

This operator is useful when a minimum value must be reached. For example, if a mark of 50 is required to pass, the condition would be:

```java
mark >= 50
```

---

## 8. Less Than or Equal To: `<=`

The `<=` operator checks whether a value is less than another value or equal to it.

```java
int absences = 3;

System.out.println(absences <= 3);
System.out.println(absences <= 2);
```

Output:

```text
true
false
```

The first comparison is true because the number of absences is equal to 3.

---

## 9. Storing Comparison Results

A relational expression can be assigned to a boolean variable.

```java
int mark = 72;

boolean passed = mark >= 50;
boolean distinction = mark >= 80;

System.out.println(passed);
System.out.println(distinction);
```

Output:

```text
true
false
```

The first variable stores the result of checking whether the mark is at least 50. The second stores the result of checking whether the mark is at least 80.

The comparisons are evaluated before their results are stored.

---

## 10. Using Relational Operators in `if` Statements

Relational operators can control which instructions execute.

```java
int mark = 68;

if (mark >= 50) {
    System.out.println("The student passed.");
} else {
    System.out.println("The student did not pass.");
}
```

Output:

```text
The student passed.
```

The condition `mark >= 50` evaluates to `true`, so the first block executes.

Another example:

```java
int absences = 6;

if (absences <= 5) {
    System.out.println("Attendance requirement met.");
} else {
    System.out.println("Attendance requirement not met.");
}
```

Output:

```text
Attendance requirement not met.
```

The number of absences exceeds 5, so the condition is false.

---

## 11. Common Mistakes

### Mistake 1: Using `=` instead of `==`

Incorrect for a comparison:

```java
if (mark = 50) {
    System.out.println("Mark is 50.");
}
```

This does not perform an equality comparison and does not compile because the condition is not a boolean expression.

Correct:

```java
if (mark == 50) {
    System.out.println("Mark is 50.");
}
```

### Mistake 2: Forgetting that equality is included

```java
int mark = 50;

System.out.println(mark > 50);
System.out.println(mark >= 50);
```

Output:

```text
false
true
```

The first expression requires the mark to be strictly greater than 50. The second allows it to equal 50.

### Mistake 3: Reversing the comparison

```java
int mark = 40;

System.out.println(mark < 50);
```

This is true because 40 is less than 50. Always read the operator from left to right.

### Mistake 4: Expecting a comparison to display words automatically

```java
System.out.println(mark >= 50);
```

This displays `true` or `false`. If you want a message, use the result in an `if` statement.

---

## 12. Practice Exercises

### Exercise 1: Predict the Results

Assume:

```java
int mark = 75;
```

Determine the result of each expression:

```java
mark == 75
mark != 75
mark > 70
mark < 70
mark >= 75
mark <= 74
```

### Exercise 2: Minimum Passing Mark

Declare an integer variable called `mark` containing 50.

Create a boolean variable called `passed` that checks whether the mark is at least 50. Display the result.

### Exercise 3: Attendance Check

Declare an integer variable called `absences` containing 4.

Use `<=` to determine whether the student has no more than 5 absences. Display the result.

### Exercise 4: Compare Two Marks

Declare two integer variables called `markOne` and `markTwo`.

Display the results of checking whether the first mark is greater than, less than and equal to the second mark.

### Exercise 5: Use an `if` Statement

Create an integer variable called `average`.

If the average is at least 80, display `"High achievement."` Otherwise, display `"Continue working towards the target."`

Test the programme with values above, below and equal to 80.

---

## Summary

- Relational operators compare two values.
- `==` checks equality.
- `!=` checks inequality.
- `>` checks whether a value is greater than another.
- `<` checks whether a value is less than another.
- `>=` checks whether a value is greater than or equal to another.
- `<=` checks whether a value is less than or equal to another.
- Relational expressions produce `true` or `false`.
- Comparison results can be stored in boolean variables or used in `if` statements.
