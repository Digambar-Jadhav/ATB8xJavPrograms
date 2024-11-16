package Oct.Task_28102024;

import java.util.ArrayList;
import java.util.List;

public class List_Practice1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3"); //Duplicates allowed
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));//false int
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("3")); //Finds the first occurrence of the element
        System.out.println(list.lastIndexOf("3"));
    }
}