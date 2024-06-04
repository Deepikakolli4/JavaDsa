import java.util.Scanner;

public class NprAndNcr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the choice either npr or ncr");
        String choice = input.nextLine();
        if(choice.equals("npr")){
            System.out.println("Enter the n value: ");
            int n = input.nextInt();
            System.out.println("Enter the p value: ");
            int p = input.nextInt();
            System.out.println("Enter the r value: ");
            int r = input.nextInt();
            int result = (factorial(n)/factorial(n-r));
            System.out.println("result: "+result);
        } else if (choice.equals("ncr")) {
            System.out.println("Enter the n value: ");
            int n = input.nextInt();
            System.out.println("Enter the c value: ");
            int c = input.nextInt();
            System.out.println("Enter the r value: ");
            int r = input.nextInt();
            int result = (factorial(n)/factorial(n-r)*factorial(r));
            System.out.println("result: "+result);
        }else{
            System.out.println("Enter the proper choice");
        }
    }
    public static int factorial(int number){
        if(number==1 || number==0){
            return 1;
        }else{
            return  number*factorial(number-1);
        }
    }
}
