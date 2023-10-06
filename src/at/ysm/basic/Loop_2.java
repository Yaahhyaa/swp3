package at.ysm.basic;

public class Loop_2 {
    public static void main(String[] args) {

        //Zähle die geraden Ziffern zwischen 1 und 1000 zusammen
        // Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.

        int iNumber = 0;
        for (int i = 0; i < 1000; i = i+2 ) {
            iNumber = iNumber + i;
        }
        System.out.println(iNumber);
    }
}
