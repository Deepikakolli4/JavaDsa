public class ShufflingArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] answer = shuffle(nums, n);
        for (int i : answer) {
            System.out.println(answer[i]);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[nums.length];
        for (int i = 0; i < nums.length / 2; i++) {
            shuffle[2 * i] = nums[i];
            shuffle[2 * i + 1] = nums[i + n];
        }
        return shuffle;
    }
}
