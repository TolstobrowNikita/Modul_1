import java.util.regex.Pattern;

public class z1_6_9 {

    public static void main(String[] args) {
        String input1 = "Was it a cat I saw?";
        String input2 = " A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as\n" +
                "forward, such as madam or racecar or the number 10801.";

        System.out.println(isPalindrome(input1));
        System.out.println(isPalindrome(input2));
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        word = word = word.replaceAll("(?<!)?[^a-z-Zа-яА-Я]+", "");
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}