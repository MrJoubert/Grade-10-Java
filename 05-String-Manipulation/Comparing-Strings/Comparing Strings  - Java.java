
public class ComparingStrings {

    public static void main(String[] args) {

        // QUESTION 1: Comparing equal strings
        System.out.println("COMPARING STRINGS");
        System.out.println("=================");

        String subjectOne = "Mathematics";
        String subjectTwo = "Mathematics";

        System.out.println("Subjects match: "
                + subjectOne.equals(subjectTwo));

        // QUESTION 2: Comparing strings with different letter cases
        System.out.println();
        System.out.println("LETTER CASE");
        System.out.println("===========");

        String nameOne = "Olivia";
        String nameTwo = "olivia";

        System.out.println("Using equals(): "
                + nameOne.equals(nameTwo));

        System.out.println("Using equalsIgnoreCase(): "
                + nameOne.equalsIgnoreCase(nameTwo));

        // QUESTION 3: Checking a student's class
        System.out.println();
        System.out.println("CLASS CHECK");
        System.out.println("===========");

        String classCode = "11A";

        if (classCode.equals("11A")) {
            System.out.println("Student is in class 11A.");
        } else {
            System.out.println("Student is in a different class.");
        }

        // QUESTION 4: Comparing subject names
        System.out.println();
        System.out.println("SUBJECT CHECK");
        System.out.println("=============");

        String enteredSubject = "information technology";
        String storedSubject = "Information Technology";

        if (enteredSubject.equalsIgnoreCase(storedSubject)) {
            System.out.println("Subject names match.");
        } else {
            System.out.println("Subject names do not match.");
        }

        // QUESTION 5: Checking for unwanted spaces
        System.out.println();
        System.out.println("SPACE CHECK");
        System.out.println("===========");

        String enteredName = " Liam ";
        String storedName = "Liam";

        System.out.println("Before trim(): "
                + enteredName.equals(storedName));

        System.out.println("After trim(): "
                + enteredName.trim().equals(storedName));

        // QUESTION 6: Comparing string references and contents
        System.out.println();
        System.out.println("REFERENCE AND CONTENTS");
        System.out.println("======================");

        String answerOne = new String("Java");
        String answerTwo = new String("Java");

        System.out.println("Using ==: " + (answerOne == answerTwo));
        System.out.println("Using equals(): "
                + answerOne.equals(answerTwo));
    }
}
