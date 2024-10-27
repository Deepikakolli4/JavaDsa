import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        boolean result = checkPossibility(ransomNote, magazine);
        System.out.println(result);
    }

    public static boolean checkPossibility(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<>();
        HashMap<Character, Integer> ran = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            mag.put(magazine.charAt(i), mag.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            ran.put(ransomNote.charAt(i), ran.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (char ch : ran.keySet()) {
            if (ran.get(ch) > mag.getOrDefault(ch, 0)) {
                return false;
            }
        }

        return true;
    }
}
