import java.io.*;
import  java.util.*;
public class PrimeNumberFinder {
    public static int findNthPrime(int N) {
        int count = 0;
        int number = 2;

        while (count < N) {
            if (isPrime(number)) {
                count++;
            }
            number++;
        }

        return number - 1;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int N = 10;
        int nthPrime = findNthPrime(N);

        System.out.println("The " + N + "th prime number is: " + nthPrime);
    }
}
