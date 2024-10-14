public class PowerOf4 {
    public static void main(String[] args) {
        int n=20;
        boolean result = isPowerOf4(n);
        System.out.println(result);
    }

    public static boolean isPowerOf4(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}
