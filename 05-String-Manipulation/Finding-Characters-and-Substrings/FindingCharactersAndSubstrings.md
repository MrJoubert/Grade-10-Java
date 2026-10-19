# Finding Characters and Substrings

## Learning Objectives

By the end of this section, you should be able to:

- Use `indexOf()` to find the position of a character or substring.
- Use `lastIndexOf()` to find the last occurrence of a character or substring.
- Interpret the position returned by these methods.
- Recognise when a character or substring cannot be found.
- Combine `indexOf()` with `substring()` to extract parts of a String.

## 1. What Does indexOf() Do?

The `indexOf()` method searches a String and returns the position of the first occurrence of a specified character or substring.

For example:

```java id="y4bv1v"
String subjectName = "Mathematics";

int position = subjectName.indexOf('t');

System.out.println(position);
```

Output:

```text id="brb7tb"
2
```

The first `t` occurs at position `2`.

Remember that Java String positions start at zero.

## 2. Finding a Character

You can search for a character by placing it inside single quotation marks.

```java id="4zv65q"
String studentName = "Olivia";

int position = studentName.indexOf('i');

System.out.println(position);
```

Output:

```text id="4w4g0p"
2
```

The first `i` occurs at position `2`. Although the String contains another `i`, `indexOf()` returns only the first occurrence.

## 3. Finding a Substring

You can also search for a sequence of characters using a String argument.

```java id="y1p6v7"
String subjectName = "Information Technology";

int position = subjectName.indexOf("Technology");

System.out.println(position);
```

Output:

```text id="8xhnz5"
12
```

The substring `"Technology"` begins at position `12`.

The method returns the starting position of the matching text.

## 4. Using lastIndexOf()

The `lastIndexOf()` method searches for the last occurrence of a character or substring.

```java id="xrb9n3"
String studentName = "Olivia";

int position = studentName.lastIndexOf('i');

System.out.println(position);
```

Output:

```text id="ctd8x7"
4
```

The first `i` is at position `2`, while the last `i` is at position `4`.

Compare the two methods:

```java id="rqf2jd"
String studentName = "Olivia";

System.out.println(studentName.indexOf('i'));
System.out.println(studentName.lastIndexOf('i'));
```

Output:

```text id="4jgv4p"
2
4
```

Both methods return positions, but they identify different occurrences.

## 5. What If the Search Text Is Not Found?

If the specified character or substring does not occur in the String, `indexOf()` and `lastIndexOf()` return `-1`.

```java id="k06evk"
String subjectName = "Mathematics";

int position = subjectName.indexOf('z');

System.out.println(position);
```

Output:

```text id="4rfk4z"
-1
```

The value `-1` indicates that the character was not found.

You can use this result in a condition:

```java id="j9b24b"
String subjectName = "Mathematics";

if (subjectName.indexOf('z') == -1) {
    System.out.println("Character not found.");
} else {
    System.out.println("Character found.");
}
```

Output:

```text id="39x83b"
Character not found.
```

Do not treat `-1` as a valid String position.

## 6. Combining indexOf() and substring()

These methods can be combined to extract information from a String.

Suppose a Student's full name is stored in one variable.

```java id="f4d0kh"
String fullName = "Olivia Smith";

int spacePosition = fullName.indexOf(' ');

String firstName = fullName.substring(0, spacePosition);
String surname = fullName.substring(spacePosition + 1);

System.out.println(firstName);
System.out.println(surname);
```

Output:

```text id="wte6wz"
Olivia
Smith
```

The program:

1. Finds the position of the space.
2. Extracts the text before the space.
3. Starts the surname extraction immediately after the space.

This example assumes the full name contains one space separating the first name and surname.

Always check that the search succeeds before using the returned position in substring calculations.

## 7. Searching from a Specific Position

Java also allows you to specify where a search should begin.

```java id="akm4m5"
String subjectName = "Mathematics";

int position = subjectName.indexOf('i', 4);

System.out.println(position);
```

Output:

```text id="2yqys9"
9
```

The search begins at position `4`, so the earlier `i` at position `5` is still found.

**Correction to note:** In `"Mathematics"`, the characters are positioned as follows: `M` 0, `a` 1, `t` 2, `h` 3, `e` 4, `m` 5, `a` 6, `t` 7, `i` 8, `c` 9, `s` 10. Therefore, the example above returns `8`, not `9`.

The starting position tells Java where to begin searching; it does not mean that the character must occur at that exact position.

## 8. Common Mistakes

### Mistake 1: Assuming positions start at one

```java id="y4k3p2"
String studentName = "Olivia";

System.out.println(studentName.indexOf('O'));
```

The result is `0`, because Java starts counting from zero.

### Mistake 2: Confusing indexOf() and lastIndexOf()

- `indexOf()` returns the first occurrence.
- `lastIndexOf()` returns the last occurrence.

### Mistake 3: Forgetting to check for -1

If a search returns `-1`, the character or substring was not found. Do not use that value as a valid extraction position.

### Mistake 4: Searching for a character with the wrong quotation marks

Use single quotation marks for a `char`:

```java id="xd79vc"
studentName.indexOf('O');
```

Use double quotation marks for a String:

```java id="4kncr8"
studentName.indexOf("Olivia");
```

## 9. Practice Exercises

1. Find the first occurrence of `a` in `"Mathematics"`.
2. Find the last occurrence of `a` in `"Mathematics"`.
3. Search for `"Technology"` in `"Information Technology"` and display its starting position.
4. Check whether a Student's surname contains the letter `s`.
5. Extract the first name and surname from a full name separated by one space.
6. Explain why `indexOf()` returns `-1` when the search text is absent.

## Summary

- `indexOf()` returns the position of the first occurrence.
- `lastIndexOf()` returns the position of the last occurrence.
- Both methods can search for a character or a substring.
- Positions start at zero.
- A return value of `-1` means the search text was not found.
- Combining `indexOf()` and `substring()` can help extract parts of a String.
