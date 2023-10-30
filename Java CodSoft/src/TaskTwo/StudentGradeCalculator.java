package TaskTwo;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects = 6;
        int totalMarks = 0;

        // Input: Take marks obtained (out of 100) in each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate Total Marks
        System.out.println("Total Marks Obtained: " + totalMarks);

        // Calculate Percentage
        double percentage = (totalMarks / (numSubjects * 100.0)) * 100;
        System.out.println("Percentage: " + percentage + "%");

        // Grade Calculation
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F'; // Fail
        }

        // Display Results
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
