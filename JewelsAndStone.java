import java.util.HashSet;
import java.util.Set;

public class JewelsAndStone {
    public static void main(String[] args) {
        System.out.println(getStonesFromJewels("abc", "ac"));
        System.out.println(getStonesFromJewels("Af", "AaaddfFf"));
        System.out.println(getStonesFromJewels("AYOPD", "ayopd"));
    }

    static int getStonesFromJewels(String jewel, String stones) {
        Set<Character> input = new HashSet<>();
        int count = 0;
        char[] jewelArray = jewel.toCharArray();

        for (int i = 0; i < jewel.length(); i++) {
            input.add(jewelArray[i]);
        }

        for (int i = 0; i < stones.length(); i++) {
            if (input.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
