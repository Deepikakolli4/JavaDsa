package controlflow;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.println("Enter the number1:");
        int number1 = input.nextInt();
        System.out.println("Enter the number2:");
        int number2 = input.nextInt();
        int result = number1 + number2;
        System.out.println("Sum: " + result);
    }
}
