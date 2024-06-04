import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the Principal: ");
        float principal = input.nextFloat();
        System.out.println("enter the rateOfInterest: ");
        float rateOfInterest = input.nextFloat();
        System.out.println("enter the noOfTimes Interest is compounded in year: ");
        float noOfTimesInterest = input.nextFloat();
        System.out.println("enter the time in years: ");
        float time = input.nextFloat();
        float interest = (float) (principal * Math.pow(1 + (rateOfInterest / noOfTimesInterest), (noOfTimesInterest * time)));
        System.out.println("Compound Interest is: " + interest);
    }
}
