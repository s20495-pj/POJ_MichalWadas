package Zjazd7.EX07_03.exceptionStrategy;


import Zjazd7.EX07_03.exceptionStrategy.Strategies.IExceptionStrategy;

/**
 * summary: Implement exercise 07_03: ExceptionSolver
 * author: Michal Wadas
 **/
public class ExceptionSolver {
    private IExceptionStrategy iExceptionStrategy;
    private Exception exception;

    public void set(Exception e, IExceptionStrategy iExceptionStrategy) {
        this.exception = e;
        this.iExceptionStrategy = iExceptionStrategy;
    }

    public boolean isSet() {
        return this.iExceptionStrategy != null;
    }

    public void handleException() {
        String result = iExceptionStrategy.handle(this.exception);
        System.out.println(result);
    }
}
