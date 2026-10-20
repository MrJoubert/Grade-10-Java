
import java.util.Scanner;

/**
 * File: StringAndCharacterPrograms.java
 * Folder: 12-Integrated-Examples-and-Practice/String-and-Character-Programs
 *
 * PURPOSE:
 * To demonstrate how String methods and the Character class can be
 * used to process and analyse text.
 *
 * SCENARIO:
 * A school programme processes Student names, subject names and
 * simple identification codes.
 *
 * CONCEPTS DEMONSTRATED:
 * 1. String length and character positions.
 * 2. Changing the case of text.
 * 3. Comparing Strings.
 * 4. Searching within Strings.
 * 5. Extracting parts of Strings.
 * 6. Using the Character class.
 * 7. Counting letters, digits and spaces.
 * 8. Processing text using loops.
 */

public class StringAndCharacterPrograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================================================
        // EXAMPLE 1: BASIC STRING METHODS
        // =========================================================

        System.out.println("EXAMPLE 1: BASIC STRING METHODS");
        System.out.println("------------------------------");

        String studentName = "Aiden Smith";

        // length() returns the number of characters in the String.
        // Spaces are included in the length.

        System.out.println("Name: " + studentName);
        System.out.println("Length: " + studentName.length());

        // toUpperCase() and toLowerCase() return new Strings
        // with the characters converted to the specified case.

        System.out.println("Uppercase: " + studentName.toUpperCase());
        System.out.println("Lowercase: " + studentName.toLowerCase());

        // charAt() returns the character at a specified position.
        // String positions start at 0, not 1.

        System.out.println("First character: " + studentName.charAt(0));
        System.out.println("Third character: " + studentName.charAt(2));

        // =========================================================
        // EXAMPLE 2: COMPARING STRINGS
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 2: COMPARING STRINGS");
        System.out.println("----------------------------");

        String subject1 = "Information Technology";
        String subject2 = "information technology";
        String subject3 = "Mathematics";

        // equals() compares the contents of two Strings.
        // It is case-sensitive.

        if (subject1.equals(subject2)) {
            System.out.println("The first two subjects are identical.");
        } else {
            System.out.println("The first two subjects differ.");
        }

        // equalsIgnoreCase() ignores differences in letter case.

        if (subject1.equalsIgnoreCase(subject2)) {
            System.out.println("The first two subjects match, ignoring case.");
        }

        // Compare a String against another specific value.

        if (subject1.equals("Information Technology")) {
            System.out.println("The subject is Information Technology.");
        }

        // =========================================================
        // EXAMPLE 3: SEARCHING WITHIN A STRING
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 3: SEARCHING WITHIN A STRING");
        System.out.println("------------------------------------");

        String schoolEmail = "aiden.smith@school.co.za";

        // contains() checks whether a String contains a sequence
        // of characters.

        if (schoolEmail.contains("@")) {
            System.out.println("The email contains an @ symbol.");
        }

        // indexOf() returns the position of the first occurrence
        // of a character or String.
        // It returns -1 when the item cannot be found.

        int atPosition = schoolEmail.indexOf("@");

        System.out.println("Position of @: " + atPosition);

        if (schoolEmail.indexOf(".") != -1) {
            System.out.println("The email contains a full stop.");
        }

        // =========================================================
        // EXAMPLE 4: EXTRACTING PARTS OF A STRING
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 4: EXTRACTING TEXT");
        System.out.println("-------------------------");

        String studentNumber = "20261025";

        // substring(0, 4) extracts characters from position 0
        // up to, but not including, position 4.

        String year = studentNumber.substring(0, 4);

        // substring(4) extracts from position 4 to the end.

        String remainingNumber = studentNumber.substring(4);

        System.out.println("Student number: " + studentNumber);
        System.out.println("Year portion: " + year);
        System.out.println("Remaining digits: " + remainingNumber);

        // replace() returns a String with matching characters replaced.

        String className = "Grade 10 IT";

        System.out.println("Original: " + className);
        System.out.println("Updated: " + className.replace("10", "11"));

        // =========================================================
        // EXAMPLE 5: USING THE CHARACTER CLASS
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 5: CHARACTER CLASS");
        System.out.println("-------------------------");

        char character = '7';

        // Character.isDigit() checks whether a character is a digit.

        if (Character.isDigit(character)) {
            System.out.println(character + " is a digit.");
        }

        // Character.isLetter() checks whether a character is a letter.

        character = 'A';

        if (Character.isLetter(character)) {
            System.out.println(character + " is a letter.");
        }

        // Character.isUpperCase() and isLowerCase() check letter case.

        if (Character.isUpperCase(character)) {
            System.out.println(character + " is uppercase.");
        }

        character = Character.toLowerCase(character);

        System.out.println("Converted to lowercase: " + character);

        // Character.isWhitespace() checks whether a character is
        // whitespace, such as a space or tab.

        character = ' ';

        if (Character.isWhitespace(character)) {
            System.out.println("The character is whitespace.");
        }

        // =========================================================
        // EXAMPLE 6: COUNTING CHARACTERS IN A STRING
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 6: COUNTING CHARACTERS");
        System.out.println("-----------------------------");

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        int letterCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int otherCount = 0;

        // Examine each character in the String.
        // The loop starts at position 0 because String indexing
        // starts at 0.

        for (int position = 0;
                position < sentence.length();
                position++) {

            char currentCharacter = sentence.charAt(position);

            // Determine the type of the current character.

            if (Character.isLetter(currentCharacter)) {
                letterCount++;
            } else if (Character.isDigit(currentCharacter)) {
                digitCount++;
            } else if (Character.isWhitespace(currentCharacter)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }

        // Display the character counts.

        System.out.println("Letters: " + letterCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Whitespace characters: " + spaceCount);
        System.out.println("Other characters: " + otherCount);

        // =========================================================
        // EXAMPLE 7: VALIDATING A STUDENT NAME
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 7: VALIDATING A NAME");
        System.out.println("---------------------------");

        System.out.print("Enter a Student's first name: ");
        String firstName = input.nextLine();

        // trim() removes whitespace from the beginning and end.
        // A name containing only spaces is treated as blank.

        while (firstName.trim().isEmpty()) {
            System.out.println("The name cannot be blank.");
            System.out.print("Enter a Student's first name: ");
            firstName = input.nextLine();
        }

        System.out.println("Name accepted: " + firstName.trim());

        input.close();
    }
}

