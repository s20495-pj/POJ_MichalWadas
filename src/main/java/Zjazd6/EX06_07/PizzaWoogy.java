package Zjazd6.EX06_07;

/**
 * summary: Implement exercise 06_07: Pizza Woogy
 * author: Michal Wadas
 **/
public class PizzaWoogy extends Pizza {

    private int diameter;
    private String woogyIngredient;
    private boolean isVegetarian;

    public PizzaWoogy(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaWoogy(double calories, String name, double price, int diameter, String woogyIngredient, boolean isVegetarian) {
        super(calories, name, price);
        this.diameter = diameter;
        this.woogyIngredient = woogyIngredient;
        this.isVegetarian = isVegetarian;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getWoogyIngredient() {
        return woogyIngredient;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        return "PizzaWoogy{Name=" + getName() +
                ", calories= " + getCalories() +
                ", price= " + getPrice() +
                ", diameter=" + diameter +
                ", woogyIngredient='" + woogyIngredient + '\'' +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}