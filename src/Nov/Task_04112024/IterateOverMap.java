package Nov.Task_04112024;

import java.util.HashMap;
import java.util.Map;

public class IterateOverMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();
        map.put("Roll no: 10", 50);
        map.put("Roll no: 12", 84);
        map.put("Roll no: 14", 93);
        map.put("Roll no: 16", 89);
        map.put("Roll no: 18", 73);

        System.out.println(map);

        //Iterate over map

        for (Map.Entry<String, Integer> item : map.entrySet())
        {
            System.out.println(item.getKey() + " " + item.getValue());
        }


    }

}