import java.text.DecimalFormat;
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        float length = input.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        float breadth = input.nextFloat();
        if (length >= 0 && breadth >= 0) {
            double area = 2 * (length + breadth);
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedPerimeter = df.format(area);
            System.out.println("perimeter: " + formattedPerimeter);
        }
    }
}

