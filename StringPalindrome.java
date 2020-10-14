public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("algorithm"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
    }

    public static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(string.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(string.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(string.charAt(i++)) != Character.toLowerCase(string.charAt(j--))) {
                return false;
            }
        }

        return true;
    }
}
