import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        boolean isPalindrome = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String string = input.nextLine();
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                isPalindrome = true;
            }
        }
        if (isPalindrome) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
    }
}
