import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        float number1 = input.nextFloat();
        System.out.println("Enter the number2 : ");
        float number2 = input.nextFloat();
        System.out.println("Enter the number3 : ");
        float number3 = input.nextFloat();
        checkAndPrintPythagoras(number1, number2, number3);
    }

    public static void checkAndPrintPythagoras(float number1, float number2, float number3) {
        float sumOfTwoNumbers = (float) (Math.pow(number1, 2) + Math.pow(number2, 2));
        float squareOfnumber = (float) (Math.pow(number3, 2));
        if (sumOfTwoNumbers == squareOfnumber) {
            System.out.println("Pythagoras is valid");
        } else {
            System.out.println("Pythagoras is not  valid");
        }
    }
}
