package Zjazd7.EX07_03.exceptionStrategy.Strategies;

/**
 * summary: Implement exercise 07_03: IOExceptionStrategy
 * author: Michal Wadas
 **/
public class IOExceptionStrategy implements IExceptionStrategy {
    @Override
    public String handle(Exception e) {
        return "An IO Exception occurred. Data was not refreshed!";
    }
}
