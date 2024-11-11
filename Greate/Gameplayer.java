package Greate;

public class Gameplayer {

    //variable

    String PlayerId, PlayerName;
    int Coins;

    // Constructor

    Gameplayer() {
        PlayerId = "c125428";
        PlayerName = "Ali";
        Coins = 100;
    }

    //Method

    public void EarCoin(int Amount) {
        if (Amount > 0) {
            Coins += Amount;
        } else {
            System.out.println("invalid");
        }
    }

    void speedCoin(int Amount) {
        if (Amount < 0) {
            Coins-= Amount;
        } else {
            System.out.println("Subtracts Your Amount Account");
        }
    }
    public void gift(String another , int Amount){
        if (Amount > Coins){
            System.out.println("Not Enough current to complete");
        }
        else {
            System.out.println("valid Successfully");
        }
    }

}
