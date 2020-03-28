package Zjazd3;

/**
 * summary: Implement UML chart, exercise 11: Employee
 * author: Michal Wadas
 **/
public class Employee {

    private int id;
    private int salary;

    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary = salary + salary * percent / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name=" + firstName + " " + lastName +
                ", salary=" + salary +
                ']';
    }
}
