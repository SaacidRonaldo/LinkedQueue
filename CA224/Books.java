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


    }


    public void display(){
        System.out.println(title);
        System.out.println(auther);
        System.out.println(year);
    }
}
