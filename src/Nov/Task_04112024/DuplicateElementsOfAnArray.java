package Nov.Task_04112024;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsOfAnArray {
    public static void main(String[] args) {

        //Duplicate Elements of an Array

        int[] numbers = {1, 2, 3, 4, 5, 1, 2};  //o/p →  1,2


        HashSet set = new HashSet();
        System.out.println("Duplicate elements: ");

        for (int num : numbers){
            if (set.contains(num)){
                System.out.println(num + " ");
            }
            else {
                set.add(num);
            }
        }

    }
}