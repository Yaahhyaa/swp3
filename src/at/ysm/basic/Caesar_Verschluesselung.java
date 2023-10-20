package at.ysm.basic;

import java.util.Random;
import java.util.Scanner;

public class Caesar_Verschluesselung {
    public static void main(String[] args) {
    String result = encrypt(2, "Hallo");
        System.out.println(result);
    }

    public static String encrypt(int shift, String stringToEncrypt){
        String  encryptedString = "";
    char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int letter = inputData[i] + shift;
            encryptedString += Character.toString(letter);
            
        }
        return encryptedString;
    }
}
