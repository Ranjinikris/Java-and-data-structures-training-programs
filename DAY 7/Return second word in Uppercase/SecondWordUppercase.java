public class SecondWordUppercase {

    public static String getSecondWordInUppercase(String inputStr) {
        String[] words = inputStr.trim().split("\\s+");
        if (words.length < 2) {
            return "LESS";
        }

        String secondWord = words[1].toUpperCase();
        return secondWord;
    }

    public static void main(String[] args) {
        String input1 = "Wipro Technologies Bangalore";
        System.out.println(getSecondWordInUppercase(input1)); // Output: "TECHNOLOGIES"

        String input2 = "Hello World";
        System.out.println(getSecondWordInUppercase(input2)); // Output: "WORLD"

        String input3 = "Championship 2017 League";
        System.out.println(getSecondWordInUppercase(input3)); // Output: "2017"

        String input4 = "Hello";
        System.out.println(getSecondWordInUppercase(input4)); // Output: "LESS"
    }
}
