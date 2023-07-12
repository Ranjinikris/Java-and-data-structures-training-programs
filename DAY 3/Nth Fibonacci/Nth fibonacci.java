import java.io.*;
import  java.util.*;
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 0;
        int prev1 = 0;
        int prev2 = 1;

        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev1 = prev2;
            prev2 = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        int n = 8;
        int result = fibonacci(n);

        System.out.println("The " + n + "th number in the Fibonacci series is: " + result);
    }
}
