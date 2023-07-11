//JAVA PROGRAM TO FIND LAST DIGIT OF A NUMBER
public class LastDigitFinder {
    public static int getLastDigit(int number) {
        int lastDigit = Math.abs(number) % 10;
        return lastDigit;
    }

    public static void main(String[] args) {
        // Example usage
        int input1 = 12345;
        int result1 = getLastDigit(input1);
        System.out.println("Last digit of " + input1 + ": " + result1);

        int input2 = -987654321;
        int result2 = getLastDigit(input2);
        System.out.println("Last digit of " + input2 + ": " + result2);

        int input3 = 0;
        int result3 = getLastDigit(input3);
        System.out.println("Last digit of " + input3 + ": " + result3);
    }
}