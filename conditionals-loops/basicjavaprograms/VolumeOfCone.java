import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        float radius = input.nextFloat();
        System.out.println("Enter the height of circle: ");
        float height = input.nextFloat();
        if (radius >= 0 && height >= 0) {
            double volume = Math.PI * radius * radius * height;
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedVolume = df.format(volume);
            System.out.println("Volume: " + formattedVolume);
        }
    }
}
