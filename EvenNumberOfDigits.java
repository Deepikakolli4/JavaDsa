public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int count = findNumbers(nums);
        System.out.println("The count of the even digited numbers: " + count);

    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            while (nums[i] != 0) {
                int temp = nums[i] % 10;
                digit++;
                nums[i] = nums[i] / 10;
            }
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
