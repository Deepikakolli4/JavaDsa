import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        float radius = input.nextFloat();
        if (radius >= 0 ){
            double area = Math.PI * radius*radius;
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedArea = df.format(area);
            System.out.println("Area of circle : " + formattedArea);
        }
    }
}
