package at.ysm.basic;
import java.sql.SQLOutput;
import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(5, 10);


        // Wenn der Wert 10 ist gib aus Ten
        switch (randomNumber){
            case 10:
                System.out.println("Ten");
                break;

            // Wenn der Wert 9 ist gib aus Nine
            case 9:
                System.out.println("Nine");
                break;

            // Wenn der Wert 8 ist gib aus Eight
            case 8:
                System.out.println("Eight");
                break;

            default:
                System.out.println("other Value");
                break;
        }



        // etc.

    }

}
