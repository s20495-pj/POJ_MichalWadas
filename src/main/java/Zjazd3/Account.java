package main.java.Zjazd3;

/**
 * summary: Implement UML chart, exercise 13: Account
 * author: Michal Wadas
 **/
public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    /**
     * @param amount
     * @return increased balance
     */
    public int credit(int amount) {
        return balance += amount;
    }

    /**
     * @param amount
     * @return reduced balance if amount <= balance ; else unchanged balance
     */
    public int debit(int amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    /**
     * @param another
     * @param amount
     * @return reduced balance after transfer if amount <= balance ; else unchanged balance
     */
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id= " + id +
                ", name= " + name +
                ", balance=" + balance +
                ']';
    }
}
