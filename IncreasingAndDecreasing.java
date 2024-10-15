
public class IncreasingAndDecreasing {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        String result = reorderString(s);
        System.out.println("Output: " + result);
    }

    public static String reorderString(String s) {
        int[] count = new int[26];
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        while (sb.length() < s.length()) {
            for (int i = 0; i < count.length; i++) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                }
            }

            for (int i = count.length - 1; i >= 0; i--) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                }
            }
        }

        return sb.toString();
    }
}
