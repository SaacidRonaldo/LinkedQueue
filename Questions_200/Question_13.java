package Questions_200;


import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            // Display menu

            System.out.println("\nMenu:");
            System.out.println("1. String Length");
            System.out.println("2. String Concatenation");
            System.out.println("3. String Character Replacement");
            System.out.println("4. Addition");
            System.out.println("5. Subtraction");
            System.out.println("6. Multiplication");
            System.out.println("7. Division");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stringLength();
                    break;
                case 2:
                    stringConcat();
                    break;
                case 3:
                    stringReplace();
                    break;
                case 4:
                    addNumbers();
                    break;
                case 5:
                    subtractNumbers();
                    break;
                case 6:
                    multiplyNumbers();
                    break;
                case 7:
                    divideNumbers();
                    break;
                case 8:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);

        scanner.close();
    }

    public static void stringLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("The length of the string is: " + str.length());
    }

    public static void stringConcat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        System.out.println("The concatenated string is: " + str1.concat(str2));
    }

    public static void stringReplace() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);
        System.out.println("The replaced string is: " + str.replace(oldChar, newChar));
    }

    public static void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The sum is: " + (num1 + num2));
    }

    public static void subtractNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The difference is: " + (num1 - num2));
    }

    public static void multiplyNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The product is: " + (num1 * num2));
    }

    public static void divideNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Use double for division
        System.out.print("Enter the second number: ");
        double num2;

    }
}