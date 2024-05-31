import java.util.ArrayList;
import java.util.Scanner;

public class AdditionTill0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.println("Enter the number: ");
        String inputString;
        while(true){
            inputString=input.nextLine();
            if(inputString.equals("0")){
                Integer.parseInt(inputString);
                break;
            }
            numbers.add(Integer.parseInt(inputString));
        }
        int sum=0;
        for(int i:numbers){
            sum+=i;
        }
        System.out.println("result: "+sum);
    }
}
