public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int[] result = countTheBits(n);
        for (int i : result) {
            System.out.print(i + "\t");
        }
    }

    public static int[] countTheBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int count = Integer.bitCount(i);
            result[i] = count;
        }
        return result;
    }
}
