import java.util.ArrayList;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] answers = buildArray(nums);
        for (int i = 0; i < answers.length; i++) {
            System.out.print(answers[i] + "\t");
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }
}
