import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3};
        removeDuplicates(nums);
    }

    public static void removeDuplicates(int[] nums) {
        int k = 0;
        HashSet<Integer> uniqueValues = new HashSet<>();
        for (int num : nums) {
            uniqueValues.add(num);
        }
        System.out.println("k" + "=" + uniqueValues.size());
        for (int num : uniqueValues) {
            System.out.print(num + "\t");
        }
        if (uniqueValues.size() < nums.length) {
            for (int i = 0; i < nums.length - uniqueValues.size(); i++) {
                System.out.print("_\t");
            }
        }
    }
}
