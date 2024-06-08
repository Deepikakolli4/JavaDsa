public class ArrayConcate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] b = new int[nums.length + nums.length];
        b=getConcatenation(nums);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+"\t");
        }

    }
    public static int[] getConcatenation(int[] nums) {
        int j = 0;
        int[] b = new int[nums.length + nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[i]=nums[i];
            b[i+nums.length]=nums[i];
        }
        return b;
    }
}
