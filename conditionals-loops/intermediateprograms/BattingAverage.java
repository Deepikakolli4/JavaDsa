import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the runs scored: ");
        float runs = input.nextFloat();
        System.out.println("enter the no:of times out: ");
        float noOfOut = input.nextFloat();
        if (noOfOut == 0) {
            System.out.println("not possible to calculate average");
        } else {
            System.out.println("Batting Average: " + (runs / noOfOut));
        }
    }
}
