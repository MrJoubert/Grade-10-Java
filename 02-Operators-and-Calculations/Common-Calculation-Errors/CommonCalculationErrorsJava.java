/*
 * Topic: Common Calculation Errors
 * Demonstrates common mistakes and their corrections.
 */

public class CommonCalculationErrors {

    public static void main(String[] args) {

        // Demonstrate integer division.
        int totalMarks = 77;

        double incorrectAverage = totalMarks / 2;
        double correctAverage = totalMarks / 2.0;

        System.out.println("INTEGER DIVISION");
        System.out.println("================");

        System.out.println("Incorrect average: " + incorrectAverage);
        System.out.println("Correct average: " + correctAverage);

        // Demonstrate the effect of operator precedence.
        int testOneMark = 40;
        int testTwoMark = 30;
        int testThreeMark = 20;

        double incorrectTestAverage = testOneMark + testTwoMark
                + testThreeMark / 3.0;

        double correctTestAverage = (testOneMark + testTwoMark
                + testThreeMark) / 3.0;

        System.out.println();
        System.out.println("OPERATOR PRECEDENCE");
        System.out.println("===================");

        System.out.println("Incorrect average: " + incorrectTestAverage);
        System.out.println("Correct average: " + correctTestAverage);

        // Demonstrate percentage calculation.
        int markObtained = 42;
        int maximumMark = 48;

        double incorrectPercentage = markObtained / maximumMark * 100;
        double correctPercentage = (double) markObtained / maximumMark * 100;

        System.out.println();
        System.out.println("PERCENTAGE CALCULATION");
        System.out.println("======================");

        System.out.println("Incorrect percentage: " + incorrectPercentage);
        System.out.println("Correct percentage: " + correctPercentage);

        // Demonstrate integer division and remainder.
        int numberOfStudents = 29;
        int studentsPerGroup = 6;

        int completeGroups = numberOfStudents / studentsPerGroup;
        int remainingStudents = numberOfStudents % studentsPerGroup;

        System.out.println();
        System.out.println("STUDENT GROUPING");
        System.out.println("================");

        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Students per group: " + studentsPerGroup);
        System.out.println("Complete groups: " + completeGroups);
        System.out.println("Students remaining: " + remainingStudents);

        // Prevent division by zero.
        int numberOfClasses = 0;

        System.out.println();
        System.out.println("DIVISION VALIDATION");
        System.out.println("===================");

        if (numberOfClasses != 0) {
            int studentsPerClass = numberOfStudents / numberOfClasses;
            System.out.println("Students per class: " + studentsPerClass);
        } else {
            System.out.println("The divisor cannot be zero.");
        }

    }

}
