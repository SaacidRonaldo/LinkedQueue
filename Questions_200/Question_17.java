package Questions_200;

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Categorize Year into Century

        System.out.println("Categorize Year into Century");
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        String century = categorizeCentury(year);
        System.out.println(year + " belongs to the " + century + ".");

        // Calculate Sum of Even and Odd Numbers (assuming a range)

        System.out.println("\nCalculate Sum of Even and Odd Numbers");
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int evenSum = calculateSum(start, end, true); // Even numbers
        int oddSum = calculateSum(start, end, false); // Odd numbers

        System.out.println("Sum of even numbers (" + start + " to " + end + "): " + evenSum);
        System.out.println("Sum of odd numbers (" + start + " to " + end + "): " + oddSum);

        scanner.close();
    }

    public static String categorizeCentury(int year) {
        int century = (year / 100) + 1;
        return century + (century % 10 == 0 ? "st" : (century % 10 == 1 ? "nd" : (century % 10 == 2 ? "rd" : "th")));
    }

    public static int calculateSum(int start, int end, boolean even) {
        int sum = 0;
        for (int num = start; num <= end; num++) {
            if (num % 2 == 0 && even) { // Even numbers
                sum += num;
            } else if (num % 2 != 0 && !even) { // Odd numbers
                sum += num;
            }
        }
        return sum;
    }
}
