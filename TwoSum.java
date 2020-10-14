import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = { 1, 3, 8, 2 };
        int[] input2 = { 3, 9, 13, 7 };
        int[] input3 = { 4, 2, 6, 5, 2 };

        System.out.println(isTwoSumShort(input, 10));
        System.out.println(isTwoSumShort(input2, 8));
        System.out.println(isTwoSumShort(input3, 4));
    }

    static boolean isTwoSum(int[] input, int sum) {
        List<Integer> requiredInts = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (input[i] < sum) {
                requiredInts.add(input[i]);
            }
        }

        for (int i = 0; i < requiredInts.size(); i++) {
            for (int j = 1; j < requiredInts.size(); j++) {
                if (requiredInts.get(i) + requiredInts.get(j) == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isTwoSumShort(int[] input, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            int difference = sum - input[i];
            if (set.contains(difference)) {
                return true;
            }
            set.add(input[i]);
        }
        return false;
    }
}
