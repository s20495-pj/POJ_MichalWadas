package Zjazd4;

import java.io.File;
import java.util.*;

/**
 * summary: Implement UML chart, exercise 25: Different Words
 * Program prints out the set of different words in a given file, and count them.
 * author: Michal Wadas
 **/
public class DifferentWords {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("src/main/resources/textFiles/Sample.txt"));
        Set<String> wordsSet = new TreeSet<>();

        while (scanner.hasNext()) {
            wordsSet.add(scanner.next()
                    .toLowerCase()
                    .replaceAll("[,.]", "")
            );
        }
        wordsSet.forEach(word -> System.out.print(word + " "));
        System.out.println("\nNumber of words: " + wordsSet.size());
    }
}
