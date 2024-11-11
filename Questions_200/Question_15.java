package Questions_200;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Check if a character is a vowel

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Get only the first character

        boolean isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

        System.out.println(ch + (isVowel ? " is a vowel." : " is not a vowel."));

        // 2. Print a pyramid pattern (assuming the character is not used in the pattern)

        System.out.print("\nEnter the number of rows for the pyramid pattern: ");
        int rows = scanner.nextInt();

        // Print the pyramid pattern using asterisks (*)

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print spaces for leading spaces
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Print asterisks for the pyramid
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
