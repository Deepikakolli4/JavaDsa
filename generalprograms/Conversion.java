package generalprograms;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the money in indian currency: ");
        float number1 = input.nextFloat();
        System.out.println("US DOLLARS: " + (number1) / 70);
    }
}
