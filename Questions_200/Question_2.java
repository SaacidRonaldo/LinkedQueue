package Questions_200;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year input

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check for leap year

        boolean isLeapYear = checkLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Get string input

        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline character from previous input
        String str = scanner.nextLine();

        // Count vowels

        int vowelCount = countVowels(str);
        System.out.println("The string \"" + str + "\" contains " + vowelCount + " vowels.");

        scanner.close();
    }

    public static boolean checkLeapYear(int year) {
        // Check leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive counting

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
