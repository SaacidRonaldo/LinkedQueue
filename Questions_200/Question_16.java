package Questions_200;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the number of students

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store marks

        int[] marks = new int[numStudents];

        // Input marks for each student

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Find the maximum and minimum marks

        int maxMark = marks[0];
        int minMark = marks[0];
        for (int mark : marks) {
            maxMark = Math.max(maxMark, mark);
            minMark = Math.min(minMark, mark);
        }

        // Assign grades based on marks

        System.out.println("\nStudent\tMarks\tGrade");
        System.out.println("-------\t-------\t------");
        for (int i = 0; i < numStudents; i++) {
            char grade;
            if (marks[i] >= 90) {
                grade = 'A';
            } else if (marks[i] >= 80) {
                grade = 'B';
            } else if (marks[i] >= 70) {
                grade = 'C';
            } else if (marks[i] >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println((i + 1) + "\t\t" + marks[i] + "\t\t" + grade);
        }

        // Display the maximum and minimum marks

        System.out.println("\nMaximum marks: " + maxMark);
        System.out.println("Minimum marks: " + minMark);
    }
}
