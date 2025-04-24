import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        String input = "Java is simple Java is powerful Java is everywhere";

        // Convert the string to lowercase and split it into words
        String[] words = input.toLowerCase().split("\\s+");

        // Use a HashMap to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}