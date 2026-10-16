```java
/*
 * Topic: Arithmetic Operators
 * Demonstrates addition, subtraction, multiplication and division.
 */

public class ArithmeticOperators {

    public static void main(String[] args) {

        // Store the assessment marks.
        int testOneMark = 35;
        int testTwoMark = 42;

        // Calculate the total marks.
        int totalMarks = testOneMark + testTwoMark;

        // Calculate the marks remaining out of 100.
        int maximumMarks = 100;
        int marksRemaining = maximumMarks - totalMarks;

        // Calculate the total possible homework marks.
        int numberOfActivities = 4;
        int marksPerActivity = 5;
        int totalPossibleMarks = numberOfActivities * marksPerActivity;

        // Calculate the average assessment mark.
        double averageMark = totalMarks / 2.0;

        // Display the results.
        System.out.println("STUDENT ASSESSMENT RESULTS");
        System.out.println("==========================");

        System.out.println("Test 1 mark: " + testOneMark);
        System.out.println("Test 2 mark: " + testTwoMark);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Marks remaining out of 100: " + marksRemaining);

        System.out.println();
        System.out.println("HOMEWORK");
        System.out.println("========");

        System.out.println("Number of activities: " + numberOfActivities);
        System.out.println("Marks per activity: " + marksPerActivity);
        System.out.println("Total possible marks: " + totalPossibleMarks);

        System.out.println();
        System.out.println("AVERAGE");
        System.out.println("=======");

        System.out.println("Average assessment mark: " + averageMark);

    }

}
```
