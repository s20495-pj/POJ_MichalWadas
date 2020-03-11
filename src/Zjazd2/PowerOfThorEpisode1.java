package Zjazd2;

import java.util.Scanner;

/**
 * Summary : Power of Thor episode one
 * author: Michał Wadas
 * url: https://www.codingame.com/ide/puzzle/power-of-thor-episode-1
 */


public class PowerOfThorEpisode1 {

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     * ---
     * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
     **/

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        /**
         * Solution below
         */

        String direction = ""; //Thor's moving direction /empty declaration

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            //clear direction  --> do not declare String here, avoid creating new Strings inside the loop
            direction = "";

            // Write an action using System.out.println()
            if (initialTy < lightY) {
                initialTy++;
                direction = "S";
            } else if (initialTy > lightY) {
                initialTy--;
                direction = "N";
            }

            if (initialTx < lightX) {
                initialTx++;
                //add string=E after S or N /concatenation
                direction += "E";
            } else if (initialTx > lightX) {
                initialTx--;
                //add string=W after S or N /concatenation
                direction += "W";
            }

            System.out.println(direction);

            //Debug lines to check Thor and Light position
            System.err.println("Thor: " + initialTx + ", " + initialTy);
            System.err.println("Light: " + lightX + ", " + lightY);

            // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}
