import java.util.Arrays;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] ar1 = {1, 2};
        int[] ar2 = {3, 4};
        double median = findMedian(ar1, ar2);
        System.out.println(median);
    }

    public static double findMedian(int[] nums1, int[] nums2) {
        double median = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        Arrays.sort(mergedArray);
        if (mergedArray.length % 2 == 0) {
            int mid1 = mergedArray[(mergedArray.length / 2) - 1];
            int mid2 = mergedArray[mergedArray.length/ 2];
            median = (mid1 + mid2) / 2.0;
        } else {
            median = mergedArray[mergedArray.length / 2];
        }
        return median;
    }
}
