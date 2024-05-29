package controlflow;
import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.println("Enter the number1:");
        int number1 = input.nextInt();
        System.out.println("Enter the number2:");
        int number2 = input.nextInt();
        int originalnumber1 = number1;
        int originalnumber2 = number2;
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        int gcd = number1;
        int lcm = (originalnumber1 * originalnumber2) / gcd;
        System.out.println("HCF: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
