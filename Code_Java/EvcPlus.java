package Code_Java;

import java.util.Scanner;

public class EvcPlus {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        String sign = "*770#";
        double haraa = 500000;
        int pin = 4567;
        System.out.println("Enter Signup");
        String Signup = cin.next();
        if (Signup.equals(sign)) {
            System.out.println("[-EVCPlus-]");
            System.out.println("Faldan geli PIN-Kaaga(Enter PIN)");
            int Ourtpin = cin.nextInt();
            if (pin == Ourtpin) {

                System.out.println("EVCPlus");
                System.out.println("1. Itus Haraaga ");
                System.out.println("2. Kaarka hadalka  ");
                System.out.println("3. Bixi Bill  ");
                System.out.println("4. U wareeji EVCPLUS ");
                System.out.println("5. Warbixin Kooban  ");
                System.out.println("6. Salaam Bank ");
                System.out.println("7. Maaraynta ");
                System.out.println("8. Taaj ");
                System.out.println("9. Bill Payment ");
                int dooro = cin.nextInt();
                switch (dooro) {
                    case 1:
                        System.out.println("[-EVCPLUS-] Haraagaagu Waa $" + haraa);
                        break;
                    case 2:
                        System.out.println("Kaara hadalka");
                        System.out.println("1. ku shubo AirTime ");
                        System.out.println("2. ugu shub AirTime ");
                        System.out.println("3. MIFI packages ");
                        System.out.println("4. ku subo interne ");
                        System.out.println("5. ugu shub qof kale (MMT) ");

//KAARKA HADALKA 1: KU SHUBO AIRTIME THE END ONE

                        double opt = cin.nextDouble();
                        if (opt == 1) {

                            System.out.println("Faldan Gelin Lacagta");
                            double mon = cin.nextDouble();
                            System.out.println("ma huptaa inaad $" + mon + " ugu shubaysid" + " \n Undenfined" + "?");

                            System.out.println("1. Haa");
                            System.out.println("2. Maya");

                            int Mahubta = cin.nextInt();
                            if (haraa >= mon) {
                                if (Mahubta == 1) {
                                    System.out.println(mon + "$ waxaad ku subatay" + " \n haragaga hada waa \n " + (haraa - mon) + " \n mahadsanid");
                                } else {
                                    System.out.println("MAHADSANID WALAL MACSALAAMO!..");
                                }


                            } else {
                                System.out.println("Haraagaga Xisaabta kuma filna ");
                            }

                        }


                        //Ugu shubo Airtime
                        else if (opt == 2) {
                            System.out.println("Fadlan Soo Geli NUmber-kada");
                            int phone = cin.nextInt();

                            System.out.println("Fadlan geli lacagta");
                            double mon = cin.nextDouble();
                            System.out.println("ma huptaa inaad $" + mon + " ugu shubaysid" + "\n +252 " + phone + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int hubin = cin.nextInt();
                            if (haraa >= mon) {
                                if (hubin == 1)
                                    System.out.println(mon + "$ ayaad ugu shubtay " + " \n +252" + phone + "?" + " \n haragaaga hada waa \n " + (haraa - mon) +
                                            " \n the process is Done");

                                else {
                                    System.out.println("mahadsanid");

                                }
                            } else {
                                System.out.println("Haraagaga Xisaabta kuma filna " + " \n Mobile No: 252" + phone + "?");
                            }
                        }

                        //Ugu shubo Airtim End

                        // MIFI packages//

                        else if (opt == 3) {
                            System.out.println("EVCPlus");
                            System.out.println("1.Ku Shubo Data-daMIFI");
                            System.out.println("Enter SignUp: ");

                            //1.$5= 10 GB koobaad// first == 1


                            int check = cin.nextInt();

                            if (check == 1) {
                                System.out.println("--Internet Bundle Recharge-----");
                                System.out.println("1.Isbuucle(WeeKly)");
                                System.out.println("2.Maalinle(Daily)");
                                System.out.println("3. Bille(Mifi)");
                                int part1 = cin.nextInt();
                                if (part1 == 1) {
                                    System.out.println("Fadlan dooro Bundle ka");
                                    System.out.println("1.$5= 10 GB");
                                    System.out.println("2.$10= 25 GB");


                                    int op = cin.nextInt();
                                    if (op == 1) {
                                        System.out.println("Fadlan Gali MIFI User ");

                                        System.out.println("Invalid input Format(Length) Fadlan Gali MIFI User" + "\n Invalid input format");

                                    }

                                } else {
                                    System.out.println("Fadlan ISka Sax  MIFI User");
                                }
                            } else {
                                System.out.println("Fadlan iska sax MIFI User!..");
                            }
                        }
                        //1.$5= 10 GB koobaad// end == 1


//                                2.$10= 25 GB  labaad // first == 2

                        int op = cin.nextInt();
                        if (op == 2) {
                            System.out.println("Fadlan Gali MIFI User ");

                            System.out.println("Invalid input Format(Length) Fadlan Gali MIFI User" + "\n Invalid input format");

                        } else {
                            System.out.println("Fadlan ISka Sax  MIFI User");
                        }



                        //                      2.Maalinle(Daily)

//                        int check = cin.nextInt();
//                                if (check == 2) {
//                        int part2 = cin.nextInt();

//                        if (part2 == 2) {


                        int op2 = cin.nextInt();
                        System.out.println("Fadlan dooro Bundle ka");
                        System.out.println("1.$1= 2 GB");
                        System.out.println("2.$2= 25 GB");

                        if (op2 == 2) {

                            System.out.println("Fadlan Gali MIFI User ");

                            System.out.println("Invalid input Format(Length) Fadlan Gali MIFI User" + "\n Invalid input format");

                        }
                        else {
                            System.out.println("Fadlan ISka Sax  MIFI User");
                        }


//                        }
//                        else {
//                            System.out.println("Fadlan iska sax MIFI User!..");
                }


//                                }


//                                2.$10= 25 GB  labaad // end == 2




            }
            else {
                System.out.println("{-EVCPLUS-} Nambarka Sirta" + " \n Ah WAA KHALAD");
            }

        }
        else{
            System.out.println("KU soo Gal SIGNUP KAAS EE SIRTA AH *770#");
        }
    }
}
