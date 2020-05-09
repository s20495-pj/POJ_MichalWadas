package Zjazd5;

import java.util.Arrays;

/**
 * summary: Implement UML chart, exercise 05_01: MyPoint
 * author: Michal Wadas
 **/
public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " +
                y + ")";
    }

    /**
     * @return distance from this point to the given point at (x,y).
     */
    public double distance(int x, int y) {
        return Math.sqrt((Math.pow((x - getX()), 2) + (Math.pow((y - getY()), 2))));
    }

    /**
     * @return distance from this point to the given instance of MyPoint.
     */
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(x - another.x, 2) + Math.pow(y - another.y, 2));
    }

    /**
     * @return distance to point (0.0).
     */
    public double distance() {
        return Math.sqrt((Math.pow(x, 2) + (Math.pow(y, 2))));
    }

    public static void main(String[] args) {

        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }
        String myPointsArrays = Arrays.toString(points);
        System.out.println(myPointsArrays);
    }
}