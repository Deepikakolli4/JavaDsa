import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,0,0,0};
        int[] ar2 = {2,5,6};
        int m=3;
        int n=3;
        merge(ar1,ar2,m,n);
    }
    public static void merge(int[] ar1,int[] ar2,int m,int n){
        int[] mergeArray = new int[m+n];
        System.arraycopy(ar1, 0, mergeArray, 0, m);
        System.arraycopy(ar2, 0, mergeArray, m,n);
        Arrays.sort(mergeArray);
        for(int i:mergeArray){
            System.out.print(i+"\t");
        }
    }
}
