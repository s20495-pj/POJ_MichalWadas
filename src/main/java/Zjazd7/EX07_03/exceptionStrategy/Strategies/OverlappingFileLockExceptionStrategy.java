package Zjazd7.EX07_03.exceptionStrategy.Strategies;

/**
 * summary: Implement exercise 07_03: OverlappingFileLockExceptionStrategy
 * author: Michal Wadas
 **/
public class OverlappingFileLockExceptionStrategy implements IExceptionStrategy {
    @Override
    public String handle(Exception e) {
        return "An Overlapping File Lock Exception occurred. Data was not refreshed!";
    }
}
