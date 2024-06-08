import java.util.ArrayList;
import java.util.List;

public class KidsCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> answer = kidsWithCandies(candies, extraCandies);
        for (boolean i : answer) {
            System.out.print(i + "\t");
        }

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> answer = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int sum = 0;
            sum = sum + candies[i] + extraCandies;
            if (sum >= Math.max(sum, max)) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }
        return answer;
    }
}
