package Questions_200;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questions_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temperature;
        char unit;

        try {
            System.out.print("Enter a temperature value: ");
            temperature = scanner.nextDouble();

            System.out.print("Enter conversion unit (C or F): ");
            unit = scanner.next().charAt(0);

            double convertedTemp;
            switch (unit) {
                case 'C':
                    convertedTemp = (temperature * 9 / 5) + 32;
                    System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit\n", temperature, convertedTemp);
                    break;
                case 'F':
                    convertedTemp = (temperature - 32) * 5 / 9;
                    System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius\n", temperature, convertedTemp);
                    break;
                default:
                    System.out.println("Invalid unit entered.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value for temperature.");
        } finally {
            scanner.close();
        }
    }
}
