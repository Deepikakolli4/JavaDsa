import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the present value: ");
        float present = input.nextFloat();
        System.out.println("enter the rateOfInterest: ");
        float rateOfInterest = input.nextFloat();
        System.out.println("enter the noOfYears: ");
        float time = input.nextFloat();
        System.out.println("Future Price: "+ present*(Math.pow((1+rateOfInterest),time)));
    }
}
