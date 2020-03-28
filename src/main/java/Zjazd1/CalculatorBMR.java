package Zjazd1;


import java.util.Scanner;

/**
 * calculator BMR Harris-Benedict
 * author: Michal Wadas
 **/
public class CalculatorBMR {


    public static void main(String[] args) {

        int age;

        int weight, height;
        double BMRw, BMRm;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write weight (in kg): ");
        weight = scanner.nextInt();

        System.out.println("Write your height (in cm): ");
        height = scanner.nextInt();

        System.out.println("Write your age: ");
        age = scanner.nextInt();

        BMRw = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        BMRm = 66 + (13.7 * weight) + (5 * height) - (6.76 * age);

        System.out.println("Basal Metabolic Rate.");
        System.out.println("BMR for man is: " + BMRm);
        System.out.println("BMR for woman is: " + BMRw);
    }
}

