package QuizSumArray;

import java.util.HashMap;

import java.util.Scanner;

public class BankAccount {
    private static final HashMap<String, Double> accounts = new HashMap<>();

    static {
        // Predefined accounts with account number and initial balance

        accounts.put("123456", 1000.0);
        accounts.put("654321", 500.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to MyBank!");
            System.out.println("1. Check Balance");
            System.out.println("2. Transfer Money");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(scanner);
                    break;
                case 2:
                    transferMoney(scanner);
                    break;
                case 3:
                    System.out.println("Exiting MyBank. Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance(Scanner scanner) {
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.next();

        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            System.out.println("Your balance is: $" + balance);
        } else {
            System.out.println("Invalid account number.");
        }
    }

    private static void transferMoney(Scanner scanner) {
        System.out.print("Enter your account number: ");
        String fromAccount = scanner.next();

        if (!accounts.containsKey(fromAccount)) {
            System.out.println("Invalid from account number.");
            return;
        }

        System.out.print("Enter recipient account number: ");
        String toAccount = scanner.next();

        if (!accounts.containsKey(toAccount)) {
            System.out.println("Invalid recipient account number.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Transfer amount must be positive.");
            return;
        }

        double fromBalance = accounts.get(fromAccount);
        if (fromBalance < amount) {
            System.out.println("Insufficient funds in your account.");
            return;
        }

        accounts.put(fromAccount, fromBalance - amount);
        accounts.put(toAccount, accounts.get(toAccount) + amount);

        System.out.println("Transfer successful! $" + amount + " transferred to account " + toAccount);
    }
}