/*
SAMPLE OUTPUT EXTRACTS

EXAMPLE 1: BASIC STRING METHODS
------------------------------
Name: Aiden Smith
Length: 11
Uppercase: AIDEN SMITH
Lowercase: aiden smith
First character: A
Third character: d

EXAMPLE 2: COMPARING STRINGS
----------------------------
The first two subjects differ.
The first two subjects match, ignoring case.
The subject is Information Technology.

EXAMPLE 3: SEARCHING WITHIN A STRING
------------------------------------
The email contains an @ symbol.
Position of @: 10
The email contains a full stop.

EXAMPLE 4: EXTRACTING TEXT
-------------------------
Student number: 20261025
Year portion: 2026
Remaining digits: 1025
Original: Grade 10 IT
Updated: Grade 11 IT

EXAMPLE 5: CHARACTER CLASS
-------------------------
7 is a digit.
A is a letter.
A is uppercase.
Converted to lowercase: a
The character is whitespace.

EXAMPLE 6: COUNTING CHARACTERS
-----------------------------
Enter a sentence: Grade 10 IT
Letters: 6
Digits: 2
Whitespace characters: 2
Other characters: 0

EXAMPLE 7: VALIDATING A NAME
---------------------------
Enter a Student's first name: Aiden
Name accepted: Aiden

Note: The output extracts illustrate selected examples.
The final two examples require user input.
*/
