import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class TFaker {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("insertDaten.txt");

            for (int i = 0; i < 100; i++) {
                String name = faker.name().fullName(); // Miss Samanta Schmidt
                String firstName = faker.name().firstName(); // Emory
                String lastName = faker.name().lastName(); // Barton
                String email = faker.name().firstName() + " " + faker.name().lastName() + "@faker.at";
                String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

                String record = "Insert into Autoren (Vorname, Nachname, E-mail) Values" +  " " + "('"  + name + "' ,'" + lastName + "' ,'" + email +"');";

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
