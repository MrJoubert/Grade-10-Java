
import javax.swing.JOptionPane;

public class InputPromptsAndOutputMessages
{
    public static void main(String[] args)
    {
        // Question 1: Requesting String input.
        // showInputDialog() displays a prompt and returns a String.
        // The user's input is stored in the variable studentName.

        String studentName = JOptionPane.showInputDialog(
                null,
                "Enter the Student's first name:",
                "Student Details",
                JOptionPane.QUESTION_MESSAGE);

        // Check whether the user cancelled the input dialog.
        if (studentName == null)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "No Student details were entered.",
                    "Input Cancelled",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }

        studentName = studentName.trim();

        // Check whether the user entered a name.
        if (studentName.isEmpty())
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Please enter a Student name.",
                    "Missing Information",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        // Question 2: Requesting integer input.
        // Input from showInputDialog() is always received as a String.
        // Integer.parseInt() converts a numeric String to an int.

        String ageInput = JOptionPane.showInputDialog(
                null,
                "Enter the Student's age:",
                "Student Details",
                JOptionPane.QUESTION_MESSAGE);

        if (ageInput == null)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Age entry cancelled.",
                    "Input Cancelled",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }

        int age;

        try
        {
            age = Integer.parseInt(ageInput.trim());
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Please enter the age as a whole number.",
                    "Invalid Age",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        // Question 3: Requesting decimal input.
        // Double.parseDouble() converts a numeric String to a double.
        // This example expects a decimal point if one is needed.

        String averageInput = JOptionPane.showInputDialog(
                null,
                "Enter the Student's average mark:",
                "Academic Details",
                JOptionPane.QUESTION_MESSAGE);

        if (averageInput == null)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Average mark entry cancelled.",
                    "Input Cancelled",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }

        double average;

        try
        {
            average = Double.parseDouble(averageInput.trim());
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Please enter a valid numeric average.",
                    "Invalid Average",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        // Question 4: Displaying a simple output message.
        // String concatenation (+) combines text and variable values.

        JOptionPane.showMessageDialog(
                null,
                "Welcome, " + studentName + "!",
                "Welcome Message",
                JOptionPane.INFORMATION_MESSAGE);

        // Question 5: Formatting multiple values.
        // Use labels and line breaks to make output easy to read.

        String studentDetails =
                "STUDENT DETAILS\n\n"
                + "Name: " + studentName + "\n"
                + "Age: " + age + "\n"
                + "Average mark: " + average + "%";

        JOptionPane.showMessageDialog(
                null,
                studentDetails,
                "Student Summary",
                JOptionPane.INFORMATION_MESSAGE);

        // Question 6: Using input values in calculations.
        // The program can process the values after receiving them.
        // The average is checked here for an acceptable range.

        if (average >= 0 && average <= 100)
        {
            String result;

            if (average >= 50)
            {
                result = "Pass";
            }
            else
            {
                result = "Fail";
            }

            JOptionPane.showMessageDialog(
                    null,
                    "Student: " + studentName + "\n"
                    + "Average: " + average + "%\n"
                    + "Result: " + result,
                    "Academic Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(
                    null,
                    "The average must be between 0 and 100.",
                    "Average Out of Range",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

/*
EXAMPLE INTERACTION

Input:
Student's first name: Liam
Student's age: 17
Student's average mark: 76.5

Output 1:
Welcome, Liam!

Output 2:
STUDENT DETAILS

Name: Liam
Age: 17
Average mark: 76.5%

Output 3:
Student: Liam
Average: 76.5%
Result: Pass

OTHER POSSIBLE OUTCOMES

- Cancelling an input dialog stops the program.
- Entering "seventeen" for age displays an error message.
- Entering "abc" for the average displays an error message.
- Entering an average of 120 displays an out-of-range message.

TEACHING EMPHASIS

1. showInputDialog() requests input from the user.
2. Input from showInputDialog() is returned as a String.
3. Integer.parseInt() converts a numeric String to an int.
4. Double.parseDouble() converts a numeric String to a double.
5. try-catch can handle invalid numeric input.
6. showMessageDialog() displays output to the user.
7. String concatenation combines text and variable values.
8. Use \n to start a new line in a message.
9. Use meaningful titles and prompts.
10. Handle cancellation because the input result can be null.
11. Validate both the format and the range of numeric values.
12. A program should not report a valid result when the input
    has not passed the required checks.
*/
