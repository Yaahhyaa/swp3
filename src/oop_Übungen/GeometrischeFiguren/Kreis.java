package oop_Übungen.GeometrischeFiguren;

public class Kreis extends Figur {
    public Kreis(String sName) {
        super(sName);
    }

    public void Flächeninhalt(double dRadius){

        double dFlächeninhalt = Math.pow(dRadius, 2) * Math.PI;
        System.out.println("Der Flächeninhalt beträgt: " + dFlächeninhalt + " ^2");
    }
}
