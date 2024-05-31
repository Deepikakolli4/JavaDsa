import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of triangle: ");
        float side = input.nextFloat();
        if (side >= 0) {
            double area = (Math.sqrt(3)*side)/4;
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedArea = df.format(area);
            System.out.println("AREA: "+formattedArea);
        }
    }
}
