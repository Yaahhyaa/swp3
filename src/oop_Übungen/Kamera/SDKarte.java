package oop_Übungen.Kamera;

import java.util.ArrayList;
import java.util.List;

public class SDKarte {
    private int capacity;
    private List<File> files;
    private Linse lens;

    //Constructor

    public SDKarte(int capacity,Linse lens) {
        this.capacity = capacity;
        this.lens = lens;
        this.files = new ArrayList<>();
    }

    //Functions
    public int CalcFreeSpace(){
        for(File file : this.files){
            int a = 0;
            a += file.getSize();
        }
        int freeSpace = this.capacity;
        return freeSpace;
    }
    public boolean isTaking(){
        boolean canSave;
        if(CalcFreeSpace()<Linse.fileSize()){
            System.out.println("Sie haben nicht genug speicherplatz.");
            canSave = false;
        } else if (CalcFreeSpace()>10) {
            System.out.println("Das Bild kann und wird gespeichert.");
            canSave = true;
        }else {
            System.out.println("Ihnen geth der Speicherplatz aus. Empfehlung: SD-karte wechseln.");
            canSave = true;
        }
        return canSave;
    }

    public void AddFile(File file){
        this.files.add(file);
    }
    //Getter & Setter

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addDatei(File picture) {
    }
}
