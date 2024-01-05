package oop_Übungen.Konto;

public class Kreditkonto extends Basiskonto {
    public Kreditkonto(double dKontostand, String sInhaber, String sIban, int iKartennummer, int iVerfügernummer) {
        super(dKontostand, sInhaber, sIban, iKartennummer, iVerfügernummer);
    }
}
