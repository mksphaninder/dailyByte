/**
 * This question is asked by Microsoft. Given an array of strings, return the
 * longest common prefix that is shared amongst all strings. Note: you may
 * assume all strings only contain lowercase alphabetical characters.
 * 
 * Ex: Given the following arrays...
 * 
 * ["colorado", "color", "cold"], return "col" ["a", "b", "c"], return ""
 * ["spot", "spotty", "spotted"], return "spot" To find the longest prefix that
 * is common amongst all words we must build our prefix one character at a time.
 * Our prefix will initially start as an empty string and we can then check if
 * the first character of the first word is also the first character of every
 * other word. If it is, we can add it to our prefix as it’s common amongst all
 * words, if it is not, we can return our prefix since one of the words not
 * containing that character is our limiting factor. Another limiting factor
 * could be reaching the length of one of the words as you’d have no more
 * character to potentially add to your prefix. Following this logic we produce
 * the solution below.
 * 
 */

public class LongestPrefix {
    public static void main(String[] args) {
        String[] sample = { "spot", "spotify", "spotless" };
        System.out.println(getLongestPrefix(sample));
    }

    public static String getLongestPrefix(String[] strs) {

        StringBuilder longestCommonPrefix = new StringBuilder();

        int index = 0;

        for (char c : strs[0].toCharArray()) {

            for (int i = 1; i < strs.length; i++) {
                // checking if the index is greater than the length of the ith string or
                // C of first string does not exist at index
                // return.
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return longestCommonPrefix.toString();
                }
            }
            // append to the longestCommonPrefix and increment the index
            longestCommonPrefix.append(c);
            index++;
        }
        return longestCommonPrefix.toString();
    }
}
