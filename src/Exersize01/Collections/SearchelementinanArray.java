package Exersize01.Collections;

public class Main {
    public static void main(String[] args) {
    int[] array = {5, 2, 9, 1, 6, 3};
    int target = 6;


    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
        System.out.println("Element "+target+" is placed at index: "+i);
        }
    }
    }
}