
/*
 * Topic: Removing Unwanted Spaces
 * Demonstrates trim() and String comparison.
 */

public class RemovingUnwantedSpaces {

    public static void main(String[] args) {

        // Store a Student name with unwanted spaces.
        String enteredName = "  Olivia Smith  ";

        // Remove leading and trailing spaces.
        String cleanedName = enteredName.trim();

        System.out.println("STUDENT NAME");
        System.out.println("============");
        System.out.println("Original name: [" + enteredName + "]");
        System.out.println("Cleaned name: [" + cleanedName + "]");
        System.out.println("Original length: " + enteredName.length());
        System.out.println("Cleaned length: " + cleanedName.length());

        // Compare a subject name before and after trimming.
        String enteredSubject = "Mathematics ";
        String correctSubject = "Mathematics";

        System.out.println();
        System.out.println("SUBJECT COMPARISON");
        System.out.println("==================");
        System.out.println("Before trimming: "
                + enteredSubject.equals(correctSubject));

        enteredSubject = enteredSubject.trim();

        System.out.println("After trimming: "
                + enteredSubject.equals(correctSubject));

        // Combine trimming with a case-insensitive comparison.
        String anotherSubject = "  INFORMATION TECHNOLOGY ";
        String expectedSubject = "Information Technology";

        anotherSubject = anotherSubject.trim();

        System.out.println();
        System.out.println("SUBJECT VALIDATION");
        System.out.println("==================");

        if (anotherSubject.equalsIgnoreCase(expectedSubject)) {
            System.out.println("Subject recognised.");
        } else {
            System.out.println("Subject not recognised.");
        }

        // Demonstrate that spaces between words remain.
        String fullName = "  Liam Jacobs  ";
        String trimmedFullName = fullName.trim();

        System.out.println();
        System.out.println("SPACES BETWEEN WORDS");
        System.out.println("====================");
        System.out.println("Original: [" + fullName + "]");
        System.out.println("Trimmed: [" + trimmedFullName + "]");

        // Check a String containing only spaces.
        String spacesOnly = "   ";

        System.out.println();
        System.out.println("EMPTY STRING CHECK");
        System.out.println("==================");
        System.out.println("Original is empty: " + spacesOnly.isEmpty());
        System.out.println("Trimmed is empty: "
                + spacesOnly.trim().isEmpty());

    }

}
