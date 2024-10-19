
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        boolean result = IsIsomorphic(s, t);
        System.out.println("Isomorphic: " + result);
    }

    public static boolean IsIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mappingST = new HashMap<>();
        HashMap<Character, Character> mappingTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!mappingST.containsKey(s.charAt(i))) {
                mappingST.put(s.charAt(i), t.charAt(i));
            } else if (mappingST.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }

            if (!mappingTS.containsKey(t.charAt(i))) {
                mappingTS.put(t.charAt(i), s.charAt(i));
            } else if (mappingTS.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
        }

        for (Map.Entry<Character, Character> entry : mappingST.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        return true;
    }
}
