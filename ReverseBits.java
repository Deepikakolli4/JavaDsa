public class ReverseBits {
    public static void main(String[] args) {
        String input = "00000010100101000001111010011100";
        int n = Integer.parseUnsignedInt(input,2);
        int reversed = reverseBits(n);
        System.out.println(reversed);
    }
    public static int reverseBits(int n){
        int reversed = 0;
        for(int i=0;i<32;i++){
            reversed=reversed<<1;
            reversed = reversed|(n&1);
            n=n>>1;
        }
        return reversed;
    }
}
