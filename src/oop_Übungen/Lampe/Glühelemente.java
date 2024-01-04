package oop_Übungen.Lampe;

public class Glühelemente {
    private String name;
    private String farbe;
    private int stromverbauch;
    private boolean statusOn;

    public Glühelemente (String name, String farbe, int stromverbauch, boolean statusOn) {
        this.name = name;
        this.farbe = farbe;
        this.stromverbauch = stromverbauch;
        this.statusOn = statusOn;
    }

    public void turnOn(){
        if (isStatusOn() == true){
            System.out.println("Mein Name ist " + getName() + "ich bin bereits eingeschaltet");
        }
        else {
            int erhöhung = getStromverbauch() + 5;
            setStromverbauch(erhöhung);
        }
    }


    public boolean isStatusOn() {
        return statusOn;
    }

    public void setStatusOn(boolean statusOn) {
        this.statusOn = statusOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getStromverbauch() {
        return stromverbauch;
    }

    public void setStromverbauch(int stromverbauch) {
        this.stromverbauch = stromverbauch;
    }


}
