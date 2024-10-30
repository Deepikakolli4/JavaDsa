public class ArrangeCoins {
    public static void main(String[] args) {
        int coins = 5;
        int rows = (int) (-1 + Math.sqrt(8L * coins) / 2);
        System.out.println(rows);
    }
}
