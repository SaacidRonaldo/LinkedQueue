package Questions_200;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Find the largest of three numbers

        System.out.print("Enter three numbers (separated by spaces): ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = Math.max(Math.max(num1, num2), num3);
        System.out.println("Largest number: " + largest);

        // 2. Print the first n Fibonacci numbers

        System.out.print("\nEnter the number of Fibonacci numbers (n): ");
        int n = scanner.nextInt();

        // Initialize first two Fibonacci numbers

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
}
