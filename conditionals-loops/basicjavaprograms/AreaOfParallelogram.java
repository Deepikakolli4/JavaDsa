import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of parallelogram: ");
        float base = input.nextFloat();
        System.out.println("Enter the height of parallelogram: ");
        float height = input.nextFloat();
        if (base >= 0 && height >= 0) {
            double area = (base * height);
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedArea = df.format(area);
            System.out.println("AREA: " + formattedArea);
        }
    }
}
