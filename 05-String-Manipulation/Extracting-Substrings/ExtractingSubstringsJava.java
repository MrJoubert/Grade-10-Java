
/*
 * Topic: Extracting Substrings
 * Demonstrates substring() with one and two arguments.
 */

public class ExtractingSubstrings {

    public static void main(String[] args) {

        // Store a subject name.
        String subjectName = "INFORMATION";

        // Extract the beginning of the subject name.
        String subjectPrefix = subjectName.substring(0, 4);

        System.out.println("SUBJECT NAME");
        System.out.println("============");
        System.out.println("Original subject: " + subjectName);
        System.out.println("Subject prefix: " + subjectPrefix);

        // Store a Student number.
        String studentNumber = "20261234";

        // Extract sections of the Student number.
        String year = studentNumber.substring(0, 4);
        String studentCode = studentNumber.substring(4, 8);
        String lastFourDigits = studentNumber.substring(
                studentNumber.length() - 4);

        System.out.println();
        System.out.println("STUDENT NUMBER");
        System.out.println("==============");
        System.out.println("Student number: " + studentNumber);
        System.out.println("Year: " + year);
        System.out.println("Student code: " + studentCode);
        System.out.println("Last four digits: " + lastFourDigits);

        // Extract parts of a class code.
        String classCode = "GRADE11A";

        String gradeText = classCode.substring(5, 7);
        String classGroup = classCode.substring(7);

        System.out.println();
        System.out.println("CLASS CODE");
        System.out.println("==========");
        System.out.println("Class code: " + classCode);
        System.out.println("Grade: " + gradeText);
        System.out.println("Class group: " + classGroup);

        // Extract the surname from a full name.
        String fullName = "Olivia Smith";
        int surnameStart = fullName.indexOf(" ") + 1;

        String surname = fullName.substring(surnameStart);

        System.out.println();
        System.out.println("STUDENT NAME");
        System.out.println("============");
        System.out.println("Full name: " + fullName);
        System.out.println("Surname: " + surname);

    }

}
