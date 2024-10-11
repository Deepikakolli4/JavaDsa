
public class MissingValue {
    public static void main(String[] args) {
        int[] nums = {0, 3, 4, 2};
        int missingNum = findMissingNumber(nums);
        System.out.println("missing value is : " + missingNum);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum = actualSum + num;
        }
        return expectedSum - actualSum;
    }
}
