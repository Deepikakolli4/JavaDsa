import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        float number = input.nextFloat();
        System.out.println("enter the power: ");
        float power = input.nextFloat();
        float result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
            System.out.println(result);
        }
        System.out.println("result: " + result);
    }
}
