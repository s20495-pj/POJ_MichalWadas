package Zjazd7.EX07_03;

import Zjazd7.EX07_03.exceptionStrategy.ExceptionSolver;
import Zjazd7.EX07_03.exceptionStrategy.Strategies.IOExceptionStrategy;
import Zjazd7.EX07_03.exceptionStrategy.Strategies.OverlappingFileLockExceptionStrategy;

import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * summary: Implement exercise 07_03: Cache
 * author: Michal Wadas
 **/
public class Cache {
    private static Cache instance;
    private DataReader dataReader;
    private ExceptionSolver exceptionSolver;
    private LocalDateTime lastRefreshTime;
    private List<Data> cache;

    private Cache() {
        dataReader = new DataReader();
    }

    public static Cache getInstance() {
        if(instance == null)
            instance = new Cache();
        return instance;
    }

    public List<Data> getData() {
        return this.cache;
    }

    public void refreshData() {
        try {
            this.cache = dataReader.readData("src/main/resources/data.csv");
        } catch (IOException e) {
            exceptionSolver.set(e, new IOExceptionStrategy());
        } catch (OverlappingFileLockException e) {
            exceptionSolver.set(e, new OverlappingFileLockExceptionStrategy());
        }
        if(exceptionSolver.isSet()) {
            exceptionSolver.handleException();
        } else {
            this.lastRefreshTime = LocalDateTime.now();
        }
    }
}
