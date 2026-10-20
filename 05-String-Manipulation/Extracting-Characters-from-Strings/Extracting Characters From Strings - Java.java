
/*
 * Topic: Extracting Characters from Strings
 * Demonstrates using charAt() and String positions.
 */

public class ExtractingCharactersFromStrings {

    public static void main(String[] args) {

        // Store the Student's name and surname.
        String firstName = "Liam";
        String surname = "Jacobs";

        // Extract the first and last characters.
        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = surname.charAt(0);
        char lastNameCharacter = surname.charAt(surname.length() - 1);

        System.out.println("STUDENT NAME");
        System.out.println("============");
        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("First initial: " + firstNameInitial);
        System.out.println("Surname initial: " + lastNameInitial);
        System.out.println("Last surname character: " + lastNameCharacter);

        // Combine the initials.
        String initials = "" + firstNameInitial + lastNameInitial;

        System.out.println();
        System.out.println("STUDENT INITIALS");
        System.out.println("================");
        System.out.println("Initials: " + initials);

        // Extract characters from a subject name.
        String subjectName = "Mathematics";

        char firstLetter = subjectName.charAt(0);
        char thirdLetter = subjectName.charAt(2);
        char lastLetter = subjectName.charAt(subjectName.length() - 1);

        System.out.println();
        System.out.println("SUBJECT CHARACTERS");
        System.out.println("==================");
        System.out.println("Subject: " + subjectName);
        System.out.println("First character: " + firstLetter);
        System.out.println("Third character: " + thirdLetter);
        System.out.println("Last character: " + lastLetter);

        // Demonstrate how spaces affect positions.
        String className = "Grade 11";

        char characterAtPositionFive = className.charAt(5);
        char characterAtPositionSix = className.charAt(6);

        System.out.println();
        System.out.println("CLASS NAME CHARACTERS");
        System.out.println("=====================");
        System.out.println("Class name: " + className);
        System.out.println("Character at position 5: '" 
                + characterAtPositionFive + "'");
        System.out.println("Character at position 6: '" 
                + characterAtPositionSix + "'");

    }

}
