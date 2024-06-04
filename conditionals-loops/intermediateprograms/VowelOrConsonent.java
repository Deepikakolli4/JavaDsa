import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputString = input.nextLine();
        int vowelCount=0;
        int consonentCount=0;
        inputString=inputString.replace(" ","").toLowerCase();
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)=='a'||inputString.charAt(i)=='e'||
                    inputString.charAt(i)=='i'||inputString.charAt(i)=='o'||inputString.charAt(i)=='u') {
                System.out.println(inputString.charAt(i) + "-" + "is vowel");
                vowelCount++;
        }else{
                System.out.println(inputString.charAt(i) +"-"+"is consonent");
                consonentCount++;
            }
        }
    }
}
