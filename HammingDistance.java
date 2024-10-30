public class HammingDistance {
    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        int count = findHammingDistance(x, y);
        System.out.println(count);
    }

    public static int findHammingDistance(int x, int y) {
        int count = 0;
        int maxLength = Math.max(Integer.toBinaryString(x).length(), Integer.toBinaryString(y).length());
        String num1 = String.format("%" + maxLength + "s", Integer.toBinaryString(x)).replace(' ', '0');
        String num2 = String.format("%" + maxLength + "s", Integer.toBinaryString(y)).replace(' ', '0');

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) != num2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
