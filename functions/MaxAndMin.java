import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        System.out.println("Enter the number3: ");
        int number3 = input.nextInt();
        int max = findMax(number1, number2, number3);
        System.out.println("Maximum is: " + max);
        int min = findMin(number1, number2, number3);
        System.out.println("Minimum is: " + min);
    }

    public static int findMax(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }

    public static int findMin(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
