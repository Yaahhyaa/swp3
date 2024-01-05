package oop_Übungen.Konto;

public class Index {

    public static void main(String[] args) {

        Basiskonto k1 = new Basiskonto(500,"Yahya","0987654", 69187, 1234567);
        k1.Einzahlung(500);
        k1.Auszahlung(200);
        k1.Saldo();
    }

}
