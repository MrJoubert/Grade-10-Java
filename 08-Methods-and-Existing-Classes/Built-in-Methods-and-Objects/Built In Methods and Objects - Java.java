
public class BuiltInMethodsAndObjects
{
    public static void main(String[] args)
    {
        // Question 1: Working with String objects.
        String firstName = "Liam";
        String surname = "Botha";

        System.out.println("FIRST NAME: " + firstName);
        System.out.println("SURNAME: " + surname);

        // Question 2: Finding the length of a String.
        // length() returns the number of characters in the String.
        System.out.println("Name length: " + firstName.length());

        // Question 3: Changing the case of a String.
        // These methods return new String values.
        // They do not change the original String.
        System.out.println("Uppercase: " + firstName.toUpperCase());
        System.out.println("Lowercase: " + surname.toLowerCase());

        // Question 4: Accessing a character using charAt().
        // String positions start at index 0.
        System.out.println("First character: " + firstName.charAt(0));
        System.out.println("Last character: "
                + firstName.charAt(firstName.length() - 1));

        // Question 5: Comparing Strings.
        // Use equals() to compare the contents of Strings.
        String subject1 = "Information Technology";
        String subject2 = "Information Technology";
        String subject3 = "information technology";

        System.out.println("Subjects match: " + subject1.equals(subject2));

        // equals() is case-sensitive.
        System.out.println("Subjects match: " + subject1.equals(subject3));

        // equalsIgnoreCase() ignores differences in uppercase and lowercase.
        System.out.println("Subjects match: "
                + subject1.equalsIgnoreCase(subject3));

        // Question 6: Checking whether a String contains text.
        String announcement = "The Grade 12 IT test is on Friday.";

        System.out.println("Contains IT: " + announcement.contains("IT"));
        System.out.println("Contains CAT: " + announcement.contains("CAT"));

        // Question 7: Extracting part of a String.
        // substring(0, 4) includes index 0 but excludes index 4.
        System.out.println("First name section: "
                + firstName.substring(0, 2));

        // Question 8: Removing spaces at the beginning and end.
        String studentNumber = "   12045   ";

        System.out.println("Before trim: [" + studentNumber + "]");
        System.out.println("After trim: [" + studentNumber.trim() + "]");

        // Question 9: Replacing characters or text.
        String classGroup = "Grade 11 CAT";

        System.out.println(classGroup.replace("CAT", "IT"));

        // Question 10: Combining built-in methods.
        String emailName = "  LIAM BOTHA  ";

        String formattedName = emailName.trim().toLowerCase();

        System.out.println("Formatted name: " + formattedName);

        // Question 11: Using a built-in method in a condition.
        String enteredPassword = "School123";

        if (enteredPassword.length() >= 8)
        {
            System.out.println("Password length is acceptable.");
        }
        else
        {
            System.out.println("Password is too short.");
        }

        // Question 12: Using a method result in a calculation.
        String studentName = "Emma";

        int nameLength = studentName.length();
        int doubleLength = nameLength * 2;

        System.out.println("Name length: " + nameLength);
        System.out.println("Double the length: " + doubleLength);
    }
}

/*
EXPECTED OUTPUT

FIRST NAME: Liam
SURNAME: Botha
Name length: 4
Uppercase: LIAM
Lowercase: botha
First character: L
Last character: m
Subjects match: true
Subjects match: false
Subjects match: true
Contains IT: true
Contains CAT: false
First name section: Li
Before trim: [   12045   ]
After trim: [12045]
Grade 11 IT
Formatted name: liam botha
Password length is acceptable.
Name length: 4
Double the length: 8

TEACHING EMPHASIS

1. A String is an object.
2. Built-in methods perform operations on objects.
3. A method is called using the object name, a dot and the method name.
4. length() returns the number of characters in a String.
5. charAt() uses an index, starting at 0.
6. equals() compares String contents and is case-sensitive.
7. equalsIgnoreCase() compares String contents without considering case.
8. substring() uses a starting index and an ending index that is excluded.
9. Methods such as trim(), toUpperCase() and replace() return a String.
10. Store a returned value in a variable if you need to use it later.
*/
