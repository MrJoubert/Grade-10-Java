/*
 * Topic: Brackets and Calculations
 * Demonstrates grouping calculations using brackets.
 */

public class BracketsAndCalculations {

    public static void main(String[] args) {

        // Calculate a Student's average mark.
        int testOneMark = 72;
        int testTwoMark = 68;
        int testThreeMark = 85;

        double averageMark = (testOneMark + testTwoMark + testThreeMark) / 3.0;

        System.out.println("STUDENT ASSESSMENT");
        System.out.println("==================");

        System.out.println("Test 1 mark: " + testOneMark);
        System.out.println("Test 2 mark: " + testTwoMark);
        System.out.println("Test 3 mark: " + testThreeMark);
        System.out.println("Average mark: " + averageMark);

        // Calculate the total cost of school supplies.
        int exerciseBookPrice = 18;
        int numberOfExerciseBooks = 4;
        int penPrice = 7;
        int numberOfPens = 3;

        int totalCost = (exerciseBookPrice * numberOfExerciseBooks)
                + (penPrice * numberOfPens);

        System.out.println();
        System.out.println("SCHOOL SUPPLIES");
        System.out.println("===============");

        System.out.println("Exercise books: " + numberOfExerciseBooks);
        System.out.println("Pens: " + numberOfPens);
        System.out.println("Total cost: R" + totalCost);

        // Calculate a weighted assessment result.
        double testMark = 75;
        double projectMark = 90;
        double testWeight = 0.30;
        double projectWeight = 0.70;

        double weightedResult = (testMark * testWeight)
                + (projectMark * projectWeight);

        System.out.println();
        System.out.println("WEIGHTED ASSESSMENT");
        System.out.println("===================");

        System.out.println("Test mark: " + testMark);
        System.out.println("Project mark: " + projectMark);
        System.out.println("Weighted result: " + weightedResult);

        // Compare expressions with and without brackets.
        int resultWithoutBrackets = 10 + 5 * 2;
        int resultWithBrackets = (10 + 5) * 2;

        System.out.println();
        System.out.println("EFFECT OF BRACKETS");
        System.out.println("==================");

        System.out.println("10 + 5 * 2 = " + resultWithoutBrackets);
        System.out.println("(10 + 5) * 2 = " + resultWithBrackets);

    }

}
