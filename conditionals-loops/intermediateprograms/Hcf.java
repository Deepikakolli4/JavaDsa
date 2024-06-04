import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number1: ");
        int number1=input.nextInt();
        System.out.println("enter the number2: ");
        int number2=input.nextInt();
        int min=Math.min(number1,number2);
        int hcf=0;
        for(int i=min;i>0;i--){
            if(number1%i==0 && number2%i==0){
                hcf=i;
                break;
            }
        }
        System.out.println("HCF: "+hcf);
    }
}
