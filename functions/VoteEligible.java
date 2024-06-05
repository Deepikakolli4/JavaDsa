import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = input.nextInt();
        checkEligibility(age);
    }

    public static void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }
}
