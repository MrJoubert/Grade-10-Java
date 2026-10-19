# Widening and Narrowing Conversions

## Learning Objectives

By the end of this section, you should be able to:

- Explain the difference between widening and narrowing conversions.
- Identify common widening conversions between primitive data types.
- Perform widening conversions without an explicit cast.
- Perform narrowing conversions using an explicit cast.
- Explain how narrowing conversions can result in lost information.

## 1. What Is Type Conversion?

Type conversion occurs when a value is converted from one data type to another.

For example, a Student's assessment mark might be stored as an `int`, but an average mark may need to be stored as a `double`.

```java
int studentMark = 85;
double markValue = studentMark;
```

Java converts the integer value into a double automatically.

There are two important types of primitive numeric conversion:

- **Widening conversion**
- **Narrowing conversion**

## 2. Widening Conversion

A widening conversion changes a value to a compatible primitive data type that can represent a wider range of values.

Java performs widening primitive conversions automatically.

For example:

```java
int studentMark = 85;
double markValue = studentMark;

System.out.println(markValue);
```

Output:

```text
85.0
```

The integer `85` becomes the double `85.0`.

The conversion does not require an explicit cast.

### Common widening conversions

| Original type | Wider type |
|---|---|
| `byte` | `short` |
| `short` | `int` |
| `int` | `long` |
| `int` | `double` |
| `float` | `double` |
| `char` | `int` |

Other widening conversions are also possible, such as `byte` to `double`.

Widening conversions generally preserve the value, but a conversion to a floating-point type can lose integer precision when the number is too large to be represented exactly.

## 3. Narrowing Conversion

A narrowing conversion changes a value to a primitive data type with a smaller range or less precision.

Java generally requires an explicit cast for narrowing primitive conversions.

For example:

```java
double averageMark = 78.9;
int wholeNumberMark = (int) averageMark;

System.out.println(wholeNumberMark);
```

Output:

```text
78
```

The cast `(int)` instructs Java to convert the double into an integer.

When a finite floating-point value is converted to an integer type, the decimal portion is discarded towards zero. The value is not rounded to the nearest whole number.

### Another example

```java
int totalMarks = 250;
byte smallValue = (byte) totalMarks;

System.out.println(smallValue);
```

Output:

```text
-6
```

A `byte` can store values from -128 to 127. Since 250 is outside this range, converting it to a byte produces a different value.

This demonstrates why narrowing conversions must be used carefully.

## 4. Comparing Widening and Narrowing

| Feature | Widening | Narrowing |
|---|---|---|
| Direction | To a compatible wider type | To a narrower type |
| Explicit cast | Usually not required | Usually required |
| Information loss | Generally preserves the value, but floating-point precision may be lost | May lose information or change the value |
| Example | `int` to `double` | `double` to `int` |

## 5. Widening in Calculations

Widening is useful when calculations need decimal values.

```java
int totalMarks = 235;
int numberOfAssessments = 3;

double averageMark = (double) totalMarks / numberOfAssessments;

System.out.println(averageMark);
```

Output:

```text
78.33333333333333
```

The cast converts `totalMarks` to a double before division. This means the calculation uses floating-point division rather than integer division.

Notice that `(double)` is used here even though widening conversions do not normally need casts. The cast is useful because it ensures that the division takes place using a double operand.

Without the cast:

```java
double averageMark = totalMarks / numberOfAssessments;
```

Both operands are integers, so Java performs integer division first. The result is `78`, which is then stored as `78.0`.

## 6. Narrowing a Calculated Result

Suppose a Student's average is stored as a double, but a whole-number result is required.

```java
double averageMark = 82.7;
int displayedMark = (int) averageMark;

System.out.println(displayedMark);
```

Output:

```text
82
```

The decimal portion is discarded. If rounding is required, use an appropriate rounding method instead of relying on a cast.

For example:

```java
int roundedMark = (int) Math.round(averageMark);
```

For `82.7`, this produces `83`.

## 7. Common Mistakes

### Mistake 1: Narrowing without a cast

```java
double averageMark = 78.5;
int wholeNumberMark = averageMark;
```

This causes a compilation error because Java does not automatically perform this narrowing conversion.

Correct:

```java
int wholeNumberMark = (int) averageMark;
```

### Mistake 2: Assuming a cast rounds a decimal

```java
double averageMark = 78.9;
int wholeNumberMark = (int) averageMark;
```

The result is `78`, not `79`.

### Mistake 3: Assuming a wider type always means perfect precision

Converting an `int` to a `double` is safe for ordinary school marks. However, very large integers may not be represented exactly by a `double`.

### Mistake 4: Assuming every narrowing conversion produces a useful result

Converting a value outside the target type's range can change the value significantly. Check whether the target type can represent the value before converting it.

## 8. Practice Exercises

1. Convert an integer containing a Student's mark into a double without using a cast.
2. Convert a double containing an average mark into an integer using an explicit cast.
3. State whether each conversion is widening or narrowing:
   - `int` to `long`
   - `double` to `int`
   - `float` to `double`
   - `int` to `byte`
4. Explain why converting `78.9` to an integer produces `78`.
5. Explain the difference between integer division and division using a double operand.
6. Predict the result of converting the double value `64.8` to an integer.

## Summary

- Widening conversions change a value to a compatible wider primitive type and usually happen automatically.
- Narrowing conversions change a value to a narrower primitive type and generally require an explicit cast.
- Narrowing a floating-point value to an integer discards the decimal portion towards zero.
- Narrowing can cause information loss or produce a changed value.
- A cast changes how a value is represented; it does not automatically round a decimal value.
