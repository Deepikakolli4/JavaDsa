import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Factors are : ");
        for (int i : factors) {
            System.out.print(i + "\t");
        }
    }
}
