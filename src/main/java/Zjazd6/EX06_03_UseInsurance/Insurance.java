package Zjazd6.EX06_03_UseInsurance;

/**
 * summary: Implement exercise 06_03: Insurance
 * author: Michal Wadas
 **/
abstract class Insurance {

    public String insuranceType;
    public double monthlyPrice;

    public Insurance(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceType() {
        return insuranceType;
    }
    
    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    abstract public void setCost();

    abstract public void display();
}
