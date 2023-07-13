import java.io.*;
import  java.util.*;
public class UniqueDigitCounter {
    public static void main(String[] args) {
        int number = 292;
        int uniqueDigitCount = countUniqueDigits(number);
        System.out.println("Number of unique digits: " + uniqueDigitCount);
    }

    public static int countUniqueDigits(int number) {
        boolean[] digitExists = new boolean[10];
        int count = 0;
        
        while (number > 0) {
            int digit = number % 10;
            if (!digitExists[digit]) {
                digitExists[digit] = true;
                count++;
            }
            number /= 10;
        }
        
        return count;
    }
}
