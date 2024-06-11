import java.util.HashMap;
import java.util.Map;

public class Population {
    public static void main(String[] args) {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int count = maximumPopulation(logs);
        System.out.println(count);
    }

    public static int maximumPopulation(int[][] logs) {
        int sum = 0;
        int min = 0;
        for (int i = 0; i < logs.length; i++) {
            int c = 0;
            for (int j = 0; j < logs.length; j++) {
                if ((logs[j][0] <= logs[i][0] && logs[j][1] > logs[i][0])) {
                    c++;
                }
            }
            if (c > sum) {
                sum = c;
                min = logs[i][0];
            }
            if (c == sum) {
                min = Math.min(min, logs[i][0]);
            }
        }
        return min;
    }
}
