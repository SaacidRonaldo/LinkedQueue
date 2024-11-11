package Questions_200;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Armstrong Numbers in Range

        System.out.print("Enter the lower limit of the range: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + ":");
        findArmstrongNumbers(lowerLimit, upperLimit);

        // Capitalize First Letter of Each Word

        System.out.println("\nCapitalize First Letter of Each Word");
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline character
        String str = scanner.nextLine();

        System.out.println("String with capitalized first letters: " + capitalizeWords(str));

        scanner.close();
    }

    public static void findArmstrongNumbers(int lower, int upper) {
        for (int num = lower; num <= upper; num++) {
            if (isArmstrongNumber(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Print newline after all Armstrong numbers
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static String capitalizeWords(String str) {
        StringBuilder capitalized = new StringBuilder();
        boolean capitalize = true;

        for (char ch : str.toCharArray()) {
            if (Character.isSpace(ch)) {
                capitalize = true;
            } else if (capitalize) {
                capitalized.append(Character.toUpperCase(ch));
                capitalize = false;
            } else {
                capitalized.append(ch);
            }
        }

        return capitalized.toString();
    }
}
