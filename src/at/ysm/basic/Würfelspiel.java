package at.ysm.basic;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        Random random = new Random();
        char cAbbruch = 0;
    do {

        int winsOfPlayer= 0;
        int winsOfComputer = 0;
        int amountOfDraws = 0;
        Scanner scanner = new Scanner(System.in);


    for (int i = 0; i < 6; i++) {
        int randomPlayer = random.nextInt(6) + 1;
        int randomComputer = random.nextInt(6) + 1;

        if (randomPlayer > randomComputer) {
            winsOfPlayer++;
        } else if (randomComputer > randomPlayer) {
            winsOfComputer++;
        } else {
            amountOfDraws++;
        }

        System.out.println("Computer:" + randomComputer + " " + "player: " + randomPlayer);

    }
        System.out.println("\n");
        System.out.println(" Computer gesamt wins:" + winsOfComputer + " \n " + "Player gesamt wins:" + winsOfPlayer + "\n " + "insgesammte Draws:" + amountOfDraws);

        System.out.println(" Wollen sie das Spiel abbrechen? " + "Mit j jabbrechen");

        cAbbruch = scanner.next().charAt(0);

        }while (cAbbruch != 'j');

        System.out.println("Spiel Beendet");

    }
}
