import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "leetcode";
        Character ch = firstUniqueCharacter(input);
        System.out.println(ch);
    }

    public static Character firstUniqueCharacter(String s) {
        HashMap<Character, Integer> unique = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            unique.put(s.charAt(i), unique.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (unique.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return null;
    }
}
