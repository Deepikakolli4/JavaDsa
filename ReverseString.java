public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]);
        }
    }
}
