/*
 * Topic: Keyboard Input with JOptionPane
 * Demonstrates collecting and displaying Student information.
 */

import javax.swing.JOptionPane;

public class KeyboardInputWithJOptionPane {

    public static void main(String[] args) {

        // Collect the Student's information.
        String studentName = JOptionPane.showInputDialog(
                "Enter the Student's name:");

        String studentSurname = JOptionPane.showInputDialog(
                "Enter the Student's surname:");

        String studentGrade = JOptionPane.showInputDialog(
                "Enter the Student's grade:");

        String classGroup = JOptionPane.showInputDialog(
                "Enter the Student's class group:");

        String subjectName = JOptionPane.showInputDialog(
                "Enter the subject:");

        // Display the information entered.
        JOptionPane.showMessageDialog(null,
                "STUDENT DETAILS\n"
                + "Name: " + studentName + "\n"
                + "Surname: " + studentSurname + "\n"
                + "Grade: " + studentGrade + "\n"
                + "Class group: " + classGroup + "\n"
                + "Subject: " + subjectName);

    }

}
