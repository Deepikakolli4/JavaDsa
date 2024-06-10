public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = diagonalSum(mat);
        System.out.println("Sum of Diagonals is: " + sum);
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;
    }
}
