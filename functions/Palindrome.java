import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String string = input.nextLine();
        boolean flag = checkPalindrome(string);
        System.out.println(flag);
    }

    public static boolean checkPalindrome(String string) {
        String[] numbers = string.split("");
        for (int i = 0; i < numbers.length / 2; i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }
}
