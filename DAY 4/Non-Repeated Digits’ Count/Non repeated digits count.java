import java.io.*;
import  java.util.*;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatedDigitCounter {
    public static void main(String[] args) {
        int number = 1015;
        int nonRepeatedDigitCount = countNonRepeatedDigits(number);
        System.out.println("Number of non-repeated digits: " + nonRepeatedDigitCount);
    }

    public static int countNonRepeatedDigits(int number) {
        Map<Integer, Integer> digitCount = new HashMap<>();
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            number /= 10;
        }

        for (int digit : digitCount.keySet()) {
            if (digitCount.get(digit) == 1) {
                count++;
            }
        }

        return count;
    }
}
