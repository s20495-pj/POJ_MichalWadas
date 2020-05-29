package Zjazd6.EX06_07;

import java.util.Arrays;

/**
 * summary: Implement exercise 06_07: Menu
 * author: Michal Wadas
 **/
public class Menu {

    public static void main(String[] args) {

        Pizza[] arrayPizza = new Pizza[40];
        arrayPizza[0] = new PizzaWoogy(531, "BonApetitta", 30.99, 13,"Olives", true);
        arrayPizza[1] = new PizzaDeluxe(800, "Hawaii", 19.99);
        arrayPizza[2] = new PizzaDeluxe(700, "Marinara", 18.99);
        arrayPizza[3] = new PizzaDeluxe(500, "Perfecta", 23.99);
        arrayPizza[4] = new PizzaDeluxe(666, "Crudo", 16.66);
        arrayPizza[5] = new PizzaDeluxe(359, "Napoli", 11.49);
        arrayPizza[6] = new PizzaDeluxe(573, "Pugliese", 16.98);
        arrayPizza[7] = new PizzaDeluxe(238, "Montanara", 15.55);
        arrayPizza[8] = new PizzaDeluxe(493, "Macaronni", 17.90);
        arrayPizza[9] = new PizzaDeluxe(960, "Romana", 18.99, 14,"Ham",false);
        arrayPizza[10] = new PizzaDeluxe(651, "Fattoria", 14.99, 15,"Pork",false);
        arrayPizza[11] = new PizzaDeluxe(514, "Schiacciata", 13.99, 13,"HamPork",false);
        arrayPizza[12] = new PizzaDeluxe(584, "Prosciutto ", 14.42, 14,"Becon",false);
        arrayPizza[13] = new PizzaDeluxe(1948, "Americana", 36.66,40,"Letuce",true);
        arrayPizza[14] = new PizzaSpecial(2800, "Margeritos", 39.99);
        arrayPizza[15] = new PizzaSpecial(3800, "Marinaros", 49.99);
        arrayPizza[16] = new PizzaSpecial(2345, "Sardos", 59.99);
        arrayPizza[17] = new PizzaSpecial(1800, "Tonnos", 69.99);
        arrayPizza[18] = new PizzaSpecial(5800, "BestOf", 79.99);
        arrayPizza[19] = new PizzaSpecial(2800, "SuperSpecial", 89.99,89,"Hamster",false);
        arrayPizza[20] = new PizzaSpecial(2200, "Spanish", 29.99);
        arrayPizza[21] = new PizzaSpecial(1999, "PolishPizza", 99.99,90,"Fish",true);
        arrayPizza[22] = new PizzaSpecial(2333, "PorkyPizza", 109.99, 100,"Holy Pork",false);
        arrayPizza[23] = new PizzaSpecial(984, "Diavolos", 29.89);
        arrayPizza[24] = new PizzaSpecial(1342, "Rusticos", 40.99);
        arrayPizza[25] = new PizzaSpecial(834, "Contadinos", 33.99);
        arrayPizza[26] = new PizzaSpecial(0, "Papa", 33.33);
        arrayPizza[27] = new PizzaWoogy(100, "Capriccini", 19.99, 13,"Olives", true);
        arrayPizza[28] = new PizzaWoogy(320, "WoogieBoogie", 8.99, 13,"Olives", true);
        arrayPizza[29] = new PizzaWoogy(322, "Paninni", 7.99, 13,"Olives", true);
        arrayPizza[30] = new PizzaWoogy(334, "Tirolesini", 11.99, 13,"Olives", true);
        arrayPizza[31] = new PizzaWoogy(312, "Roma", 14.99, 13,"Olives", true);
        arrayPizza[32] = new PizzaWoogy(123, "Campagnolini", 5.99, 13,"Olives", true);
        arrayPizza[33] = new PizzaWoogy(132, "Vegetarianini", 15.99, 13,"Olives", true);
        arrayPizza[34] = new PizzaWoogy(231, "Bufalinini", 17.99, 13,"Olives", true);
        arrayPizza[35] = new PizzaWoogy(312, "Fontanini", 12.99, 13,"Olives", true);
        arrayPizza[36] = new PizzaWoogy(321, "Tricolorini", 11.99, 13,"Olives", true);
        arrayPizza[37] = new PizzaWoogy(213, "Valdostanini", 8.99, 13,"Olives", true);
        arrayPizza[38] = new PizzaWoogy(434, "Capresini", 6.99, 13,"Olives", true);
        arrayPizza[39] = new PizzaWoogy(400, "Funghini", 9.99, 13,"Olives", true);

        Arrays.sort(arrayPizza);
        for (Pizza pizza : arrayPizza) {
            System.out.println(pizza);
        }
    }
}