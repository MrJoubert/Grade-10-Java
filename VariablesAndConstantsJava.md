```java
/*
 * Topic: Variables and Constants
 * Demonstrates changeable variables and final constants.
 */

public class VariablesAndConstants {

    public static void main(String[] args) {

        // Declare constants.
        final String SCHOOL_NAME = "Crawford International College";
        final int MAX_PERIODS = 8;
        final int PASS_MARK = 50;

        // Declare variables.
        String studentName = "Liam Jacobs";
        int studentAge = 16;
        int studentGrade = 10;
        double averageMark = 78.5;

        // Display the original details.
        System.out.println("SCHOOL STUDENT PROFILE");
        System.out.println("======================");
        System.out.println("School: " + SCHOOL_NAME);
        System.out.println("Maximum periods: " + MAX_PERIODS);
        System.out.println("Pass mark: " + PASS_MARK);
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Average mark: " + averageMark);

        // Update the variables.
        studentName = "Olivia Smith";
        studentAge = 17;
        studentGrade = 11;
        averageMark = 84.25;

        // Display the updated details.
        System.out.println();
        System.out.println("UPDATED STUDENT PROFILE");
        System.out.println("=======================");
        System.out.println("School: " + SCHOOL_NAME);
        System.out.println("Maximum periods: " + MAX_PERIODS);
        System.out.println("Pass mark: " + PASS_MARK);
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Average mark: " + averageMark);

    }

}
```
