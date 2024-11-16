package Oct.Task_28102024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab189_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Digambar");
        mylist.add("Anvi");
        mylist.add("Anita");
        System.out.println("--To print ArrayList 1--");
        for(Object o:mylist){
            System.out.println(o);
        }
        System.out.println("--To print ArrayList 2--");
        for (int i=0;i< mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("--To print ArrayList 3--");
        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}