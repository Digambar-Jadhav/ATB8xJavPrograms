package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Lab197_Array_ArrayList_CF {
    public static void main(String[] args) {

        // Collection - Interface - 10
        // List - Interface - 15 ( 25)
        //  ArrayList, LinkedList, Stack and Vector - Class


        // Shopping - bread,milk, curd, panneer, buttermilk. , butter
        // Collection of items - with same or different data type.
        // Collections of students -

        ArrayList studentList = new ArrayList();
        studentList.add("Digambar");
        studentList.add("Shri Gurudev datta");
        studentList.add("Dutta Digambar"); // Duplicate is allowed.
        studentList.add("Anvi");
        studentList.add("Anita");
        studentList.add(true); // Different data type is allowed.
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);


        // Integer[] names = new Integer[5]; - Fixed, Same Data Types










    }
}