import java.util.HashMap;
import java.util.Map;

public class PalindromePossibilityChecker {
    public static int isPalindromePossible(int N) {
        // Convert the number to a string
        String numStr = Integer.toString(N);

        // Count the frequency of each digit using a HashMap
        Map<Character, Integer> digitFrequency = new HashMap<>();
        for (char digit : numStr.toCharArray()) {
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
        }

        // Count the number of odd-frequency digits
        int oddFrequencyCount = 0;
        for (int frequency : digitFrequency.values()) {
            if (frequency % 2 != 0) {
                oddFrequencyCount++;
            }
        }

        // Check if it is possible to form a palindrome
        if (oddFrequencyCount <= 1) {
            return 2; // Return 2 if it is possible to form a palindrome
        } else {
            return 1; // Return 1 if it is not possible to form a palindrome
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindromePossible(21251)); // Output: 2
        System.out.println(isPalindromePossible(2125));  // Output: 1
    }
}
