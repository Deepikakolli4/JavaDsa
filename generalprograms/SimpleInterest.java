package generalprograms;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        float principal = input.nextFloat();
        System.out.println("Enter the rateOfInterest: ");
        float rateOfInterest = input.nextFloat();
        System.out.println("Enter the Time: ");
        float time = input.nextFloat();
        if (principal > 0 && time > 0 && rateOfInterest > 0) {
            System.out.println("Simple Interest is: " + " " + (principal * rateOfInterest * time) / 100);
        } else {
            System.out.println("enter proper inputs");
        }
    }
}
