package Zjazd6.EX06_03_UseInsurance;

/**
 * summary: Implement exercise 06_03: Health
 * author: Michal Wadas
 **/
public class Health extends Insurance {

    public Health() {
        super("Health");
        setCost();
    }

    @Override
    public void setCost() {
        this.monthlyPrice = 196;
    }

    @Override
    public void display() {
        System.out.printf("Your insurance type is: %s.\n" +
                "Your monthly cost is: %.2f$.", insuranceType, monthlyPrice);
    }
}
