public class CorrectCapitalization {

    public static void main(String[] args) {
        System.out.println(checkCapitalization("USA")); // true
        System.out.println(checkCapitalization("Calvin")); // true
        System.out.println(checkCapitalization("compUter")); // false
        System.out.println(checkCapitalization("coding")); // true
    }

    public static boolean checkCapitalization(String input) {
        // char[] inputArray = input.toCharArray();

        // int upperCaseLetters = 0;
        // int loweCaseLetters = 0;

        // for (int i = 0; i < inputArray.length; i++) {

        // if (Character.isUpperCase(inputArray[i])) {
        // upperCaseLetters++;
        // }

        // if (Character.isLowerCase(inputArray[i])) {
        // loweCaseLetters++;
        // }

        // }
        // // if all are uppercase
        // if (upperCaseLetters == input.length()) {
        // return true;
        // }
        // // if all are lowercase
        // if (loweCaseLetters == input.length()) {
        // return true;
        // }
        // // if first letter is capitalized
        // if (upperCaseLetters == 1 && loweCaseLetters == input.length() - 1 &&
        // Character.isUpperCase(inputArray[0])) {
        // return true;
        // }

        // return false;

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                count++;
            }
        }

        return count == input.length() || count == 0 || count == 1 && Character.isUpperCase(input.charAt(0));
    }
}
