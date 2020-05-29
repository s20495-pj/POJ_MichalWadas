package Zjazd6.EX06_02;

/**
 * summary: Implement UML chart, exercise 06_02: Resizable circle
 * author: Michal Wadas
 **/
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}