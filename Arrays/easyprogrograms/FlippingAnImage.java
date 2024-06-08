public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};
        int answer[][] = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(answer[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] answer = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                answer[i][j] = image[i][image.length - 1 - j];
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++)
                if (answer[i][j] == 0) {
                    answer[i][j] = 1;
                } else if (answer[i][j] == 1) {
                    answer[i][j] = 0;
                }
        }
        return answer;
    }
}
