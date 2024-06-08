import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String sentence=input.nextLine();
        checkIfPangram(sentence.toLowerCase());
    }
    public static boolean checkIfPangram(String sentence) {
        int count=0;
        int[] seen = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if(c>='a'&&c<='z'){
                int index=c-'a';
                if(seen[index]==0) {
                    seen[index] = 1;
                    count++;
                }
            }
        }
        if(count==26){
            return true;
        }else{
            return false;
        }
}
}
