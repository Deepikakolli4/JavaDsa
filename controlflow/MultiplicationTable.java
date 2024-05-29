package controlflow;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.println("Enter the number:");
        int number = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
}
