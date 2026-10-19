
public class UnderstandingBooleanValuesAndExpressions {

    public static void main(String[] args) {

        // QUESTION 1: Declaring boolean variables
        System.out.println("BOOLEAN VARIABLES");
        System.out.println("=================");

        boolean registered = true;
        boolean resultsPublished = false;
        boolean attended = true;

        System.out.println("Registered: " + registered);
        System.out.println("Results published: " + resultsPublished);
        System.out.println("Attended: " + attended);

        // QUESTION 2: Evaluating boolean expressions
        System.out.println();
        System.out.println("BOOLEAN EXPRESSIONS");
        System.out.println("===================");

        int mark = 65;

        boolean passed = mark >= 50;
        boolean distinction = mark >= 80;

        System.out.println("Mark: " + mark);
        System.out.println("Passed: " + passed);
        System.out.println("Distinction: " + distinction);

        // QUESTION 3: Using comparison operators
        System.out.println();
        System.out.println("COMPARISON OPERATORS");
        System.out.println("====================");

        int testMark = 72;

        System.out.println("Greater than 50: " + (testMark > 50));
        System.out.println("Less than 50: " + (testMark < 50));
        System.out.println("Equal to 72: " + (testMark == 72));
        System.out.println("Not equal to 72: " + (testMark != 72));
        System.out.println("At least 70: " + (testMark >= 70));
        System.out.println("At most 60: " + (testMark <= 60));

        // QUESTION 4: Using a boolean in an if statement
        System.out.println();
        System.out.println("REGISTRATION CHECK");
        System.out.println("==================");

        if (registered) {
            System.out.println("Student is registered.");
        } else {
            System.out.println("Student is not registered.");
        }

        // QUESTION 5: Checking whether results are published
        System.out.println();
        System.out.println("RESULTS CHECK");
        System.out.println("=============");

        if (resultsPublished) {
            System.out.println("Results are available.");
        } else {
            System.out.println("Results are not yet available.");
        }

        // QUESTION 6: Comparing boolean values and strings
        System.out.println();
        System.out.println("BOOLEAN AND STRING");
        System.out.println("=================");

        boolean passedAssessment = true;
        String resultText = "true";

        System.out.println("Boolean value: " + passedAssessment);
        System.out.println("String value: " + resultText);
    }
}
