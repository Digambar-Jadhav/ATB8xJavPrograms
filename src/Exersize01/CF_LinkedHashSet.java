package Exersize01;

import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;

public class CF_LinkedHashSet {
    public static void main(String[] args) {
        Set myset = new LinkedHashSet();
        myset.add("Digambar");
        myset.add("Anvi");
        myset.add("Anvi");
        myset.add("Anita");
        myset.add("Test");
        // mylist.add(123);
        // mylist.add(true);

        for(Object o:myset){
            System.out.println(o);
        }
        System.out.println("--------");
        Iterator iterator = myset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}