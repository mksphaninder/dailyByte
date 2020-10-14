public class StringReversal {

    public static void main(String[] args) {
        System.out.println(reverseIt("string"));
        System.out.println(reverseIt("Cat"));
        System.out.println(reverseIt("Phaneendar Mullapudi"));
        System.out.println(reverseIt("civic"));
    }

    public static String reverseIt(String string) {
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result;
    }
}
