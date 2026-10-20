
/*
 * Topic: String to Numeric Conversion
 * Demonstrates converting Strings into numeric data types.
 */

public class StringToNumericConversion {

    public static void main(String[] args) {

        // Convert Strings to integers.
        String firstMarkInput = "72";
        String secondMarkInput = "84";

        int firstMark = Integer.parseInt(firstMarkInput);
        int secondMark = Integer.parseInt(secondMarkInput);

        int totalMarks = firstMark + secondMark;

        System.out.println("INTEGER CONVERSION");
        System.out.println("==================");
        System.out.println("First mark: " + firstMark);
        System.out.println("Second mark: " + secondMark);
        System.out.println("Total marks: " + totalMarks);

        // Convert a String to a double.
        String averageInput = "78.5";
        double averageMark = Double.parseDouble(averageInput);

        double adjustedAverage = averageMark + 1.5;

        System.out.println();
        System.out.println("DOUBLE CONVERSION");
        System.out.println("=================");
        System.out.println("Original average: " + averageMark);
        System.out.println("Adjusted average: " + adjustedAverage);

        // Convert a String to a long.
        String studentNumberInput = "9876543210";
        long studentNumber = Long.parseLong(studentNumberInput);

        System.out.println();
        System.out.println("LONG CONVERSION");
        System.out.println("===============");
        System.out.println("Student number: " + studentNumber);

        // Demonstrate why conversion is needed.
        String firstValue = "20";
        String secondValue = "5";

        String joinedValues = firstValue + secondValue;

        int firstNumber = Integer.parseInt(firstValue);
        int secondNumber = Integer.parseInt(secondValue);

        int addedValues = firstNumber + secondNumber;

        System.out.println();
        System.out.println("COMPARING STRING AND NUMERIC OPERATIONS");
        System.out.println("=======================================");
        System.out.println("Joined Strings: " + joinedValues);
        System.out.println("Added numbers: " + addedValues);

    }

}
