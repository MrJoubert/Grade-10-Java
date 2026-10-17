/*
 * Topic: Input Conversion
 * Demonstrates converting String input into numeric values.
 */

import javax.swing.JOptionPane;

public class InputConversion {

    public static void main(String[] args) {

        // Collect the Student's assessment marks.
        String firstMarkInput = JOptionPane.showInputDialog(
                "Enter the first assessment mark:");

        String secondMarkInput = JOptionPane.showInputDialog(
                "Enter the second assessment mark:");

        // Convert the input into integers.
        int firstMark = Integer.parseInt(firstMarkInput);
        int secondMark = Integer.parseInt(secondMarkInput);

        // Calculate the total and average.
        int totalMarks = firstMark + secondMark;
        double averageMark = totalMarks / 2.0;

        // Collect and convert the Student's current average.
        String currentAverageInput = JOptionPane.showInputDialog(
                "Enter the Student's current average:");

        double currentAverage = Double.parseDouble(currentAverageInput);
        double adjustedAverage = currentAverage + 2.5;

        // Display the results.
        JOptionPane.showMessageDialog(null,
                "ASSESSMENT RESULTS\n"
                + "First mark: " + firstMark + "\n"
                + "Second mark: " + secondMark + "\n"
                + "Total marks: " + totalMarks + "\n"
                + "Average mark: " + averageMark
                + "\n\nAVERAGE ADJUSTMENT\n"
                + "Current average: " + currentAverage + "\n"
                + "Adjusted average: " + adjustedAverage);

    }

}
