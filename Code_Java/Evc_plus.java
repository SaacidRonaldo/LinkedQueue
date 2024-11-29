package Code_Java;

import java.util.Scanner;

public class Evc_plus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dial = "*770#";
        double haraga = 100;
        int pin = 4321;
        System.out.println("Enter SignUp");
        String dialup = input.next();
        if (dialup.equals(dial)) {
            System.out.println("-EVCPLUS-");
            System.out.println("Fadlan geli PIN-kaaga(Enter PIN)");
            int yourpin = input.nextInt();
            if (pin == yourpin) {
                System.out.println("EVCPlus");
                System.out.println("1. Itus Haraaga ");
                System.out.println("2. Kaarka hadalka  ");
                System.out.println("3. Bixi Bill  ");
                System.out.println("4. U wareeji EVCPLUS ");
                System.out.println("5. Warbixin Kooban  ");
                System.out.println("6. Salaam Bank ");
                System.out.println("7. Maaraynta ");
//                System.out.println("8. Taaj ");
                System.out.println("8. Bill Payment ");
                int doorasho = input.nextInt();
                switch (doorasho) {
                    case 1:
                        System.out.println("{-EVCPLUS-} Haraagaagu Waa $" + haraga);
                        break;
                    case 2:
                        System.out.println("1. ku shubo AirTime ");
                        System.out.println("2. ugu shub AirTime ");
                        System.out.println("3. MIFI packages ");
                        System.out.println("4. ku subo interne ");
                        System.out.println("5. ugu shub qof kale (MMT) ");

                        //1.ku shubo AirTime

                        int numbers = input.nextInt();
                        switch (numbers) {
                            case 1:

                                System.out.println("Fadlan gali lcgtta");
                                double galilcgta = input.nextDouble();
                                System.out.println("Ma hubtaa inaad $" + galilcgta + "ku shubatid?");
                                System.out.println("1:haa");
                                System.out.println("2:maya");

                                int hubinta_ku_shubo_Airtime = input.nextInt();
                                switch (hubinta_ku_shubo_Airtime) {

                                    case 1:
                                        double Haragaga_cusub = haraga - galilcgta;
//                                if (galilcgta > 0) {
//                                    System.out.println("Amount Must Be Greater Than Zero");

                                        if (haraga < galilcgta)
                                            System.out.println("Haragagu kuguma filna");
                                        else
                                            System.out.println("[-EVCPlus-] waat ku guleysatay inaat" + " ku shubato $"

                                                    + galilcgta + "haraagagu waa $" + Haragaga_cusub);
                                        break;


                                    case 2:
                                        System.out.println("macsalamo");

                                }


                                //2.Ugu shub AirTime
                                break;
                            case 2: {
                                System.out.println("Fadlan gali moboilk");
                                double gali_mobilka = input.nextDouble();
                                System.out.println("Fadlan gali lacagta");
                                double gali_lcgta = input.nextDouble();
                                System.out.println("Ma hubtaa inaad $" + gali_lcgta + "ugu shubtid " + gali_mobilka + "?");
                                System.out.println("1:Haa");
                                System.out.println("2:Maya");

                                int hubinta_ugu_Airtime = input.nextInt();
                                switch (hubinta_ugu_Airtime) {
                                    case 1:
                                        double haraga__cusub = haraga - gali_lcgta;
                                        if (haraga < gali_lcgta)
                                            System.out.println("Haragagu kuguma filna");
                                        else
                                            System.out.println("[-EVCPlus-] waxaad $" + gali_lcgta + "ugu shubtay" + gali_mobilka +
                                                    "haraagagu waa $" + haraga__cusub);
                                        break;

                                    case 2:
                                        System.out.println("macsalamo");
                                }
                            }

                            //MIFI packages
                            break;
                            case 3: {
                                System.out.println("1.Ku shubo Data-da MIFI");
//
                                int mifi_package = input.nextInt();
                                if (mifi_package == 1) {

                                    System.out.println("--internet_bundle_recharge--");
                                    System.out.println("1: isbuucle(Weekly)");
                                    System.out.println("2: malinle(Daily)");
                                    System.out.println("3:bille (mifi)");


                                } else
                                    System.out.println("Fadla dooro number sax ah");

                                // isbucle(Weekly) (mifi packages)

                                int isbucle = input.nextInt();
                                switch (isbucle) {
                                    case 1:
                                        System.out.println("fadlan dooro bundle");
                                        System.out.println("1. $5=10gb");
                                        System.out.println("2.$10=25gb");

                                        //number one 1$5GB

                                        int numbrs_of_isbucle = input.nextInt();
                                        switch (numbrs_of_isbucle) {

                                            case 1:
                                                int lacag = 5;

                                                System.out.println("Fadlan gali mafi");
                                                int mifi = input.nextInt();
                                                System.out.println("ma hubta " + lacag + "ku shubatid" + " " + mifi);
                                                System.out.println("1:haaa");
                                                System.out.println("2:maya");
                                                int hubinta_isbucle_1 = input.nextInt();
                                                if (hubinta_isbucle_1 == 1) {
                                                    if (haraga > lacag) {
                                                    }
                                                    System.out.println("waxa ku guulesate " + lacag + " " + mifi);
                                                } else
                                                    System.out.println("macsalamo");
                                                break;

                                            //number two $10 25GB

                                            case 2:

                                                int lacag2 = 10;

                                                System.out.println("Fadlan gali mafi");
                                                int mifi2 = input.nextInt();
                                                System.out.println("ma hubta " + lacag2 + "ku shubatid" + " " + " ww" +
                                                        "" + mifi2);
                                                System.out.println("1:haaa");
                                                System.out.println("2:maya");


                                                int hubinta_isbucle_2 = input.nextInt();
                                                if (hubinta_isbucle_2 == 1) {
                                                    if (haraga > lacag2) {
                                                    }
                                                    System.out.println("waxa ku guulesate " + lacag2 + " " + mifi2);
                                                } else
                                                    System.out.println("macsalamo");

                                        }
                                        //malinle(mifi packages)
                                    case 2:
                                        double lcg = 1;


                                        System.out.println("Fadlan dooro bundleka");
                                        System.out.println("1.$=1 2GB");
                                        System.out.println("2.$=2 5GB");
                                        int numMalinle = input.nextInt();
                                        switch (numMalinle) {

                                            //number one =1$ 2GB

                                            case 1:
                                                System.out.println("Fadlan gali mifi userka: ");
                                                int Mifi = input.nextInt();
                                                System.out.println("Ma hubta in " + lcg + "shubtid" + " " + Mifi + "?");
                                                System.out.println("1=Haa");
                                                System.out.println("2=Maya");
                                                int hubin_malinle_1 = input.nextInt();
                                                if (hubin_malinle_1 == 1) {
                                                    if (haraga > lcg) {
                                                    }
                                                    System.out.println("waxa ku guulesate " + lcg + " " + Mifi);
                                                } else
                                                    System.out.println("macsalamo");

                                                //number =2$ 5GB
                                            case 2:
                                                System.out.println("Fadlan gali mifi userka: ");
                                                int mifi = input.nextInt();
                                                System.out.println("Ma hubta in " + lcg + " " + "shubtid" + " " + mifi + "?"
                                                );
                                                System.out.println("1=Haa");
                                                System.out.println("2=Maya");
                                                int hubin_malin_num2 = input.nextInt();
                                                if (hubin_malin_num2 == 1) {
                                                    if (haraga > lcg) {
                                                    }
                                                    System.out.println("waxa ku guulesate " + lcg + " " + mifi);
                                                } else
                                                    System.out.println("macsalamo");


                                        }
                                        // bile(mifi packages)
                                    case 3:
//


                                        System.out.println("Fadlan dooro bundleka");
                                        System.out.println("1.$=20 40GB");
                                        System.out.println("2.$=40 85GB");
                                        System.out.println("3.$60=150GB");
                                        System.out.println("4.$30=Monthly Unlimit");
                                        int bille = input.nextInt();
                                        switch (bille) {
                                            //number one =1$ 2GB

                                            case 1:
                                                int lacg = 1;

                                                System.out.println("Fadlan gali mifi userka: ");
                                                int Mifi = input.nextInt();
                                                System.out.println("Ma hubta in " + "$" + lacg + "shubtid" + " " + Mifi + "?");
                                                System.out.println("1=Haa");
                                                System.out.println("2=Maya");
                                                int hubunta_bille_num_1 = input.nextInt();
                                                if (hubunta_bille_num_1 == 1) {
                                                    if (haraga > lacg) {
                                                    }
                                                    System.out.println("waxa ku guulesate " + lacg + " " + Mifi);
                                                } else
                                                    System.out.println("macsalamo");


                                                //number two=$=40 85GB
                                            case 2:
                                                int lcge = 40;
                                                System.out.println("Fadlan gali mifi userka: ");
                                                int mifi = input.nextInt();
                                                System.out.println("Ma hubta in " + "$" + lcge + "shubtid" + " " + mifi + "?");
                                                System.out.println("1=Haa");
                                                System.out.println("2=Maya");
                                                int hubinta_bile_num_2 = input.nextInt();
                                                if (hubinta_bile_num_2 == 1) {
                                                    if (haraga > lcge) {
                                                    }
                                                    System.out.println("waxa ku guulesate " + "$" + lcge + " " + mifi);
                                                } else
                                                    System.out.println("macsalamo");

                                                ///num three $60=150GB
                                            case 3:
                                                int lacag = 60;
                                                System.out.println("Fadlan gali mifi userka: ");
                                                int mifii = input.nextInt();
                                                System.out.println("Ma hubta in " + "$" + lacag + "shubtid" + "" + mifii + "?");
                                                System.out.println("1=Haa");
                                                System.out.println("2=Maya");
                                                int hubinta_bille_num3 = input.nextInt();
                                                if (hubinta_bille_num3 == 1) {
                                                    if (haraga > lacag) {
                                                    }
                                                    System.out.println("waxa ku guulesate " + "$" + lacag + " " + mifii);
                                                } else
                                                    System.out.println("macsalamo");

                                                //number four $30=Monthly Unlimit

                                            case 4:
                                                int lcgta = 30;
                                                System.out.println("Fadlan gali mifi userka: ");
                                                int mife = input.nextInt();
                                                System.out.println("Ma hubta in " + "$" + lcgta + "shubtid" + "" + mife + "?");
                                                System.out.println("1=Haa");
                                                System.out.println("2=Maya");
                                                int hubinta_bille_num4 = input.nextInt();
                                                if (hubinta_bille_num4 == 1) {
                                                    if (haraga > lcgta) {
                                                    }
                                                    System.out.println("waxa ku guulesate " + "$" + lcgta + " " + mife);
                                                } else
                                                    System.out.println("macsalamo");


                                        }


                                }


                            }
                            //4. ku subo interne

                            case 4:

                                System.out.println("Fadlan dooro number-ka aad ku shubeso");
                                System.out.println("1.Iabuucle(weeekly)");
                                System.out.println("2.TIME BASED PACKAGES");
                                System.out.println("3.DATA");
                                System.out.println("4.Maalinle(Daily)");
                                System.out.println("5.BIlle(mifi)");

                                int ku_shubo_internet = input.nextInt();
                                switch (ku_shubo_internet) {

                                    //isbuucle internet
                                    case 1:
                                        System.out.println("Fadlan gali lcgta");
                                        int lacag = input.nextInt();
                                        System.out.println("ma hubtaa inaad" + "$" + lacag + " " + " ku shubatid ?");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int hubinta_isbucle_internet = input.nextInt();
                                        if (hubinta_isbucle_internet == 1) {
                                            if (haraga > lacag) {

                                                System.out.println("waxa ku guulesate " + "$" + lacag + " " + "in aad ku shubato");
                                            }
                                        } else
                                            System.out.println("macsalamo");

                                        //Time based package internett
                                    case 2:

                                        System.out.println("Fadlan gali lcgta");
                                        int lacagt = input.nextInt();
                                        System.out.println("ma hubtaa inaad" + "$" + lacagt + " " + " ku shubatid ?");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int hubinta_time_packa = input.nextInt();
                                        if (hubinta_time_packa == 1) {
                                            if (haraga > lacagt) {

                                                System.out.println("waxa ku guulesate " + "$" + lacagt + " " + "inaad ku shubato");
                                            }
                                        } else
                                            System.out.println("macsalamo");
                                        //Data internet

                                    case 3:
                                        System.out.println("Fadlan gali lcgta");
                                        int lacagta = input.nextInt();
                                        System.out.println("ma hubtaa inaad" + "$" + lacagta + " " + " ku shubatid ?");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int hubinta_data_internet = input.nextInt();
                                        if (hubinta_data_internet == 1) {
                                            if (haraga > lacagta) {

                                                System.out.println("waxa ku guulesate " + "$" + lacagta + " " + "inaad ku shubato");
                                            }
                                        } else
                                            System.out.println("macsalamo");

                                        //malinle internet

                                    case 4:
                                        System.out.println("Fadlan gali lcgta");
                                        int lacagtaa = input.nextInt();
                                        System.out.println("ma hubtaa inaad" + "$" + lacagtaa + " " + " ku shubatid ?");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int hubinta_malinle_inter = input.nextInt();
                                        if (hubinta_malinle_inter == 1) {
                                            if (haraga > lacagtaa) {

                                                System.out.println("waxa ku guulesate " + "$" + lacagtaa + " " + "inaad ku shubato");
                                            }
                                        } else
                                            System.out.println("mahadsanid");

                                        //bille internet

                                    case 5:
                                        System.out.println("Fadlan gali lcgta");
                                        int lacagtan = input.nextInt();
                                        System.out.println("ma hubtaa inaad" + "$" + lacagtan + " " + " ku shubatid ?");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        double haragaa = haraga - lacagtan;
                                        int hubinta_bille_intenet = input.nextInt();
                                        if (hubinta_bille_intenet == 1) {
                                            if (haraga > lacagtan) {

                                                System.out.println("waxa ku guulesate " + "$" + lacagtan + " " + "inaad ku shubato haraagaagu waa " + haragaa);
                                            }
                                        } else
                                            System.out.println("mahadsanid");


                                }


                                //ugu shub qof kale
                            case 5:
                                System.out.println("Fadlan gali mobilka");
                                int mobile = input.nextInt();
                                System.out.println("Fadlan gali lacagta");
                                double lacagata = input.nextDouble();
                                System.out.println("ma hubta inaa " + "$" + lacagata + "ugu shubtid" + " " + mobile + "?");
                                System.out.println("1.HAA");
                                System.out.println("2.MAYA");
                                double haragaa = haraga - lacagata;
                                int dooraho = input.nextInt();
                                if (dooraho == 1) {
                                    if (haraga > lacagata)
                                        System.out.println("wAXA " + "$" + lacagata + " " + "ugu shubtey " + mobile + " " + "Haraagagu waa" + haragaa);
                                } else
                                    System.out.println("mahadsanid");


                        }
                        break;

                    //Bixi Bilka
                    case 3:
                        System.out.println("Bixi Biilka");
                        System.out.println("1.Post Paid");
                        System.out.println("2.Ku Iibso");

                        int doro = input.nextInt();

                        switch (doro) {
                            //////// //1 Post Paid
                            case 1:
                                System.out.println("Post Paid");
                                System.out.println("1.Ogow Biilka");
                                System.out.println("2.Bixi Biilka");
                                System.out.println("3.Kabixi Biilka");

                                int numbrs = input.nextInt();
                                switch (numbrs) {

                                    //ogow billka

                                    case 1:
                                        System.out.println("error occurred,please try again later");

                                        //Bixi billka

                                    case 2:
                                        System.out.println("Fadlan gali lacagta");
                                        double lacag = input.nextDouble();
                                        System.out.println("Ma hubtaa inaad bixisid Bill lacagtiisu tahay: $" + lacag + "?");
                                        System.out.println("1.Haa");
                                        System.out.println("2.Maya");
                                        double haragaa = haraga - lacag;
                                        int doorsho = input.nextInt();
                                        if (doorsho == 1) {
                                            System.out.println("Waxaad Bixise bill $" + lacag + "tahay haraagagu waa" + haragaa);
                                        } else
                                            System.out.println("mahadsanid!");
                                        //ka Bixi Biilka
                                    case 3:
                                        System.out.println("Fadlan gali mobil-ka");
                                        int mobile = input.nextInt();
                                        System.out.println("Fadlan gali lacagta");
                                        double lacagta = input.nextDouble();
                                        System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay" + lacagta + "oo laga rabe tell No" + " "
                                                + mobile + "?");
                                        System.out.println("1.Haa");
                                        System.out.println("2.Maya");

                                        double haraaa = haraga - lacagta;
                                        int num = input.nextInt();
                                        if (num == 1) {
                                            System.out.println("Waxaa bixisayy bill lacagtiisu tahay $" + lacagta + "laga rabe" + mobile + "haraagaagu waa" + haraaa);
                                        } else
                                            System.out.println("mahadsanid");

                                }
                                break;

                            //ku iibso

                            case 2:
                                System.out.println("Fadlan Gali aqoonsiga ganacsigada");
                                String aqoonsi = input.next();
                                System.out.println("Ma hubtaa inaad" + " " + aqoonsi + " " + "aqonsi saxan soo galise");
                                System.out.println("1.Haa");
                                System.out.println("2.Maya");
                                int hubinta_ku_iibso = input.nextInt();
                                if (hubinta_ku_iibso == 1) {
                                    System.out.println("aqoonsigada ma ahan mid jira naya mhdsnd");
                                } else
                                    System.out.println("mahadsanid!");

                        }
                        break;
                    //4. U wareeji EVCPLUS
                    case 4:

                        System.out.println("fadlan geli Mobile-ka ");
                        int phone = input.nextInt();
                        System.out.println("Fadlan geli lacagta");
                        double mon = input.nextDouble();
                        System.out.println("ma huptaa inaa $" + mon + " " + " u wareejisid" + " " + "252" + phone + "?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int hubin = input.nextInt();
                        if (haraga >= mon) {
                            if (hubin == 1)

                                System.out.println("\n[-EVCPLUS-]\n" + mon + "$ ayaad uwareejisay " + phone + "Tar :1/1/2025" + " 17:30:03" + " haragaaga hada waa " + (haraga - mon) +
                                        "\nLasoo dag appka waafi");
                            else System.out.println("mahadsanid");
                        } else
                            System.out.println("Haraagaaga kuguma filna");

                        //5. Warbixin Kooban
                        break;

                    case 5:
                        System.out.println("-Warbixin kooban-");
                        System.out.println("1.Last Action");
                        System.out.println("2.Wareejinti u dambsey");
                        System.out.println("3.iibsashadi ugu dambese");
                        System.out.println("4.Last 3 Actions");
                        System.out.println("5.Email Me my Activity");

                        int doorasho_warbixin_kooban = input.nextInt();
                        switch (doorasho_warbixin_kooban) {
                            //1.Last Action

                            case 1:
                                double mony = 4;
                                int phones = 610916119;
                                System.out.println("$" + mony + " Ayaad u wareejisay" + phones + " Taariikh: 23/03/24");

                                //2.wareejintii ugu dambeese
                                break;

                            case 2:
                                System.out.println("Statementiga:");
                                System.out.println("1.udirtay");
                                System.out.println("2.ka heshe");
                                int doorasho_warejinti_ugu_dambese = input.nextInt();
                                switch (doorasho_warejinti_ugu_dambese) {

                                    //1.udirte
                                    case 1:
                                        double lacag_udirte = 3;
                                        System.out.println("Fadlan gali mobilka");
                                        int mobile = input.nextInt();
                                        System.out.println("$" + lacag_udirte + "Ayaad u warejisay " + " " + mobile + " " + "Taarikh:" + "\n23/03/2024 20:47:36");
                                        break;

                                    //ka heshe

                                    case 2:
                                        double lacag_ka_heshe = 3;
                                        System.out.println("Fadlan gali mobilka");
                                        int mobilei = input.nextInt();
                                        System.out.println("$" + lacag_ka_heshe + "Ayaad ka heshe " + " " + mobilei + " " + "Taarikh:" + "\n23/03/2024 20:54:28");


                                }
                                break;
                            //iibsashadi ugu dambese
                            case 3:
                                System.out.println("Fadlan Gali aqoonsiga ganacsigada");
                                String aqoonsi = input.next();
                                System.out.println("Ma hubtaa inaad" + " " + aqoonsi + " " + "aqonsi saxan soo galise");
                                System.out.println("1.Haa");
                                System.out.println("2.Maya");
                                int hubinta_iibsashadi_ugu_dambese = input.nextInt();
                                if (hubinta_iibsashadi_ugu_dambese == 1) {
                                    System.out.println("aqoonsigada ma ahan mid jira naya mhdsnd");
                                } else
                                    System.out.println("mahadsanid!");
                                break;
                            ///last three Action
                            case 4:
                                System.out.println("$4 Ayaad u wareejisay 25269878985 Taariikh:\n23/03/24 20:54:28");
                                System.out.println("$3 Ayaad ka heshe 252615594366  Taarikh:\n23/03/24 20:54:28");
                                System.out.println("$10 Ayaad ka heshe 25267624536  Taariikh: \n23/3/24 20:54:28");
                                break;
                            case 5:
                                System.out.println("Fadlan Geli email kaaga");
                                String email = input.next();
                                System.out.println("Fadlan Geli taarikhda hore (MAALIN/BISHA/SANAD,\n e.g: 01/04/2018");
                                String TAARIKH = input.next();

                                System.out.println("you request is being processed and the Activity\nwiil be emailed to " + email);


                        }
                        //SALAM BANK
                    case 6:
                        System.out.println("Fadlan dooro xisabta Bangiga");
                        System.out.println("1.SALAAM SOMALI BANK");
                        System.out.println("2.Darasalaam Bank");
                        System.out.println("3.Bank Beeraha");
                        System.out.println("4.Salaam sch");
                        int doorasho_salam_Bank = input.nextInt();
                        switch (doorasho_salam_Bank) {
                            //salam somali bank
                            case 1:
                                System.out.println("Salaam Bank");
                                System.out.println("1.ka wareeji EVCPlus");
                                int salam_s_B = input.nextInt();
                                switch (salam_s_B) {
                                    case 1:
                                        System.out.println("Salaam Bank");
                                        int kawareji = input.nextInt();
                                        System.out.println("Fadlan gali account-ka");
                                        int Account = input.nextInt();
                                        System.out.println("Fadlan gali maclumadka");
                                        String MACLUMAT = input.next();
                                    default:
                                        System.out.println("mahadsanid");

                                }
                                break;

                            //"2.Darasalaam Bank"
                            case 2:
                                System.out.println("Salaam Bank");
                                System.out.println("1.ka wareeji EVCPlus");
                                int darasalam_B = input.nextInt();
                                switch (darasalam_B) {
                                    case 1:
                                        System.out.println("Darasalam Bank");
                                        int kawareji = input.nextInt();
                                        System.out.println("Fadlan gali account-ka");
                                        int Account = input.nextInt();
                                        System.out.println("Fadlan gali maclumadka");
                                        String MACLUMAT = input.next();
                                    default:
                                        System.out.println("mahadsanid");


                                }
                                //Bank Beeraha
                                break;

                            case 3:

                                System.out.println("Bank Beeraha");
                                System.out.println("1.ka wareeji EVCPlus");
                                int Bank_Beeraha = input.nextInt();
                                switch (Bank_Beeraha) {
                                    case 1:
                                        System.out.println("Bank Beeraha");
                                        int kawareji = input.nextInt();
                                        System.out.println("Fadlan gali account-ka");
                                        int Account = input.nextInt();
                                        System.out.println("Fadlan gali maclumadka");
                                        String MACLUMAT = input.next();
                                    default:
                                        System.out.println("mahadsanid");
                                }

                                //Salaam sch
                                break;
                            case 4:

                                System.out.println("salaam sch");
                                System.out.println("1.ka wareeji EVCPlus");
                                int salam_sch = input.nextInt();
                                switch (salam_sch) {
                                    case 1:
                                        System.out.println("salam sch");
                                        int kawareji = input.nextInt();
                                        System.out.println("Fadlan gali account-ka");
                                        int Account = input.nextInt();
                                        System.out.println("Fadlan gali maclumadka");
                                        String MACLUMAT = input.next();
                                    default:
                                        System.out.println("mahadsanid");}



                        }
                        break;
                    //maareynta

                    case 7:
                        System.out.println("Maareynta");
                        System.out.println("1.Bedel lamber sirta");
                        System.out.println("2.Bedel luqada");
                        System.out.println("3.wargalin mobikle lume");
                        System.out.println("4.lacag xirasho");
                        System.out.println("5.Uceli lcg qaldante");
                        System.out.println("6.EnableMobileBanking");
                        int maareynta=input.nextInt();
                        switch (maareynta){

                            //1.Bedel lamber sirta
                            case 1:
                                System.out.println("Fadlan geli PIN-kaaga cusub");
                                String PIN_Cusub=input.next();
                                System.out.println("Xaqiiji PIN-kaaga cusub");
                                String xaqiiji_PIN=input.next();
                                if (xaqiiji_PIN.equals(PIN_Cusub)){
                                    System.out.println("waad ku guulaysatay in aad bedesho PIN-kaaga");
                                }else
                                    System.out.println("INPUT MISMATCH\nHubi PIN-kaaga cusub");
                                break;
                            //.Bedel luqada"
                            case 2:
                                System.out.println("Fadlan dooro luuqada");
                                System.out.println("1.english");
                                System.out.println("2.somali");
                                int dooro_luuqad=input.nextInt();
                                switch (dooro_luuqad){
                                    case 1:
                                        System.out.println("[-EVCPlus-]\nYou have successfullyy changed your language");
                                        break;
                                    case 2:
                                        System.out.println("[-EVCPlus-]\nWaad ku guulaysatay in aad bedesho Luqadda");
                                        break;
                                }
                                // wargalin mobikle lume
                            case 3:
                                System.out.println("Fadlan Geli Mobile-ka Lumey");
                                int mobile_lumey=input.nextInt();
                                System.out.println("Fadlam Geli pinkisa");
                                int pinkisa=input.nextInt();
                                System.out.println("Waad ku guulaysatay in aad diwaangeliso Mobile lumay");
                                break;
                            //.lacag xirasho
                            case 4:
                                System.out.println("Fadlan Geli lambarka qaladka ah");
                                int lambarka_qaladka=input.nextInt();
                                System.out.println("Fadlan Geli lambarka loo rabay");
                                int lambarka_loo_rabay=input.nextInt();
                                System.out.println("Fadlan Geli Macluumaad");
                                String MACluumaad=input.nextLine();
                                System.out.println("Ma hubtaa in aad xirato lacag");
                                System.out.println("1.HAA");
                                System.out.println("2.MAYA");
                                int ma_hubtaa_in_aad_xirato=input.nextInt();
                                if (ma_hubtaa_in_aad_xirato==1){
                                    System.out.println("Waad ku guulaysatay in aad xirato lacagta");
                                }else
                                    System.out.println("Mahadsanid!.");

                                break;
                            //Uceli lcg qaldante
                            case 5:
                                System.out.println("Fadlan Geli aqoonsi lacag dirida");
                                String aqoonsi_lacagDirid=input.next();
                                System.out.println("Fadlan Macluumaad");
                                String macluumad_lacagDirid=input.next();
                                System.out.println("Ma hubtaa in aad lacagta celiso?");
                                System.out.println("1.Haa");
                                System.out.println("2.Maya");
                                int hubin_lacag_dirid=input.nextInt();
                                if (hubin_lacag_dirid==1){
                                    System.out.println("Waad ku guulaysatay in aad celiso");
                                }else
                                    System.out.println("Mahadsanid!.");
                                break;
                            //EnableMobileBanking
                            case 6:
                                System.out.println("Fadlan Geli lambarka is diwaangelinta");

                        }
                        //Bill Payment
                        break;
                    case 8:
                        System.out.println("EVCplus");
                        System.out.println("1.Itus haragaga Bill Ka");
                        System.out.println("2.Wada bixi bill-ka");
                        System.out.println("3.Qeyb ka bixi billka");
                        int doorasho_bil_py=input.nextInt();
                        switch (doorasho_bil_py){
                            case 1:
                                System.out.println("Fadlan Gali Bill reference number");
                                int REV_NUM=input.nextInt();

                                break;
                            case 2:
                                System.out.println("some parameters are missing, please Check your request");
                                //insha allh xugtiisa hada helna dhamestirena
                        }


                        int wadan = input.nextInt();
                        switch (wadan){
                            case 1:
                                System.out.println("Fadlan Gali Bill reference number ");
                                break;
                            case 2:
                                System.out.println("some parameters are missing, please Check your request");
                                break;

                        }

                }
            }
            else{
                System.out.println("Pinka aad gelisay waa khalad");
            }


        }
        else {
            System.out.println("you can dial is *770#");
        }

    }
}
