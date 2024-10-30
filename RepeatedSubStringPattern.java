import java.util.HashMap;

public class RepeatedSubStringPattern {
    public static void main(String[] args) {
        String s = "aba";
        boolean result = repeatedSubstringPattern(s);
        System.out.println(result);
    }

    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() == 0) {
            return false;
        }
        String doubled = s + s;
        String modified = doubled.substring(1, doubled.length() - 1);
        return modified.contains(s);
    }
}
