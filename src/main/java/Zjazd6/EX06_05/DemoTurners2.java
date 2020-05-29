package Zjazd6.EX06_05;

/**
 * summary: Implement exercise 06_05: DemoTurners2
 * author: Michal Wadas
 **/
public class DemoTurners2 {

    public static void main(String[] args) {
        Jedi jedi = new Jedi();
        Human human = new Human();

        System.out.print(jedi.getClass().getSimpleName() + ": ");
        jedi.turn();

        System.out.print(human.getClass().getSimpleName() + ": ");
        human.turn();
    }
}