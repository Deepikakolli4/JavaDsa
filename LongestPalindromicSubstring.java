public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        findLongestPalindromeSubString(s);
    }
    public static void findLongestPalindromeSubString(String s){
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for(int i =0;i<s.length();i++){
            sb.append(s.charAt(i));

        }
    }
}
