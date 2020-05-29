package Zjazd6.EX06_06;

/**
 * summary: Implement exercise 06_06: Loan
 * author: Michal Wadas
 **/
abstract class Loan implements LoanConstants {

    protected double interestRate;
    private final int loanNumber;
    private final String customerLastName;
    private int loanAmount;
    private final int term;

    public Loan(int loanNumber, String customerLastName, int amountOfLoan, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        this.loanAmount = amountOfLoan;

        if (amountOfLoan > MAX_AMOUNT) {
            this.loanAmount = MAX_AMOUNT;
            System.out.println("Maximum amount=" + MAX_AMOUNT);

        } else if (amountOfLoan < 1) {
            System.out.println("Wrong amount, minimum amount = 1.");
            this.loanAmount = 1;
        }
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
            System.out.println("Our proposition of term is: " + SHORT_TERM + " year.");
        } else {
            this.term = term;
        }
    }

    @Override
    public String toString() {
        String formattedRate = String.format("%.2f", interestRate);
        String formattedAmount = String.format("%.2f", (loanAmount + (loanAmount * (interestRate / 100) * term)));
        return "Loan: [" +
                "loanNumber= " + loanNumber +
                ", customerName= '" + customerLastName + '\'' +
                ", loanAmount= " + formattedAmount +
                ", interestRate= " + formattedRate + "%" +
                ", term=" + term + " years" +
                ']';
    }
}