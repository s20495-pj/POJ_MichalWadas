package test.java.Zjazd3;

import main.java.Zjazd3.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * summary: Test Employee class
 * author: Michal Wadas
 **/
public class EmployeeTest {

    private final static String EMPLOYEE_INFORMATION = "Employee[id=1, name=Michal Wadas, salary=3000]";
    private final static int salary = 3000;

    private Employee employee;

    @Before
    public void setUp() {

        employee = new Employee(1, "Michal", "Wadas", salary);
    }

    @Test
    public void testGetNameWithFirstAndLastName() {

        Assert.assertEquals("Michal Wadas", employee.getName());
    }

    @Test
    public void testAnnualSalary() {

        int annualSalary = salary * 12;

        Assert.assertEquals(annualSalary, employee.getAnnualSalary());
    }

    @Test
    public void testTenPercentIncreasedSalary() {

        int increasedTenPercentSalary = (int) (1.1 * salary);

        Assert.assertEquals(increasedTenPercentSalary, employee.raiseSalary(10));
    }

    @Test
    public void testToStringInformation(){

        Assert.assertEquals(EMPLOYEE_INFORMATION,employee.toString());
    }

}
