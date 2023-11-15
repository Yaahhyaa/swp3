package at.ysm.basic.oop;

public class Index {
    public static void main(String[] args) {
        int a = 7;

        car c1 = new car();
        c1.brand = "BMW";
        c1.fuelConsumption = 7;
        c1.serialnumber = "B12345";

        car c2 = new car();
        c2.brand = "Lmabo";
        c2.fuelConsumption = 14;
        c2.serialnumber = "L18769";

        System.out.println(c1.serialnumber);
        System.out.println(c2.serialnumber);



    }
}
