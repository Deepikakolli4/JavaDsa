package controlflow;
import java.util.ArrayList;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Hello and welcome! if  you are done entering inputs enter 'X'");
        System.out.println("Enter the number:");
        String inputString = "";
        while (true) {
            inputString = input.next();
            if (inputString.equalsIgnoreCase("X")) {
                break;
            }
            numbers.add(Integer.parseInt(inputString));
        }
        int Sum = 0;
        for (int i : numbers) {
            Sum = Sum + i;
        }
        System.out.println("Sum: " + Sum);
    }
}
