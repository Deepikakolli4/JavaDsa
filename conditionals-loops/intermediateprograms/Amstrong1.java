import java.util.Scanner;

public class Amstrong1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = input.nextInt();
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum = (int) (sum + Math.pow(digit, 3));
            temp = temp / 10;
        }
        if (number == sum) {
            System.out.println("it is an amstrong number");
        } else {
            System.out.println("it is not an amstrong number");
        }
    }
}
