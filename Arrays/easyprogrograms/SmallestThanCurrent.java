public class SmallestThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int answers[] = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < answers.length; i++) {
            System.out.print(answers[i] + "\t");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            answers[i] = count;
        }
        return answers;
    }
}
