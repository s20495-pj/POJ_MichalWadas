package Zjazd6.EX06_07;

/**
 * summary: Implement exercise 06_07: Pizza Special
 * author: Michal Wadas
 **/
public class PizzaSpecial extends Pizza {

    private int diameter;
    private String specialIngredient;
    private boolean isVegetarian;

    public PizzaSpecial(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaSpecial(double calories, String name, double price, int diameter, String specialIngredient, boolean isVegetarian) {
        super(calories, name, price);
        this.diameter = diameter;
        this.specialIngredient = specialIngredient;
        this.isVegetarian = isVegetarian;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getSpecialIngredient() {
        return specialIngredient;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        return "PizzaSpecial{Name=" + getName() +
                ", calories= " + getCalories() +
                ", price= " + getPrice() +
                "diameter=" + diameter +
                ", specialIngredient='" + specialIngredient + '\'' +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}