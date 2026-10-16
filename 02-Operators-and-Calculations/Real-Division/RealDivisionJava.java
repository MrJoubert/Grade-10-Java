/*
 * Topic: Real Division
 * Demonstrates averages and percentages using real division.
 */

public class RealDivision {

    public static void main(String[] args) {

        // Store the Student's assessment marks.
        int testOneMark = 41;
        int testTwoMark = 36;

        // Calculate the total and average.
        int totalMarks = testOneMark + testTwoMark;
        double averageMark = totalMarks / 2.0;

        System.out.println("STUDENT ASSESSMENT");
        System.out.println("==================");

        System.out.println("Test 1 mark: " + testOneMark);
        System.out.println("Test 2 mark: " + testTwoMark);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average mark: " + averageMark);

        // Calculate the Student's percentage.
        int markObtained = 37;
        int maximumMark = 45;

        double percentage = markObtained / (double) maximumMark * 100;

        System.out.println();
        System.out.println("ASSESSMENT PERCENTAGE");
        System.out.println("====================");

        System.out.println("Mark obtained: " + markObtained);
        System.out.println("Maximum mark: " + maximumMark);
        System.out.println("Percentage: " + percentage);

        // Compare integer division with real division.
        double incorrectAverage = totalMarks / 2;
        double correctAverage = totalMarks / 2.0;

        System.out.println();
        System.out.println("DIVISION COMPARISON");
        System.out.println("===================");

        System.out.println("Integer division result: " + incorrectAverage);
        System.out.println("Real division result: " + correctAverage);

    }

}
