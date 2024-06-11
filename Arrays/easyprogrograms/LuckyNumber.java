import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        List<Integer> luckyNumbers = luckyNumbers(matrix);
        System.out.println("Lucky Numbers in the matrix: " + luckyNumbers);
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();

        int m = matrix.length; // Number of rows
        int n = matrix[0].length; // Number of columns

        // Iterate through each element of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];
                // Check if the current element is the minimum in its row
                boolean isMinInRow = true;
                for (int k = 0; k < n; k++) {
                    if (matrix[i][k] < num) {
                        isMinInRow = false;
                        break;
                    }
                }
                // Check if the current element is the maximum in its column
                boolean isMaxInColumn = true;
                for (int k = 0; k < m; k++) {
                    if (matrix[k][j] > num) {
                        isMaxInColumn = false;
                        break;
                    }
                }
                // If the current element is both the minimum in its row and maximum in its column, it's a lucky number
                if (isMinInRow && isMaxInColumn) {
                    luckyNumbers.add(num);
                }
            }
        }

        return luckyNumbers;
    }
}
