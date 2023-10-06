package at.ysm.basic;
import java.sql.SQLOutput;
public class Loop_1 {
    public static void main(String[] args) {

       // Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen

        int iNumber = 0;

        for (int i = 0; i < 101; i++) {

            iNumber = iNumber + i;
        }
        System.out.println(iNumber);
    }
}
