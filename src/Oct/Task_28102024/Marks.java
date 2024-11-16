
package Oct.Task_28102024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Marks {
    public static void main(String[] args) {
        List marks = new ArrayList();

        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);
        System.out.println(marks);

        Collections.sort(marks);
        System.out.println("Sorted");
        System.out.println(marks);

        System.out.println("Reverse");
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
