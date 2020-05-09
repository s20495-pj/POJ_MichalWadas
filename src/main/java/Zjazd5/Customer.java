package Zjazd5;

/**
 * summary: Implement UML chart, exercise 05_05: Customer
 * author: Michal Wadas
 **/
public class Customer {

    private final int ID;
    private final String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return '"' +
                name + "(" +
                ID + ")" +
                '"';
    }
}