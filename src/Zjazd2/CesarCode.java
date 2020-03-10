package Zjazd2;

import java.util.Scanner;

/**
 * summary: Cesar Cipher
 * author: Michal Wadas
 **/
public class CesarCode {

    //Zaimplementuj klasę do szyfrowania za pomocą szyfru Cezara. Zaszyfruj swoje imię i nazwisko.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your name and last name: ");
        String text = scanner.nextLine().toLowerCase();

        System.out.println("Write value to shift each character by given value: ");
        int shiftNumber = scanner.nextInt();

        StringBuilder cipherText = new StringBuilder();
        cipherCesar(text, shiftNumber, cipherText);
        System.out.println(" CipherCode : " + cipherText);
    }

    private static void cipherCesar(String text, int shiftNumber, StringBuilder cipherText) {
        char alphabet;
        for (int i = 0; i < text.length(); i++) {
            // shift char in alphabet to right
            alphabet = text.charAt(i);

            // if char belongs to the alphabet
            if (alphabet >= 'a' && alphabet <= 'z') {
                // shift alphabet
                alphabet = (char) (alphabet + shiftNumber);
                // if shift char greater than 'z'
                if (alphabet > 'z') {
                    // move to starting position
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                cipherText.append(alphabet);
            } else {
                //if input include numbers
                cipherText.append(alphabet);
            }

        }
    }

}
