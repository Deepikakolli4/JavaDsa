import java.text.DecimalFormat;
import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = input.nextFloat();
        System.out.println("Enter the height: ");
        float height = input.nextFloat();
        if (radius >= 0) {
            double curvedSurfaceArea = 2 * Math.PI * radius * height;
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedCurvedSurfaceArea = df.format(curvedSurfaceArea);
            System.out.println("Curved Surface Area : " + formattedCurvedSurfaceArea);
        }
    }
}
