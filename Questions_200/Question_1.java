package Questions_200;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_STUDENTS = 10; // Maximum number of students

        int numStudents;
        do {
            System.out.print("Enter the number of students (up to " + MAX_STUDENTS + "): ");
            numStudents = scanner.nextInt();
        } while (numStudents < 1 || numStudents > MAX_STUDENTS);

        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];
        char[] grades = new char[numStudents];

        // Get student data
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            names[i] = scanner.next();

            System.out.print("Enter score for " + names[i] + ": ");
            scores[i] = scanner.nextInt();
        }

        // Calculate grades
        
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display results

        System.out.println("\n** Grade Report **");
        System.out.println("------------------");
        System.out.printf("%-20s %5s %5s\n", "Name", "Score", "Grade");
        System.out.println("------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-20s %5d %5c\n", names[i], scores[i], grades[i]);
        }
        System.out.println("------------------");

        scanner.close();

    }
}
