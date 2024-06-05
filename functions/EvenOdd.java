import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        boolean flag = checkEvenOdd(number);
        System.out.println(flag);
    }

    public static boolean checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
