package Zjazd6.EX06_02;

/**
 * summary: Implement UML chart, exercise 06_02: Circle
 * author: Michal Wadas
 **/
public class Circle implements GeometricObject {

    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}