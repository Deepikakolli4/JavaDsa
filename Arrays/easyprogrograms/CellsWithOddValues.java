public class CellsWithOddValues {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{1, 1}, {1, 1}};
        int temp = oddCells(m, n, indices);
        System.out.println("The number of odd cells in array: " + temp);
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int row = 0, col = 0;
        int[][] intial = new int[m][n];
        for (int[] index : indices) {
            row = index[0];
            col = index[1];
            for (int i = 0; i < n; i++) {
                intial[row][i]++;
            }
            for (int j = 0; j < m; j++) {
                intial[j][col]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (intial[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}