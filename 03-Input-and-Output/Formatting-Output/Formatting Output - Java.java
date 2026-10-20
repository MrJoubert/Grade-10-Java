/*
 * Topic: Formatting Output
 * Demonstrates formatted assessment results and currency values.
 */

import javax.swing.JOptionPane;

public class FormattingOutput {

    public static void main(String[] args) {

        // Store the Student's details.
        String studentName = "Olivia Smith";
        int studentGrade = 11;

        // Calculate the assessment results.
        int testOneMark = 72;
        int testTwoMark = 85;
        int testThreeMark = 79;

        int totalMarks = testOneMark + testTwoMark + testThreeMark;
        double averageMark = totalMarks / 3.0;

        // Calculate the assessment percentage.
        int markObtained = 37;
        int maximumMark = 45;

        double percentage = (double) markObtained / maximumMark * 100;

        // Display the Student's profile.
        System.out.println("STUDENT PROFILE");
        System.out.println("===============");

        System.out.printf("Name: %s%n", studentName);
        System.out.printf("Grade: %d%n", studentGrade);

        System.out.println();
        System.out.println("ASSESSMENT RESULTS");
        System.out.println("==================");

        System.out.printf("Test 1: %d%n", testOneMark);
        System.out.printf("Test 2: %d%n", testTwoMark);
        System.out.printf("Test 3: %d%n", testThreeMark);
        System.out.printf("Total: %d%n", totalMarks);
        System.out.printf("Average: %.2f%n", averageMark);
        System.out.printf("Percentage: %.2f%%%n", percentage);

        // Display subject marks in aligned columns.
        System.out.println();
        System.out.println("SUBJECT MARKS");
        System.out.println("=============");

        System.out.printf("%-35s %8s%n", "Subject", "Mark");
        System.out.printf("%-35s %8d%n", "Information Technology", 85);
        System.out.printf("%-35s %8d%n", "Computer Applications Technology", 78);
        System.out.printf("%-35s %8d%n", "Mathematics", 82);

        // Calculate and display stationery costs.
        int numberOfBooks = 4;
        double bookPrice = 18.50;
        double totalCost = numberOfBooks * bookPrice;

        System.out.println();
        System.out.println("STATIONERY COST");
        System.out.println("===============");

        System.out.printf("Unit price: R%.2f%n", bookPrice);
        System.out.printf("Quantity: %d%n", numberOfBooks);
        System.out.printf("Total cost: R%.2f%n", totalCost);

        // Display a formatted message dialog.
        String message = String.format(
                "STUDENT RESULTS%n"
                + "Name: %s%n"
                + "Average mark: %.2f%n"
                + "Percentage: %.2f%%",
                studentName, averageMark, percentage);

        JOptionPane.showMessageDialog(null, message);

    }

}
