import java.io.*;
import  java.util.*;
public class PrimeChecker {
    public static int checkPrime(int N) {
        if (N < 2) {
            return 1;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 1;
            }
        }

        return 2;
    }

    public static void main(String[] args) {
        int N = 7;
        int result = checkPrime(N);

        if (result == 2) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }
    }
}
