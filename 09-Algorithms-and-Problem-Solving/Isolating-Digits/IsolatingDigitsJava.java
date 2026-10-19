
public class IsolatingDigits
{
    public static void main(String[] args)
    {
        // Question 1: Isolating the units digit.
        // The modulus operator (%) returns the remainder.
        // Dividing an integer by 10 and finding the remainder
        // gives the units digit.

        int studentNumber = 12345;

        int unitsDigit = studentNumber % 10;

        System.out.println("Student number: " + studentNumber);
        System.out.println("Units digit: " + unitsDigit);

        // Question 2: Isolating the tens digit.
        // Integer division by 10 removes the units digit.
        // Taking the remainder after dividing by 10 then
        // gives the original tens digit.

        int tensDigit = (studentNumber / 10) % 10;

        System.out.println("Tens digit: " + tensDigit);

        // Question 3: Isolating the hundreds digit.
        // Divide by 100 to remove the last two digits.
        // The remainder after dividing by 10 gives
        // the hundreds digit.

        int hundredsDigit = (studentNumber / 100) % 10;

        System.out.println("Hundreds digit: " + hundredsDigit);

        // Question 4: Isolating the thousands digit.
        int thousandsDigit = (studentNumber / 1000) % 10;

        System.out.println("Thousands digit: " + thousandsDigit);

        // Question 5: Isolating the ten-thousands digit.
        int tenThousandsDigit = (studentNumber / 10000) % 10;

        System.out.println("Ten-thousands digit: " + tenThousandsDigit);

        // Question 6: Using isolated digits in a calculation.
        // Here, we add the units and tens digits.

        int digitTotal = unitsDigit + tensDigit;

        System.out.println("Units and tens total: " + digitTotal);

        // Question 7: Isolating digits from a mark.
        // Consider a mark of 87.
        // The tens digit is 8 and the units digit is 7.

        int mark = 87;

        int markTens = (mark / 10) % 10;
        int markUnits = mark % 10;

        System.out.println("Mark: " + mark);
        System.out.println("Tens digit of mark: " + markTens);
        System.out.println("Units digit of mark: " + markUnits);
    }
}

/*
EXPECTED OUTPUT

Student number: 12345
Units digit: 5
Tens digit: 4
Hundreds digit: 3
Thousands digit: 2
Ten-thousands digit: 1
Units and tens total: 9
Mark: 87
Tens digit of mark: 8
Units digit of mark: 7

TEACHING EMPHASIS

1. The modulus operator (%) gives the remainder after division.
2. Integer division (/) removes the decimal portion of the result.
3. number % 10 isolates the units digit.
4. (number / 10) % 10 isolates the tens digit.
5. (number / 100) % 10 isolates the hundreds digit.
6. Dividing by higher powers of 10 allows you to isolate
   digits further to the left.
7. Brackets make the order of calculations clear.
*/
