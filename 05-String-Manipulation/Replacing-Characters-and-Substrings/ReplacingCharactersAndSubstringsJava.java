
/*
 * Topic: Replacing Characters and Substrings
 * Demonstrates the replace() method.
 */

public class ReplacingCharactersAndSubstrings {

    public static void main(String[] args) {

        // Replace characters in a Student's name.
        String studentName = "Olivia Smith";

        String updatedName = studentName.replace('i', 'y');

        System.out.println("STUDENT NAME");
        System.out.println("============");
        System.out.println("Original name: " + studentName);
        System.out.println("Updated name: " + updatedName);

        // Replace a class group.
        String classCode = "11A";

        String updatedClassCode = classCode.replace('A', 'B');

        System.out.println();
        System.out.println("CLASS CODE");
        System.out.println("==========");
        System.out.println("Original code: " + classCode);
        System.out.println("Updated code: " + updatedClassCode);

        // Replace a substring in a subject name.
        String subjectName = "Computer Studies";

        String updatedSubject = subjectName.replace(
                "Studies", "Applications Technology");

        System.out.println();
        System.out.println("SUBJECT NAME");
        System.out.println("============");
        System.out.println("Original subject: " + subjectName);
        System.out.println("Updated subject: " + updatedSubject);

        // Replace all occurrences of a substring.
        String subjectCodes = "IT IT IT";

        String updatedCodes = subjectCodes.replace("IT", "CAT");

        System.out.println();
        System.out.println("SUBJECT CODES");
        System.out.println("=============");
        System.out.println("Original codes: " + subjectCodes);
        System.out.println("Updated codes: " + updatedCodes);

        // Replace spaces with underscores.
        String fullName = "Liam Jacobs";

        String formattedName = fullName.replace(' ', '_');

        System.out.println();
        System.out.println("FORMATTED NAME");
        System.out.println("==============");
        System.out.println("Original name: " + fullName);
        System.out.println("Formatted name: " + formattedName);

        // Store a replacement in the original variable.
        String editableCode = "12A";

        editableCode = editableCode.replace('A', 'C');

        System.out.println();
        System.out.println("UPDATED VARIABLE");
        System.out.println("================");
        System.out.println("Updated code: " + editableCode);

    }

}
