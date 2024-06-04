import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the original price: ");
        float price = input.nextFloat();
        System.out.println("Enter the discount: ");
        float discount = input.nextFloat();
        float discountPrice = (price) * (discount / 100);
        System.out.println("Discount Price: " + discountPrice);
        float finalPrice = price - discountPrice;
        System.out.println("Final Price: " + finalPrice);
    }
}
