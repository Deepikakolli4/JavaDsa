import java.text.DecimalFormat;
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        float radius = input.nextFloat();
        if (radius >= 0) {
            double perimeter = 2 * Math.PI * radius;
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedPerimeter = df.format(perimeter);
            System.out.println("Perimeter of circle : " + formattedPerimeter);
        }
    }
}
