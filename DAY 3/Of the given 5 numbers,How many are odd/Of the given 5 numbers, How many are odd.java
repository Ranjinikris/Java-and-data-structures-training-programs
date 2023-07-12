import java.io.*;
import  java.util.*;
public class OddNumberCounter {
    public static int countOddNumbers(int num1, int num2, int num3, int num4, int num5) {
        int count = 0;

        if (isOdd(num1)) {
            count++;
        }
        if (isOdd(num2)) {
            count++;
        }
        if (isOdd(num3)) {
            count++;
        }
        if (isOdd(num4)) {
            count++;
        }
        if (isOdd(num5)) {
            count++;
        }

        return count;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 17;
        int num3 = 19;
        int num4 = 14;
        int num5 = 115;

        int result = countOddNumbers(num1, num2, num3, num4, num5);
        System.out.println("Number of odd numbers: " + result);
    }
}
