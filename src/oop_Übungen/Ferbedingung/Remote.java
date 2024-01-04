package oop_Übungen.Ferbedingung;

import oop_Übungen.Lampe.Glühelemente;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private boolean isOn;
    private int hasPower;

    private List<Battery> batteries;
    public Remote(){
        this.batteries = new ArrayList<>();
    }

    public void addLightElemente(Battery battery){
        this.batteries.add(battery);
    }

    public void turnOn(){
        isOn = true;
        for (int i = 0; i < batteries.size(); i++) {
            int NewAkku = batteries.get(i).getChargingStatus() - 5;
            batteries.get(i).setChargingStatus(NewAkku);
            System.out.println("Verbraucher angeschlossen");
        }
    }
    
    public void turnOff(){
        isOn = false;
        System.out.println("kein Verbraucher angeschlossen");
    }

    public void getStatus(){
        int Summe = 0;
        for (int i = 0; i < batteries.size(); i++) {
            Summe += batteries.get(i).getChargingStatus();
        }
        setHasPower(Summe/2);
        System.out.println(hasPower);

    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getHasPower() {
        return hasPower;
    }

    public void setHasPower(int hasPower) {
        this.hasPower = hasPower;
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Battery> batteries) {
        this.batteries = batteries;
    }
}
