package Exersize01;

import java.util.*;

public class ReverseWordsUsingMap {
    public static void main(String[] args) {
        String input = "I work for Deloitte";

        String[] words = input.split(" ");


        Map<String, String> wordMap = new LinkedHashMap<>();

        for (String word : words) {
            wordMap.put(word, new StringBuilder(word).reverse().toString());
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {

            result.append(wordMap.get(word)).append(" ");
        }

        System.out.println("Original String       : " + input);
        System.out.println("Reversed Words String : " + result.toString().trim());
    }
}