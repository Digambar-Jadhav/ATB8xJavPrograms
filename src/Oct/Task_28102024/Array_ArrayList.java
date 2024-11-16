package Oct.Task_28102024;

import java.util.ArrayList;

public class Array_ArrayList {
    public static void main(String[] args) {

        ArrayList<Object> studentlist = new ArrayList<>();
        studentlist.add("Digambar");
        studentlist.add("Anvi");
        studentlist.add("Anita");
        studentlist.add(true);
        studentlist.add(123);    //Different data types are allowed.
        studentlist.add(null);
        System.out.println(studentlist);




    }
}