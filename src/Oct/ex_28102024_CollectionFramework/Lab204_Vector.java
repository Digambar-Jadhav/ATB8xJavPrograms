package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_Vector {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5); // FR - CO
        mylist1.add("Digambara Digambara Shripad Vallabh Digambara");
        mylist1.add("Shri Gurudev Datta");
        mylist1.add("Om Dram Dattatreyay Namah");
        mylist1.add("Avadhut Chintan shri Gurudev Datta");
        mylist1.add("Datt");
        mylist1.add("Shri Nrusiha Saraswati Maharaj Ki Jay");
        System.out.println(mylist1);


        Vector v = new Vector();
        v.add("Digambar"); // t1
        v.add("Anvi"); // t1
        v.add("Anita"); // t1
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Digambar"));
        System.out.println(v.lastIndexOf("Anvi"));
        System.out.println(v.contains("Anita"));
//        System.out.println(v.replaceAll("Kiran"););



        // Only Problem with the Vector
        // - It is Thread Safe, Synchronised.
        // It will be time consumming
        // One by One - usage
        // Slower

    }
}