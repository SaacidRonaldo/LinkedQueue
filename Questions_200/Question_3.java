package Questions_200;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculator");
            System.out.println("2. Palindrome Checker");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performCalculation(scanner);
                    break;
                case 2:
                    checkPalindrome(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void performCalculation(Scanner scanner) {
        double num1, num2;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero error.");
                    return; // Exit calculation if division by zero
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
    }

    public static void checkPalindrome(Scanner scanner) {
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline character from previous input
        String str = scanner.nextLine();

        str = str.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase

        StringBuilder reversed = new StringBuilder(str).reverse();

        if (str.equals(reversed.toString())) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static class Question_12 {
        public static void main(String[] args) {
            // Palindrome Check

            System.out.println("Palindrome Check");
            System.out.print("Enter a string: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }

            // GCD Calculation

            System.out.println("\nGCD Calculation");
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int gcd = calculateGCD(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

            scanner.close();
        }

        public static boolean isPalindrome(String str) {
            int len = str.length();
            for (int i = 0; i < len / 2; i++) {
                if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(len - 1 - i))) {
                    return false;
                }
            }
            return true;
        }

        public static int calculateGCD(int num1, int num2) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        }
    }
}
