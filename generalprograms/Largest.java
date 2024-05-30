package generalprograms;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        if (number1 > number2) {
            System.out.println("Largest is: " + " " + number1);
        } else if (number2 > number1) {
            System.out.println("Largest is: " + " " + number2);
        } else {
            System.out.println("Equal Numbers");
        }
    }
}
