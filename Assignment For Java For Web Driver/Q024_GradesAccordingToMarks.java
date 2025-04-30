package Assignment;

import java.util.Scanner;

public class Q024_GradesAccordingToMarks {

    // Method to determine grade based on marks
    public static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: A+");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: B+");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: D");
        } else if (marks <= 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        // Call the method to display grade
        displayGrade(marks);

        scanner.close();
    }
}
