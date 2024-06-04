import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Starting number: ");
        int startNumber = input.nextInt();
        System.out.println("Enter the Ending number: ");
        int endNumber = input.nextInt();
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }
}
