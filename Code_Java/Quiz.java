package Code_Java;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Password:");

        String password1 = input.nextLine();


        if (password1.length() >8){
            System.out.println("It's Your Validity Password!..");
        }
        else {
            System.out.println("It's Your InValidity Password!...");
        }
    }
}
