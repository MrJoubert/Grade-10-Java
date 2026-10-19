
/*
 * Topic: Numeric to String Conversion
 * Demonstrates converting numeric values into Strings.
 */

public class NumericToStringConversion {

    public static void main(String[] args) {

        // Store the Student's details.
        String studentName = "Liam Jacobs";
        int studentAge = 16;
        int studentGrade = 10;

        // Convert integer values into Strings.
        String ageText = String.valueOf(studentAge);
        String gradeText = String.valueOf(studentGrade);

        System.out.println("STUDENT DETAILS");
        System.out.println("===============");
        System.out.println("Name: " + studentName);
        System.out.println("Age as a String: " + ageText);
        System.out.println("Grade as a String: " + gradeText);

        // Calculate an assessment average.
        int firstMark = 75;
        int secondMark = 84;
        int thirdMark = 81;

        int totalMarks = firstMark + secondMark + thirdMark;
        double averageMark = totalMarks / 3.0;

        // Convert the average into a String.
        String averageText = String.valueOf(averageMark);

        System.out.println();
        System.out.println("ASSESSMENT RESULTS");
        System.out.println("==================");
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average as a String: " + averageText);

        // Construct a message using concatenation.
        String resultMessage = "Student: " + studentName
                + "\nGrade: " + gradeText
                + "\nAverage: " + averageText;

        System.out.println();
        System.out.println("STUDENT REPORT");
        System.out.println("==============");
        System.out.println(resultMessage);

        // Compare addition and String concatenation.
        int firstNumber = 20;
        int secondNumber = 5;

        int numericResult = firstNumber + secondNumber;

        String firstNumberText = String.valueOf(firstNumber);
        String secondNumberText = String.valueOf(secondNumber);

        String textResult = firstNumberText + secondNumberText;

        System.out.println();
        System.out.println("ADDITION AND CONCATENATION");
        System.out.println("=========================");
        System.out.println("Numeric addition: " + numericResult);
        System.out.println("String concatenation: " + textResult);

    }

}
