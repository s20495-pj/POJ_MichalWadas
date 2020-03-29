package main.java.Zjazd3;

import java.util.ArrayList;
import java.util.List;

/**
 * Summary: Implement exercise 16: ArrayList with Employees
 * Author: Michal Wadas
 */
public class Employment {

    /*
    Write a program to print the name, salary and date of joining of
    8 employees in a company.
    Use arrayList of objects.
     */

    private Date dateOfJoin;
    private Employee employee;

    public Employment(Employee employee, Date dateOfJoin) {
        this.employee = employee;
        this.dateOfJoin = dateOfJoin;
    }

    @Override
    public String toString() {
        return "Employment: " +
                " Date of join=" + dateOfJoin + " : " + employee;
    }

    public static void main(String[] args) {

        List<Employment> employmentList = new ArrayList<>();

        Employee employee1 = new Employee(1, "Maciek", "Kaminski", 3000);
        Date dateOfJoin1 = new Date(03, 11, 1999);

        Employee employee2 = new Employee(2, "Jacek", "Wiktorski", 3400);
        Date dateOfJoin2 = new Date(03, 3, 1999);

        Employee employee3 = new Employee(3, "Wacek", "Domnikański", 4000);
        Date dateOfJoin3 = new Date(4, 5, 1999);

        Employee employee4 = new Employee(4, "Rocky", "Balboa", 3500);
        Date dateOfJoin4 = new Date(6, 6, 1999);

        Employee employee5 = new Employee(5, "Zenek", "Doe", 3000);
        Date dateOfJoin5 = new Date(7, 9, 1999);

        Employee employee6 = new Employee(6, "John", "Bolek", 2000);
        Date dateOfJoin6 = new Date(8, 4, 1999);

        Employee employee7 = new Employee(7, "Adam", "Klapek", 5000);
        Date dateOfJoin7 = new Date(10, 11, 1999);

        Employee employee8 = new Employee(8, "Pawel", "Roko", 2500);
        Date dateOfJoin8 = new Date(15, 10, 1999);

        employmentList.add(new Employment(employee1, dateOfJoin1));
        employmentList.add(new Employment(employee2, dateOfJoin2));
        employmentList.add(new Employment(employee3, dateOfJoin3));
        employmentList.add(new Employment(employee4, dateOfJoin4));
        employmentList.add(new Employment(employee5, dateOfJoin5));
        employmentList.add(new Employment(employee6, dateOfJoin6));
        employmentList.add(new Employment(employee7, dateOfJoin7));
        employmentList.add(new Employment(employee8, dateOfJoin8));

        employmentList.forEach(System.out::println);
    }
}
