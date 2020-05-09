package Zjazd5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * summary:Exercise 05_04: MyRectangle Test
 * author: Michal Wadas
 **/
public class MyRectangleTest {

    private final MyRectangle rectangle = new MyRectangle(2, 3, 5, 1);

    /*
     length= 3
     width = 2
     */
    @Test
    public void areaTest() {
        assertEquals("Wrong area size.", 6, rectangle.getArea(), 0.0);
    }

    @Test
    public void perimeterTest() {
        assertEquals("Wrong perimeter size.", 10, rectangle.getPerimeter(), 0.0);
    }

    @Test
    public void diagonalTest() {
        assertEquals("Wrong diagonal size.", 3.6, rectangle.getDiagonal(), 0.1);
    }

    @Test
    public void widthAndLengthTest() {
        assertEquals(2, rectangle.getWidth(), 0.0);
        assertEquals(3, rectangle.getLength(), 0.0);
    }
}