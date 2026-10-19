
import javax.swing.JOptionPane;

public class DesktopAndMobileUIComparison
{
    public static void main(String[] args)
    {
        // Question 1: Understanding different interface requirements.
        // Desktop interfaces often have more screen space.
        // Mobile interfaces have smaller screens and touch controls.
        // These are general design considerations, not strict rules.

        JOptionPane.showMessageDialog(null,
                "DESKTOP INTERFACE\n\n"
                + "More screen space is often available.\n"
                + "Multiple sections can be displayed together.\n"
                + "A keyboard and mouse are commonly used.",
                "Desktop Interface",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "MOBILE INTERFACE\n\n"
                + "Screen space is more limited.\n"
                + "Buttons should be easy to tap.\n"
                + "Forms should avoid unnecessary fields.",
                "Mobile Interface",
                JOptionPane.INFORMATION_MESSAGE);

        // Question 2: Using a clear input prompt.
        // A prompt should tell the user exactly what to enter.
        // Avoid vague prompts such as "Enter data".

        String studentName = JOptionPane.showInputDialog(
                null,
                "Enter the Student's first name:",
                "Student Registration",
                JOptionPane.QUESTION_MESSAGE);

        // The user can cancel an input dialog.
        // A cancelled dialog returns null.
        if (studentName == null)
        {
            JOptionPane.showMessageDialog(null,
                    "Registration cancelled.");
            return;
        }

        studentName = studentName.trim();

        // Question 3: Checking input before continuing.
        if (studentName.isEmpty())
        {
            JOptionPane.showMessageDialog(null,
                    "Please enter a Student name.",
                    "Missing Information",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Question 4: Asking only for necessary information.
        // A simple registration example requires only a name and grade.
        // Unnecessary fields make forms longer and harder to complete.

        String[] gradeOptions = {"10", "11", "12"};

        String selectedGrade = (String) JOptionPane.showInputDialog(
                null,
                "Select the Student's grade:",
                "Student Registration",
                JOptionPane.QUESTION_MESSAGE,
                null,
                gradeOptions,
                gradeOptions[0]);

        if (selectedGrade == null)
        {
            JOptionPane.showMessageDialog(null,
                    "Registration cancelled.");
            return;
        }

        // Question 5: Presenting information clearly.
        // Use line breaks and labels to make the information readable.
        String registrationSummary =
                "REGISTRATION SUMMARY\n\n"
                + "Student: " + studentName + "\n"
                + "Grade: " + selectedGrade + "\n\n"
                + "Please check that the information is correct.";

        JOptionPane.showMessageDialog(null,
                registrationSummary,
                "Confirm Registration",
                JOptionPane.INFORMATION_MESSAGE);

        // Question 6: Providing clear feedback.
        JOptionPane.showMessageDialog(null,
                "Registration completed successfully.",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

/*
EXAMPLE INTERACTION

1. The program displays information about desktop interfaces.
2. The program displays information about mobile interfaces.
3. The user enters: Liam
4. The user selects: 12
5. The program displays:

REGISTRATION SUMMARY

Student: Liam
Grade: 12

Please check that the information is correct.

6. The program displays a registration success message.

Other possible interactions:
- If the user leaves the name empty, a warning is displayed.
- If the user cancels a dialog, registration stops.
- The grade is selected from a list instead of typed manually.

TEACHING EMPHASIS

1. Desktop and mobile interfaces have different design constraints.
2. Desktop interfaces often have more room for information.
3. Mobile interfaces should account for smaller screens and touch input.
4. Prompts should clearly explain what the user must enter.
5. Only request information that is necessary for the task.
6. Labels and line breaks make output easier to read.
7. Provide feedback after an action is completed.
8. Use consistent wording and dialog titles.
9. Handle cancellation rather than assuming that input was supplied.
10. A graphical Java dialog demonstrates some interface principles,
    but it does not automatically make a program responsive to
    different screen sizes.
*/
