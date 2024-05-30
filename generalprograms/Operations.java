package generalprograms;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        input.nextLine();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        input.nextLine();
        System.out.println("Enter the operation(+,-,/,%,*):  ");
        String operator = input.nextLine();
        if (operator.equals("+")) {
            System.out.println("The Sum is: " + " " + (number1 + number2));
        } else if (operator.equals("-")) {
            System.out.println("The Difference is: " + " " + (number1 - number2));
        } else if (operator.equals("*")) {
            System.out.println("The Product is: " + " " + (number1 * number2));
        } else if (operator.equals("/")) {
            if (number2 != 0) {
                System.out.println("The divisor  is: " + " " + (number1 / number2));
            } else {
                System.out.println("Not Possible");
            }
        } else if (operator.equals("%")) {
            if (number2 != 0) {
                System.out.println("The remainder  is: " + " " + (number1 % number2));
            } else {
                System.out.println("Not Possible");
            }
        } else {
            System.out.println("Enter the valid operator");
        }
    }
}
