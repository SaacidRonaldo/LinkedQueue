package chapter5;

import java.util.Scanner;

public class DoWhile_Lop {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);


        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);

        int answer = cin.nextInt();

        do {
            System.out.println("Wrong Answer. Try Again. What is : " + num1 + " + " + num2 + "?");

            answer = cin.nextInt();

        } while (num1 + num2 != answer);

        System.out.println("You Got It..." );
    }
}
