package Questions_200;

import java.util.HashMap;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        // Factorial using Recursion

        System.out.println("Factorial using Recursion");
        System.out.print("Enter a number (non-negative): ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        // Anagram Check

        System.out.println("\nAnagram Check");
        System.out.print("Enter the first string: ");
        scanner.nextLine(); // Consume newline from previous input
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        scanner.close();
    }

    public static int calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        // Convert both strings to lowercase for case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Use a HashMap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Iterate through the second string and check if character frequencies match
        for (char ch : str2.toCharArray()) {
            int count = charCount.getOrDefault(ch, 0);
            if (count == 0) {
                return false; // Character not found in first string
            }
            charCount.put(ch, count - 1);
        }

        // Check if all characters in first string have matching frequencies in second string
        for (int value : charCount.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
