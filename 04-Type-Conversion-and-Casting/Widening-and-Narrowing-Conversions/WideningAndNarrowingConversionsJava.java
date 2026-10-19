
/*
 * Topic: Widening and Narrowing Conversions
 * Demonstrates automatic conversion and explicit casting.
 */

public class WideningAndNarrowingConversions {

    public static void main(String[] args) {

        // Demonstrate widening from int to double.
        int studentMark = 85;
        double markValue = studentMark;

        System.out.println("WIDENING CONVERSION");
        System.out.println("===================");
        System.out.println("Integer mark: " + studentMark);
        System.out.println("Double mark: " + markValue);

        // Demonstrate widening from int to long.
        int totalMarks = 250;
        long largeTotal = totalMarks;

        System.out.println();
        System.out.println("INTEGER TO LONG");
        System.out.println("===============");
        System.out.println("Integer total: " + totalMarks);
        System.out.println("Long total: " + largeTotal);

        // Demonstrate narrowing from double to int.
        double averageMark = 78.9;
        int wholeNumberMark = (int) averageMark;

        System.out.println();
        System.out.println("NARROWING CONVERSION");
        System.out.println("====================");
        System.out.println("Original average: " + averageMark);
        System.out.println("Converted integer: " + wholeNumberMark);

        // Demonstrate narrowing from int to byte.
        int largeValue = 250;
        byte smallValue = (byte) largeValue;

        System.out.println();
        System.out.println("INTEGER TO BYTE");
        System.out.println("===============");
        System.out.println("Original integer: " + largeValue);
        System.out.println("Converted byte: " + smallValue);

        // Compare integer division with double division.
        int assessmentTotal = 235;
        int numberOfAssessments = 3;

        double integerDivisionAverage = assessmentTotal / numberOfAssessments;
        double doubleDivisionAverage = (double) assessmentTotal
                / numberOfAssessments;

        System.out.println();
        System.out.println("DIVISION COMPARISON");
        System.out.println("===================");
        System.out.println("Integer division result: " + integerDivisionAverage);
        System.out.println("Double division result: " + doubleDivisionAverage);

        // Demonstrate rounding instead of casting.
        double calculatedAverage = 82.7;

        int castResult = (int) calculatedAverage;
        int roundedResult = (int) Math.round(calculatedAverage);

        System.out.println();
        System.out.println("CASTING AND ROUNDING");
        System.out.println("====================");
        System.out.println("Original average: " + calculatedAverage);
        System.out.println("Result using cast: " + castResult);
        System.out.println("Result using rounding: " + roundedResult);

    }

}
