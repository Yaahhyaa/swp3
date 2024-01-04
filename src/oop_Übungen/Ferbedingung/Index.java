package oop_Übungen.Ferbedingung;


public class Index {
    public static void main(String[] args) {
        Remote r1 = new Remote();

        Battery b1 = new Battery(90);
        Battery b2 = new Battery(80);

        r1.addLightElemente(b1);
        r1.addLightElemente(b2);

        r1.getStatus();
        r1.turnOn();
        r1.getStatus();
        r1.turnOff();
    }

}

