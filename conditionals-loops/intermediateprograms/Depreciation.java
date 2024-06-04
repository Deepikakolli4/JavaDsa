import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the actual value: ");
        float actualValue = input.nextFloat();
        System.out.println("enter the rateOfDepreciation: ");
        float rateOfDepriciation = input.nextFloat();
        System.out.println("enter the time in years: ");
        float time = input.nextFloat();
        float depriciationValue = (float) (actualValue * Math.pow((1 - (rateOfDepriciation / 100)), time));
        System.out.println("Depreciation Value: " + depriciationValue);
    }
}
