package Questions_200;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // GCD of Pairs

        System.out.println("GCD of Pairs");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        // Word Count in String

        System.out.println("\nWord Count in String");
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline from previous input
        String str = scanner.nextLine();

        int wordCount = countWords(str);
        System.out.println("The string \"" + str + "\" contains " + wordCount + " words.");

        scanner.close();
    }

    public static int calculateGCD(int num1, int num2) {

        // Efficient GCD calculation using Euclidean algorithm

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int countWords(String str) {

        // Split the string based on whitespace (spaces, tabs, newlines)

        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
