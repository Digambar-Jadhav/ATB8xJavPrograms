package Exersize01.StringExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateCharacterCountwithMap {
    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'a', 'c', 'a', 'b', 'd'};
        // Using LinkedHashMap to preserve insertion order
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Populate the map with character frequencies
        for (char ch : chars) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Printing the array after removing duplicates (unique characters)
        System.out.println("Char Occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue()>0){ //to print remove dup char
            //if (entry.getValue()==1){ //to print unique char
            //if(entry.getValue()>1){ // to print dup char
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}