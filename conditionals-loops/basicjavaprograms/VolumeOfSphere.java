import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = input.nextFloat();
        if (radius >= 0) {
            double volume = (Math.PI * Math.pow(radius, 3) * 4) / 3;
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedVolume = df.format(volume);
            System.out.println("Volume : " + formattedVolume);
        }
    }
}

