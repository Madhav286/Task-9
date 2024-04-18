package javabasics.OOPS;


    import java.util.Scanner;

public class Gradingsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks scored by the student: ");
        int marks = scanner.nextInt();
        scanner.close();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        } else {
            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else if (marks >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Grade: " + grade);
        }
    }
}

