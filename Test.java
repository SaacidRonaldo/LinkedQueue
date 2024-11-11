package chapter1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello:");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The marks of the islamic ? :");
        double islamic = input.nextDouble();

        System.out.print("Enter The marks of the Math ? :");
        double Math = input.nextDouble();

        System.out.print("Enter The marks of the Eng ? :");
        double Eng = input.nextDouble();

        double avg = (islamic + Math + Eng) / 3;
//        int avgr = islamic + Math + Eng / 3;
//
//
//
        if (avg >= 97) {
            System.out.println("Your Grade A+ :");
        }
        else if (avg >= 94) {
            System.out.println("Your Grade A- :");
        } else if (avg >= 90){
            System.out.println("Your Grade is A :");
        } else if (avg >= 87) {
            System.out.println("Your Grade B+ :");
        }
        else if (avg >= 84) {
            System.out.println("Your Grade B- :");
        } else if (avg >= 80){
            System.out.println("Your Grade is B :");
        }
        else if (avg >= 77) {
            System.out.println("Your Grade C+ :");
        }
        else if (avg >= 74) {
            System.out.println("Your Grade C- :");
        } else if (avg >= 70){
            System.out.println("Your Grade is C :");
        }
        else if (avg >= 67) {
            System.out.println("Your Grade D+ :");
        }
        else if (avg >= 64) {
            System.out.println("Your Grade D- :");
        } else if (avg >= 60){
            System.out.println("Your Grade is D :");
        } else if (avg >= 50){
            System.out.println("You FaiL :");
        }
//
        System.out.println("The average of all subjects is : " +avg);

    }
}
