import java.util.Scanner;

public class SumOfNaturaNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int result = sumofNNumbers(number);
        System.out.println("sum: " + result);
    }

    public static int sumofNNumbers(int number) {
        return number * ((number + 1) / 2);
    }
}
