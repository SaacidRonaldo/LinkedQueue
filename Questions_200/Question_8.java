package Questions_200;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Multiplication Table

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        printMultiplicationTable(num);

        // String to Uppercase

        System.out.println("\nString to Uppercase");
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline character
        String str = scanner.nextLine();

        System.out.println("Uppercase string: " + convertToUppercase(str));

        scanner.close();
    }

    public static void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static String convertToUppercase(String str) {
        return str.toUpperCase();
    }
}
