import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the point1 (x1): ");
        float x1 = input.nextFloat();
        System.out.println("Enter the point1 (y1): ");
        float y1 = input.nextFloat();
        System.out.println("enter the point2 (x2): ");
        float x2 = input.nextFloat();
        System.out.println("Enter the point2 (y2): ");
        float y2 = input.nextFloat();
        float distance = (float) (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("Distance between 2 points is: " + distance);
    }
}
