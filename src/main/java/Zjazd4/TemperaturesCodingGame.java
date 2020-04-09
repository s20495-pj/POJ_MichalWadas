package Zjazd4;

import java.util.Scanner;
/**
 * Summary : Temperatures
 * author: Michał Wadas
 * url: https://www.codingame.com/ide/puzzle/temperature-code-golf
 */
public class TemperaturesCodingGame {
    /**
     *Write a program that prints the temperature closest to 0 among input data.
     * If two numbers are equally close to zero, positive integer has to be considered closest to zero
     * (for instance, if the temperatures are -5 and 5, then display 5).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        String temp = in.nextLine(); // The N temperatures expressed as integers ranging from -273 to 5526

        if( n > 0 ) {
            String[] array = in.nextLine().split(" ");

            int temperature = 0;
            int max = 100;

            for (String split : array) {
                temperature = Integer.parseInt(split);

                if (Math.abs(temperature) < Math.abs(max)) {
                    max = temperature;
                } else if (Math.abs(temperature) == Math.abs(max) && temperature != max) {
                    max = Math.abs(temperature);
                }
            }
            System.out.println(max);
        } else {
            System.out.println(0);
        }
    }
}
