package Zjazd5;

/**
 * summary: Implement UML chart, exercise 05_04: MyRectangle
 * author: Michal Wadas
 **/
public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint rightBottom;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.rightBottom = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint rightBottom) {
        this.topLeft = topLeft;
        this.rightBottom = rightBottom;
    }

    /**
     * @return rectangle width.
     */
    public double getWidth() {
        return topLeft.getY() - rightBottom.getY();
    }

    /**
     * @return rectangle length.
     */
    public double getLength() {
        return rightBottom.getX() - topLeft.getX();
    }

    /**
     * @return rectangle diagonal.
     */
    public double getDiagonal() {
        return topLeft.distance(rightBottom);
    }

    /**
     * @return rectangle perimeter.
     */
    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    /**
     * @return rectangle area.
     */
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return "MyRectangle[" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                ']';
    }
}