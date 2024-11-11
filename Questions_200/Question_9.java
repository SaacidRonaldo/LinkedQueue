package Questions_200;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Electricity Bill

        System.out.println("Electricity Bill Calculation");
        System.out.print("Enter the number of units consumed: ");
        double units = scanner.nextDouble();

        double billAmount = calculateElectricityBill(units);
        System.out.printf("The electricity bill for %.2f units is Rs. %.2f\n", units, billAmount);

        // String Length

        System.out.println("\nString Length Calculator");
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline character from previous input
        String str = scanner.nextLine();

        int stringLength = getLength(str);
        System.out.println("The length of the string \"" + str + "\" is: " + stringLength);

        scanner.close();
    }

    public static double calculateElectricityBill(double units) {
        final double fixedCharge = 120; // Replace with your fixed charges
        double rate1 = 1.0; // Rate for first slab (replace with your rates)
        double rate2 = 2.0; // Rate for second slab (replace with your rates)
        double rate3 = 3.0; // Rate for exceeding slabs (replace with your rates)
        double slab1 = 100; // Units in first slab (replace with your slabs)
        double slab2 = 200; // Units in second slab (replace with your slabs)

        double bill = fixedCharge;
        if (units <= slab1) {
            bill += units * rate1;
        } else if (units <= slab1 + slab2) {
            bill += slab1 * rate1 + (units - slab1) * rate2;
        } else {
            bill += slab1 * rate1 + slab2 * rate2 + (units - slab1 - slab2) * rate3;
        }

        return bill;
    }
    public static int getLength(String str) {
        return str.length();
    }
}
