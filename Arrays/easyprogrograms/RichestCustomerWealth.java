import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int customers = input.nextInt();
        System.out.println("Enter the customers wealth: ");
        int wealth = input.nextInt();
        int[][] accounts = new int[customers][wealth];
        for (int i = 0; i < customers; i++) {
            for (int j = 0; j < wealth; j++) {
                System.out.println("Enter customer" + i + "wealth: ");
                accounts[i][j] = input.nextInt();
            }
        }
        int max = maximumWealth(accounts);
        System.out.println("The maximum wealth: " + max);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
                maxWealth = Math.max(sum, maxWealth);
            }
        }
        return maxWealth;
    }
}
