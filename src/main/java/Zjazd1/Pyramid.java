package Zjazd1;

import java.util.Scanner;

/**
 * pyramid
 * author: Michal Wadas
 **/
public class Pyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char a = 'a';
        int num = 1;
        System.out.println("Write number of pyramid levels: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= num / 2; k++) {
                System.out.print((char) (a + k) + " ");
            }

            for (int j = num / 2 - 1; j >= 0; j--) {
                System.out.print((char) (a + j) + " ");
            }
            num = num + 2;
            a = 'a';
            System.out.println();
        }
    }
}






