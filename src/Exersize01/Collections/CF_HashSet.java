package Exersize01.Collections;

import java.util.*;

public class CF_HashSet {
    public static void main(String[] args) {
        Set myset = new HashSet(); //Dynamic dispatch
        myset.add("Digambar");
        myset.add("Anvi");
        myset.add("Anvi");
        myset.add("Anita");
        myset.add("Test");
        // mylist.add(123);
        // mylist.add(true);


        System.out.println(myset);
        System.out.println(myset.size());
        //mylist.remove(3);
        //System.out.println(mylist);
        System.out.println("-----------");

        for(Object str : myset) {
            System.out.println(str);
        }
        System.out.println("-----------");
        //Iterator
        Iterator<String> iterator = new iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(myset);

    }

    private static class iterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            return "";
        }
    }
}
