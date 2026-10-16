# Brackets and Calculations

## Learning Objectives

By the end of this topic, you should be able to:

- Explain how brackets affect the order of calculations in Java.
- Use brackets to group related calculations.
- Calculate totals, averages and percentages using appropriate brackets.
- Identify errors caused by incorrect placement of brackets.
- Write clear arithmetic expressions that produce the intended result.

## 1. Why Do We Use Brackets?

Brackets allow you to group parts of a calculation and control the order in which Java evaluates an expression.

Consider the following calculation:

```java
int result = 10 + 5 * 2;
```

Java performs multiplication before addition.

The calculation is:

\[
10 + (5 \times 2) = 20
\]

Now consider:

```java
int result = (10 + 5) * 2;
```

Java calculates the expression inside the brackets first:

\[
(10 + 5) \times 2 = 30
\]

The results differ because the brackets change the order of evaluation.

**Important:** Java evaluates expressions inside brackets before applying operators outside those brackets.

## 2. Calculating a Total Before Multiplication

Suppose a Student purchases 3 school exercise books at R25 each and 2 stationery packs at R40 each.

You can calculate the total cost as follows:

```java
int exerciseBookPrice = 25;
int numberOfExerciseBooks = 3;

int stationeryPackPrice = 40;
int numberOfStationeryPacks = 2;

int totalCost = (exerciseBookPrice * numberOfExerciseBooks)
        + (stationeryPackPrice * numberOfStationeryPacks);
```

The calculation is:

\[
(25 \times 3) + (40 \times 2) = 155
\]

The total cost is R155.

The brackets make it clear that each item's price must first be multiplied by its quantity. The two subtotals are then added together.

Although multiplication already has higher precedence than addition, brackets can make the intention easier to understand.

## 3. Calculating an Average Correctly

Suppose a Student receives the following marks:

- Test 1: 65
- Test 2: 78
- Test 3: 82

The average is calculated by adding all the marks and dividing the total by the number of tests.

The correct Java expression is:

```java
double averageMark = (65 + 78 + 82) / 3.0;
```

The calculation is:

\[
\frac{65 + 78 + 82}{3} = 75
\]

The result is `75.0`.

### What happens without brackets?

Consider:

```java
double averageMark = 65 + 78 + 82 / 3.0;
```

Java performs the division first:

\[
65 + 78 + (82 \div 3.0)
\]

The result is approximately `170.33333333333334`.

This is not the average. It is the sum of the first two marks plus one-third of the third mark.

**Remember:** When calculating an average, add all the values inside brackets before dividing by the number of values.

## 4. Calculating a Percentage

A percentage is calculated by dividing the mark obtained by the maximum mark and multiplying the result by 100.

The formula is:

\[
\text{Percentage} =
\frac{\text{Mark Obtained}}{\text{Maximum Mark}} \times 100
\]

For example, a Student receives 36 out of 45 marks.

```java
int markObtained = 36;
int maximumMark = 45;

double percentage = ((double) markObtained / maximumMark) * 100;
```

The result is `80.0`.

The brackets group the division before the multiplication by 100.

The cast `(double)` ensures that the division produces a fractional result when necessary.

## 5. Combining Several Calculations

Consider a Student who receives marks for three assessments. The assessments have different weightings.

Suppose:

- Test mark: 70, contributing 40% of the final result.
- Project mark: 80, contributing 60% of the final result.

The weighted result can be calculated as follows:

```java
double testMark = 70;
double projectMark = 80;

double weightedResult = (testMark * 0.40)
        + (projectMark * 0.60);
```

The calculation is:

\[
(70 \times 0.40) + (80 \times 0.60) = 76
\]

The weighted result is `76.0`.

The brackets group each weighted component before adding them together.

## 6. Nested Brackets

Brackets can be placed inside other brackets. The innermost expression is evaluated first.

For example:

```java
int result = ((10 + 5) * 2) - 8;
```

Step 1: Calculate the innermost brackets.

\[
10 + 5 = 15
\]

Step 2: Multiply by 2.

\[
15 \times 2 = 30
\]

Step 3: Subtract 8.

\[
30 - 8 = 22
\]

The result is `22`.

Nested brackets can be useful, but avoid unnecessary complexity. Clear variable names and separate calculations can make a program easier to read.

## 7. Common Mistakes

### Mistake 1: Forgetting to group the numerator

Incorrect:

```java
double average = markOne + markTwo + markThree / 3.0;
```

Correct:

```java
double average = (markOne + markTwo + markThree) / 3.0;
```

### Mistake 2: Placing brackets around the wrong calculation

Compare:

```java
int firstResult = 20 - 4 * 2;
int secondResult = (20 - 4) * 2;
```

The first result is `12`. The second result is `32`.

### Mistake 3: Assuming brackets fix integer division

Brackets control the order of evaluation, but they do not automatically change data types.

```java
double average = (77 / 2);
```

The result is `38.0`, because integer division takes place inside the brackets.

Correct:

```java
double average = (77 / 2.0);
```

The result is `38.5`.

### Mistake 4: Using too many brackets

Brackets are useful when they clarify the intended calculation. Unnecessary brackets can make expressions harder to read.

Use them where they improve clarity or change the order of evaluation.

## 8. Practice Activities

Complete these activities in NetBeans.

### Activity 1: Student Average

A Student receives marks of 72, 68 and 85.

1. Declare three integer variables.
2. Calculate the average using real division.
3. Use brackets to ensure that all three marks are added before dividing.
4. Display the average.

### Activity 2: School Supplies

A Student purchases 4 exercise books at R18 each and 3 pens at R7 each.

1. Declare variables for the prices and quantities.
2. Calculate the total cost.
3. Use brackets to group the cost of each item type.
4. Display the total cost.

### Activity 3: Weighted Assessment

A Student receives 75 for a test and 90 for a project. The test contributes 30% and the project contributes 70%.

1. Declare suitable variables using `double`.
2. Calculate each weighted component.
3. Add the components to calculate the final result.
4. Display the final result.

### Activity 4: Find and Correct the Error

Study the following code:

```java
int testOne = 55;
int testTwo = 72;
int testThree = 83;

double average = testOne + testTwo + testThree / 3.0;
```

1. Explain how Java evaluates the expression.
2. Explain why the result is not the intended average.
3. Rewrite the expression correctly.
4. Calculate the correct average.

## 9. Summary

- Brackets control the order of calculations.
- Expressions inside brackets are evaluated before operations outside them.
- Use brackets to group related calculations, especially when calculating averages and percentages.
- Brackets do not automatically change integer division into real division.
- Clear expressions make programs easier to understand, test and maintain.
