package Exersize01.Collections;


    import java.util.*;

    public class CommonElements {
        public static void main(String[] args) {
            int[] array1 = {1, 3, 4, 5, 6, 7};
            int[] array2 = {2, 3, 5, 7, 8, 9};

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> common = new HashSet<>();

            // Add elements of array1 to the set
            for (int num : array1) {
                set1.add(num);
            }

            // Check for common elements in array2
            for (int num : array2) {
                if (set1.contains(num)) {
                    common.add(num);
                }
            }

            // Print common elements
            System.out.println("Common elements: " + common);
        }
    }
}
