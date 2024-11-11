package Questions_200;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            // Display menu

            System.out.println("\nMenu:");
            System.out.println("1. Check for Palindrome");
            System.out.println("2. Calculate GCD");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkPalindrome();
                    break;
                case 2:
                    calculateGCD();
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive check

        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }

        if (str.equals(reversedStr.toString())) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void calculateGCD() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b); // Use Euclidean algorithm for efficient GCD calculation
        }
    }
}
