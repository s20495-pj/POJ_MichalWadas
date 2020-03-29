package main.java.Zjazd3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * summary: Implement UML chart, exercise 14: Date
 * author: Michal Wadas
 **/
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * @param day
     * @param month
     * @param year
     */
    public void setDate(int day, int month, int year) {
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d", day, month) + "/" + year;
    }
}
