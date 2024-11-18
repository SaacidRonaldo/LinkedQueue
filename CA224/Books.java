package CA224;

import java.util.Scanner;

public class Books {
    Scanner input = new Scanner(System.in);

    String title , auther , year;

    public Books(){
        System.out.println("enter Book_name : ");
        title = input.nextLine();
        System.out.println("Enter the Author : ");
        auther = input.nextLine();
        System.out.println("Enter the Year : ");
        year = input.nextLine();

        System.out.println("---------------------------------------");

        System.out.println("the Title is : " + title);
        System.out.println("the Auther is : " + auther);
        System.out.println("The Year is : " + year);

    }


}
