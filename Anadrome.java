import java.util.HashMap;
import java.util.Map;

public class Anadrome {
    // first check if the given string forms a palindrome.
    public static void main(String[] args) {

    }

    static boolean createPalindrome(String input) {
        // if odd number of characters then every character must be repeated twice
        // except 1
        // if even every character must be repeated twice.
        int lengthOfTheString = input.length();
        boolean isEven = lengthOfTheString % 2 == 0 ? true : false;
        Map<Character, Integer> inputMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (inputMap.containsKey(c)) {

                inputMap.putIfAbsent(c, inputMap.get(c) + 1);

            } else {
                inputMap.put(c, 1);
            }
        }
        int count = 0;

        inputMap.forEach((k, v) -> {
            if (v < 2) {
                count++;
            }
        });

    }

    static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

// abcba anagram
// afrcnv
