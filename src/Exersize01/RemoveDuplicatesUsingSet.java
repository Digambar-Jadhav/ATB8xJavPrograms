package Exersize01;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {

                char[] arr = {'d', 'a', 'c', 'a', 'a', 'q', 'd'};

                // Using LinkedHashSet to maintain insertion order and remove duplicates
                Set<Character> a = new LinkedHashSet<>();
                for (char c : arr) {
                    a.add(c);
                }

                // Convert Set to array
                char[] result = new char[a.size()];
                int i = 0;
                for (char c : a) {
                    result[i++] = c;
                }

                // Print the result
                System.out.println("Array after removing duplicates:");
                System.out.println(result);
            }
        }
