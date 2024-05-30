package generalprograms;
import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.nextLine();
        System.out.println("HELLLO" + " " + name.toUpperCase());
    }
}
