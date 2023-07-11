//JAVA PROGRAM TO FIND SECOND LAST DIGIT OF A GIVEN NUMBER

public class SecondLastDigitFinder {
    public static int getSecondLastDigit(int number) {
        int absNumber = Math.abs(number);
       
        if (absNumber < 10) {
            // If the number has only one digit, return -1 to indicate no second last digit
            return -1;
        } else {
            int secondLastDigit = (absNumber / 10) % 10;
            return secondLastDigit;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int input1 = 12345;
        int result1 = getSecondLastDigit(input1);
        System.out.println("Second last digit of " + input1 + ": " + result1);

        int input2 = -987654321;
        int result2 = getSecondLastDigit(input2);
        System.out.println("Second last digit of " + input2 + ": " + result2);

        int input3 = 7;
        int result3 = getSecondLastDigit(input3);
        System.out.println("Second last digit of " + input3 + ": " + result3);
    }
}