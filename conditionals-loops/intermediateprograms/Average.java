import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("enter the numbers and remember to enter " + "X" + "if inputs are over: ");
        String inputString;
        while (true) {
            inputString = input.nextLine();
            if (inputString.equals("X")) {
                break;
            }
            numbers.add(Integer.parseInt(inputString));
        }
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("Average: " + ((sum) / numbers.size()));
    }
}
