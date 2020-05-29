package Zjazd6.EX06_06;

/**
 * summary: Implement exercise 06_06: PersonalLoan
 * author: Michal Wadas
 **/
public class PersonalLoan extends Loan {

    public PersonalLoan(int loanNumber, String customerLastName, int amountOfLoan, int term, double primeInterestRate) {
        super(loanNumber, customerLastName, amountOfLoan, term);
        super.interestRate = primeInterestRate + 2;
    }
}