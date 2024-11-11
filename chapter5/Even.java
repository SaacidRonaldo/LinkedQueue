package chapter5;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner Cin = new Scanner(System.in);
        for(int num = 1; num < 100;){
            if (num % 2 == 1) {
                System.out.println(num);
            }num++;

        }
    }
}
