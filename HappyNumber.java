public class HappyNumber {
    public static void main(String[] args) {
        int number = 19;
        int sum = number;
        while(sum!=1){
            sum = calculateSquares(sum);
            System.out.println(sum);
        }
        System.out.println(isHappy(sum));

    }
    public static int  calculateSquares(int n){
        int sum = 0;
        while(n>0){
             int rem = n%10;
             sum=sum+(int)Math.pow(rem,2);
             n=n/10;
        }
        return sum;
    }
    public static boolean isHappy(int sum){
        if(sum==1){
            return true;
        }
        return false;
    }
}
