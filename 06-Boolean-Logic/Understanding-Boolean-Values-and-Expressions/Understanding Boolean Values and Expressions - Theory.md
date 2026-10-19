# Understanding Boolean Values and Expressions

## Learning Objectives

By the end of this section, you should be able to:

- Explain what a boolean value is.
- Declare and initialise boolean variables.
- Identify expressions that produce boolean results.
- Use boolean values to represent conditions.
- Distinguish between a boolean variable and a string containing `"true"` or `"false"`.

---

## 1. What Is a Boolean?

A `boolean` is a Java data type that can store only one of two values:

- `true`
- `false`

A boolean is useful when a programme needs to represent a condition that is either satisfied or not satisfied.

For example, a school programme might need to record whether:

- A student has passed an assessment.
- A student's results have been published.
- A student is registered for a subject.
- A class has completed an activity.

Each of these conditions can be represented using a boolean value.

## 2. Declaring Boolean Variables

A boolean variable is declared using the keyword `boolean`.

### Syntax

```java
boolean variableName = value;
```

The value must be either `true` or `false`.

### Example 1: A student passes an assessment

```java
boolean passed = true;

System.out.println(passed);
```

Output:

```text
true
```

The variable `passed` stores the boolean value `true`.

### Example 2: Results have not been published

```java
boolean resultsPublished = false;

System.out.println(resultsPublished);
```

Output:

```text
false
```

The variable stores `false` because the results have not yet been published.

### Important

Boolean values do not require quotation marks.

Correct:

```java
boolean passed = true;
```

Incorrect:

```java
boolean passed = "true";
```

The second example is incorrect because `"true"` is a `String`, not a boolean value.

---

## 3. Boolean Expressions

A boolean expression is an expression that produces either `true` or `false`.

For example:

```java
int mark = 75;

System.out.println(mark >= 50);
```

Output:

```text
true
```

The expression `mark >= 50` checks whether the mark is greater than or equal to 50.

Because the mark is 75, the expression evaluates to `true`.

Consider another example:

```java
int mark = 42;

System.out.println(mark >= 50);
```

Output:

```text
false
```

The mark is below 50, so the expression evaluates to `false`.

---

## 4. Using Comparison Operators

Comparison operators are commonly used to produce boolean results.

| Operator | Meaning | Example |
|---|---|---|
| `==` | Equal to | `mark == 75` |
| `!=` | Not equal to | `mark != 75` |
| `>` | Greater than | `mark > 50` |
| `<` | Less than | `mark < 50` |
| `>=` | Greater than or equal to | `mark >= 50` |
| `<=` | Less than or equal to | `mark <= 50` |

Assume:

```java
int mark = 75;
```

The following expressions produce these results:

| Expression | Result |
|---|---|
| `mark == 75` | `true` |
| `mark != 75` | `false` |
| `mark > 50` | `true` |
| `mark < 50` | `false` |
| `mark >= 75` | `true` |
| `mark <= 70` | `false` |

These expressions can be stored in boolean variables.

```java
boolean passed = mark >= 50;
boolean distinction = mark >= 80;
```

For a mark of 75, `passed` is `true` and `distinction` is `false`.

---

## 5. Boolean Variables and `if` Statements

Boolean values are often used to control which instructions a programme executes.

```java
boolean passed = true;

if (passed) {
    System.out.println("The student passed.");
} else {
    System.out.println("The student did not pass.");
}
```

Output:

```text
The student passed.
```

When the condition is `true`, the first block executes. When it is `false`, the `else` block executes.

A boolean variable can also store the result of a comparison.

```java
int mark = 68;
boolean passed = mark >= 50;

if (passed) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

Output:

```text
Pass
```

---

## 6. Boolean Values Versus Text

A boolean and a string may display similar characters, but they are different data types.

```java
boolean passed = true;
String result = "true";
```

The variable `passed` stores a boolean value.

The variable `result` stores text.

You cannot assign a string directly to a boolean variable:

```java
boolean passed = "true";
```

This causes a compilation error.

Use the correct data type for the information being stored.

---

## 7. Common Mistakes

### Mistake 1: Using quotation marks

Incorrect:

```java
boolean registered = "true";
```

Correct:

```java
boolean registered = true;
```

### Mistake 2: Using `=` instead of `==` in a comparison

The single equals sign `=` assigns a value to a variable.

The double equals sign `==` compares values.

```java
int mark = 75;

System.out.println(mark == 75);
```

Output:

```text
true
```

### Mistake 3: Thinking a boolean can store any value

A boolean can store only `true` or `false`.

Values such as `1`, `0`, `"Yes"` and `"No"` are not boolean values in Java.

### Mistake 4: Confusing the variable with its expression

```java
int mark = 45;
boolean passed = mark >= 50;
```

The variable `mark` stores an integer. The variable `passed` stores the result of the comparison, which is `false`.

---

## 8. Practice Exercises

### Exercise 1: Declare Boolean Variables

Declare and initialise the following variables:

- `registered` with `true`
- `resultsPublished` with `false`
- `attended` with `true`

Display all three values.

### Exercise 2: Check a Mark

Declare an integer variable containing `65`.

Create a boolean variable called `passed` that stores whether the mark is greater than or equal to 50. Display the result.

### Exercise 3: Predict the Results

Assume `mark = 72`.

Determine the result of each expression:

```java
mark > 50
mark < 50
mark == 72
mark != 72
mark >= 70
mark <= 60
```

### Exercise 4: Use a Boolean in an `if` Statement

Declare a boolean variable called `registered`.

Display `"Student is registered."` when the value is `true`, and `"Student is not registered."` when it is `false`.

Test the programme with both values.

### Exercise 5: Identify the Error

Explain why the following statement does not compile:

```java
boolean passed = "false";
```

Rewrite the statement correctly.

---

## Summary

- A `boolean` stores either `true` or `false`.
- Boolean expressions evaluate to one of these two values.
- Comparison operators can produce boolean results.
- Boolean variables can be used in `if` statements.
- Boolean values do not use quotation marks.
- A boolean is different from a string containing the text `"true"` or `"false"`.
