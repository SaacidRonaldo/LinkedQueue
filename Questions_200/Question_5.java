package Questions_200;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prime Numbers

        System.out.print("Enter the upper limit for prime numbers: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        checkPrimeNumbers(limit);

        // Reverse String

        System.out.println("\nString Reversal");
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline character from previous input
        String str = scanner.nextLine();

        System.out.println("Reversed string: " + reverseString(str));

        scanner.close();
    }

    public static void checkPrimeNumbers(int limit) {
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Print a newline after all primes
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return reversed.toString();
    }
}
