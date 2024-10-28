import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ThirdHighestElement {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        HashSet<Integer> unique = new HashSet<>();
        int result = 0;
        for(int num : nums){
            if(!unique.contains(num)){
                unique.add(num);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(unique);
        Collections.sort(list, Collections.reverseOrder());
        if(list.size()>=3) {
            result = list.get(2);
        }else{
            result=list.get(0);
        }
        System.out.println(result);
    }
}
