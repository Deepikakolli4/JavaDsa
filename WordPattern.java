import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abab";
        String s = "dog cat dog cat";
        boolean result = wordPattern(s, pattern);
        System.out.println(result);
    }

    public static boolean wordPattern(String s, String pattern) {
        HashMap<String, Character> wordsToPattern = new HashMap<>();
        HashMap<Character, String> patternToWords = new HashMap<>();
        String[] wordsArray = s.split("\\s+");

        if (pattern.length() != wordsArray.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            String currentString = wordsArray[i];
            Character currentCharacter = pattern.charAt(i);
            if (wordsToPattern.containsKey(currentString)) {
                if (wordsToPattern.get(currentString) != currentCharacter) {
                    return false;
                }
            } else {
                wordsToPattern.put(currentString, currentCharacter);
            }
            if (patternToWords.containsKey(currentCharacter)) {
                if (!patternToWords.get(currentCharacter).equals(currentString)) {
                    return false;
                }
            } else {
                patternToWords.put(currentCharacter, currentString);
            }
        }

        return true;
    }
}
