public class NimWin {
    public static void main(String[] args) {
        int n = 4;
        boolean result = findWin(n);
        System.out.println(result);
    }
    public static boolean findWin(int n) {
        return n % 4 != 0;
    }
}
