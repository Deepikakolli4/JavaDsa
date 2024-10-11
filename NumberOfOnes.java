public class NumberOfOnes {
    public static void main(String[] args) {
        int number = 124500;
        int noOfOnes = Integer.bitCount(number);
        int noOfZeroes = 32 - noOfOnes;
        System.out.println("Number Of Ones : " + noOfOnes);
        System.out.println("Number Of Zeroes : " + noOfZeroes);
    }
}
