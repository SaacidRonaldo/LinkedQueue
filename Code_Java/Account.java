package Code_Java;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Acoount = "*789#";
        double haraa = 90000;
        int pin_Account = 123456;
        System.out.println("Account-EVCPLUS");
        String Account_Evc = input.next();
        if (Account_Evc.equals(Acoount)) {
            System.out.println("Faldan geli PIN-Kaaga(Account PIN)");
            int check = input.nextInt();
            System.out.println("Fadlan Soo Geli Number_ka : ");
            int number = input.nextInt();
            System.out.println("Fadlan Soo Geli Lacagta :");

            int mon = input.nextInt();
            System.out.println("ma huptaa inaad $" + mon + " ugu shubaysid" + " \tt Undenfined" + "?");
            System.out.println("1. Haa");
            System.out.println("2. Maya");
            int Mahubta = input.nextInt();
            if (haraa >= mon) {
                if (Mahubta == 1) {
                    System.out.println(mon + "$ waxaad ku subatay" + " \tt haragaga hada waa \tt " + (haraa - mon) + " \tt mahadsanid");
                }
                else {
                    System.out.println("MAHADSANID WALAL MACSALAAMO!..");
                }


            }
            else {
                System.out.println("Haraagaga Xisaabta kuma filna ");
            }

            System.out.println("MA Hubtaa inaad $" + mon + "\tt wax kaga iibsato TAYO MEDICAL PHARMACY"+ "\tt +252" + number + "\tt" + (haraa - mon) + check);
        }
        else {
            System.out.println("Waxaa Ku soo Geli Kartaa Account-ka NUmber *789#");
        }
    }
}


