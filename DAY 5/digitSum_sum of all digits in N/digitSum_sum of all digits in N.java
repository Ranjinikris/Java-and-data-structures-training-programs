import java.io.*;
import  java.util.*;
public class DigitSum {
    public static int calculateDigitSum(int number) {
        // Convert the number to positive if it's negative
        if (number < 0) {
            number = Math.abs(number);
            number *= -1;
        }
        
        while (number > 9) {
            int sum = 0;
            
            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            
            number = sum;
        }
        
        return number;
    }
    
    public static void main(String[] args) {
        int inputNumber = 976592; // Replace with your desired number
        
        int result = calculateDigitSum(inputNumber);
        
        System.out.println("Single-digit digitSum: " + result);
    }
}

