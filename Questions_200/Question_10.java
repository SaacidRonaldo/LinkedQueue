package Questions_200;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prime Number Sum

        System.out.print("Enter the upper limit for prime numbers: ");
        int limit = scanner.nextInt();

        int primeSum = sumPrimes(limit);
        System.out.println("Sum of all prime numbers up to " + limit + ": " + primeSum);

        // String Replacement

        System.out.println("\nString Replacement");
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline character
        String str = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);

        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);

        String replacedString = replaceCharacter(str, oldChar, newChar);
        System.out.println("Replaced string: " + replacedString);

        scanner.close();
    }

    public static int sumPrimes(int limit) {
        int sum = 0;
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
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
    public static String replaceCharacter(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }
}
