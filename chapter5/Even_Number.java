package chapter5;

import java.util.Scanner;

public class Even_Number {
    public static void main(String[] args) {
        Scanner Cin = new Scanner(System.in);
//        System.out.println(even(10,10));


        Even_Number input = new Even_Number();
        int Odd = input.Odd(10,2);

        System.out.println(Odd);



    }

    public static int even(int num1, int num2) {

        int result ;

        if (num1 % 2 == 1) {
            result = num1;
        }
        else if (num2 % 2 == 1){
            result = num2;
        }
        else {
            result = 0;
        }

        return result;
    }

    public int Odd(int num1, int num2){
        int result ;

        if (num1 % 2 == 0) {
            result = num1;
        } else if (num2 % 2 == 0){
            result = num2;
        }
        else {
            result= 0;
        }

        return result;
    }
}
