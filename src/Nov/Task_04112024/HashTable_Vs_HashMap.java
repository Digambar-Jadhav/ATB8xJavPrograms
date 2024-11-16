package Nov.Task_04112024;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable_Vs_HashMap
{
    public static void main (String[] args ){

        // Hash table is Synchronized ,making it safer for Multi threaded environment,does not allow null keys/Values
        //Hash Map is not Synchronized,making it faster for single threaded Environment,allows null keys/Values.


       /* Map <Character,String> map= new Hashtable<>();
        map.put('A',"Apple");
        map.put('B',"Ball");
        map.put('C',"Cat");
        map.put('D',"Dog");
        map.put(null,null);
        System.out.println(map);*/



        Map <Character,String> map1= new HashMap<>();
        map1.put('A',"Apple");
        map1.put('B',"Ball");
        map1.put('C',"Cat");
        map1.put('D',"Dog");
        map1.put(null,null);
        System.out.println(map1);    }
}