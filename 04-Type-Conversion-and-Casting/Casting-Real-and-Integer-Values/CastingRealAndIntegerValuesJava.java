
/*
 * Topic: Casting Real and Integer Values
 * Demonstrates casting and its effect on calculations.
 */

public class CastingRealAndIntegerValues {

    public static void main(String[] args) {

        // Cast a decimal value to an integer.
        double averageMark = 78.9;
        int wholeNumberMark = (int) averageMark;

        System.out.println("DOUBLE TO INT");
        System.out.println("=============");
        System.out.println("Original average: " + averageMark);
        System.out.println("Cast result: " + wholeNumberMark);

        // Cast an integer to a double.
        int studentMark = 85;
        double decimalMark = (double) studentMark;

        System.out.println();
        System.out.println("INT TO DOUBLE");
        System.out.println("=============");
        System.out.println("Integer mark: " + studentMark);
        System.out.println("Double mark: " + decimalMark);

        // Compare integer division and floating-point division.
        int totalMarks = 235;
        int numberOfAssessments = 3;

        double integerDivisionResult = totalMarks / numberOfAssessments;
        double floatingPointResult = (double) totalMarks
                / numberOfAssessments;

        System.out.println();
        System.out.println("DIVISION COMPARISON");
        System.out.println("===================");
        System.out.println("Integer division: " + integerDivisionResult);
        System.out.println("Floating-point division: " + floatingPointResult);

        // Calculate an assessment percentage.
        int markObtained = 37;
        int maximumMark = 45;

        double percentage = (double) markObtained / maximumMark * 100;

        System.out.println();
        System.out.println("ASSESSMENT PERCENTAGE");
        System.out.println("=====================");
        System.out.println("Mark obtained: " + markObtained);
        System.out.println("Maximum mark: " + maximumMark);
        System.out.println("Percentage: " + percentage);

        // Compare casting and rounding.
        double calculatedAverage = 76.9;

        int castResult = (int) calculatedAverage;
        int roundedResult = (int) Math.round(calculatedAverage);

        System.out.println();
        System.out.println("CASTING AND ROUNDING");
        System.out.println("====================");
        System.out.println("Original average: " + calculatedAverage);
        System.out.println("Cast result: " + castResult);
        System.out.println("Rounded result: " + roundedResult);

    }

}
