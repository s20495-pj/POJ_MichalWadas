package Zjazd2;
import java.util.*;

/**
 * summary: Mars Lander Episode One
 * url: https://www.codingame.com/ide/puzzle/mars-lander-episode-1
 * author: Michal Wadas
 **/
public class MarsLanderEpisode1 {
    //Rozwiąż dwa zadania ze strony: https://www.codingame.com
    //Wkomituj opis i rozwiązanie do swojego repozytorium.


        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
            for (int i = 0; i < surfaceN; i++) {
                int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
                int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            }

            // game loop
            while (true) {
                int X = in.nextInt();
                int Y = in.nextInt();
                int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
                int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
                int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
                int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
                int power = in.nextInt(); // the thrust power (0 to 4).

                // Write an action using System.out.println()
                // To debug: System.err.println("Debug messages...");

                /**
                 * SOLUTION Mars Lander Episode 1
                 *
                 */
                if (vSpeed <= -30)
                {
                    //if vertical speed is equal or lower than -30, change power to 4,rotation 0
                    System.out.println("0 4");
                }
                else
                {
                    System.out.println("0 1");
                }
            }
        }
    }

