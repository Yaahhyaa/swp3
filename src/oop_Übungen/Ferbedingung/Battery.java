package oop_Übungen.Ferbedingung;

public class Battery {
    private int chargingStatus;

    public Battery(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public int getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
}
