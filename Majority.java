import java.util.HashMap;

public class Majority {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 5, 1};
        int result = findMajority(nums);
        System.out.println(result);
    }

    public static int findMajority(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> count = new HashMap<>();
        int result = 0;
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        for (HashMap.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
