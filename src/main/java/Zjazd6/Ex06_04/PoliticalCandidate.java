package Zjazd6.Ex06_04;

/**
 * summary: Implement exercise 06_04: PoliticalCandidate
 * author: Michal Wadas
 **/
public class PoliticalCandidate implements Runner {

    private final String className = this.getClass().getSimpleName();

    public PoliticalCandidate() {
    }

    @Override
    public void run() {
        System.out.println(className + ": I will run in next presidential election.");
    }
}