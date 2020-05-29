package Zjazd6.EX06_08;

/**
 * summary: Implement exercise 06_08: Used Car
 * author: Michal Wadas
 **/
public class UsedCar {
    private final String VIN;
    private final String make;
    private final int year;
    private final int mileage;
    private final double price;

    public UsedCar(String VIN, String make, int year, int mileage, double price) throws UsedCarException {
        if (!VIN.matches("\\d") && VIN.length() != 4) throw new UsedCarException("Only 4 number VIN is possible");
        if (year < 1997 || year > 2017) throw new UsedCarException("Only cars between 1997 and 2017!");
        if (mileage < 0 || price < 0) throw new UsedCarException("No Negatives!");

        switch (make) {
            case "Ford":
            case "Fiat":
            case "Chrysler":
            case "Mazda":
            case "Other":
                this.make = make;
                break;
            default:
                throw new UsedCarException("Wrong make");
        }

        this.VIN = VIN;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "[VIN]= " + VIN +
                ", [Make]= " + make +
                ", [Year]= " + year +
                ", [Mileage]= " + mileage +
                ", [Price]= " + price +
                "}";
    }
}