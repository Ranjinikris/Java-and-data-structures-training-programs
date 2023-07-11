//JAVA PROGRAM TO FIND THE SUM OF LAST DIGITS OF TWO NUMBERS

public class LastTwoDigitsSum {
    public static int sumOfLastTwoDigits(int number1, int number2) {
        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
       
        int secondLastDigit1 = (number1 / 10) % 10;
        int secondLastDigit2 = (number2 / 10) % 10;
       
        int sum = lastDigit1 + lastDigit2 + secondLastDigit1 + secondLastDigit2;
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        int input1 = 12345;
        int input2 = 67890;
        int result = sumOfLastTwoDigits(input1, input2);
        System.out.println("Sum of the last two digits of " + input1 + " and " + input2 + ": " + result);
    }
}