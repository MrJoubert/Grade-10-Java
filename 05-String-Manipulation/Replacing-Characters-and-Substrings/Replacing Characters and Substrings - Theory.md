# Replacing Characters and Substrings

## Learning Objectives

By the end of this section, you should be able to:

- Use `replace()` to replace characters in a String.
- Use `replace()` to replace a sequence of characters with another String.
- Explain how `replace()` affects repeated occurrences.
- Store and use the result of a replacement.
- Understand why replacing text does not change the original String automatically.

## 1. What Does replace() Do?

The `replace()` method returns a new String in which matching characters or character sequences have been replaced.

For example:

```java
String studentName = "Olivia Smith";

String updatedName = studentName.replace('i', 'y');

System.out.println(updatedName);
```

Output:

```text
Olyvya Smyth
```

Every occurrence of the character `i` is replaced with `y`.

The original String remains unchanged unless you assign the returned value back to the original variable.

## 2. Replacing a Character

Use the character version of `replace()` when replacing one character with another.

```java
String classCode = "11A";

String updatedCode = classCode.replace('A', 'B');

System.out.println(updatedCode);
```

Output:

```text
11B
```

The method replaces every occurrence of the specified character.

For example:

```java
String result = "banana".replace('a', 'o');

System.out.println(result);
```

Output:

```text
bonono
```

All three occurrences of `a` are replaced.

## 3. Replacing a Substring

You can also replace a sequence of characters using Strings.

```java
String subjectName = "Computer Studies";

String updatedSubject = subjectName.replace(
        "Studies", "Applications Technology");

System.out.println(updatedSubject);
```

Output:

```text
Computer Applications Technology
```

The method searches for the specified sequence and replaces each occurrence with the replacement String.

The matching is case-sensitive.

## 4. Replacing Multiple Occurrences

The `replace()` method replaces all matching occurrences, not just the first one.

```java
String subjectName = "IT IT IT";

String updatedSubject = subjectName.replace("IT", "CAT");

System.out.println(updatedSubject);
```

Output:

```text
CAT CAT CAT
```

Each occurrence of `"IT"` is replaced with `"CAT"`.

If the search text does not occur in the String, the returned String has the same contents as the original.

## 5. Storing the Replacement Result

Strings in Java are immutable. This means that methods such as `replace()` return a String rather than modifying the original String object.

Consider:

```java
String classCode = "11A";

classCode.replace('A', 'B');

System.out.println(classCode);
```

Output:

```text
11A
```

The replacement result was not stored.

To retain the updated value, assign the result:

```java
classCode = classCode.replace('A', 'B');

System.out.println(classCode);
```

Output:

```text
11B
```

You can also store the result in a separate variable if you need both versions.

## 6. Replacing Spaces

The `replace()` method can replace spaces within a String.

```java
String fullName = "Olivia Smith";

String nameWithUnderscore = fullName.replace(' ', '_');

System.out.println(nameWithUnderscore);
```

Output:

```text
Olivia_Smith
```

This replaces every ordinary space character with an underscore.

Unlike `trim()`, this method can replace spaces between words.

## 7. Common Mistakes

### Mistake 1: Forgetting to store the result

```java
String studentName = "Liam";
studentName.replace('L', 'W');

System.out.println(studentName);
```

The output remains `Liam`.

Correct:

```java
studentName = studentName.replace('L', 'W');
```

### Mistake 2: Expecting only the first occurrence to change

```java
String result = "banana".replace('a', 'o');
```

The result is `bonono`, because every matching occurrence is replaced.

### Mistake 3: Ignoring case sensitivity

```java
String subjectName = "Mathematics";
String result = subjectName.replace("math", "Math");
```

The result remains `Mathematics`, because the lowercase substring `"math"` does not match the uppercase `M` in the original String.

### Mistake 4: Confusing replace() with substring()

- `replace()` returns a String with matching content replaced.
- `substring()` extracts part of an existing String.

## 8. Practice Exercises

1. Replace every `a` in `"Mathematics"` with `o`.
2. Replace `"Grade 10"` with `"Grade 11"` within a String.
3. Replace spaces in a Student's full name with underscores.
4. Explain why calling `replace()` without assigning its result does not update the original variable.
5. Predict the result of `"banana".replace('a', 'e')`.
6. Explain why replacing `"math"` in `"Mathematics"` does not replace the uppercase `M`.

## Summary

- `replace(char, char)` replaces matching characters.
- `replace(CharSequence, CharSequence)` replaces matching character sequences.
- All matching occurrences are replaced.
- String replacement is case-sensitive.
- Strings are immutable, so the returned value must be stored or used.
- `replace()` can replace spaces within a String, unlike `trim()`, which removes qualifying characters at the ends.
