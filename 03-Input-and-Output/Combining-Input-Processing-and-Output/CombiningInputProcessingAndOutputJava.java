/*
 * Topic: Combining Input, Processing and Output
 * Calculates a Student's assessment total, average and percentage.
 */

import javax.swing.JOptionPane;

public class CombiningInputProcessingAndOutput {

    public static void main(String[] args) {

        // Collect the Student's assessment marks.
        String firstMarkInput = JOptionPane.showInputDialog(
                "Enter the first assessment mark:");

        String secondMarkInput = JOptionPane.showInputDialog(
                "Enter the second assessment mark:");

        String maximumMarkInput = JOptionPane.showInputDialog(
                "Enter the maximum mark for each assessment:");

        // Convert the input into numeric values.
        int firstMark = Integer.parseInt(firstMarkInput);
        int secondMark = Integer.parseInt(secondMarkInput);
        int maximumMark = Integer.parseInt(maximumMarkInput);

        // Process the values.
        int totalMarks = firstMark + secondMark;
        int totalPossibleMarks = maximumMark * 2;

        double averageMark = totalMarks / 2.0;
        double percentage = (double) totalMarks / totalPossibleMarks * 100;

        // Display the results.
        JOptionPane.showMessageDialog(null,
                "STUDENT ASSESSMENT RESULTS\n"
                + "First mark: " + firstMark + "\n"
                + "Second mark: " + secondMark + "\n"
                + "Total marks: " + totalMarks + " / " + totalPossibleMarks
                + "\nAverage mark: " + averageMark
                + "\nPercentage: " + percentage + "%");

    }

}
