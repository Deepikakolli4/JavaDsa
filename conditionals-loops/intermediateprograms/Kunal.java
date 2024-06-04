import java.util.Scanner;

public class Kunal {
    public static void main(String[] args) {
        int days = 0;
        int evenDaysCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter month number: ");
        int month = input.nextInt();
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 0;
                break;
        }
        System.out.println(days);
        System.out.println("The number of even days: ");
        for (int i = 2; i <= days; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                evenDaysCount++;
            }
        }
        System.out.println("No:of EvenDays: " + evenDaysCount);
    }
}

