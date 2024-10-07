import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String input = "bbbb";
        int result = findLongestSubStringWithoutRepeatingChar(input);
        System.out.println(result);
    }

    public static int findLongestSubStringWithoutRepeatingChar(String input) {
        HashSet<Character> characters = new HashSet<>();
        if(input.isEmpty()){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            while (characters.contains(input.charAt(i))) {
                characters.remove(input.charAt(j));
                j++;
            }
            characters.add(input.charAt(i));
            max = Math.max(max, characters.size());
        }
        return max;
    }
}