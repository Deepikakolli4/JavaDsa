import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> list = addToArrayForm(num, k);
        for (int i : list) {
            System.out.print(i + "\t");
        }
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int carry = 0;
        int i = num.length - 1;
        while (i >= 0 || k > 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
                i--;
            }
            if (k > 0) {
                carry += k % 10;
                k /= 10;
            }
            list.add(0, carry % 10);
            carry /= 10;
        }
        return list;
    }
}
