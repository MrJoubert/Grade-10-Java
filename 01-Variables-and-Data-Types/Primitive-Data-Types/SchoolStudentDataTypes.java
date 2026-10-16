### SchoolStudentDataTypes.java

```java
/*
 * School Student Data Types
 *
 * This program demonstrates how Java primitive data types
 * can be used to store information about a Student.
 *
 * Concepts covered:
 * - int
 * - double
 * - char
 * - boolean
 * - String (a reference type, not a primitive type)
 */

public class SchoolStudentDataTypes {

    public static void main(String[] args) {

        // --------------------------------------------------
        // STEP 1: Store the Student's age.
        // --------------------------------------------------
        // int is used to store a whole number.
        // A Student's age is normally represented as a
        // whole number, so int is appropriate here.

        int studentAge = 16;


        // --------------------------------------------------
        // STEP 2: Store the Student's average mark.
        // --------------------------------------------------
        // double is used to store a number that can contain
        // a decimal component.
        // For example, a Student's average could be 78.5.

        double averageMark = 78.5;


        // --------------------------------------------------
        // STEP 3: Store the Student's initial.
        // --------------------------------------------------
        // char stores a single character.
        // Character values use single quotation marks.

        char studentInitial = 'L';


        // --------------------------------------------------
        // STEP 4: Store whether the Student plays sport.
        // --------------------------------------------------
        // boolean stores one of two values:
        // true or false.
        // Here, the Student participates in school sport.

        boolean playsSport = true;


        // --------------------------------------------------
        // STEP 5: Store the Student's name.
        // --------------------------------------------------
        // String stores text.
        // String is NOT a primitive data type.
        // String values use double quotation marks.

        String studentName = "Liam Jacobs";


        // --------------------------------------------------
        // STEP 6: Display the Student's information.
        // --------------------------------------------------
        // System.out.println() displays information and
        // moves the cursor to a new line.

        System.out.println("SCHOOL STUDENT PROFILE");
        System.out.println("======================");

        System.out.println("Name: " + studentName);
        System.out.println("Initial: " + studentInitial);
        System.out.println("Age: " + studentAge);
        System.out.println("Average mark: " + averageMark);
        System.out.println("Participates in sport: " + playsSport);
    }
}
```

### Expected output

```text
SCHOOL STUDENT PROFILE
======================
Name: Liam Jacobs
Initial: L
Age: 16
Average mark: 78.5
Participates in sport: true
```

### Try it yourself

1. Change the Student's name to `Olivia Smith`.
2. Change the age to `17`.
3. Change the average mark to `84.25`.
4. Change the initial to `'O'`.
5. Change `playsSport` to `false`.
6. Run the program again and observe how the output changes.

**Think about it:** Why would `double` be more suitable than `int` for an average mark that could be `78.5`? Why does the name use double quotation marks while the initial uses single quotation marks?
