package oop_Übungen.GeometrischeFiguren;

public class Quadrat extends Figur {
    public Quadrat(String sName) {
        super(sName);
    }

    public void Flächeninhalt(double dSeitenlänge){
        double dFlächeninhalt = Math.pow(dSeitenlänge, 2);
        System.out.println("Der Flächeninhalt beträgt: " + dFlächeninhalt + " ^2");
    }

}
