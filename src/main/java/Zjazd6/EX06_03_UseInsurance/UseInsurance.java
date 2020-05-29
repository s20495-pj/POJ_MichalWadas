package Zjazd6.EX06_03_UseInsurance;

import java.util.Scanner;

/**
 * summary: Implement exercise 06_03: UseInsurance
 * author: Michal Wadas
 **/
public class UseInsurance {
    public static void main(String[] args) {
        System.out.println("Choose insurance \n 1. Health \n 2. Life\n");
        Insurance insurance;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equals("1")) {
            insurance = new Health();
            insurance.display();
        } else if (input.equals("2")) {
            insurance = new Life();
            insurance.display();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}