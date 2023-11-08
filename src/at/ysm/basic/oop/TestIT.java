package at.ysm.basic.oop;

public class TestIT {
    public static void main(String[] args) {
        Flasche flasche = new Flasche("cola", 500, "cola zero");
        Auto auto = new Auto(300,"rot");
        Getraenkekiste getraenkekiste = new Getraenkekiste(24,flasche);
        auto.setKofferraumGetraenkekiste(getraenkekiste);

        Flasche flasche1 = new Flasche("voues", 330, "cola");
        //System.out.println(auto.getKofferraumGetraenkekiste().getFlasche().getHersteller());
        //auto.getKofferraumGetraenkekiste().setFlasche(flasche1);

        Auto auto1 = new Auto();

        auto.setiLeistung(300);
        auto.setsFarbe("rot");
        //auto.iLeistung = 400;

       Fahrrad fahrrad = new Fahrrad();

       auto.setKofferraumfahrrad(fahrrad);

        System.out.println(fahrrad.getiMarke());
        System.out.println(fahrrad.getiRahmengroesse());
        System.out.println(fahrrad.getsFarbe());

        System.out.println(auto.getiLeistung());
        System.out.println(auto.getsFarbe());

    }
}
