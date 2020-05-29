package Zjazd6.Ex06_04;

/**
 * summary: Implement exercise 06_04: Athlete
 * author: Michal Wadas
 **/
public class Athlete implements Runner{

    private final String className = this.getClass().getSimpleName();

    public Athlete() {
    }

    @Override
    public void run() {
        System.out.println(className + ": I will run in this marathon.");
    }
}