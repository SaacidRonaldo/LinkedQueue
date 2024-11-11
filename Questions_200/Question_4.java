package Questions_200;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Triangle Type
        System.out.println("Triangle Type Checker");
        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        String triangleType = determineTriangleType(side1, side2, side3);
        if (triangleType != null) {
            System.out.println("Triangle type: " + triangleType);
        } else {
            System.out.println("Invalid triangle. Sides must form a triangle.");
        }

        // Fibonacci Series
        System.out.println("\nFibonacci Series Generator");
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        System.out.print("Fibonacci Series: ");
        generateFibonacci(n);

        scanner.close();
    }

    public static String determineTriangleType(double side1, double side2, double side3) {
        // Check for triangle inequality violation
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            return null;
        }

        // Check for triangle type
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
