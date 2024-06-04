import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number: ");
        String inputString;
        while (true) {
            inputString = input.nextLine();
            if (inputString.equals("0")) {
                Integer.parseInt(inputString);
                break;
            }
            numbers.add(Integer.parseInt(inputString));
        }
        int evenSum = 0;
        int oddSum = 0;
        int negativeSum = 0;
        for (int number : numbers) {
            if (number > 0 && number % 2 == 0) {
                evenSum += number;
            } else if (number > 0 && number % 2 != 0) {
                oddSum += number;
            } else if (number < 0) {
                negativeSum += number;
            }
        }
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
        System.out.println("negative sum: " + negativeSum);
    }
}

