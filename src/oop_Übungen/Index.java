package oop_Übungen;

public class Index {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.setBrand("BMW");
        c1.setFuelConsumption(7);
        c1.setSerialnumber("B12345");

        Car c2 = new Car();
        c2.setBrand("Lambo");
        c2.setFuelConsumption(14);
        c2.setSerialnumber("L18769");

        Car c3 = new Car(17, "Audi", "12345");

        System.out.println(c3.getFuelAmount());
    }
}