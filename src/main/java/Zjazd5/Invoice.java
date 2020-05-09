package Zjazd5;

/**
 * summary: Implement UML chart, exercise 05_05: Invoice
 * author: Michal Wadas
 **/
public class Invoice {

    private final int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAmount() {
        return String.valueOf(amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        return amount - ((getCustomer().getDiscount() / 100.0) * amount);
    }
}