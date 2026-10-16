/*
 * Topic: Operator Precedence
 * Demonstrates the order of operations and the effect of brackets.
 */

public class OperatorPrecedence {

    public static void main(String[] args) {

        // Demonstrate arithmetic operator precedence.
        int resultOne = 5 + 4 * 3;
        int resultTwo = 18 - 8 / 2;
        int resultThree = 6 * 2 + 7;
        int resultFour = 24 / 4 * 2;

        System.out.println("OPERATOR PRECEDENCE");
        System.out.println("===================");

        System.out.println("5 + 4 * 3 = " + resultOne);
        System.out.println("18 - 8 / 2 = " + resultTwo);
        System.out.println("6 * 2 + 7 = " + resultThree);
        System.out.println("24 / 4 * 2 = " + resultFour);

        // Demonstrate how brackets change calculations.
        int bracketResultOne = (5 + 4) * 3;
        int bracketResultTwo = 18 - (8 / 2);
        int bracketResultThree = (6 * 2) + 7;
        int bracketResultFour = 24 / (4 * 2);

        System.out.println();
        System.out.println("EFFECT OF BRACKETS");
        System.out.println("==================");

        System.out.println("(5 + 4) * 3 = " + bracketResultOne);
        System.out.println("18 - (8 / 2) = " + bracketResultTwo);
        System.out.println("(6 * 2) + 7 = " + bracketResultThree);
        System.out.println("24 / (4 * 2) = " + bracketResultFour);

        // Calculate a Student's average correctly.
        int testOneMark = 40;
        int testTwoMark = 35;
        int testThreeMark = 45;

        double averageMark = (testOneMark + testTwoMark + testThreeMark) / 3.0;

        System.out.println();
        System.out.println("STUDENT ASSESSMENT");
        System.out.println("==================");

        System.out.println("Test 1 mark: " + testOneMark);
        System.out.println("Test 2 mark: " + testTwoMark);
        System.out.println("Test 3 mark: " + testThreeMark);
        System.out.println("Average mark: " + averageMark);

    }

}
