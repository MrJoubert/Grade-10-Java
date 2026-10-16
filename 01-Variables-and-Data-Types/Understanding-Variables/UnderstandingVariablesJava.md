```java
/*
 * Topic: Understanding Variables
 * Demonstrates declaration, initialisation, assignment
 * and updating variable values.
 */

public class UnderstandingVariables {

    public static void main(String[] args) {

        // Declare and initialise variables.
        String studentName = "Liam Jacobs";
        int studentAge = 16;
        int studentGrade = 10;

        // Display the original values.
        System.out.println("ORIGINAL STUDENT DETAILS");
        System.out.println("========================");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);

        // Update the existing variables.
        studentName = "Olivia Smith";
        studentAge = 17;
        studentGrade = 11;

        // Display the updated values.
        System.out.println();
        System.out.println("UPDATED STUDENT DETAILS");
        System.out.println("=======================");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);

    }

}
```
