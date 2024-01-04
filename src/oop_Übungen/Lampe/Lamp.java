package oop_Übungen.Lampe;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Glühelemente> elemente;

    public Lamp() {
        this.elemente = new ArrayList<>();
    }
    public void addLightElemente(Glühelemente elemente){
        this.elemente.add(elemente);
    }

    public void turnAllOn(){
        for (int i = 0; i < elemente.size(); i++) {
            if (!elemente.get(i).isStatusOn()) {
                elemente.get(i).setStatusOn(true);
                int erhöhung = elemente.get(i).getStromverbauch() + 5;
                elemente.get(i).setStromverbauch(erhöhung);
            }
        }
    }

    public int getOverallPowerUsage(){
        int gesamtStromverbrauch = 0;
        for (int i = 0; i < elemente.size(); i++) {
            gesamtStromverbrauch = gesamtStromverbrauch + elemente.get(i).getStromverbauch();
        }
        return gesamtStromverbrauch;
    }

    public void printNameOfLightElements(){
        for (int i = 0; i < elemente.size(); i++) {
            System.out.println(elemente.get(i).getName());
        }
    }

}
