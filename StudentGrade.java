import java.util.Scanner;

public class LabActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Grading System
        System.out.println("=== Grading System ===");
        System.out.print("Enter exam score (0-100): ");
        int score = scanner.nextInt();
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

        // Task 2: Loop Challenge
        System.out.println("\n=== Loop Challenge (1–50, skip multiples of 3) ===");
        Skipper.printSkipMultiplesOf3(1, 50);

        scanner.close();
    }
}