package oop_Übungen.Rechner;

public class Index {
    public static void main(String[] args) {
        Rechner r1 = new Rechner();
        r1.Addition(20,55);
        r1.Subtraktion(100,50);
        r1.Subtraktion(2,2);
        r1.Division(50,100);

        WissenschaftlicherRechner wsr1 = new WissenschaftlicherRechner();
        wsr1.Cosinus(5);
        wsr1.Sinus(90);

        WurzelRechner wr1 = new WurzelRechner();
        wr1.Wurzelziehen(25);
    }
}
