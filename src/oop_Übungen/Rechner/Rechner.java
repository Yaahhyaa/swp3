package oop_Übungen.Rechner;

public class Rechner {
    public void Addition (double Summand1, double Summand2){
        double Summe = Summand1 + Summand2;
        System.out.println("Das Ergebnis ist " + Summe);
    }

    public void Subtraktion (double Zahl1, double Zahl2){
        double Differenz = Zahl1 + Zahl2;
        System.out.println("Das Ergebnis ist " + Differenz);
    }

    public void Multiplikation (double Faktor1, double Faktor2){
        double Produkt = Faktor1 + Faktor2;
        System.out.println("Das Ergebnis ist " + Produkt);
    }

    public void Division(double Dividend, double Divisor){
        double Quotient = Dividend / Divisor;
        System.out.println("Das Ergebnis ist " + Quotient);
    }

}
