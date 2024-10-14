import java.util.HashMap;

public class MaximumBalloons {
    public static void main(String[] args) {
        String text = "nlaebolko";
        findMaximumBalloons(text);
        int result = maxNumberOfBalloons(text);
        System.out.println(result);
    }

    public static void findMaximumBalloons(String text) {
        HashMap<Character, Integer> targetCount = new HashMap<>();
        HashMap<Character, Integer> textCount = new HashMap<>();
        targetCount.put('b', 1);
        targetCount.put('a', 1);
        targetCount.put('l', 2);
        targetCount.put('o', 2);
        targetCount.put('n', 1);
        for (char ch : text.toCharArray()) {
            textCount.put(ch, textCount.getOrDefault(ch, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char ch : targetCount.keySet()) {
            int countInText = textCount.getOrDefault(ch, 0);
            int requiredCount = targetCount.get(ch);
            max = Math.max(max, countInText / requiredCount);
        }
        System.out.println(max);
    }

    public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char ch : text.toCharArray()) {
            switch (ch) {
                case 'b':
                    ++b;
                    break;
                case 'a':
                    ++a;
                    break;
                case 'l':
                    ++l;
                    break;
                case 'o':
                    ++o;
                    break;
                case 'n':
                    ++n;
                    break;
            }
        }
        return Math.min(Math.min(o / 2, l / 2), Math.min(Math.min(b, a), n));
    }
}
