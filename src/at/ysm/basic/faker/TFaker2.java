package at.ysm.basic.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class TFaker2 {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("insertDaten.txt");

            for (int i = 0; i < 100; i++) {


                String name = faker.name().fullName(); // Miss Samanta Schmidt
                String firstName = faker.name().firstName(); // Emory
                String lastName = faker.name().lastName(); // Barton

                String comicsID = faker.number().digits(5); // Generiere eine 5-stellige Zahl als ComicID
                String Titel = faker.book().title(); // Generiere einen Buchtitel
                String SerieID = faker.number().digits(3); // Generiere eine 3-stellige Zahl als SerieID
                String AutorID = faker.name().fullName(); // Generiere den Namen eines Autors
                int Veröffentlichungsjahr = faker.number().numberBetween(1900, 2023); // Generiere ein Veröffentlichungsjahr

                String record = "INSERT INTO Comics (ComicID, Titel, SerieID, AutorID, Veröffentlichungsjahr) VALUES ('" +
                        comicsID + "', '" + Titel + "', '" + SerieID + "', '" + AutorID + "', " + Veröffentlichungsjahr + ");";


                myWriter.write(record + "\n"); // Writing each record to a new line in the file

            }

            myWriter.close();
            System.out.println("Successfully wrote 100 records to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
