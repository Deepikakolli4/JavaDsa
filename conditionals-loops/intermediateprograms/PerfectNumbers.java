import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello and welcome!" + "\n" + "Enter the number to check:");
        int number = input.nextInt();
        if (number % 2 != 0) {
            System.out.println("It is not a perfect number");
        } else {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (number == sum) {
                System.out.println("It is a perfect number");
            } else {
                System.out.println("It is not a perfect number");
            }
        }
    }
}
