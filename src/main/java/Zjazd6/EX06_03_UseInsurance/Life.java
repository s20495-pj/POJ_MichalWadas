package Zjazd6.EX06_03_UseInsurance;

/**
 * summary: Implement exercise 06_03: Life
 * author: Michal Wadas
 **/
public class Life extends Insurance {

    public Life() {
        super("Life");
        setCost();
    }

    @Override
    public void setCost() {
        this.monthlyPrice=36;
    }

    @Override
    public void display() {
        System.out.printf("Your insurance type is: %s.\n" +
                "Your monthly cost is: %.2f$.", insuranceType, monthlyPrice);

    }
}
