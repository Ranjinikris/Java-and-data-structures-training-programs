import java.io.*;
import  java.util.*;
public class DigitSum {
    public static int calculateDigitSum(int number, String option) {
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            
            if ((option.equals("even") && digit % 2 == 0) || (option.equals("odd") && digit % 2 != 0)) {
                sum += digit;
            }
            
            number /= 10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int inputNumber = 9625; // Replace with your desired number
        String option = "odd"; // Replace with "even" or "odd"
        
        int result = calculateDigitSum(inputNumber, option);
        
        System.out.println("DigitSum: " + result);
    }
}
