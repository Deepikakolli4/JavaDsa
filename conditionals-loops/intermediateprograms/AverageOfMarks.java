import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numbersOfSubjects = input.nextInt();
        ArrayList<Float> marks = new ArrayList<>();
        if (numbersOfSubjects == 0) {
            System.out.println("not possible to calculate the cgpa");
        } else {
            for (int i = 1; i <= numbersOfSubjects; i++) {
                System.out.println("Enter the subject " + i + " marks:");
                float mark = input.nextFloat();
                marks.add(mark);
            }
            float sum = 0;
            for (float mark : marks) {
                sum = sum + mark;
            }
            System.out.println("Average marks: " + (sum / marks.size()));
        }
    }
}
