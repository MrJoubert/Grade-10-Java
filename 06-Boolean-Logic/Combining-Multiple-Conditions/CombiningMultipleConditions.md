# Combining Multiple Conditions

## Learning Objectives

By the end of this section, you should be able to:

- Combine multiple relational expressions using logical operators.
- Use `&&`, `||` and `!` in more complex boolean expressions.
- Use brackets to group conditions.
- Evaluate expressions containing more than one logical operator.
- Translate a written requirement into a Java boolean expression.
- Use combined conditions in `if` statements.

---

## 1. Why Combine Conditions?

Sometimes a programme must check several requirements before making a decision.

For example, a school programme might determine whether a student qualifies for a particular activity.

The student may need to:

- Have an average of at least 60%.
- Have permission to participate.
- Have no outstanding disciplinary restriction.

Each requirement can be represented by a boolean expression. Logical operators combine the expressions into one overall result.

## 2. Combining Conditions Using `&&`

The AND operator (`&&`) requires every condition to be true.

Suppose a student must achieve a mark of at least 50 and submit an assessment.

```java
int mark = 75;
boolean assessmentSubmitted = true;

boolean eligible = mark >= 50 && assessmentSubmitted;

System.out.println(eligible);
```

Output:

```text
true
```

Both conditions are true, so `eligible` is true.

If the assessment has not been submitted, the result changes:

```java
int mark = 75;
boolean assessmentSubmitted = false;

boolean eligible = mark >= 50 && assessmentSubmitted;

System.out.println(eligible);
```

Output:

```text
false
```

Even though the mark is sufficient, the second condition is false.

## 3. Combining Conditions Using `||`

The OR operator (`||`) requires at least one condition to be true.

Suppose a student qualifies for additional support if their mark is below 40 or their attendance is below 70%.

```java
int mark = 35;
int attendance = 90;

boolean needsSupport = mark < 40 || attendance < 70;

System.out.println(needsSupport);
```

Output:

```text
true
```

The mark is below 40, so the first condition is true. The complete expression is therefore true.

If the mark is 65 and attendance is 85%, both conditions are false, so `needsSupport` is false.

## 4. Combining Three or More Conditions

You can use multiple logical operators in one expression.

```java
int mark = 75;
int attendance = 90;
boolean projectSubmitted = true;

boolean eligible = mark >= 50
        && attendance >= 80
        && projectSubmitted;

System.out.println(eligible);
```

Output:

```text
true
```

The student has achieved at least 50%, has attendance of at least 80%, and has submitted the project. All three conditions are true.

If any one of these conditions is false, the complete AND expression is false.

## 5. Mixing `&&` and `||`

A more complex expression may contain both AND and OR.

Java evaluates `&&` before `||`. Brackets can make the intended grouping explicit.

Consider the expression:

```java
boolean result = true || false && false;
```

The AND operation is evaluated first:

```text
false && false = false
```

The expression then becomes:

```text
true || false = true
```

Therefore, `result` is `true`.

### Using brackets

Compare the previous expression with:

```java
boolean result = (true || false) && false;
```

The brackets are evaluated first:

```text
true || false = true
```

The expression then becomes:

```text
true && false = false
```

Therefore, the result is `false`.

**Important:** Brackets can change the result of a boolean expression. Use them to make complex conditions easier to read and understand.

## 6. Using Brackets in Practical Conditions

Suppose a student may attend an academic support session if they have a low mark or low attendance, but only if their parent has given permission.

```java
int mark = 35;
int attendance = 90;
boolean parentPermission = true;

boolean needsSupport = (mark < 40 || attendance < 70)
        && parentPermission;

System.out.println(needsSupport);
```

Output:

```text
true
```

The student meets the support criteria because the mark is below 40, and permission has been given.

If permission is false, the overall result becomes false, even if the student has a low mark or attendance.

The brackets group the two support conditions together before the permission condition is applied.

## 7. Using `!` with Combined Conditions

The NOT operator (`!`) reverses the result of a boolean expression.

```java
boolean registered = true;
boolean paidFees = false;

boolean requirementsNotMet = !(registered && paidFees);

System.out.println(requirementsNotMet);
```

Output:

```text
true
```

First, the expression inside the brackets is evaluated:

```text
true && false = false
```

The NOT operator reverses the result:

```text
!false = true
```

Therefore, `requirementsNotMet` is true.

## 8. Translating Requirements into Conditions

When a question describes a rule in words, identify the individual requirements before writing the Java expression.

| Written requirement | Java expression |
|---|---|
| The mark is at least 50 | `mark >= 50` |
| Attendance is at least 80 | `attendance >= 80` |
| Both requirements must be met | `mark >= 50 && attendance >= 80` |
| Either requirement may be met | `mark >= 50 || attendance >= 80` |
| The project has not been submitted | `!projectSubmitted` |
| The mark is below 40 or attendance is below 70, and permission is given | `(mark < 40 || attendance < 70) && parentPermission` |

Always pay attention to words such as **and**, **or**, **not**, **both** and **either**.

- **And** usually indicates `&&`.
- **Or** usually indicates `||`.
- **Not** often indicates `!`.
- **Both** means all specified conditions must be true.
- **Either** generally means at least one specified condition must be true.

Read the full requirement before selecting the operators.

## 9. Common Mistakes

### Mistake 1: Using OR when every condition is required

If a student must pass and submit a project, use:

```java
mark >= 50 && projectSubmitted
```

Using `||` would allow the student to meet only one requirement.

### Mistake 2: Forgetting brackets

Consider:

```java
mark < 40 || attendance < 70 && parentPermission
```

Java evaluates the AND part before the OR part. If the intended rule is that permission is required regardless of which support condition applies, write:

```java
(mark < 40 || attendance < 70) && parentPermission
```

### Mistake 3: Reversing a condition incorrectly

```java
!(mark >= 50)
```

This means the mark is not at least 50. It is equivalent to:

```java
mark < 50
```

### Mistake 4: Forgetting that every expression has a result

A combined boolean expression still produces only `true` or `false`, regardless of how many conditions it contains.

---

## 10. Practice Exercises

### Exercise 1: Three Requirements

A student qualifies if their mark is at least 50, attendance is at least 80%, and their project has been submitted.

Create suitable variables and write a boolean expression to determine eligibility.

### Exercise 2: Support Conditions

A student needs support if their mark is below 40 or attendance is below 70%.

Write the expression and test it with different values.

### Exercise 3: Permission Required

A student may participate if their mark is at least 60 or their average is at least 70, but parental permission is compulsory.

Write the expression using brackets.

### Exercise 4: Predict the Results

Determine the result of each expression:

```java
true || false && false
(true || false) && false
true && false || true
true && (false || true)
!(true && false)
```

### Exercise 5: Translate a Written Rule

A student qualifies for a school award if their average is at least 80 and they have no disciplinary restriction, or if they have achieved a special award.

Create suitable variables and write the expression. Use brackets to show the intended grouping clearly.

### Exercise 6: Explain the Difference

Explain why the following expressions can produce different results:

```java
(mark >= 50 || attendance >= 80) && permission
```

```java
mark >= 50 || attendance >= 80 && permission
```

---

## Summary

- Use `&&` when all specified conditions must be true.
- Use `||` when at least one specified condition must be true.
- Use `!` to reverse a boolean expression.
- Multiple logical operators can be combined in one expression.
- Java evaluates `&&` before `||`.
- Brackets make the intended grouping explicit and can change the result.
- Translate written requirements into individual conditions before combining them.
