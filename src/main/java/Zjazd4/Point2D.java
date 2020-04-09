package Zjazd4;

import java.util.Arrays;
import java.util.List;

/**
 * summary: Implement UML chart, exercise 21: Point2D
 * author: Michal Wadas
 **/
public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public List getXY() {
        return Arrays.asList(x, y);
    }

    @Override
    public String toString() {
        return "(" +
                x + ", " +
                y + ')';
    }
}
