package Code_Java;

import java.util.Scanner;

public class LacagFiirin {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

//        String Message = "HelloWord!";
//        System.out.println(Message.substring(1,3));


        //It's Only Using *711#//
//
        String Signin = "*711#";
        double rharaa = 500000;
        int dpin = 4567;
        System.out.println("Enter Sign");
        String Sigout = cin.next();
        if (Sigout.equals(Signin)) {
            System.out.println("{-EVCPlus-}");
            System.out.println("Geli Pin-kaaga(Enter Pin)");
            int outpin = cin.nextInt();
            if (dpin == outpin) {
                System.out.println("{-EVCPLUS-} Haraagaagu Waa $" + rharaa);
            }
            else {
                System.out.println("{-Evcplus-}" + " \n Nambarka Sirta ah Waa Khalad");
            }

        }
        else {
            System.out.println("Fadlan ku soo Gel Sidees *711#");
        }

        //It's Only Using *711# End
    }
}
