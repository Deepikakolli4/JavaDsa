import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        int result = product(number1, number2);
        System.out.println("Product: " + result);
    }

    public static int product(int number1, int number2) {
        return number1 * number2;
    }
}
