/**
 * This question is asked by Facebook. Given a string and the ability to delete
 * at most one character, return whether or not it can form a palindrome. Note:
 * a palindrome is a sequence of characters that reads the same forwards and
 * backwards.
 * 
 * Ex: Given the following strings...
 * 
 * "abcba", return true "foobof", return true (remove the first 'o', the second
 * 'o', or 'b') "abccab", return false
 */

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isValidPalindromWithRemoval("abcba"));
        System.out.println(isValidPalindromWithRemoval("foobof"));
        System.out.println(isValidPalindromWithRemoval("abccab"));
    }

    public static boolean isValidPalindromWithRemoval(String input) {

        for (int i = 0; i < input.length(); i++) {

            StringBuilder validator = new StringBuilder(input);
            validator.deleteCharAt(i);

            if (isPalindrome(validator.toString())) {
                return true;
            }
        }
        return false;
    }

    static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
