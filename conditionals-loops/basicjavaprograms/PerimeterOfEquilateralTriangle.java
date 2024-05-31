import java.text.DecimalFormat;
import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of triangle: ");
        float side = input.nextFloat();
        if (side >= 0) {
            double area = 3*side;
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedPerimeter = df.format(area);
            System.out.println("Perimeter: "+formattedPerimeter);
        }
    }
}
