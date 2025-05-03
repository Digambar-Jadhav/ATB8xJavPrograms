package Exersize01.Collections;


import java.util.HashMap;
import java.util.Map;

    public class UniqueElements {
        public static void main(String[] args) {
            //int[] arr = {4, 5, 4, 6, 7, 5, 8};
            int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
            // Use a HashMap to count occurrences
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int num : arr) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            System.out.println("Unique elements in the array:");
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
               // if (entry.getValue()==1) {   //Non Repeated
                   // if (entry.getValue()>0) {  //Unique Only
                    if (entry.getValue()>1) {  //Duplicate Only
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    }

