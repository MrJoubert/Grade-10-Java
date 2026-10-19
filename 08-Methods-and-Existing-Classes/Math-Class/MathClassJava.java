public class MathClass
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS THE MATH CLASS?
        // ============================================================
        // Java provides a built-in class called Math.
        //
        // The Math class contains methods for mathematical operations.
        //
        // These methods are static, which means that we can call them
        // using the class name without creating a Math object.
        //
        // Example:
        // Math.sqrt(25)
        //
        // The method name follows Math and a dot.
        // The value inside the parentheses is the argument.

        System.out.println("SECTION 1: THE MATH CLASS");

        int mark1 = 75;
        int mark2 = 86;

        System.out.println("First mark: " + mark1);
        System.out.println("Second mark: " + mark2);

        // ============================================================
        // SECTION 2: Math.max()
        // ============================================================
        // Math.max() returns the larger of two values.
        //
        // The method compares the two arguments and returns the
        // greater value.
        //
        // This can be useful when comparing two assessment marks.

        System.out.println();
        System.out.println("SECTION 2: MAXIMUM VALUE");

        int highestMark = Math.max(mark1, mark2);

        System.out.println("Highest mark: " + highestMark);

        // ============================================================
        // SECTION 3: Math.min()
        // ============================================================
        // Math.min() returns the smaller of two values.
        //
        // It is the opposite of Math.max().

        System.out.println();
        System.out.println("SECTION 3: MINIMUM VALUE");

        int lowestMark = Math.min(mark1, mark2);

        System.out.println("Lowest mark: " + lowestMark);

        // ============================================================
        // SECTION 4: Math.abs()
        // ============================================================
        // Math.abs() returns the absolute value of a number.
        //
        // The absolute value is the distance from zero.
        // It is never negative.
        //
        // Examples:
        // Math.abs(-8) returns 8.
        // Math.abs(8) returns 8.
        //
        // This can be used to calculate the size of a difference
        // when the direction of the difference does not matter.

        System.out.println();
        System.out.println("SECTION 4: ABSOLUTE VALUE");

        int markDifference = 72 - 85;

        System.out.println("Original difference: " + markDifference);
        System.out.println("Absolute difference: "
                + Math.abs(markDifference));

        // ============================================================
        // SECTION 5: Math.pow()
        // ============================================================
        // Math.pow() raises a number to a specified power.
        //
        // The first argument is the base.
        // The second argument is the exponent.
        //
        // Math.pow(2, 3) means 2 raised to the power of 3.
        // This is calculated as 2 x 2 x 2 = 8.
        //
        // Math.pow() returns a double value.

        System.out.println();
        System.out.println("SECTION 5: POWERS");

        double squaredValue = Math.pow(5, 2);
        double cubedValue = Math.pow(3, 3);

        System.out.println("5 squared: " + squaredValue);
        System.out.println("3 cubed: " + cubedValue);

        // ============================================================
        // SECTION 6: Math.sqrt()
        // ============================================================
        // Math.sqrt() calculates the square root of a number.
        //
        // The square root of 49 is 7 because 7 x 7 = 49.
        //
        // The method returns a double, even when the answer is
        // a whole number.

        System.out.println();
        System.out.println("SECTION 6: SQUARE ROOT");

        double squareRoot = Math.sqrt(49);

        System.out.println("Square root of 49: " + squareRoot);

        // ============================================================
        // SECTION 7: Math.round()
        // ============================================================
        // Math.round() rounds a number to the nearest whole number.
        //
        // It returns a long when the argument is a double.
        // It returns an int when the argument is a float.
        //
        // In this example, the results are stored as long values.

        System.out.println();
        System.out.println("SECTION 7: ROUNDING");

        double averageMark = 76.6;
        double lowerAverage = 76.3;

        long roundedAverage = Math.round(averageMark);
        long roundedLowerAverage = Math.round(lowerAverage);

        System.out.println("Original average: " + averageMark);
        System.out.println("Rounded average: " + roundedAverage);
        System.out.println("Second rounded average: "
                + roundedLowerAverage);

        // ============================================================
        // SECTION 8: Math.ceil()
        // ============================================================
        // Math.ceil() rounds a value UP to the nearest whole number.
        //
        // It returns a double.
        //
        // For example:
        // Math.ceil(4.2) returns 5.0.
        //
        // This differs from Math.round(), which rounds to the
        // nearest whole number.

        System.out.println();
        System.out.println("SECTION 8: ROUNDING UP");

        double value1 = Math.ceil(4.2);
        double value2 = Math.ceil(7.0);

        System.out.println("Ceiling of 4.2: " + value1);
        System.out.println("Ceiling of 7.0: " + value2);

        // ============================================================
        // SECTION 9: Math.floor()
        // ============================================================
        // Math.floor() rounds a value DOWN to the nearest whole number.
        //
        // It returns a double.
        //
        // For example:
        // Math.floor(4.8) returns 4.0.
        //
        // Compare this with Math.ceil(), which rounds upwards.

        System.out.println();
        System.out.println("SECTION 9: ROUNDING DOWN");

        double floorValue1 = Math.floor(4.8);
        double floorValue2 = Math.floor(7.0);

        System.out.println("Floor of 4.8: " + floorValue1);
        System.out.println("Floor of 7.0: " + floorValue2);

        // ============================================================
        // SECTION 10: Math.random()
        // ============================================================
        // Math.random() returns a random double greater than or equal
        // to 0.0 and less than 1.0.
        //
        // The result could be 0.0, but it will always be less than 1.0.
        //
        // Multiplying by 10 produces a value from 0.0 up to, but not
        // including, 10.0.
        //
        // Adding 1 and casting to int gives an integer from 1 to 10.
        //
        // IMPORTANT:
        // The result changes between program runs, so it cannot have
        // one fixed expected value.

        System.out.println();
        System.out.println("SECTION 10: RANDOM NUMBERS");

        double randomValue = Math.random();

        int randomNumber = (int) (Math.random() * 10) + 1;

        System.out.println("Random decimal: " + randomValue);
        System.out.println("Random integer from 1 to 10: "
                + randomNumber);

        // ============================================================
        // SECTION 11: USING MATH METHODS IN CALCULATIONS
        // ============================================================
        // Math methods can be included in larger expressions.
        //
        // Here, Math.max() identifies the highest mark.
        // Math.min() identifies the lowest mark.
        // Their difference is then calculated.

        System.out.println();
        System.out.println("SECTION 11: COMBINING MATH METHODS");

        int assessment1 = 68;
        int assessment2 = 91;
        int assessment3 = 77;

        int highestAssessment = Math.max(
                Math.max(assessment1, assessment2),
                assessment3);

        int lowestAssessment = Math.min(
                Math.min(assessment1, assessment2),
                assessment3);

        int assessmentRange = highestAssessment - lowestAssessment;

        System.out.println("Highest assessment: " + highestAssessment);
        System.out.println("Lowest assessment: " + lowestAssessment);
        System.out.println("Difference: " + assessmentRange);

        // ============================================================
        // SECTION 12: CALCULATING A ROUNDED AVERAGE
        // ============================================================
        // A calculation may produce a decimal value.
        //
        // Math.round() can be used when a whole-number result is
        // required.
        //
        // First, calculate the average using double division.
        // Then round the average to the nearest whole number.

        System.out.println();
        System.out.println("SECTION 12: ROUNDED AVERAGE");

        int testMark1 = 71;
        int testMark2 = 82;
        int testMark3 = 90;

        double average = (testMark1 + testMark2 + testMark3) / 3.0;
        long roundedMark = Math.round(average);

        System.out.println("Exact average: " + average);
        System.out.println("Rounded average: " + roundedMark);

        // ============================================================
        // SECTION 13: COMMON MISTAKES
        // ============================================================
        // 1. Writing max() instead of Math.max().
        //
        // 2. Forgetting to provide the correct number of arguments.
        //
        // 3. Assuming every Math method returns an int.
        //
        // 4. Confusing Math.round(), Math.ceil() and Math.floor().
        //
        // 5. Expecting Math.random() to return the same value each run.
        //
        // 6. Forgetting that Math.pow() and Math.sqrt() return double.
        //
        // 7. Confusing the exponent and base in Math.pow().
        //
        // Check the method's return type before assigning its result
        // to a variable.

        // ============================================================
        // SECTION 14: PRACTICE CHALLENGE
        // ============================================================
        // A Student received marks of 67 and 84.
        //
        // Write code to:
        // 1. Find the higher mark.
        // 2. Find the lower mark.
        // 3. Calculate the absolute difference.
        // 4. Calculate 6 squared.
        // 5. Calculate the square root of 144.
        // 6. Round an average of 73.8.
        //
        // Predict the results before running your code.

        System.out.println();
        System.out.println("SECTION 14: PRACTICE CHALLENGE");

        int challengeMark1 = 67;
        int challengeMark2 = 84;

        System.out.println("Higher mark: "
                + Math.max(challengeMark1, challengeMark2));

        System.out.println("Lower mark: "
                + Math.min(challengeMark1, challengeMark2));

        System.out.println("Absolute difference: "
                + Math.abs(challengeMark1 - challengeMark2));

        System.out.println("6 squared: " + Math.pow(6, 2));
        System.out.println("Square root of 144: " + Math.sqrt(144));
        System.out.println("Rounded average: " + Math.round(73.8));
    }
}
