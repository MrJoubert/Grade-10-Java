
/*
 * Topic: String and Character Conversion
 * Demonstrates extracting characters and converting them to Strings.
 */

public class StringAndCharacterConversion {

    public static void main(String[] args) {

        // Store the Student's name.
        String studentName = "Liam";
        String studentSurname = "Jacobs";

        // Extract the first characters.
        char firstInitial = studentName.charAt(0);
        char surnameInitial = studentSurname.charAt(0);

        System.out.println("STUDENT INITIALS");
        System.out.println("================");
        System.out.println("First name: " + studentName);
        System.out.println("Surname: " + studentSurname);
        System.out.println("First initial: " + firstInitial);
        System.out.println("Surname initial: " + surnameInitial);

        // Convert the characters into Strings.
        String firstInitialText = String.valueOf(firstInitial);
        String surnameInitialText = String.valueOf(surnameInitial);

        String studentInitials = firstInitialText + surnameInitialText;

        System.out.println();
        System.out.println("CONVERTED INITIALS");
        System.out.println("==================");
        System.out.println("First initial as a String: " + firstInitialText);
        System.out.println("Surname initial as a String: " + surnameInitialText);
        System.out.println("Full initials: " + studentInitials);

        // Extract a character from a subject name.
        String subjectName = "Mathematics";

        char firstLetter = subjectName.charAt(0);
        char fourthLetter = subjectName.charAt(3);

        System.out.println();
        System.out.println("SUBJECT CHARACTERS");
        System.out.println("==================");
        System.out.println("Subject: " + subjectName);
        System.out.println("First character: " + firstLetter);
        System.out.println("Fourth character: " + fourthLetter);

        // Demonstrate the difference between char and String.
        char classInitial = 'A';
        String classInitialText = String.valueOf(classInitial);

        System.out.println();
        System.out.println("CHAR AND STRING");
        System.out.println("===============");
        System.out.println("Character value: " + classInitial);
        System.out.println("String value: " + classInitialText);

    }

}
