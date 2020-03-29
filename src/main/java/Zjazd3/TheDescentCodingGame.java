package main.java.Zjazd3;

import java.util.Scanner;

/**
 * Summary : The Descent
 * author: Michał Wadas
 * url: https://www.codingame.com/ide/puzzle/the-descent
 */

public class TheDescentCodingGame {

    /**
     * The while loop represents the game.
     * Each iteration represents a turn of the game
     * where you are given inputs (the heights of the mountains)
     * and where you have to print an output (the index of the mountain to fire on)
     * The inputs you are given are automatically updated according to your last actions.
     **/

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        /*
        Solution
         */

        // game loop
        while (true) {
            int highestMountain = 0;
            int mountainValue = 0;

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                // The index of the mountain to fire on.
                if (mountainH > highestMountain) {
                    highestMountain = mountainH;
                    mountainValue = i;
                }
            }
            // Write an action using System.out.println()
            System.out.println(mountainValue);
        }
    }
}

