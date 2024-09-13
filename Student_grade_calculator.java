import java.util.Scanner;
public class Student_grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter number of subjects.
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of subjects");
        int nS = sc.nextInt();
        int total = 0;
        for (int i = 0; i < nS; i++) {
            System.out.println("Enter marks obtained in" + (i + 1) + ":");
            int marks = sc.nextInt();
            total += marks;
        }
        // calculating percentage
        double averP = (double) total / nS;
        // Grade calculation
        char Grade;
        if (averP >= 90) {
            Grade = 'A';
        } else if (averP >= 80) {
            Grade = 'B';
        } else if (averP >= 70) {
            Grade = 'C';
        } else if (averP >= 60) {
            Grade = 'D';
        } else if (averP >= 50) {
            Grade = 'E';
        } else if (averP >= 40) {
            Grade = 'F';
        } else {
            Grade = 'G';
        }
        System.out.println("Total marks scored is " + total);
        System.out.println("Average Percentage Gained is " + averP + "%");
        System.out.println(" Grade:" + Grade);
    }
}