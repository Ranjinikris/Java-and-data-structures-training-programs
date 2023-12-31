import java.io.*;
import  java.util.*;
public class FactorialCalculator {
    public static int calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
