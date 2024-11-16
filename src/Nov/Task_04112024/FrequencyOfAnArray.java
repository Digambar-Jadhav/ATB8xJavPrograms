package Nov.Task_04112024;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfAnArray {
    public static void main(String[] args) {

        Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4}; //O/p 2→ 3 , 3 → 2 , 4→ 2,  5→ 3

        //Create object of a map
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        //iterate over an array
        for (Integer num : numbers){

            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

        }
        //print the array
        for (Map.Entry<Integer, Integer> item : frequencyMap.entrySet()){
            System.out.println(item.getKey()+ " --> " + item.getValue());
        }

    }
}