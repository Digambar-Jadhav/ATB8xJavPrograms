package Exersize01;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountwithMap {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = scanner.nextLine();
        scanner.close();
        Map<Character,Integer> charCountMap= new HashMap<>();
        for (char ch: input.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch,0)+1);
        }
        System.out.println("Character Occurrences: ");
        for (Map.Entry<Character,Integer> entry: charCountMap.entrySet()) {

            System.out.println(entry.getKey()+" : "+entry.getValue());



        }

    }
}