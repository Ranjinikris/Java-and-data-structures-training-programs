public class StringWeightCalculator {

    public static int calculateStringWeight(String input, int includeVowels) {
        int weight = 0;
        String vowels = "AEIOUaeiou";

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                int charWeight = Character.toLowerCase(ch) - 'a' + 1;
                if (includeVowels == 1 || vowels.indexOf(ch) == -1) {
                    weight += charWeight;
                }
            }
        }

        return weight;
    }

    public static void main(String[] args) {
        String input1 = "Hello World";
        int option1 = 0;
        System.out.println(calculateStringWeight(input1, option1)); // Output: 89

        String input2 = "Hello World";
        int option2 = 1;
        System.out.println(calculateStringWeight(input2, option2)); // Output: 124

        String input3 = "All Zebras are Black & White!!";
        int option3 = 0;
        System.out.println(calculateStringWeight(input3, option3)); // Output: 186

        String input4 = "All Zebras are Black & White!!";
        int option4 = 1;
        System.out.println(calculateStringWeight(input4, option4)); // Output: 251
    }
}
