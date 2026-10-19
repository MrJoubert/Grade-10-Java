
/*
 * Topic: Changing Case and Comparing Strings
 * Demonstrates case conversion and String comparison.
 */

public class ChangingCaseAndComparingStrings {

    public static void main(String[] args) {

        // Store Student and subject information.
        String studentName = "Olivia Smith";
        String subjectName = "Information Technology";

        // Convert Strings to uppercase and lowercase.
        String upperName = studentName.toUpperCase();
        String lowerSubject = subjectName.toLowerCase();

        System.out.println("CHANGING CASE");
        System.out.println("=============");
        System.out.println("Original name: " + studentName);
        System.out.println("Uppercase name: " + upperName);
        System.out.println("Original subject: " + subjectName);
        System.out.println("Lowercase subject: " + lowerSubject);

        // Compare identical Strings.
        String firstSubject = "Mathematics";
        String secondSubject = "Mathematics";

        System.out.println();
        System.out.println("EQUALS COMPARISON");
        System.out.println("=================");
        System.out.println("Subjects equal: "
                + firstSubject.equals(secondSubject));

        // Compare Strings with different capitalisation.
        String enteredSubject = "MATHEMATICS";

        System.out.println();
        System.out.println("CASE-SENSITIVE COMPARISON");
        System.out.println("=========================");
        System.out.println("Using equals(): "
                + firstSubject.equals(enteredSubject));
        System.out.println("Using equalsIgnoreCase(): "
                + firstSubject.equalsIgnoreCase(enteredSubject));

        // Recognise a subject regardless of capitalisation.
        System.out.println();
        System.out.println("SUBJECT RECOGNITION");
        System.out.println("===================");

        if (enteredSubject.equalsIgnoreCase("Mathematics")) {
            System.out.println("Subject recognised.");
        } else {
            System.out.println("Subject not recognised.");
        }

        // Compare String references and contents.
        String firstName = new String("Liam");
        String secondName = new String("Liam");

        System.out.println();
        System.out.println("REFERENCE AND CONTENT COMPARISON");
        System.out.println("================================");
        System.out.println("Using ==: " + (firstName == secondName));
        System.out.println("Using equals(): "
                + firstName.equals(secondName));

    }

}
