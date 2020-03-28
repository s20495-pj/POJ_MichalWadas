package Zjazd2;

/**
 * summary: Rectangle class
 * author: Michal Wadas
 **/
public class Rectangle {

    //Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
    //Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.

    private double width;
    private double length;

    /**
     * @param width
     * @param length
     * @return Rectangle circuit
     */
    private double circuit(int width, int length) {
        this.width = width;
        this.length = length;
        double circuit;

        circuit = 2 * (width + length);

        return circuit;
    }

    /**
     * @param width
     * @param length
     * @return Rectangle diagonal
     */
    private double diagonal(double width, double length) {
        this.width = width;
        this.length = length;
        double diagonal;

        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));

        return diagonal;
    }

    /**
     * @param width
     * @param length
     * @return Rectangle field area
     */
    private double field(double width, double length) {
        this.width = width;
        this.length = length;
        double field;

        field = width * length;
        return field;
    }
}
