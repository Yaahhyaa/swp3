package oop_Übungen.Lampe;

public class Index {
    public static void main(String[] args) {
        Glühelemente g1 = new Glühelemente("LED1", "Rot", 15, true);
        Glühelemente g2 = new Glühelemente("LED2", "Grün", 35, false);
        Glühelemente g3 = new Glühelemente("LED3", "Gelb", 55, true);
        Glühelemente g4 = new Glühelemente("LED4", "Weiß", 100, true);

        Lamp l1 = new Lamp();
        l1.addLightElemente(g1);
        l1.addLightElemente(g2);
        l1.addLightElemente(g3);
        l1.addLightElemente(g4);


        System.out.println(l1.getOverallPowerUsage());
        l1.turnAllOn();
        System.out.println(l1.getOverallPowerUsage());
        l1.printNameOfLightElements();



    }

}
