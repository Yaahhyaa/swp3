package oop_Übungen;

public class car {
    public int fuelConsumption;
    public String brand;
    public String serialnumber;
    public String color;
    private double tankstand;
    private double tankvolumen;
    public double verbrauch;

    public car(int fuelConsumption, String brand, String serialnumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialnumber = serialnumber;
    }

    public void car(int fuelConsumption, String brand, String serialnumber){

    }

    //Konstruktor dient dazu Objekte zu Initialisieren. Wird nur am Anfang einer Classe aufgerufen.
    public car(double tankstand, double tankvolumen, double verbrauch) {
        this.tankstand = tankstand;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;
    }

    public car() {
    }

    //Methode zum Bremsen
    public void breakMethod() {
        System.out.println("Ich bremse");
    }

    //Methode für Turboboost

    public void Turboboost() {
        double minFuelForBoost = 0.1 * tankvolumen; //Mindestbestand tankvolumen für boost

        if (tankstand < minFuelForBoost) {
            System.out.println("SuperBoost");
        } else {
            System.out.println("Not enough fuel to go superboost");
        }
    }

    public void honk(int amountOfRepetiotions) {
        for (int i = 0; i < amountOfRepetiotions; i++) {
            System.out.println("Tuuut");
        }
    }
}
