
/*
 * Topic: Finding Characters and Substrings
 * Demonstrates indexOf() and lastIndexOf().
 */

public class FindingCharactersAndSubstrings {

    public static void main(String[] args) {

        // Search for characters in a Student's name.
        String studentName = "Olivia";

        int firstPosition = studentName.indexOf('i');
        int lastPosition = studentName.lastIndexOf('i');

        System.out.println("STUDENT NAME SEARCH");
        System.out.println("===================");
        System.out.println("Student name: " + studentName);
        System.out.println("First occurrence of i: " + firstPosition);
        System.out.println("Last occurrence of i: " + lastPosition);

        // Search for a subject within a String.
        String subjectName = "Information Technology";

        int subjectPosition = subjectName.indexOf("Technology");

        System.out.println();
        System.out.println("SUBJECT SEARCH");
        System.out.println("==============");
        System.out.println("Subject: " + subjectName);
        System.out.println("Technology starts at: " + subjectPosition);

        // Check whether a character exists.
        int missingPosition = subjectName.indexOf('z');

        System.out.println();
        System.out.println("CHARACTER CHECK");
        System.out.println("===============");
        System.out.println("Position of z: " + missingPosition);

        if (missingPosition == -1) {
            System.out.println("Character not found.");
        } else {
            System.out.println("Character found.");
        }

        // Extract the first name and surname.
        String fullName = "Olivia Smith";

        int spacePosition = fullName.indexOf(' ');

        String firstName = fullName.substring(0, spacePosition);
        String surname = fullName.substring(spacePosition + 1);

        System.out.println();
        System.out.println("NAME EXTRACTION");
        System.out.println("===============");
        System.out.println("Full name: " + fullName);
        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);

        // Search for a character starting from a position.
        String mathematics = "Mathematics";

        int nextPosition = mathematics.indexOf('i', 6);

        System.out.println();
        System.out.println("SEARCH FROM A POSITION");
        System.out.println("======================");
        System.out.println("Subject: " + mathematics);
        System.out.println("Position of i from position 6: " + nextPosition);

    }

}
