public class DigitCounter {
    public static void main(String[] args) {
        int number = 292;
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
