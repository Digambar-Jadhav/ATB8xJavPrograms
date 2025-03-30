package Exersize01;

import java.util.*;

public class ReverseWordsUsingMap {
    public static void main(String[] args) {
        String input = "Hello World Java Programming";

        // Split the string into words
        String[] words = input.split(" "); //put double space to reverse whole string

        // Use a HashMap to store original and reversed words
        Map<String, String> wordMap = new LinkedHashMap<>();

        for (String word : words) {
            //wordMap.put(word, new StringBuilder(word).reverse().toString());
              wordMap.put(word, new StringBuilder(word).reverse().toString());
        }

        // Construct the final reversed string
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            //result.append(wordMap.get(word)).append(" ");
            result.append(wordMap.get(word)).append(" ");
        }

        // Print the result
        System.out.println("Original String       : " + input);
        System.out.println("Reversed Words String : " + result.toString().trim());
    }
}