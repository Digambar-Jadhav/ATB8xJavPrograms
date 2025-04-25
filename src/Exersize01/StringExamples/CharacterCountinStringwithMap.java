package Exersize01.StringExamples;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountinStringwithMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = scanner.nextLine();
        scanner.close();
        Map<Character,Integer> charCountMap= new LinkedHashMap<>();
        for (char ch: input.toCharArray())
        {                                       // String to char conversion
            charCountMap.put(ch, charCountMap.getOrDefault(ch,0)+1);  //insert char data into MAP
        }
        System.out.println("Character Occurrences: ");
        for (Map.Entry<Character,Integer> entry: charCountMap.entrySet())
        {      //Iterate over Map
              if (entry.getValue()>0){ //to print all char
            //if (entry.getValue()==1){ //to print unique char
            //if(entry.getValue()>1){           // to find duplicates
            System.out.println(entry.getKey()+" : "+entry.getValue());           // Print Key Value Pair
        }

   }
}}