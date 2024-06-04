import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the sales amount: ");
        float sales = input.nextFloat();
        System.out.println("Enter the commission amount: ");
        float commissionAmount = input.nextFloat();
        if (sales == 0) {
            System.out.println("no commission as there is no sale");
        } else {
            float commissionPercentage = (commissionAmount / sales) * 100;
            System.out.println("Commission percentage:  " + commissionPercentage + "%");
        }
    }
}