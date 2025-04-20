import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReverseSentenceWordsUsingMap {
    public static void main(String[] args) {
        String sentence = "I am java developer";
        String[] words = sentence.split(" ");

        // Store words with their index in a LinkedHashMap
        Map<Integer, String> wordMap = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordMap.put(i, words[i]);
        }

        // Use TreeMap to sort keys in reverse order
        Map<Integer, String> reversedMap = new TreeMap<>((a, b) -> b - a);
        reversedMap.putAll(wordMap);

        // Build the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : reversedMap.values()) {
            reversedSentence.append(word).append(" ");
        }

        // Output
        System.out.println("Original: " + sentence);
        System.out.println("Reversed (words intact): " + reversedSentence.toString().trim());
    }
}