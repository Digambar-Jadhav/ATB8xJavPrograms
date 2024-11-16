package Oct.Task_28102024;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ex_Vector {
    public static void main(String[] args) {


        Vector v = new Vector<>();
        v.add("Digambar"); //t1
        v.add("Anvi"); //t1
        v.add("Anita"); //t1
        System.out.println(v);
        /*
         * Only probelm with vector is it is thread safe, Synchronised
         * It will be time consuming
         * One by one usage
         * Slower
         */
    }
}