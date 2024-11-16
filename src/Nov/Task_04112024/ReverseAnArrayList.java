package Nov.Task_04112024;

import java.util.ArrayList;

public class ReverseAnArrayList {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Digambar");
        list.add("Anvi");
        list.add("Anita");
        list.add("Riddhi");
        list.add("Shri Guudev datta");

        System.out.println("Print the list: " + list);

        //reverse the list
        System.out.println("Reverse an arraylist: " + list.reversed());

    }
}