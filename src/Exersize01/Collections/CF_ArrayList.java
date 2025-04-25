package Exersize01.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CF_ArrayList {
    public static void main(String[] args) {
        List mylist = new ArrayList();   //Dynamic dispatch
        mylist.add("Digambar");
        mylist.add("Anvi");
        mylist.add("Anvi");
        mylist.add("Anita");
        mylist.add("Test");
       // mylist.add(123);
       // mylist.add(true);


        System.out.println(mylist);
        System.out.println(mylist.size());
        //mylist.remove(3);
        //System.out.println(mylist);
        System.out.println("-----------");

        for(Object str : mylist) {
            System.out.println(str);
        }
        System.out.println("-----------");
        //Iterator
        Iterator<String> iterator = new iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(mylist);

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
