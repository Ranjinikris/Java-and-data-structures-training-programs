public class PalindromeChecker {

    public static int isPalindrome(String input) {
        // Remove non-alphabetic characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Compare the cleaned string with its reverse
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        // Check if the original string is equal to its reverse
        if (cleanedInput.equals(reversedInput)) {
            return 2; // It is a palindrome
        } else {
            return 1; // It is not a palindrome
        }
    }

    public static void main(String[] args) {
        String input1 = "abba";
        System.out.println(isPalindrome(input1)); // Output: 2

        String input2 = "Madam";
        System.out.println(isPalindrome(input2)); // Output: 2

        String input3 = "hello";
        System.out.println(isPalindrome(input3)); // Output: 1

        String input4 = "madam1";
        System.out.println(isPalindrome(input4)); // Output: 2 (Ignoring the non-alphabetic character '1')
    }
}
