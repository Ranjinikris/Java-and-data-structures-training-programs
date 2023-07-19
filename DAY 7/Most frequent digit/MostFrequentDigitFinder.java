public class MostFrequentDigitFinder {

    public static int MostFrequentDigit(int input1, int input2, int input3, int input4) {
        int[] digitFrequency = new int[10];

        countDigits(input1, digitFrequency);
        countDigits(input2, digitFrequency);
        countDigits(input3, digitFrequency);
        countDigits(input4, digitFrequency);

        int mostFrequentDigit = findMostFrequentDigit(digitFrequency);
        return mostFrequentDigit;
    }

    private static void countDigits(int num, int[] digitFrequency) {
        while (num > 0) {
            int digit = num % 10;
            digitFrequency[digit]++;
            num /= 10;
        }
    }

    private static int findMostFrequentDigit(int[] digitFrequency) {
        int mostFrequentDigit = 0;
        int maxFrequency = 0;

        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] >= maxFrequency) {
                maxFrequency = digitFrequency[i];
                mostFrequentDigit = i;
            }
        }

        return mostFrequentDigit;
    }

    public static void main(String[] args) {
        int input1 = 123, input2 = 234, input3 = 345, input4 = 673;
        System.out.println(MostFrequentDigit(input1, input2, input3, input4)); // Output: 3

        int input5 = 123, input6 = 456, input7 = 345, input8 = 5043;
        System.out.println(MostFrequentDigit(input5, input6, input7, input8)); // Output: 5

        int input9 = 1203, input10 = 7624, input11 = 2046, input12 = 1052;
        System.out.println(MostFrequentDigit(input9, input10, input11, input12)); // Output: 2

        int input13 = 1203, input14 = 7624, input15 = 2046, input16 = 1002;
        System.out.println(MostFrequentDigit(input13, input14, input15, input16)); // Output: 2
    }
}
