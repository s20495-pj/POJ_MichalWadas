package Zjazd5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * summary: Implement UML chart, exercise 05_07: Statistic
 * author: Michal Wadas
 **/
public class Statistic {

    private final int grade1 = 50;
    private final int grade2 = 51;
    private final int grade3 = 56;
    private final int grade4 = 53;
    private final List<Integer> gradeList = Arrays.asList(grade1, grade2, grade3, grade4);

    public List<Integer> grades() {
        return gradeList;
    }

    public float sum() {
        float total = 0;
        for (float i = 0; i < grades().size(); i++) {
            total = total + gradeList.get((int) i);
        }
        return total;
    }

    public float average() {
        return sum() / grades().size();
    }

    public float median() {

        Collections.sort(gradeList);

        int length = gradeList.size();
        int mean = (length - 1) / 2;

        if (length % 2 == 0) {
            return (gradeList.get(mean) + gradeList.get(mean + 1)) >> 1;
        } else {
            return gradeList.get(mean);
        }
    }

    public int minimum() {
        return Collections.min(gradeList);
    }

    public int maximum() {
        return Collections.max(gradeList);
    }

    public float standardDeviation() {
        double standardDeviation = 0.0;
        double mean = sum() / gradeList.size();
        for (double num : gradeList) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation / gradeList.size());
        return (float) standardDeviation;
    }

    public static void main(String[] args) {
        Statistic statistic = new Statistic();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Enter the number of students: " + statistic.gradeList.size());
        System.out.println("Enter the grade for student 1: " + statistic.grade1);
        System.out.println("Enter the grade for student 2: " + statistic.grade2);
        System.out.println("Enter the grade for student 3: " + statistic.grade3);
        System.out.println("Enter the grade for student 4: " + statistic.grade4);
        System.out.println("The grades are: " + statistic.gradeList);
        System.out.println("The average is: " + df.format(statistic.average()));
        System.out.println("The median is: " + df.format(statistic.median()));
        System.out.println("The minimum is: " + statistic.minimum());
        System.out.println("The maximum is: " + statistic.maximum());
        System.out.println("The standard deviation is: " + df.format(statistic.standardDeviation()));
    }
}