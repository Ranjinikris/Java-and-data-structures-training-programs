import java.io.*;
import  java.util.*
public class EvenDigitsSum {
    public static int calculateEvenDigitsSum(int number) {
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            
            if (digit % 2 == 0) {
                sum += digit;
            }
            
            number /= 10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int inputNumber = 9625; // Replace with your desired number
        
        int result = calculateEvenDigitsSum(inputNumber);
        
        System.out.println("EvenDigitsSum: " + result);
    }
}
