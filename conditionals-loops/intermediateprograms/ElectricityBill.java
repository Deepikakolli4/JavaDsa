import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the units: ");
        float units= input.nextFloat();
        System.out.println("Enter the fixed cost: ");
        float fixedCost=input.nextFloat();
        System.out.println("Enter the rate per kilowatt: ");
        float rate=input.nextFloat();
        System.out.println("Bill is : "+((units*rate)+fixedCost));
    }
}
