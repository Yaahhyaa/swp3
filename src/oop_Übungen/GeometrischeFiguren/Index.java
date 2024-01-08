package oop_Übungen.GeometrischeFiguren;

public class Index {

    public static void main(String[] args) {
        Kreis k1 = new Kreis("Kreis1");
        k1.Flächeninhalt(50);
        k1.NameAusgabe();

        Rechteck r1 = new Rechteck("Rechteck1");
        r1.Flächeninhalt(30, 15);
        r1.NameAusgabe();

        Quadrat q1 = new Quadrat("Quadrat1");
        q1.Flächeninhalt(25);
        q1.NameAusgabe();

        Würfel w1 = new Würfel("Würfel1");
        w1.Flächeninhalt(5);
        w1.Volumen(15);
        w1.NameAusgabe();
    }
}
