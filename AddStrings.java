import java.math.BigInteger;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "6913259244";
        String num2 = "71103343";
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        BigInteger result = number1.add(number2);
        System.out.println(result);
    }
}
