import java.util.Scanner;

public class Marks_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter marks for 5 subjects:");
        double[] marks = new double[5];
        double totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        double percentage = (totalMarks / (5 * 100)) * 100;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nName: " + name);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
