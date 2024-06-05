import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = input.nextFloat();
        float area = areaOfCircle(radius);
        System.out.println("Area: " + area);
        float circumference = circumferenceOfCircle(radius);
        System.out.println("Circumference: " + circumference);
    }

    public static float areaOfCircle(float radius) {
        return (float) ((3.14) * Math.pow(radius, 2));
    }

    public static float circumferenceOfCircle(float radius) {
        return (float) (2 * (3.14) * radius);
    }
}
