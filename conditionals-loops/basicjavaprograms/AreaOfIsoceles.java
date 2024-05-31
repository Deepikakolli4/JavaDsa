import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfIsoceles {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of triangle: ");
    float length = input.nextFloat();
    System.out.println("Enter the breadth of triangle: ");
    float breadth = input.nextFloat();
    if (length >= 0 && breadth >= 0) {
        double area = (0.5 * length * breadth);
        DecimalFormat df = new DecimalFormat("#.###");
        String formattedArea = df.format(area);
        System.out.println("AREA: "+formattedArea);
    }
}
}
