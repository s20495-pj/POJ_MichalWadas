package Zjazd6.EX06_06;

import java.util.*;

/**
 * summary: Implement exercise 06_06: CreateLoans
 * author: Michal Wadas
 **/
public class CreateLoans {

    public static void main(String[] args) {

        Scanner scanOne = new Scanner(System.in);

        System.out.println("How many percent your prime interest rate is?");
        double userInputRate = scanOne.nextDouble();
        Loan[] loans = new Loan[5];
        for (int i = 0; i < loans.length; i++) {
            Scanner scanTwo = new Scanner(System.in);

            System.out.println("Whats your name?");
            String userInputName = scanTwo.nextLine();

            System.out.println("What type of loan you want? \n 1. Personal \n 2. Business");
            String userInputLoanType = scanTwo.nextLine();

            System.out.println("How much money you want?");
            int userInputAmount = scanTwo.nextInt();

            System.out.println("How long you want pay off it?");
            int userInputTerm = scanTwo.nextInt();

            if (userInputLoanType.equals("1")) {
                loans[i] = new PersonalLoan(i + 1, userInputName,
                        userInputAmount, userInputTerm,
                        userInputRate);
            } else if (userInputLoanType.equals("2")) {
                loans[i] = new BusinessLoan(i + 1, userInputName,
                        userInputAmount, userInputTerm,
                        userInputRate);
            }
        }
        Arrays.stream(loans).forEach(System.out::println);
    }
}