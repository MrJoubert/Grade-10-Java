
import javax.swing.JOptionPane;

public class ErrorMessagesAndUserFeedback
{
    public static void main(String[] args)
    {
        // Question 1: Displaying an information message.
        // Use INFORMATION_MESSAGE to communicate useful information.
        JOptionPane.showMessageDialog(
                null,
                "The Student Management System is ready.",
                "System Information",
                JOptionPane.INFORMATION_MESSAGE);

        // Question 2: Displaying a warning message.
        // A warning informs the user about a potential problem.
        JOptionPane.showMessageDialog(
                null,
                "Remember to save your work before closing the system.",
                "Important Reminder",
                JOptionPane.WARNING_MESSAGE);

        // Question 3: Displaying an error message.
        // An error message should explain what went wrong.
        // Where possible, it should also explain how to fix the problem.
        JOptionPane.showMessageDialog(
                null,
                "Invalid mark entered.\n"
                + "Please enter a whole number between 0 and 100.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);

        // Question 4: Requesting confirmation.
        // showConfirmDialog() allows the user to choose an option.
        int choice = JOptionPane.showConfirmDialog(
                null,
                "Do you want to continue with registration?",
                "Confirm Registration",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (choice == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "You chose to continue.",
                    "Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (choice == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Registration was not continued.",
                    "Registration Cancelled",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            // The user closed the confirmation dialog.
            JOptionPane.showMessageDialog(
                    null,
                    "No choice was made.",
                    "No Response",
                    JOptionPane.WARNING_MESSAGE);
        }

        // Question 5: Providing feedback after a successful action.
        String studentName = JOptionPane.showInputDialog(
                "Enter the Student's first name:");

        if (studentName == null)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Student entry was cancelled.",
                    "Cancelled",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }

        studentName = studentName.trim();

        if (studentName.isEmpty())
        {
            JOptionPane.showMessageDialog(
                    null,
                    "A Student name is required.\n"
                    + "Please try again and enter a name.",
                    "Missing Information",
                    JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            // Display a success message only after the input
            // has passed the validation check.
            JOptionPane.showMessageDialog(
                    null,
                    "Student " + studentName + " was accepted.",
                    "Successful Entry",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        // Question 6: Displaying a result clearly.
        int mark = 76;

        String resultMessage =
                "Student: Liam\n"
                + "Mark: " + mark + "%\n"
                + "Result: Pass";

        JOptionPane.showMessageDialog(
                null,
                resultMessage,
                "Student Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

/*
EXAMPLE INTERACTIONS

1. Information message:
   The Student Management System is ready.

2. Warning message:
   Remember to save your work before closing the system.

3. Error message:
   Invalid mark entered.
   Please enter a whole number between 0 and 100.

4. Confirmation:
   The user chooses Yes, No, or closes the dialog.
   The program responds according to the choice.

5. Student entry:
   Input: Liam
   Output: Student Liam was accepted.

6. Student result:
   Student: Liam
   Mark: 76%
   Result: Pass

TEACHING EMPHASIS

1. showMessageDialog() displays a message to the user.
2. INFORMATION_MESSAGE is used for general information.
3. WARNING_MESSAGE highlights a potential problem.
4. ERROR_MESSAGE communicates an error.
5. QUESTION_MESSAGE can be used when asking a question.
6. showConfirmDialog() allows the user to make a choice.
7. The return value of showConfirmDialog() can be checked
   using constants such as YES_OPTION and NO_OPTION.
8. A useful error message explains the problem and how to fix it.
9. Success messages should only be displayed after an action
   has actually succeeded.
10. Use line breaks to make longer messages easier to read.
11. A user closing a dialog is not always the same as choosing No.
12. User feedback helps people understand what the program is doing.
*/
