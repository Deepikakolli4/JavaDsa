import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputString = input.nextLine();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }
    }
}
