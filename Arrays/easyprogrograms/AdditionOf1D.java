import java.util.Enumeration;
import java.util.Scanner;

public class AdditionOf1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int[] sum=runningSum(nums);
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]+"\t");
        }
    }
    public static int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        System.out.print(nums[0]);
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
            System.out.println(sum);
        }
        return sum;
    }
}
