public class NumberOfSegments {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        if(s.trim().isEmpty()){
            System.out.println(0);
        }
        String[] segments = s.trim().split("\\s+");
        int count = segments.length;
        System.out.println(count);
    }
}
