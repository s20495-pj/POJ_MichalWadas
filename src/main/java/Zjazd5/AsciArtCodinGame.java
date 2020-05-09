package Zjazd5;

import java.util.*;

/**
 * Summary : Asci Art
 * author: Michał Wadas
 * url: https://www.codingame.com/ide/puzzle/ascii-art
 */
public class AsciArtCodinGame {

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    static class Solution {

        public static final int INPUT_CHARACTERS = 27;

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int L = in.nextInt();
            in.nextLine();
            int H = in.nextInt();
            in.nextLine();
            String T = in.nextLine();
            String ROWS = "";
            for (int i = 0; i < H; i++) {
                ROWS += in.nextLine();
            }
            T = T.toUpperCase();

            StringBuilder res = new StringBuilder();
            for (int row = 0; row < H; row++) {
                for (char ch : T.toCharArray()) {
                    int position = ch < 65 || ch > 90 ? 26 : ch - 65;
                    int start = (L * INPUT_CHARACTERS) * row + position * L;
                    res.append(ROWS.substring(start, start + L));
                }
                res.append("\n");
            }

            System.out.println(res);
        }
    }
}
