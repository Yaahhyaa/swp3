
//Diese Aufgabe setzt sich aus allen gelernten Inhalten zusammen!
//Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
//1. Einzahlen
//2. Abheben
//3. Kontostand
//4. Beenden

package at.ysm.basic;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Bankomat_Beispiel {
    public static void main(String[] args) {

        System.out.println("1. Einzahlung");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        Scanner scanner = new Scanner(System.in);

        float fEinzahlung = 0;
        float fKontostand = 0;
        float fAbheben = 0;
        char cAbbruch = 'a';

        do {
            System.out.println("Drücken sie 1 zum Einzahlen ");
            System.out.println("Drücken sie 2 zum Abheben ");
            System.out.println("Drücken sie 3 um den Kontostand zu sehen ");
            System.out.println("Drücken sie 4 zum Beenden ");

            float fEingabe = scanner.nextFloat();

            if (fEingabe == 1){
                System.out.print("Wieviel wollen sie einzahlen?");
                fEinzahlung = scanner.nextFloat();

                fKontostand = fKontostand + fEinzahlung;
            }

            else if (fEingabe == 2){
                System.out.println("Wiebviel wollen sie abheben");
                fAbheben = scanner.nextFloat();

                fKontostand = fKontostand - fAbheben;

            }

            else if (fEingabe == 3){
                System.out.println("Ihr Konto betrag lautet" + fKontostand);

            }

            else if (fEingabe == 4){
                System.out.println("Wollen sie beenden? Wenn nein drücken sie N wenn ja drücken sie J");
                cAbbruch = scanner.next().charAt(0);
            }


        } while(cAbbruch != 'J');

        System.out.println("Programm beendet\n");
        System.out.println("Programm beendet\n");



    }
}
