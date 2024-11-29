package Code_Java;

import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter to string");
        char Hello=input.nextLine().charAt(0);
        if('A'<=Hello && Hello<='Z'){
            System.out.println(" Star to uppercase");
        }else {
            System.out.println("does not starts to uppercase");
        }


    }
}
