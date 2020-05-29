package Zjazd6.EX06_07;

/**
 * summary: Implement exercise 06_07: Pizza
 * author: Michal Wadas
 **/
public class Pizza implements Comparable<Pizza> {

    private final double calories;
    private final String name;
    private final double price;

    public Pizza(double calories, String name, double price){
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Pizza pizza) {
        return Double.compare(this.price, pizza.price);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}