public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3,9};
        int[] result = plusOne(digits);
        for (int num : result) {
            System.out.print(num + "\t");
        }
    }

    public static int[] plusOne(int[] digits) {
//        StringBuilder number = new StringBuilder();
//        for (int i = 0; i < digits.length; i++) {
//            number.append(digits[i]);
//        }
//        int num = Integer.parseInt(number.toString().trim()) + 1;
//        String req = Integer.toString(num);
//        int[] result = new int[req.length()];
//        for (int i = 0; i < req.length(); i++) {
//            result[i] = req.charAt(i) - '0';
//        }
//        return result;
//    }
        int[] result = new int[digits.length + 1];
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        result[0] = 1;
        return result;
    }
}
