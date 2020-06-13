package Zjazd7.EX07_03;

import java.util.List;

/**
 * summary: Implement exercise 07_03
 * author: Michal Wadas
 **/
public class Main {
    public static void main(String[] args) {

        Cache cache = Cache.getInstance();
        List<Data> data1 = cache.getData();
        System.out.println("First");
        data1.forEach(System.out::println);
        List<Data> data2 = cache.getData();
        System.out.println("Second");
        data2.forEach(System.out::println);
    }
}
