package oop_Übungen.Rechner;
import static java.lang.Math.*;
public class WissenschaftlicherRechner extends Rechner{
    public void Sinus(double Zahl){
        double Ergebnis = sin(toRadians(Zahl));
        System.out.println("Das Ergebnis ist " + Ergebnis);
    }

    public void Cosinus(double Zahl){
        double Ergebnis = cos(toRadians(Zahl));
        System.out.println("Das Ergebnis ist " + Ergebnis);
    }

}
