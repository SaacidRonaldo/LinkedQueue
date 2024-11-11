package chapter5;

import java.util.Scanner;

public class WriteProgrammer {
    public static void main(String[] args) {

        Scanner Cin = new Scanner(System.in);

        String Signin = "*711#";
        double rharaa = 500000;
        int dpin = 4567;
        System.out.println("Enter Sign");
        String Sigout = Cin.next();
        if (Sigout.equals(Signin)) {
            System.out.println("{-EVCPlus-}");
            System.out.println("Geli Pin-kaaga(Enter Pin)");
            int outpin = Cin.nextInt();
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
