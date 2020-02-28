package Zjazd1;

import java.util.Scanner;

import static Zjazd1.Color.ANSI_BRIGHT_RED;
import static Zjazd1.Color.ANSI_BG_RED;
import static Zjazd1.Color.ANSI_RESET;
import static Zjazd1.Color.ANSI_BG_BLACK;

/**
 * print Polish flag
 * author: Michal Wadas
 **/
public class PolishFlag {

    public static void main(String[] args) {
        runProgram();
    }

    private static void runProgram() {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose size of the flag: 1= small , 2= medium , 3=large");

        int flagSize = scanner.nextInt();
        if (flagSize == 1) {
            size = 2;
        } else if (flagSize == 2) {
            size = 4;
        } else if (flagSize == 3) {
            size = 6;
        } else {
            System.out.println("Bad input!");
        }
        System.out.println();
        japaneseFlag(size);
    }

    private static void japaneseFlag(int size) {
        int flagXSize = size * 10;
        int flagYSize = size * 2;

        System.out.print(" ");

        System.out.println();
        for (int j = 0; j < flagYSize + 1; j++) {
            for (int i = 0; i < flagXSize; i++) {

                System.out.print(ANSI_BG_BLACK + "  ");
            }
            System.out.println(ANSI_RESET);
        }

        for (int j = 0; j <= flagYSize; j++) {
            System.out.print(ANSI_BRIGHT_RED + ANSI_BG_RED);
            for (int i = 0; i < flagXSize; i++) {
                System.out.print(ANSI_BRIGHT_RED + "  ");
            }
            System.out.println(ANSI_RESET + ANSI_BRIGHT_RED);

        }
    }
}







