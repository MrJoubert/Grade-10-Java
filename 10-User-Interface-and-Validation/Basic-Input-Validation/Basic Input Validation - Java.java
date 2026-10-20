
import javax.swing.JOptionPane;

public class BasicInputValidation
{
    public static void main(String[] args)
    {
        // Question 1: Checking whether input is empty.
        // showInputDialog() returns the text entered by the user.
        // trim() removes spaces from the beginning and end.
        // An empty String means that no usable text was entered.

        String studentName = JOptionPane.showInputDialog(
                "Enter the Student's first name:");

        if (studentName == null)
        {
            JOptionPane.showMessageDialog(null,
                    "Input cancelled. The program will close.");
            return;
        }

        studentName = studentName.trim();

        if (studentName.isEmpty())
        {
            JOptionPane.showMessageDialog(null,
                    "Error: Student name cannot be empty.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "Student name accepted: " + studentName);
        }

        // Question 2: Validating a numeric mark.
        // Input from showInputDialog() is a String.
        // Integer.parseInt() converts a valid numeric String to an int.
        // Invalid text would cause an error, so use try-catch.

        String markInput = JOptionPane.showInputDialog(
                "Enter the Student's mark (0 to 100):");

        if (markInput == null)
        {
            JOptionPane.showMessageDialog(null,
                    "Mark entry cancelled.");
        }
        else
        {
            try
            {
                int mark = Integer.parseInt(markInput.trim());

                // Question 3: Checking the acceptable range.
                // A mark must be at least 0 and at most 100.
                if (mark >= 0 && mark <= 100)
                {
                    JOptionPane.showMessageDialog(null,
                            "Valid mark entered: " + mark);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Invalid mark. Enter a value from 0 to 100.");
                }
            }
            catch (NumberFormatException e)
            {
                // This block runs if the input cannot be converted
                // into an integer, for example "eighty".
                JOptionPane.showMessageDialog(null,
                        "Invalid input. Enter a whole number.");
            }
        }

        // Question 4: Repeatedly asking for a valid mark.
        // The loop continues while the mark is invalid.
        // A valid mark or cancellation ends the loop.

        boolean validMark = false;
        boolean cancelled = false;
        int acceptedMark = 0;

        while (!validMark && !cancelled)
        {
            String input = JOptionPane.showInputDialog(
                    "Enter a valid mark between 0 and 100:");

            if (input == null)
            {
                cancelled = true;
            }
            else
            {
                try
                {
                    int mark = Integer.parseInt(input.trim());

                    if (mark >= 0 && mark <= 100)
                    {
                        acceptedMark = mark;
                        validMark = true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,
                                "Mark out of range. Enter 0 to 100.");
                    }
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null,
                            "Please enter a whole number.");
                }
            }
        }

        if (validMark)
        {
            JOptionPane.showMessageDialog(null,
                    "Mark saved successfully: " + acceptedMark);
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "Mark entry cancelled.");
        }

        // Question 5: Validating an age.
        // This example combines numeric validation and range checking.

        String ageInput = JOptionPane.showInputDialog(
                "Enter the Student's age (5 to 25):");

        if (ageInput == null)
        {
            JOptionPane.showMessageDialog(null,
                    "Age entry cancelled.");
        }
        else
        {
            try
            {
                int age = Integer.parseInt(ageInput.trim());

                if (age >= 5 && age <= 25)
                {
                    JOptionPane.showMessageDialog(null,
                            "Age accepted: " + age);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Age must be between 5 and 25.");
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,
                        "Invalid age. Enter a whole number.");
            }
        }
    }
}

/*
EXAMPLE INTERACTIONS

These examples show possible messages. Actual interactions depend
on what the user enters.

Example 1: Student name
Input: Liam
Output: Student name accepted: Liam

Example 2: Valid mark
Input: 85
Output: Valid mark entered: 85

Example 3: Invalid numeric input
Input: eighty
Output: Invalid input. Enter a whole number.

Example 4: Mark outside the range
Input: 120
Output: Invalid mark. Enter a value from 0 to 100.

Example 5: Repeated validation
Input: abc
Output: Please enter a whole number.

Input: 150
Output: Mark out of range. Enter 0 to 100.

Input: 75
Output: Mark saved successfully: 75

Example 6: Age
Input: 17
Output: Age accepted: 17

TEACHING EMPHASIS

1. Input from showInputDialog() is received as a String.
2. Use Integer.parseInt() to convert a numeric String to an int.
3. Use try-catch to handle invalid numeric input.
4. NumberFormatException occurs when text cannot be converted
   into the required numeric format.
5. Use && when both conditions must be true.
6. A range check such as mark >= 0 && mark <= 100 checks
   both the minimum and maximum acceptable values.
7. Use trim() to remove leading and trailing spaces.
8. Use isEmpty() to check whether a String has zero characters.
9. A null result from showInputDialog() means the user cancelled.
10. A validation loop can keep requesting input until it is valid.
11. Numeric validation and range validation are different:
    "abc" is not a valid integer, while 120 is an integer
    but is outside the permitted mark range.
12. Validation helps prevent incorrect data from being processed.
*/
