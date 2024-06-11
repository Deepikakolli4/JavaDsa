public class SumOfNTill0 {
    public static void main(String[] args) {
        int n = 5;
        int answer[] = sumZero(n);
        for (int i : answer) {
            System.out.print(i + "\t");
        }
    }

    public static int[] sumZero(int n) {
        int answer[] = new int[n];
        int d = -(n / 2);
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                answer[i] = d;
                d = d + 1;
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (d == 0) {
                    d = d + 1;
                }
                answer[i] = d;
                d++;
            }
        }
        return answer;
    }
}
