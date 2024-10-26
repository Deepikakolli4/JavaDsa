public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String input = "IceCreAm";
        String result = reverseVowels(input);
        System.out.println("Output: " + result);
    }

    public static String reverseVowels(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }

        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                vowels.append(ch);
            }
        }

        char[] chars = input.toCharArray();
        int vowelIndex = vowels.length() - 1;
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = vowels.charAt(vowelIndex--);
            }
        }

        return new String(chars);
    }

    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
