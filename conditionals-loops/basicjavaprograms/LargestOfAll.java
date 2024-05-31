import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number: ");
        String inputString;
        while (true) {
            inputString = input.nextLine();
            if (inputString.equals("0")) {
                break;
            }
            numbers.add(Integer.parseInt(inputString));
        }
        Collections.sort(numbers);
        int largest = numbers.get(numbers.size() - 1);
        System.out.println("largest is: " + largest);
    }
}
