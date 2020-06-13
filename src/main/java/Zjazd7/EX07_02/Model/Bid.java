package Zjazd7.EX07_02.Model;

import Zjazd7.EX07_02.Model.User.User;

/**
 * summary: Implement exercise 07_02: Bid
 * author: Michal Wadas
 **/
public class Bid {

    public User getUser() {
        return user;
    }

    public double getPrice() {
        return Price;
    }

    private User user;
    private double Price;

    public Bid(User user, double price) {
        this.user = user;
        Price = price;
    }
}
