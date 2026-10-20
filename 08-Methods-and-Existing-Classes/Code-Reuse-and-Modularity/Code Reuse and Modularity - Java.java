public class CodeReuseAndModularity
{
    public static void main(String[] args)
    {
        // Question 1: Calling reusable methods.
        displaySchoolHeading();
        displaySeparator();

        // Question 2: Reusing a method with different arguments.
        displayStudentName("Liam", "Botha");
        displayStudentName("Emma", "Naidoo");
        displayStudentName("Noah", "Smith");

        displaySeparator();

        // Question 3: Reusing a method to calculate a total.
        int testMark = 78;
        int examMark = 84;

        int total = calculateTotal(testMark, examMark);

        System.out.println("Total marks: " + total);

        // Question 4: Reusing a method to calculate an average.
        double average = calculateAverage(testMark, examMark);

        System.out.println("Average mark: " + average + "%");

        // Question 5: Reusing a method to determine a result.
        displayResult("Liam", average);
        displayResult("Emma", 92.0);
        displayResult("Noah", 43.0);

        displaySeparator();

        // Question 6: Using methods to process several Students.
        String[] studentNames = {"Liam", "Emma", "Noah"};
        int[] marks = {78, 92, 43};

        for (int i = 0; i < studentNames.length; i++)
        {
            displayResult(studentNames[i], marks[i]);
        }

        displaySeparator();

        // Question 7: One method can call other methods.
        displayStudentSummary("Emma", 78, 92);
    }

    // Question 1
    // This method displays a heading.
    // It can be called whenever the heading is needed.
    public static void displaySchoolHeading()
    {
        System.out.println("CRAWFORD STUDENT RESULTS");
    }

    // This method avoids repeating the same separator statement.
    public static void displaySeparator()
    {
        System.out.println("------------------------------");
    }

    // Question 2
    // The method is written once but can be reused with different names.
    // firstName and surname are parameters.
    public static void displayStudentName(String firstName, String surname)
    {
        System.out.println("Student: " + firstName + " " + surname);
    }

    // Question 3
    // This method receives two marks and returns their total.
    // The calculation is performed in one place, making it reusable.
    public static int calculateTotal(int mark1, int mark2)
    {
        int total = mark1 + mark2;

        return total;
    }

    // Question 4
    // This method reuses the two marks to calculate an average.
    // The return type is double because the answer may contain decimals.
    public static double calculateAverage(int mark1, int mark2)
    {
        double average = (mark1 + mark2) / 2.0;

        return average;
    }

    // Question 5
    // This method receives a Student's name and average.
    // It displays the result without returning a value.
    public static void displayResult(String studentName, double average)
    {
        System.out.println(studentName + ": " + average + "%");

        if (average >= 50)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }
    }

    // Question 7
    // This method combines existing methods instead of repeating
    // calculations and result-checking code.
    public static void displayStudentSummary(
            String studentName, int testMark, int examMark)
    {
        displaySeparator();

        System.out.println("STUDENT SUMMARY");
        displayStudentName(studentName, "");
        
        int total = calculateTotal(testMark, examMark);
        double average = calculateAverage(testMark, examMark);

        System.out.println("Test mark: " + testMark);
        System.out.println("Exam mark: " + examMark);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average + "%");

        displayResult(studentName, average);

        displaySeparator();
    }
}

/*
EXPECTED OUTPUT

CRAWFORD STUDENT RESULTS
------------------------------
Student: Liam Botha
Student: Emma Naidoo
Student: Noah Smith
------------------------------
Total marks: 162
Average mark: 81.0%
Liam: 81.0%
Result: Pass
Emma: 92.0%
Result: Pass
Noah: 43.0%
Result: Fail
------------------------------
Liam: 78.0%
Result: Pass
Emma: 92.0%
Result: Pass
Noah: 43.0%
Result: Fail
------------------------------
STUDENT SUMMARY
Student: Emma
Test mark: 78
Exam mark: 92
Total: 170
Average: 85.0%
Emma: 85.0%
Result: Pass
------------------------------

TEACHING EMPHASIS

1. Modularity means dividing a program into smaller methods.
2. Code reuse means writing a method once and calling it when needed.
3. Parameters allow a method to work with different data.
4. A method can return a calculated value to the calling code.
5. A void method performs an action without returning a value.
6. A method can call other methods to avoid duplicated code.
7. Reusable methods make programs easier to test, understand and maintain.
8. Keep each method focused on a clear task.
*/
