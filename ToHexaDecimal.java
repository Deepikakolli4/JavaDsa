public class ToHexaDecimal {
    public static void main(String[] args) {
        int num = 26;
        System.out.println(Integer.toHexString(num & 0xFFFFFFFF));
    }
}
