import java.io.*;
import  java.util.*;
public class MultipleChecker {
    public static int checkMultiple(int first, int second) {
        if (first == 0 || second == 0) {
            return 3;
        } else if (first % second == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int first = 12;
        int second = 4;
        int result = checkMultiple(first, second);
        System.out.println("Result: " + result);
    }
}
