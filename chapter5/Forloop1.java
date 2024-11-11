package chapter5;

import java.util.Scanner;

public class Forloop1 {
    public static void main(String[] args) {

        Scanner Cin = new Scanner(System.in);

        System.out.println("Enter the num: "+ "?");

        int Num = Cin.nextInt();

        do {
            int sum = 0;

            for (int D = 1; D < Num; D++){
                if (Num % D == 0){
                    sum  += D;
                }
            }
            if (sum == Num){
                System.out.println("the prefect number is :" + Num);
            }
            else {
                System.out.println(" this not prefect number is :");
            }
        }
        while (Num <= 0);
    }
}
