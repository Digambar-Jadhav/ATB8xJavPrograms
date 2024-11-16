package Oct.Task_28102024;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingList {
    public static void main(String[] args) {
        //ArrayList is created using growable array(Dynamic array)

        List list = new ArrayList();
        list.add("bread");
        list.add("milk");
        list.add("paneer");
        list.add("butter");
        list.add("jam");
        list.add("Cheese");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
       // System.out.println(list.indexOf("3")); //Finds the first occurrence of the element
      // System.out.println(list.lastIndexOf("3"));

        System.out.println("---List---");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("For each loop---");
        for(Object o: list){
            System.out.println(o);
        }
    }
}