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

        for(Object str:myset){
            System.out.println(str);
        }
        System.out.println("--------");
        Iterator<String> iterator = myset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}