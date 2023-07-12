import java.io.*;
import  java.util.*
public class EvenNumberCounter {
    public static int countEvenNumbers(int num1, int num2, int num3, int num4, int num5) {
        int count = 0;

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

        return count;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 0;
        int num3 = -12;
        int num4 = 19;
        int num5 = 28;

        int result = countEvenNumbers(num1, num2, num3, num4, num5);
        System.out.println("Number of even numbers: " + result);
    }
}
