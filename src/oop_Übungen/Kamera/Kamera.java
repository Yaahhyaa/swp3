package oop_Übungen.Kamera;

public class Kamera {
    private int gewicht;
    private int pixel;
    private Producer hersteller;
    private Linse objective;
    private SDKarte sdKarte;

    public Kamera(int gewicht, int pixel, Producer hersteller, Linse objective, SDKarte sdKarte) {
        this.gewicht = gewicht;
        this.pixel = pixel;
        this.hersteller = hersteller;
        this.objective = objective;
        this.sdKarte = sdKarte;
    }

    public void takePicture(String name, String date){
        if(sdKarte.isTaking() == true){
            File picture = new File(name,date, Linse.fileSize());
            sdKarte.addDatei(picture);
        }
    }



    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public Producer getHersteller() {
        return hersteller;
    }

    public void setHersteller(Producer hersteller) {
        this.hersteller = hersteller;
    }

    public Linse getObjective() {
        return objective;
    }

    public void setObjective(Linse objective) {
        this.objective = objective;
    }

    public SDKarte getSdKarte() {
        return sdKarte;
    }

    public void setSdKarte(SDKarte sdKarte) {
        this.sdKarte = sdKarte;
    }
}
