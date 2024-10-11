public class PowerOfThree {
    public static void main(String[] args) {
        int num = 27;
        boolean result = isPowerOfThree(num);
        System.out.println(result);
    }

    public static boolean isPowerOfThree(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        return num == 1;
    }
}
