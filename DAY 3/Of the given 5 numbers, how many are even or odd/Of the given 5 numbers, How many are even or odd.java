import java.io.*;
import  java.util.*;
public class NumberCounter {
    public static int countNumbers(int num1, int num2, int num3, int num4, int num5, String type) {
        int count = 0;

        if (type.equals("even")) {
            if (isEven(num1)) {
                count++;
            }
            if (isEven(num2)) {
                count++;
            }
            if (isEven(num3)) {
                count++;
            }
            if (isEven(num4)) {
                count++;
            }
            if (isEven(num5)) {
                count++;
            }
        } else if (type.equals("odd")) {
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
        }

        return count;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
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
        String type = "odd";

        int result = countNumbers(num1, num2, num3, num4, num5, type);
        System.out.println("Number of " + type + " numbers: " + result);
    }
}
