package oop_Übungen.GeometrischeFiguren;

public class Figur {
    private String sName;

    public Figur(String sName) {
        this.sName = sName;
    }

    public void Flächeninhalt(){
        double dFlächeninhalt = 0;
        System.out.println("Der Flächeninhalt ist " + dFlächeninhalt + "^2");
    }

    public void NameAusgabe(){
        System.out.println("Der Name der figur ist " + getsname());
    }

    private String getsname() {
        return sName;
    }
}
