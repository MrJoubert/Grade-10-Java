# De Morgan's Laws

## Learning Objectives

By the end of this section, you should be able to:

- Explain what it means to negate a boolean expression.
- State De Morgan's two laws.
- Rewrite a negated AND expression as an OR expression.
- Rewrite a negated OR expression as an AND expression.
- Apply De Morgan's Laws to Java boolean expressions.
- Use brackets to identify the part of an expression being negated.

---

## 1. What Does Negating an Expression Mean?

Negating a boolean expression means reversing its result.

In Java, the NOT operator (`!`) performs this operation:

- `!true` produces `false`.
- `!false` produces `true`.

For example:

```java
boolean passed = true;

System.out.println(!passed);
```

Output:

```text
false
```

The NOT operator reverses the value stored in `passed`.

Negation can also be applied to a complete expression.

```java
int mark = 45;

System.out.println(!(mark >= 50));
```

Output:

```text
true
```

The expression `mark >= 50` is false. Negating it produces true.

---

## 2. De Morgan's First Law

The first law states:

**The negation of an AND expression is equivalent to an OR expression in which each condition is negated.**

In Java:

```java
!(A && B)
```

is equivalent to:

```java
!A || !B
```

The brackets indicate that the complete AND expression is negated.

### Example

Suppose:

```java
boolean passed = true;
boolean projectSubmitted = false;
```

Consider:

```java
!(passed && projectSubmitted)
```

The expression inside the brackets is:

```text
true && false = false
```

Negating the result gives:

```text
!false = true
```

Now consider the equivalent expression:

```java
!passed || !projectSubmitted
```

Evaluate each condition:

```text
!true || !false
false || true
true
```

Both expressions produce `true`.

### Why does this law work?

An AND expression is true only when both conditions are true.

Therefore, the negation of that expression is true whenever at least one condition is false.

That is exactly what the OR expression `!A || !B` checks.

---

## 3. De Morgan's Second Law

The second law states:

**The negation of an OR expression is equivalent to an AND expression in which each condition is negated.**

In Java:

```java
!(A || B)
```

is equivalent to:

```java
!A && !B
```

### Example

Suppose:

```java
boolean availableMonday = false;
boolean availableTuesday = false;
```

Consider:

```java
!(availableMonday || availableTuesday)
```

The expression inside the brackets is:

```text
false || false = false
```

Negating the result gives:

```text
!false = true
```

Now consider the equivalent expression:

```java
!availableMonday && !availableTuesday
```

Evaluate each condition:

```text
true && true
true
```

Both expressions produce `true`.

### Why does this law work?

An OR expression is true when at least one condition is true.

Therefore, the negation of that expression is true only when both conditions are false.

That is exactly what the AND expression `!A && !B` checks.

---

## 4. Summary of De Morgan's Laws

| Original expression | Equivalent expression |
|---|---|
| `!(A && B)` | `!A || !B` |
| `!(A || B)` | `!A && !B` |

Remember two important changes:

1. Negate each individual condition.
2. Change AND to OR, or OR to AND.

The NOT operator must apply to each condition in the rewritten expression.

---

## 5. Applying the Laws to Relational Expressions

De Morgan's Laws can be used with relational expressions.

Consider:

```java
!(mark >= 50 && attendance >= 80)
```

Applying the first law gives:

```java
mark < 50 || attendance < 80
```

Why?

- The negation of `mark >= 50` is `mark < 50`.
- The negation of `attendance >= 80` is `attendance < 80`.
- AND changes to OR.

The rewritten expression means that the student has either a mark below 50 or attendance below 80%.

Another example:

```java
!(mark < 40 || attendance < 70)
```

Applying the second law gives:

```java
mark >= 40 && attendance >= 70
```

Both requirements must now be true.

---

## 6. Understanding the Comparison Operators

When negating a relational expression, reverse the comparison correctly.

| Original condition | Negated condition |
|---|---|
| `mark == 50` | `mark != 50` |
| `mark != 50` | `mark == 50` |
| `mark > 50` | `mark <= 50` |
| `mark < 50` | `mark >= 50` |
| `mark >= 50` | `mark < 50` |
| `mark <= 50` | `mark > 50` |

For example:

```java
!(mark >= 50)
```

is equivalent to:

```java
mark < 50
```

It is **not** equivalent to `mark <= 50`, because a mark of exactly 50 satisfies the original condition.

Similarly:

```java
!(mark > 50)
```

is equivalent to:

```java
mark <= 50
```

Pay attention to whether the original comparison includes equality.

---

## 7. Worked Example: Student Eligibility

Suppose a student is eligible when their mark is at least 50 and their project has been submitted.

```java
boolean eligible = mark >= 50 && projectSubmitted;
```

The opposite condition is:

```java
boolean notEligible = !(mark >= 50 && projectSubmitted);
```

Using De Morgan's first law, this becomes:

```java
boolean notEligible = mark < 50 || !projectSubmitted;
```

This means that the student is not eligible if either:

- Their mark is below 50, or
- Their project has not been submitted.

Both expressions represent the same logical result.

---

## 8. Common Mistakes

### Mistake 1: Forgetting to change the logical operator

Incorrect:

```java
!(A && B)
```

rewritten as:

```java
!A && !B
```

Correct:

```java
!A || !B
```

### Mistake 2: Negating only one condition

Incorrect:

```java
!(A || B)
```

rewritten as:

```java
!A || B
```

Correct:

```java
!A && !B
```

### Mistake 3: Reversing a comparison incorrectly

Incorrect:

```java
!(mark >= 50)
```

rewritten as:

```java
mark <= 50
```

Correct:

```java
mark < 50
```

A mark of exactly 50 makes the original expression true, so its negation must be false.

### Mistake 4: Removing brackets without applying the laws

The brackets in `!(A && B)` show that the entire AND expression is being negated.

Do not simply remove them. Apply the correct law to each condition and change the logical operator.

---

## 9. Practice Exercises

### Exercise 1: Rewrite Using De Morgan's First Law

Rewrite the following expressions without using NOT outside the brackets:

```java
!(A && B)
!(passed && projectSubmitted)
!(mark >= 50 && attendance >= 80)
```

### Exercise 2: Rewrite Using De Morgan's Second Law

Rewrite the following expressions:

```java
!(A || B)
!(availableMonday || availableTuesday)
!(mark < 40 || attendance < 70)
```

### Exercise 3: Negate Relational Expressions

Rewrite each condition:

```java
!(mark > 60)
!(mark <= 75)
!(mark == 100)
!(mark != 50)
```

### Exercise 4: Predict the Results

Given:

```java
boolean A = true;
boolean B = false;
```

Determine the result of:

```java
!(A && B)
!A || !B
!(A || B)
!A && !B
```

### Exercise 5: Student Eligibility

A student is eligible if their mark is at least 50 and their project has been submitted.

Write:

1. The expression for eligibility.
2. The negation of the expression.
3. An equivalent expression using De Morgan's Law.

Explain what the negated expression means in words.

---

## Summary

De Morgan's Laws provide two important rules for rewriting boolean expressions:

- `!(A && B)` is equivalent to `!A || !B`.
- `!(A || B)` is equivalent to `!A && !B`.

When negating a relational expression, reverse the comparison operator correctly.

These laws help simplify complex conditions and express the same logic in different forms.
