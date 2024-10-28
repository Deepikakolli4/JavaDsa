import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String s  = "aec";
        String t = "abcde";
        boolean result = isSubSequence(s,t);
        System.out.println(result);
    }
    public static boolean isSubSequence(String s,String t){
        int[] indexes = new int[s.length()];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            index = t.indexOf(s.charAt(i), index);
            if (index == -1) {
                return false;
            }
            indexes[i] = index;
            index++;
        }

        int[] sortedIndexes = Arrays.copyOf(indexes, indexes.length);
        Arrays.sort(sortedIndexes);

        return Arrays.equals(indexes, sortedIndexes);
    }
}
