
/*
 * Topic: String Length and Empty Strings
 * Demonstrates length(), isEmpty() and isBlank().
 */

public class StringLengthAndEmptyStrings {

    public static void main(String[] args) {

        // Store Student information.
        String studentName = "Liam Jacobs";
        String subjectName = "Information Technology";

        // Determine String lengths.
        int nameLength = studentName.length();
        int subjectLength = subjectName.length();

        System.out.println("STUDENT INFORMATION");
        System.out.println("===================");
        System.out.println("Student name: " + studentName);
        System.out.println("Name length: " + nameLength);
        System.out.println("Subject: " + subjectName);
        System.out.println("Subject length: " + subjectLength);

        // Check an empty String.
        String emptyName = "";

        System.out.println();
        System.out.println("EMPTY STRING");
        System.out.println("============");
        System.out.println("Length: " + emptyName.length());
        System.out.println("Is empty: " + emptyName.isEmpty());

        // Compare an empty String with a String containing a space.
        String spaceText = " ";

        System.out.println();
        System.out.println("EMPTY STRING AND SPACE");
        System.out.println("======================");
        System.out.println("Empty String length: " + emptyName.length());
        System.out.println("Space String length: " + spaceText.length());
        System.out.println("Space String is empty: " + spaceText.isEmpty());
        System.out.println("Space String is blank: " + spaceText.isBlank());

        // Check whether a Student name has been entered.
        String enteredName = "Olivia Smith";

        System.out.println();
        System.out.println("NAME VALIDATION");
        System.out.println("===============");

        if (enteredName.isEmpty()) {
            System.out.println("Please enter a Student name.");
        } else {
            System.out.println("Student name accepted.");
        }

        // Check the minimum length of a class code.
        String classCode = "11A";

        System.out.println();
        System.out.println("CLASS CODE VALIDATION");
        System.out.println("=====================");

        if (classCode.length() >= 3) {
            System.out.println("Class code length accepted.");
        } else {
            System.out.println("Class code is too short.");
        }

    }

}
