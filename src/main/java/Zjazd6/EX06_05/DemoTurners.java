package Zjazd6.EX06_05;

/**
 * summary: Implement exercise 06_05: DemoTurners
 * author: Michal Wadas
 **/
public class DemoTurners {

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();

        System.out.print(leaf.getClass().getSimpleName() + ": ");
        leaf.turn();

        System.out.print(page.getClass().getSimpleName() + ": ");
        page.turn();

        System.out.print(pancake.getClass().getSimpleName() + ": ");
        pancake.turn();
    }
}