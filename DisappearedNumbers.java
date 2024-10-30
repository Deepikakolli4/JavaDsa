import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int n = nums[nums.length - 1];
        for (int i = 1; i < n; i++) {
            if (!unique.contains(i)) {
                result.add(i);
            }
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
