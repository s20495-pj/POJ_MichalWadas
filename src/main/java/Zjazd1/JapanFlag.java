package Zjazd1;

import java.util.Scanner;

import static Zjazd1.Color.ANSI_WHITE;
import static Zjazd1.Color.ANSI_BRIGHT_RED;

/**
 * print Japan flag
 * author: Michal Wadas
 **/
public class JapanFlag {

    public static void main(String[] args) {
        runProgram();
    }

    private static void runProgram() {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose size of the flag: 1= small , 2= medium , 3=large");

        int flagSize = scanner.nextInt();
        if (flagSize == 1) {
            size = 8;
        } else if (flagSize == 2) {
            size = 10;
        } else if (flagSize == 3) {
            size = 12;
        } else {
            System.out.println("Bad input!");
        }
        System.out.println();
        japaneseFlag(size);
    }

    private static void japaneseFlag(int size) {
        int flagXSize = size * 9;
        int flagYSize = size * 2;
        int circleXCenter = flagXSize / 2;
        int circleYCenter = flagYSize / 2;
        int circleSize = (size / 2) + 2;
        System.out.print(" ");
        for (int i = 0; i < flagXSize; i++) {
            System.out.print("_");
        }
        System.out.println();
        for (int j = 0; j <= flagYSize; j++) {
            System.out.print("|");
            for (int i = 0; i < flagXSize; i++) {
                double length = customCirclePattern(i, j, circleXCenter, circleYCenter);
                if (length < circleSize) {

                    System.out.print(ANSI_BRIGHT_RED + "*");

                } else {
                    System.out.print(ANSI_WHITE + "/");
                }
            }
            System.out.println("|");
        }
    }

    public static double customCirclePattern(int x1, int y1, int x2, int y2) {
        double result;
        result = Math.sqrt(Math.pow(Math.abs(x1 - x2), 1.5) + Math.pow((Math.abs(y1 - y2)), 2.2) + 7.9);

        return result;
    }
}


