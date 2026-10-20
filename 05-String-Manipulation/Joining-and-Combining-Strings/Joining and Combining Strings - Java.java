public class JoiningAndCombiningStrings {

    public static void main(String[] args) {

        // QUESTION 1: Joining a first name and surname
        System.out.println("FULL NAME");
        System.out.println("=========");

        String firstName = "Olivia";
        String surname = "Smith";

        String fullName = firstName + " " + surname;

        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Full name: " + fullName);

        // QUESTION 2: Joining several values
        System.out.println();
        System.out.println("STUDENT INFORMATION");
        System.out.println("===================");

        String classCode = "11A";
        String subject = "Information Technology";
        int mark = 85;

        String report = fullName + " is in class " + classCode
                + " and achieved " + mark + "% for "
                + subject + ".";

        System.out.println(report);

        // QUESTION 3: Addition versus concatenation
        System.out.println();
        System.out.println("ADDITION AND CONCATENATION");
        System.out.println("==========================");

        int firstNumber = 10;
        int secondNumber = 5;

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Concatenation: " + firstNumber + secondNumber);
        System.out.println("With brackets: " + (firstNumber + secondNumber));

        // QUESTION 4: Using concat()
        System.out.println();
        System.out.println("USING CONCAT");
        System.out.println("============");

        String welcome = "Welcome, ";
        String studentName = "Liam";

        welcome = welcome.concat(studentName);

        System.out.println(welcome);

        // QUESTION 5: Joining subject names
        System.out.println();
        System.out.println("SUBJECTS");
        System.out.println("========");

        String subjectOne = "Computer";
        String subjectTwo = "Applications";
        String subjectThree = "Technology";

        String completeSubject = subjectOne + " " + subjectTwo
                + " " + subjectThree;

        System.out.println("Subject: " + completeSubject);

        // QUESTION 6: Combining and updating a string
        System.out.println();
        System.out.println("UPDATED CLASS MESSAGE");
        System.out.println("=====================");

        String classMessage = "The students are in ";
        classMessage = classMessage.concat(classCode);
        classMessage = classMessage + ".";

        System.out.println(classMessage);
    }
}
