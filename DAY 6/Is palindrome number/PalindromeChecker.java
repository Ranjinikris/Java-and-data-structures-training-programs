public class PalindromeChecker {
    public static int isPalindromeNumber(int N) {
        // Convert the number to a string
        String numStr = Integer.toString(N);

        // Check if the string is equal to its reverse
        if (numStr.equals(new StringBuilder(numStr).reverse().toString())) {
            return 2; // Return 2 if the number is a palindrome
        } else {
            return 1; // Return 1 if the number is not a palindrome
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindromeNumber(252));    // Output: 2
        System.out.println(isPalindromeNumber(18981));  // Output: 2
        System.out.println(isPalindromeNumber(5005));   // Output: 2
        System.out.println(isPalindromeNumber(12345));  // Output: 1
        System.out.println(isPalindromeNumber(25000));  // Output: 1
    }
}
