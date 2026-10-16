```java
/*
 * Topic: Naming Conventions
 * Demonstrates meaningful variable names, constant names
 * and Java class naming conventions.
 */

public class NamingConventions {

    public static void main(String[] args) {

        // Variables use camelCase.
        String studentName = "Liam Jacobs";
        int studentAge = 16;
        int studentGrade = 10;
        double averageMark = 78.5;
        String subjectName = "Information Technology";
        String classGroup = "10A";

        // Constants use UPPER_SNAKE_CASE.
        final int PASS_MARK = 50;
        final int MAX_PERIODS = 8;

        // Display the Student's information.
        System.out.println("STUDENT PROFILE");
        System.out.println("===============");

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Class group: " + classGroup);
        System.out.println("Subject: " + subjectName);
        System.out.println("Average mark: " + averageMark);

        System.out.println();
        System.out.println("SCHOOL CONSTANTS");
        System.out.println("================");

        System.out.println("Pass mark: " + PASS_MARK);
        System.out.println("Maximum periods: " + MAX_PERIODS);

    }

}
```
