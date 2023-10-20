package at.ysm.basic;

import java.util.Random;
import java.util.Scanner;

public class Caesar_Verschluesselung {
    public static void main(String[] args) {
    String result = encrypt(2, "zzz");
        System.out.println(result);
    }

    public static String encrypt(int shift, String stringToEncrypt){
        String  encryptedString = "";
    char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            char letter = inputData[i];

            if (Character.isLetter(letter)) {
                char base = Character.isUpperCase(letter) ? 'A' : 'a';
                int shifted = (letter - base + shift) % 26;
                if (shifted < 0) {
                    shifted += 26;
                }
                encryptedString += (char) (base + shifted);
            }

            else {
                encryptedString += letter;
            }
            
        }
        return encryptedString;
    }
}
