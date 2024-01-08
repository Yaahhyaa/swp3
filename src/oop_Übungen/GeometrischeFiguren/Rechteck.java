package oop_Übungen.GeometrischeFiguren;

public class Rechteck extends Figur{
    public Rechteck(String sName) {
        super(sName);
    }

    public void Flächeninhalt(double dLänge, double dBreite){
        double dFlächeninhalt = dBreite * dLänge;
        System.out.println("Der Flächeninhalt beträgt: " + dFlächeninhalt + " ^2");
    }
}
