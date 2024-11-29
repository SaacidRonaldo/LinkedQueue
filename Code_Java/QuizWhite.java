package Code_Java;

import java.util.Scanner;

public class QuizWhite {
    public static void main(String[] args) {

//        Waxaana Qiyaas siinaa labo nambar

        int number = (int) (Math.random() *101);

        Scanner Cin = new Scanner(System.in);
        System.out.println("waxaana Qiyaasayaa nambar farqiga 0 and 100");

//        xaqeyji labar-ka aad doorado

        System.out.println("\n soo Gali Qiyaastaada");

        int Qiyaastaada = Cin.nextInt();

        if (Qiyaastaada == number)
            System.out.println("waa saxantahay " + "100%" + number);
        else if (Qiyaastaada > number)
            System.out.println("Qiyaastaada waa ficaantahay Waa" + "100%" );
        else
            System.out.println("Qiyaastaada aad baa u hooseysaa");

    }
}
