/*
 * Topic: Displaying Output
 * Demonstrates console output, concatenation and message dialogs.
 */

import javax.swing.JOptionPane;

public class DisplayingOutput {

    public static void main(String[] args) {

        // Store the Student's details.
        String studentName = "Olivia Smith";
        int studentGrade = 11;
        String classGroup = "11A";

        // Display the Student's profile.
        System.out.println("STUDENT PROFILE");
        System.out.println("===============");
        System.out.println("Name: " + studentName);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Class group: " + classGroup);

        // Store and display assessment marks.
        int testOneMark = 72;
        int testTwoMark = 85;
        int testThreeMark = 79;

        int totalMarks = testOneMark + testTwoMark + testThreeMark;
        double averageMark = totalMarks / 3.0;

        System.out.println();
        System.out.println("ASSESSMENT RESULTS");
        System.out.println("==================");
        System.out.println("Test 1: " + testOneMark);
        System.out.println("Test 2: " + testTwoMark);
        System.out.println("Test 3: " + testThreeMark);
        System.out.println("Total: " + totalMarks);
        System.out.println("Average: " + averageMark);

        // Demonstrate print() and println().
        System.out.println();
        System.out.println("SUBJECT SUMMARY");
        System.out.println("===============");
        System.out.print("Subject: ");
        System.out.println("Information Technology");

        // Demonstrate escape sequences.
        System.out.println();
        System.out.println("TIMETABLE");
        System.out.println("=========");
        System.out.println("Monday\tInformation Technology");
        System.out.println("Tuesday\tMathematics");
        System.out.println("Wednesday\tEnglish");

        // Display the Student's information in a message dialog.
        JOptionPane.showMessageDialog(null,
                "STUDENT PROFILE\n"
                + "Name: " + studentName + "\n"
                + "Grade: " + studentGrade + "\n"
                + "Class group: " + classGroup + "\n"
                + "Average mark: " + averageMark);

    }

}
