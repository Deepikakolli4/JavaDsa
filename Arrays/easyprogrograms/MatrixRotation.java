import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int mat[][] = {{0, 1}, {1, 0}};
        int target[][] = {{1, 0}, {0, 1}};
        boolean isRotation = findRotation(mat, target);
        System.out.println(isRotation);
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        if (mat == target)
            return true;

        int m = mat.length;
        int[][] res90 = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                res90[i][j] = mat[m - j - 1][i];
            }
        }

        int[][] res180 = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                res180[i][j] = res90[m - j - 1][i];
            }
        }

        int[][] res270 = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                res270[i][j] = res180[m - j - 1][i];
            }
        }
        if (Arrays.deepEquals(target, res90) || Arrays.deepEquals(target, res180) || Arrays.deepEquals(target, res270) || Arrays.deepEquals(target, mat)) {
            return true;
        }
        return false;
    }
}
