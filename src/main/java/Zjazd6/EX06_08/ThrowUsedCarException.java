package Zjazd6.EX06_08;

import java.util.ArrayList;

/**
 * summary: Implement exercise 06_08: Throw Used Car Exception
 * author: Michal Wadas
 **/
public class ThrowUsedCarException {

    public static void main(String[] args) {

        ArrayList<UsedCar> usedCarsList = new ArrayList<>();
        addNewCarToList(usedCarsList, "1234", "Volvo", 1999, 923229, 15000);
        addNewCarToList(usedCarsList, "0231", "Mercedes", 2010, 50000, -30000);
        addNewCarToList(usedCarsList, "111", "Ford", 1999, 345111, 2000);
        addNewCarToList(usedCarsList, "3456", "Other", 2009, 35777, 5000);
        addNewCarToList(usedCarsList, "0909", "Toyota", 2008, 999999, 50000);
        addNewCarToList(usedCarsList, "1111", "Chrysler", 2009, -500, 200000);
        addNewCarToList(usedCarsList, "111", "Honda", 1997, 234000, 3000);

        for(UsedCar usedCar : usedCarsList) {
            System.out.println(usedCar);
        }
    }

    private static void addNewCarToList(ArrayList<UsedCar> list, String VIN, String make, int year, int mileage, int price) {
        try {
            list.add(new UsedCar(VIN, make, year, mileage, price));
        } catch (Exception e) {
            System.out.println("!" + e.getMessage() + "!");
        }
    }
}