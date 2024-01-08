package oop_Übungen.GeometrischeFiguren;

public class Würfel extends Quadrat{
    public Würfel(String sName) {
        super(sName);
    }

    public void Volumen(double dSeitenlänge){
        double dVolumen = Math.pow(dSeitenlänge, 3);
        System.out.println("Das Volumen von dem Würfels beträgt " + dVolumen + " ^3");
    }


}
