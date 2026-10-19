
public class SwappingValues
{
    public static void main(String[] args)
    {
        // Question 1: Swapping two integer values.
        // Initially, number1 contains 10 and number2 contains 20.

        int number1 = 10;
        int number2 = 20;

        System.out.println("BEFORE SWAPPING");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        // A temporary variable stores one value while it is replaced.
        // Step 1: Save the value of number1 in temp.
        int temp = number1;

        // Step 2: Copy the value of number2 into number1.
        number1 = number2;

        // Step 3: Copy the original value of number1 from temp into number2.
        number2 = temp;

        System.out.println();
        System.out.println("AFTER SWAPPING");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        // Question 2: Swapping two Student marks.
        int liamMark = 75;
        int emmaMark = 92;

        System.out.println();
        System.out.println("BEFORE SWAPPING MARKS");
        System.out.println("Liam's mark: " + liamMark);
        System.out.println("Emma's mark: " + emmaMark);

        // Store Liam's mark before overwriting it.
        int temporaryMark = liamMark;

        // Give Liam Emma's original mark.
        liamMark = emmaMark;

        // Give Emma Liam's original mark.
        emmaMark = temporaryMark;

        System.out.println();
        System.out.println("AFTER SWAPPING MARKS");
        System.out.println("Liam's mark: " + liamMark);
        System.out.println("Emma's mark: " + emmaMark);

        // Question 3: Swapping two String values.
        String firstStudent = "Noah";
        String secondStudent = "Ava";

        System.out.println();
        System.out.println("BEFORE SWAPPING NAMES");
        System.out.println("First Student: " + firstStudent);
        System.out.println("Second Student: " + secondStudent);

        // The same technique works with String variables.
        String temporaryName = firstStudent;

        firstStudent = secondStudent;

        secondStudent = temporaryName;

        System.out.println();
        System.out.println("AFTER SWAPPING NAMES");
        System.out.println("First Student: " + firstStudent);
        System.out.println("Second Student: " + secondStudent);
    }
}

/*
EXPECTED OUTPUT

BEFORE SWAPPING
Number 1: 10
Number 2: 20

AFTER SWAPPING
Number 1: 20
Number 2: 10

BEFORE SWAPPING MARKS
Liam's mark: 75
Emma's mark: 92

AFTER SWAPPING MARKS
Liam's mark: 92
Emma's mark: 75

BEFORE SWAPPING NAMES
First Student: Noah
Second Student: Ava

AFTER SWAPPING NAMES
First Student: Ava
Second Student: Noah

TEACHING EMPHASIS

1. Swapping means exchanging the values stored in two variables.
2. A temporary variable is needed to preserve a value before it
   is overwritten.
3. The correct order is important:
      temp = number1;
      number1 = number2;
      number2 = temp;
4. If you assign number1 = number2 first, the original value
   of number1 is lost unless it was saved.
5. The same technique works with different variable types,
   such as int and String.
*/
