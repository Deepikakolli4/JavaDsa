
public class FindTheDifference {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        char ch = findingDifference(s,t);
        System.out.println(ch);
    }
    public static char findingDifference(String s,String t){
        char result = 0;
        for(char ch:s.toCharArray()){
            result ^= ch;
        }
        for(char ch:t.toCharArray()){
            result ^= ch;
        }

        return result;
    }
}
