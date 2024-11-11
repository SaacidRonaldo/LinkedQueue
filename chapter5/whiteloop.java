package chapter5;

import java.util.Scanner;

public class whiteloop {
    public static void main(String[] args) {

        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);

//        create Scanner

        Scanner cin = new Scanner(System.in);

        System.out.print("What is " + num1  + "+" + num2 + "?");

        int answer = cin.nextInt();

        while (num1 + num2 != answer)
        {
            System.out.println("Wrong answer. Try again. What is" + num1 + "+" + num2 + "?");
            answer = cin.nextInt();
        }
        System.out.println("You Got It...");
    }
}
