package Zjazd6.EX06_06;

/**
 * summary: Implement exercise 06_06: BusinessLoan
 * author: Michal Wadas
 **/
public class BusinessLoan extends Loan {

    public BusinessLoan(int loanNumber, String customerLastName, int amountOfLoan, int term, double primeInterestRate) {
        super(loanNumber, customerLastName, amountOfLoan, term);
        super.interestRate = primeInterestRate + 1;
    }
}