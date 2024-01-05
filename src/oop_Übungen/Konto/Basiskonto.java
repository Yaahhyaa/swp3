package oop_Übungen.Konto;

public class Basiskonto {
    private double dKontostand;
    private String sInhaber;
    private String sIban;
    private int iKartennummer;
    private int iVerfügernummer;

    public void Auszahlung(double dSumme){
        System.out.println("Es wurde " + dSumme + "€ abgehoben");
        double dNeuerKontostand = getdKontostand() - dSumme;
        setdKontostand(dNeuerKontostand);
    }

    public void Einzahlung(double dSumme){
        System.out.println("Es wurde " + dSumme + "€ eingezahlt");
        double dNeuerKontostand = getdKontostand() + dSumme;
        setdKontostand(dNeuerKontostand);
    }

    public void Saldo(){
        System.out.println("Der Kontostand beträgt " + getdKontostand() + "€");
    }

    public Basiskonto(double dKontostand, String sInhaber, String sIban, int iKartennummer, int iVerfügernummer) {
        this.dKontostand = dKontostand;
        this.sInhaber = sInhaber;
        this.sIban = sIban;
        this.iKartennummer = iKartennummer;
        this.iVerfügernummer = iVerfügernummer;
    }

    public double getdKontostand() {
        return dKontostand;
    }

    public void setdKontostand(double dKontostand) {
        this.dKontostand = dKontostand;
    }

    public String getsInhaber() {
        return sInhaber;
    }

    public void setsInhaber(String sInhaber) {
        this.sInhaber = sInhaber;
    }

    public String getsIban() {
        return sIban;
    }

    public void setsIban(String sIban) {
        this.sIban = sIban;
    }

    public int getiKartennummer() {
        return iKartennummer;
    }

    public void setiKartennummer(int iKartennummer) {
        this.iKartennummer = iKartennummer;
    }

    public int getiVerfügernummer() {
        return iVerfügernummer;
    }

    public void setiVerfügernummer(int iVerfügernummer) {
        this.iVerfügernummer = iVerfügernummer;
    }
}
