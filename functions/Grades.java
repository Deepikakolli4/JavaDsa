import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks out of 100 : ");
        float mark = input.nextFloat();
        printingGrade(mark);
    }

    public static void printingGrade(float mark) {
        if (mark > 90 && mark <= 100) {
            System.out.println("AA");
        } else if (mark > 80 && mark <= 90) {
            System.out.println("AB");
        } else if (mark > 70 && mark <= 80) {
            System.out.println("BB");
        } else if (mark > 60 && mark <= 70) {
            System.out.println("BC");
        } else if (mark > 50 && mark <= 60) {
            System.out.println("CD");
        } else if (mark > 40 && mark <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("FAIL");
        }
    }
}
