package Zjazd4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Summary : Horse Racing Duals
 * author: Michał Wadas
 * url: https://www.codingame.com/ide/puzzle/horse-racing-duals
 */
public class HorseRacingDualsCodingGame {
    /**
     * Casablanca’s hippodrome is organizing a new type of horse racing: duals. During a dual, only two horses will participate in the race.
     * In order for the race to be interesting, it is necessary to try to select two horses with similar strength.
     * Write a program which, using a given number of strengths, identifies the two closest strengths and shows their difference with an integer (≥ 0).
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        ArrayList<Integer> racingHorses = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int Pi = in.nextInt();
            in.nextLine();
            racingHorses.add(Pi);
        }
        Collections.sort(racingHorses);

        int gap = 1000;
        int temp = 0;
        for (int i = 0; i < racingHorses.size() - 1; i++) {
            temp = racingHorses.get(i + 1) - racingHorses.get(i);
            if (temp < gap) {
                gap = temp;
            }
        }
        System.out.println(gap);
    }
}
