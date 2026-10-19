
public class BuiltInMethodsAndObjects
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS AN OBJECT?
        // ============================================================
        // An object is created from a class.
        //
        // String is a class provided by Java.
        // A String object stores a sequence of characters.
        //
        // The variable studentName refers to a String object.
        //
        // Java provides built-in methods that allow us to work with
        // objects without writing all the functionality ourselves.

        System.out.println("SECTION 1: STRING OBJECTS");

        String studentName = "Ayesha Khan";
        String subject = "Information Technology";

        System.out.println("Student: " + studentName);
        System.out.println("Subject: " + subject);

        // ============================================================
        // SECTION 2: WHAT IS A METHOD?
        // ============================================================
        // A method is a named block of code that performs a task.
        //
        // A built-in method is a method already provided by Java.
        //
        // To call a method on an object, we generally use:
        //
        // objectName.methodName();
        //
        // Some methods return a value.
        // That value can be displayed, stored or used in a calculation.

        System.out.println();
        System.out.println("SECTION 2: CALLING METHODS");

        String schoolName = "Crawford";

        // length() returns the number of characters in the String.
        int numberOfCharacters = schoolName.length();

        System.out.println("School name: " + schoolName);
        System.out.println("Number of characters: "
                + numberOfCharacters);

        // ============================================================
        // SECTION 3: THE length() METHOD
        // ============================================================
        // length() counts every character in a String.
        //
        // Spaces also count as characters.
        //
        // The result is an int, so it can be stored in an int variable.
        //
        // Remember:
        // String uses length()
        // Arrays use the length property without parentheses.

        System.out.println();
        System.out.println("SECTION 3: STRING LENGTH");

        String fullName = "Liam Smith";
        String className = "Grade 10";

        System.out.println("Full name length: " + fullName.length());
        System.out.println("Class name length: " + className.length());

        // ============================================================
        // SECTION 4: THE toUpperCase() METHOD
        // ============================================================
        // toUpperCase() returns a new String with its letters
        // converted to uppercase.
        //
        // The original String is not changed automatically.
        // We can display the returned value or store it in a variable.

        System.out.println();
        System.out.println("SECTION 4: UPPERCASE");

        String originalSubject = "computer applications technology";

        System.out.println("Original: " + originalSubject);
        System.out.println("Uppercase: "
                + originalSubject.toUpperCase());

        // ============================================================
        // SECTION 5: THE toLowerCase() METHOD
        // ============================================================
        // toLowerCase() returns a String with its letters converted
        // to lowercase.
        //
        // This can be useful when displaying information consistently
        // or preparing text for case-insensitive comparisons.

        System.out.println();
        System.out.println("SECTION 5: LOWERCASE");

        String studentSurname = "NAIDOO";

        System.out.println("Original: " + studentSurname);
        System.out.println("Lowercase: "
                + studentSurname.toLowerCase());

        // ============================================================
        // SECTION 6: THE charAt() METHOD
        // ============================================================
        // charAt() returns the character at a specified position.
        //
        // IMPORTANT:
        // Java String positions start at 0, not 1.
        //
        // For "GRADE":
        // G is at position 0.
        // R is at position 1.
        // A is at position 2.
        // D is at position 3.
        // E is at position 4.
        //
        // The position supplied to charAt() is called an index.

        System.out.println();
        System.out.println("SECTION 6: CHARACTER POSITIONS");

        String gradeLabel = "GRADE";

        System.out.println("Position 0: " + gradeLabel.charAt(0));
        System.out.println("Position 1: " + gradeLabel.charAt(1));
        System.out.println("Position 2: " + gradeLabel.charAt(2));
        System.out.println("Position 3: " + gradeLabel.charAt(3));
        System.out.println("Position 4: " + gradeLabel.charAt(4));

        // ============================================================
        // SECTION 7: USING length() AND charAt() TOGETHER
        // ============================================================
        // These methods can be combined.
        //
        // length() tells us how many characters are present.
        // charAt() retrieves a character at a particular index.
        //
        // The final character is at index length() - 1.
        //
        // For a String of length 5:
        // The last valid index is 4.
        //
        // This is because indexing starts at 0.

        System.out.println();
        System.out.println("SECTION 7: FIRST AND LAST CHARACTERS");

        String firstName = "Thabo";

        char firstCharacter = firstName.charAt(0);
        char lastCharacter = firstName.charAt(firstName.length() - 1);

        System.out.println("First character: " + firstCharacter);
        System.out.println("Last character: " + lastCharacter);

        // ============================================================
        // SECTION 8: THE equals() METHOD
        // ============================================================
        // equals() compares the contents of two Strings.
        //
        // It returns a boolean:
        // true if the Strings contain the same sequence of characters.
        // false if their contents differ.
        //
        // String comparisons using equals() are case-sensitive.
        //
        // Use equals() to compare String contents instead of ==.

        System.out.println();
        System.out.println("SECTION 8: STRING COMPARISON");

        String selectedSubject = "IT";

        boolean isIT = selectedSubject.equals("IT");
        boolean isCAT = selectedSubject.equals("CAT");

        System.out.println("Is IT selected? " + isIT);
        System.out.println("Is CAT selected? " + isCAT);

        // ============================================================
        // SECTION 9: CASE-SENSITIVE COMPARISON
        // ============================================================
        // "IT" and "it" contain different uppercase/lowercase letters.
        //
        // equals() treats these as different Strings.
        //
        // equalsIgnoreCase() compares Strings without considering
        // differences between uppercase and lowercase letters.

        System.out.println();
        System.out.println("SECTION 9: CASE-SENSITIVE COMPARISON");

        String enteredSubject = "it";

        System.out.println("Using equals(): "
                + enteredSubject.equals("IT"));

        System.out.println("Using equalsIgnoreCase(): "
                + enteredSubject.equalsIgnoreCase("IT"));

        // ============================================================
        // SECTION 10: THE contains() METHOD
        // ============================================================
        // contains() checks whether a String contains a specified
        // sequence of characters.
        //
        // It returns true if the sequence is found.
        // It returns false if the sequence is not found.
        //
        // The comparison is case-sensitive.

        System.out.println();
        System.out.println("SECTION 10: SEARCHING TEXT");

        String subjectDescription =
                "Information Technology includes programming";

        System.out.println("Contains programming? "
                + subjectDescription.contains("programming"));

        System.out.println("Contains databases? "
                + subjectDescription.contains("databases"));

        // ============================================================
        // SECTION 11: THE substring() METHOD
        // ============================================================
        // substring() extracts part of a String.
        //
        // substring(beginIndex) returns characters from beginIndex
        // to the end of the String.
        //
        // substring(beginIndex, endIndex) returns characters from
        // beginIndex up to, but NOT including, endIndex.
        //
        // Remember that String indexes start at 0.

        System.out.println();
        System.out.println("SECTION 11: SUBSTRING");

        String studentNumber = "STU202610";

        System.out.println("Original: " + studentNumber);
        System.out.println("From index 3: "
                + studentNumber.substring(3));
        System.out.println("Indexes 0 to 3: "
                + studentNumber.substring(0, 3));

        // ============================================================
        // SECTION 12: THE trim() METHOD
        // ============================================================
        // trim() removes leading and trailing spaces from a String.
        //
        // It does not remove spaces between words.
        //
        // This can be useful when processing text entered by a user.

        System.out.println();
        System.out.println("SECTION 12: REMOVING OUTSIDE SPACES");

        String enteredName = "  Naledi Molefe  ";

        System.out.println("Original: [" + enteredName + "]");
        System.out.println("Trimmed: [" + enteredName.trim() + "]");

        // ============================================================
        // SECTION 13: THE replace() METHOD
        // ============================================================
        // replace() returns a String in which matching characters
        // or character sequences have been replaced.
        //
        // The original String remains unchanged unless the returned
        // value is assigned to a variable.

        System.out.println();
        System.out.println("SECTION 13: REPLACING TEXT");

        String timetableEntry = "IT - Room 12";

        String updatedEntry = timetableEntry.replace("Room 12",
                "Room 15");

        System.out.println("Original: " + timetableEntry);
        System.out.println("Updated: " + updatedEntry);

        // ============================================================
        // SECTION 14: METHODS THAT RETURN VALUES
        // ============================================================
        // Some methods return a value that can be used elsewhere.
        //
        // The returned value can be:
        // - Displayed directly.
        // - Stored in a variable.
        // - Used in a calculation.
        // - Used as part of a condition.
        //
        // The following examples demonstrate these possibilities.

        System.out.println();
        System.out.println("SECTION 14: USING RETURNED VALUES");

        String surname = "Dlamini";

        // Display the returned value directly.
        System.out.println(surname.toUpperCase());

        // Store the returned value.
        String shortenedSurname = surname.substring(0, 3);
        System.out.println("First three letters: "
                + shortenedSurname);

        // Use the returned int in a calculation.
        int surnameLength = surname.length();
        int doubleLength = surnameLength * 2;

        System.out.println("Double the surname length: "
                + doubleLength);

        // Use the returned boolean in a condition.
        if (surname.contains("lam"))
        {
            System.out.println("The surname contains 'lam'.");
        }

        // ============================================================
        // SECTION 15: COMMON ERRORS
        // ============================================================
        // 1. Writing length instead of length() for a String.
        //
        // 2. Using an invalid index with charAt().
        //    For a String of length 5, valid indexes are 0 to 4.
        //
        // 3. Forgetting that substring's end index is excluded.
        //
        // 4. Expecting toUpperCase() or trim() to change the original
        //    String automatically.
        //
        // 5. Comparing String contents using == instead of equals().
        //
        // 6. Forgetting that equals() is case-sensitive.
        //
        // 7. Using parentheses incorrectly when calling a method.
        //
        // Check the return type of a method before storing its result.

        // ============================================================
        // SECTION 16: PRACTICE CHALLENGE
        // ============================================================
        // A Student's name is stored in the variable challengeName.
        //
        // Write statements to:
        // 1. Display the name in uppercase.
        // 2. Display the number of characters in the name.
        // 3. Display the first character.
        // 4. Display the last character.
        // 5. Check whether the name contains "an".
        //
        // Use the built-in methods demonstrated in this file.

        System.out.println();
        System.out.println("SECTION 16: PRACTICE CHALLENGE");

        String challengeName = "Anele";

        System.out.println("Uppercase: "
                + challengeName.toUpperCase());

        System.out.println("Length: " + challengeName.length());

        System.out.println("First character: "
                + challengeName.charAt(0));

        System.out.println("Last character: "
                + challengeName.charAt(challengeName.length() - 1));

        System.out.println("Contains 'an': "
                + challengeName.contains("an"));
    }
}
