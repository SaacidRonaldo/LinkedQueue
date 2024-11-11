package chapter5;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);


        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);

        System.out.println("What is : " + num1 + " + " + num2 + "?");


        int answer = cin.nextInt();




        for ( ; num1 + num2 != answer;)
        {

           System.out.print("Wrong Answer. Try Again. What is : " + num1 + " + " + num2 + "?");
            answer = cin.nextInt();

        }
        System.out.println("You Got It....");


    }
}
