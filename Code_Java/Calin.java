package Code_Java;

import java.util.Scanner;

public class Calin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        int max =n;
        int min=n;
        while (n<=10){
            System.out.println("enter number");
            n=input.nextInt();
            if (n<0)
                break;
            if (n>max)
                max=n;
            if (n<min)
                min=n;
            System.out.println(max + " maximum  1"  +min+ "   minmum");


        }
    }
}
