package Zjazd6.Ex06_04;

/**
 * summary: Implement exercise 06_04: Machine
 * author: Michal Wadas
 **/
public class Machine implements Runner{

    private final String className = this.getClass().getSimpleName();

    public Machine() {
    }

    @Override
    public void run() {
        System.out.println(className + ": I will run after pressing start button.");
    }
}