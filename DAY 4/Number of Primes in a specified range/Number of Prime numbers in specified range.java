import java.io.*; 
import java.util.*;
public class PrimeNumberCounter {
    public static void main(String[] args) {
        int startingNumber = 2;
        int endingNumber = 20;
        int count = countPrimesInRange(startingNumber, endingNumber);
        System.out.println("Number of prime numbers: " + count);
    }

    public static int countPrimesInRange(int startingNumber, int endingNumber) {
        int count = 0;
        for (int num = startingNumber; num <= endingNumber; num++) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
