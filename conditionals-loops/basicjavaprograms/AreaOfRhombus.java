import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the diagonal1: ");
        float d1 = input.nextFloat();
        System.out.println("Enter the diagonal2: ");
        float d2 = input.nextFloat();
        if (d1 >= 0 && d2 >= 0) {
            double area = (0.5 * d1 * d2);
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedArea = df.format(area);
            System.out.println("AREA: " + formattedArea);
        }
    }
}
