import java.text.DecimalFormat;
import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length: ");
            float side = input.nextFloat();
            if (side >= 0) {
                double totalSurfaceArea = 6*Math.pow(side,2);
                DecimalFormat df = new DecimalFormat("#.###");
                String formattedTotalSurfaceAreaOfCube = df.format(totalSurfaceArea);
                System.out.println("Total Surface Area : " + formattedTotalSurfaceAreaOfCube);
            }
        }
}
