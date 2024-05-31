import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        float length = input.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        float breadth = input.nextFloat();
        if (length >= 0 && breadth >= 0) {
            double area = (length * breadth);
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedArea = df.format(area);
            System.out.println("AREA: " + formattedArea);
        }
    }
}


