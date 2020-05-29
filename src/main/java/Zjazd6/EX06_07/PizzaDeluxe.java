package Zjazd6.EX06_07;

/**
 * summary: Implement exercise 06_07: Pizza Deluxe
 * author: Michal Wadas
 **/
public class PizzaDeluxe extends Pizza {

    private int diameter;
    private String deluxeIngredient;
    private boolean isVegetarian;

    public PizzaDeluxe(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaDeluxe(double calories, String name, double price, int diameter, String deluxeIngredient, boolean isVegetarian) {
        super(calories, name, price);
        this.diameter = diameter;
        this.deluxeIngredient = deluxeIngredient;
        this.isVegetarian = isVegetarian;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getDeluxeIngredient() {
        return deluxeIngredient;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        return "PizzaDeluxe{Name=" + getName() +
                ", calories= " + getCalories() +
                ", price= " + getPrice() +
                "diameter=" + diameter +
                ", deluxeIngredient='" + deluxeIngredient + '\'' +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}