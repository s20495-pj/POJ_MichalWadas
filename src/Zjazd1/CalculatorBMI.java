package Zjazd1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * summary: calculator BMI
 * author: Michal Wadas
 **/
public class CalculatorBMI {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("\nWrite your height (in cm) : ");
        double height = scanner.nextDouble();

        double BMI = (weight / (height * height)) * 10000;

        if (BMI < 18.5) {
            System.out.println("You are underweight!");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("You have correct weight.");
        } else if (BMI > 24.9 && BMI < 30) {
            System.out.println("You are overweight!");
        } else {
            System.out.println("You are obese!!!");
        }

        System.out.print("\nYour BMI is " + decimalFormat.format(BMI));
    }
}
