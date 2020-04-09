package Zjazd4;

import java.util.Arrays;
import java.util.List;

/**
 * summary: Implement UML chart, exercise 21: Point3D
 * author: Michal Wadas
 **/
public class Point3D extends Point2D {

    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        super.setXY(x, y);
    }

    public List getXYZ() {
        return Arrays.asList(super.getXY(), z);
    }

    @Override
    public String toString() {
        return "(" +
                getX() + ", " +
                getY() + ", " +
                z + ')';
    }
}
