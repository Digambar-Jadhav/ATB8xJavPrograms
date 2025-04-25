package Exersize01.StringExamples;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        String input = "Java is simple Java is powerful Java is everywhere";

        // Convert the string to lowercase and split it into words
        String[] words = input.toLowerCase().split("\\s+");
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}