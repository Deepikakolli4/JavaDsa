public class TownJudge {
    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};
        int n = 3;
        int result = findJudge(trust,n);
        System.out.println(result);
    }
    public static int  findJudge(int[][] trust , int n){
        if (trust.length == 0 && n == 1) {
            return 1;
        }

        int[] trustCount = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            trustCount[trust[i][1]]++;
            trustCount[trust[i][0]]--;
        }

        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
