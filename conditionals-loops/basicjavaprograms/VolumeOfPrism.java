import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of prism (Rectangular Prism / Triangular Prism / Hexagonal Prism): ");
        String base = input.nextLine();

        if (base.equalsIgnoreCase("Rectangular Prism")) {
            System.out.println("Enter the length of rectangle: ");
            float length = input.nextFloat();
            System.out.println("Enter the breadth of rectangle: ");
            float breadth = input.nextFloat();
            System.out.println("Enter the height of prism: ");
            float height = input.nextFloat();

            if (length >= 0 && breadth >= 0 && height >= 0) {
                double area = length * breadth;
                double volume = area * height;
                DecimalFormat df = new DecimalFormat("#.###");
                String formattedVolume = df.format(volume);
                System.out.println("Volume of Rectangular Prism: " + formattedVolume);
            } else {
                System.out.println("Invalid input. Length, breadth, and height must be non-negative.");
            }

        } else if (base.equalsIgnoreCase("Triangular Prism")) {
            System.out.println("Enter the base length of triangle: ");
            float baseLength = input.nextFloat();
            System.out.println("Enter the height of triangle: ");
            float triangleHeight = input.nextFloat();
            System.out.println("Enter the height of prism: ");
            float height = input.nextFloat();

            if (baseLength >= 0 && triangleHeight >= 0 && height >= 0) {
                double area = 0.5 * baseLength * triangleHeight;
                double volume = area * height;
                DecimalFormat df = new DecimalFormat("#.###");
                String formattedVolume = df.format(volume);
                System.out.println("Volume of Triangular Prism: " + formattedVolume);
            } else {
                System.out.println("Invalid input. Base length, triangle height, and prism height must be non-negative.");
            }

        } else if (base.equalsIgnoreCase("Hexagonal Prism")) {
            System.out.println("Enter the side length of hexagon: ");
            float side = input.nextFloat();
            System.out.println("Enter the height of prism: ");
            float height = input.nextFloat();

            if (side >= 0 && height >= 0) {
                double area = (3 * Math.sqrt(3) / 2) * side * side;
                double volume = area * height;
                DecimalFormat df = new DecimalFormat("#.###");
                String formattedVolume = df.format(volume);
                System.out.println("Volume of Hexagonal Prism: " + formattedVolume);
            } else {
                System.out.println("Invalid input. Side length and height must be non-negative.");
            }

        } else {
            System.out.println("Invalid type of prism entered.");
        }
    }
}
