package Zjazd1;

import java.util.Scanner;

/**
 * pyramid
 * author: Michal Wadas
 **/
public class Pyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte a = 'a';
        int num = 1;
        System.out.println("Write number of pyramid levels: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= num / 2; k++) {
                System.out.print(((char) Byte.toUnsignedInt(a++)) + " ");
            }

            a = (byte) (a - 2);

            for (int j = 0; j < num / 2; j++) {
                System.out.print(((char) Byte.toUnsignedInt(a--)) + " ");
            }
            num = num + 2;
            a = 'a';
            System.out.println();
        }
    }
}






