public class ValidPerfectSquare {
    public static void main(String[] args) {
        int number = 16;
        boolean result = checkValidPerfectSquare(number);
        System.out.println(result);
    }

    public static boolean checkValidPerfectSquare(int number) {
        int squareNumber = (int) Math.sqrt(number);
        if (number == (squareNumber * squareNumber)) {
            return true;
        }
        return false;
    }
}
