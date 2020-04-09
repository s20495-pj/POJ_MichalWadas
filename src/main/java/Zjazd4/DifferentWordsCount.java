package Zjazd4;

import java.io.File;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

/**
 * summary: Implement UML chart, exercise 26: Different Words Count
 * Program prints out the set of different words in a given file, and their number.
 * author: Michal Wadas
 **/
public class DifferentWordsCount {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("src/main/resources/textFiles/Sample.txt"));
        Map<String, Integer> wordMap = new TreeMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().replaceAll("[,.]", "");
            Integer countNumber = wordMap.getOrDefault(word, 0);
            wordMap.put(word, ++countNumber);
        }
        /*
        Sort map by value not a key
         */
        Map<String, Integer> sortedMapByValue = wordMap
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (key, value) -> value,
                        LinkedHashMap::new));
        /*
        Default map has {} brackets, let's change it to []
         */
        String mapWithChangedBrackets = "[" + sortedMapByValue.toString()
                .replace("{", "")
                .replace("}", "") + "]";
        System.out.println(mapWithChangedBrackets);
    }
}
