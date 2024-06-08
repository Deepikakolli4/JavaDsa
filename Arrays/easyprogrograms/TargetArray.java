import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
      int[] nums = {0,1,2,3,4};
      int[] index = {0,1,2,2,1};
      int[] target=createTargetArray( nums,index );
      for(int i=0;i<target.length;i++){
          System.out.println(target[i]);
      }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        Arrays.fill(target, -1);
        for (int i = 0; i < nums.length; i++) {
            int targetIndex = index[i];
            if (target[targetIndex] == -1) {
                target[targetIndex] = nums[i];
            } else {
                for (int j =nums.length-1; j > targetIndex; j--) {
                    target[j] = target[j - 1];
                }
                target[targetIndex] = nums[i];
            }
            }
            return target;
        }
    }
