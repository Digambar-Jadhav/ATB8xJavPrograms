package Exersize01;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateCharacterCountwithMap {
    public static void main(String[] args) {
        //char[] chars = {'a', 'b', 'a', 'c', 'a', 'b', 'd'};
        char[] chars = {'a', 'b', 'a', 'c', 'a', 'b', 'd'};
        // Using LinkedHashMap to preserve insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Populate the map with character frequencies
        for (char ch : chars) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Printing the array after removing duplicates (unique characters)
        System.out.println("Array after removing duplicates:");
        for (Character key : charCountMap.keySet()) {
            System.out.print(key + "  ");//print character with space
        }

    }
}