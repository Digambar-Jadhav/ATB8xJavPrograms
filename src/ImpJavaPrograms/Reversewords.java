package ImpJavaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Reversewords {
    public static void main(String[] args) {
        String input = "I WORK FOR WIPRO";
        String[] words = input.split(" ");
        Map<String, String> wordMap = new LinkedHashMap<>();
        for(String word:words){
            wordMap.put(word, new StringBuilder(word).reverse().toString());
        }
        StringBuilder result = new StringBuilder();
        for(String word: words){
            result.append(wordMap.get(word)).append(" ");

        }
        System.out.println(" Input String:  "+input);
        System.out.println(" Reverse words: "+result.toString().trim());
    }
}
