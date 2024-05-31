import java.text.DecimalFormat;
import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one side of parallelogram: ");
        float side = input.nextFloat();
        System.out.println("Enter the  length of the adjacent side of parallelogram: ");
        float adjacentside = input.nextFloat();
        if (side >= 0 && adjacentside >= 0) {
            double perimeter = 2 * (side + adjacentside);
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedPerimeter = df.format(perimeter);
            System.out.println("AREA: " + perimeter);
        }
    }
}
