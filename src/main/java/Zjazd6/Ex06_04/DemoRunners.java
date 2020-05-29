package Zjazd6.Ex06_04;

/**
 * summary: Implement exercise 06_04: DemoRunners
 * author: Michal Wadas
 **/
public class DemoRunners {
    public static void main(String[] args) {
        System.out.println("Depends on type of run, output will be different.");

        Athlete athlete = new Athlete();
        Machine machine = new Machine();
        PoliticalCandidate politicalCandidate = new PoliticalCandidate();

        athlete.run();
        machine.run();
        politicalCandidate.run();
    }
}